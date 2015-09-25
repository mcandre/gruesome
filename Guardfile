guard :shell do
  watch(/^.*\.groovy$/) do |m|
    title = 'Compile'
    eager 'gradle install'
    status = ($?.success? && :success) || :failed
    n '', title, status
    ''
  end
end
