Given(/^the program has finished$/) do
    @cucumber = `java -cp build/libs/gruesome-all.jar example`
end

Then(/^the output is correct for each test$/) do
    lines = @cucumber.split("\n")

    lines.length.should >= 4

    lines.include?('*** Failed!').should == true
    start = lines.find_index('*** Failed!')

    lines[start + 1].should =~ /^\[(-)?[0-9]+\]$/
    lines[start + 2].should == '+++ OK, passed 100 tests.'
    lines[start + 3].should == '+++ OK, passed 100 tests.'
end
