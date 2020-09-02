Feature: Test Redfin.com to find sunnyvale homes
Scenario Outline: Verify Sunnyvale homes list in Redfin.com 
 Given www.Redfin.com site to launch
 When User enter Sunnyvale in searchbox
 And press enter
 Then pop up appears
 When user select the entry "<name>"
 Then navigated to Sunnyvale Real Estate page
 And Test Sunnyvale in search box
 When Select the min price as "<min>" and max price as "<max>"
 Then Verify List of homes appears from Sunnyvale,CA,USA otherwise error
 And close the browser
 
Examples:
 |name                       |min|max|
 |CA                         |800|850|
 |TX                         |600|800|
 