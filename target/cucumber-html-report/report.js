$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features.feature");
formatter.feature({
  "line": 1,
  "name": "Test Redfin.com to find sunnyvale homes",
  "description": "",
  "id": "test-redfin.com-to-find-sunnyvale-homes",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Verify Sunnyvale homes list in Redfin.com",
  "description": "",
  "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "www.Redfin.com site to launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter Sunnyvale in searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "press enter",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user select the entry \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "navigated to Sunnyvale Real Estate page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Test Sunnyvale in search box",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the min price as \"\u003cmin\u003e\" and max price as \"\u003cmax\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify List of homes appears from Sunnyvale,CA,USA otherwise error",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;",
  "rows": [
    {
      "cells": [
        "name",
        "min",
        "max"
      ],
      "line": 15,
      "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;;1"
    },
    {
      "cells": [
        "CA",
        "800",
        "850"
      ],
      "line": 16,
      "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;;2"
    },
    {
      "cells": [
        "TX",
        "600",
        "800"
      ],
      "line": 17,
      "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7655912600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Sunnyvale homes list in Redfin.com",
  "description": "",
  "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "www.Redfin.com site to launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter Sunnyvale in searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "press enter",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user select the entry \"CA\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "navigated to Sunnyvale Real Estate page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Test Sunnyvale in search box",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the min price as \"800\" and max price as \"850\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify List of homes appears from Sunnyvale,CA,USA otherwise error",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "test1.www_Redfin_com_site_to_launch()"
});
formatter.result({
  "duration": 2711475200,
  "status": "passed"
});
formatter.match({
  "location": "test1.user_enter_Sunnyvale_in_searchbox()"
});
formatter.result({
  "duration": 1383617600,
  "status": "passed"
});
formatter.match({
  "location": "test1.press_enter()"
});
formatter.result({
  "duration": 1126982200,
  "status": "passed"
});
formatter.match({
  "location": "test1.pop_up_appears()"
});
formatter.result({
  "duration": 68300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CA",
      "offset": 23
    }
  ],
  "location": "test1.user_select_the_entry(String)"
});
formatter.result({
  "duration": 3252358200,
  "status": "passed"
});
formatter.match({
  "location": "test1.navigated_to_Sunnyvale_Real_Estate_page()"
});
formatter.result({
  "duration": 131500,
  "status": "passed"
});
formatter.match({
  "location": "test1.test_Sunnyvale_in_search_box()"
});
formatter.result({
  "duration": 2551409000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "800",
      "offset": 25
    },
    {
      "val": "850",
      "offset": 48
    }
  ],
  "location": "test1.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 2509736500,
  "status": "passed"
});
formatter.match({
  "location": "test1.verify_List_of_homes_appears_from_Sunnyvale_CA_USA_otherwise_error()"
});
formatter.result({
  "duration": 2830008400,
  "status": "passed"
});
formatter.match({
  "location": "test1.close_the_browser()"
});
formatter.result({
  "duration": 33900,
  "status": "passed"
});
formatter.after({
  "duration": 934928400,
  "status": "passed"
});
formatter.before({
  "duration": 5628688300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Sunnyvale homes list in Redfin.com",
  "description": "",
  "id": "test-redfin.com-to-find-sunnyvale-homes;verify-sunnyvale-homes-list-in-redfin.com;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "www.Redfin.com site to launch",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter Sunnyvale in searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "press enter",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user select the entry \"TX\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "navigated to Sunnyvale Real Estate page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Test Sunnyvale in search box",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the min price as \"600\" and max price as \"800\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify List of homes appears from Sunnyvale,CA,USA otherwise error",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "test1.www_Redfin_com_site_to_launch()"
});
formatter.result({
  "duration": 3446891700,
  "status": "passed"
});
formatter.match({
  "location": "test1.user_enter_Sunnyvale_in_searchbox()"
});
formatter.result({
  "duration": 1294317200,
  "status": "passed"
});
formatter.match({
  "location": "test1.press_enter()"
});
formatter.result({
  "duration": 1121547500,
  "status": "passed"
});
formatter.match({
  "location": "test1.pop_up_appears()"
});
formatter.result({
  "duration": 41900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TX",
      "offset": 23
    }
  ],
  "location": "test1.user_select_the_entry(String)"
});
formatter.result({
  "duration": 3040643200,
  "status": "passed"
});
formatter.match({
  "location": "test1.navigated_to_Sunnyvale_Real_Estate_page()"
});
formatter.result({
  "duration": 251200,
  "status": "passed"
});
formatter.match({
  "location": "test1.test_Sunnyvale_in_search_box()"
});
formatter.result({
  "duration": 2028409000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "600",
      "offset": 25
    },
    {
      "val": "800",
      "offset": 48
    }
  ],
  "location": "test1.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 2879966400,
  "status": "passed"
});
formatter.match({
  "location": "test1.verify_List_of_homes_appears_from_Sunnyvale_CA_USA_otherwise_error()"
});
formatter.result({
  "duration": 21111069300,
  "status": "passed"
});
formatter.match({
  "location": "test1.close_the_browser()"
});
formatter.result({
  "duration": 41500,
  "status": "passed"
});
formatter.after({
  "duration": 833921500,
  "status": "passed"
});
});