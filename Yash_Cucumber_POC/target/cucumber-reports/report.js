$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Open browser",
  "description": "",
  "id": "google-search;open-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@OpenBrowser"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am able to open browser as \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the URL as \"http://www.amazon.co.in\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Title should be \"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 30
    }
  ],
  "location": "BrowserFactory.i_type_the_keyword_as(String)"
});
formatter.result({
  "duration": 9148907318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.co.in",
      "offset": 20
    }
  ],
  "location": "OpenUrl_And_VerifyTitle.i_enter_the_URL_as(String)"
});
formatter.result({
  "duration": 10211317351,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
      "offset": 17
    }
  ],
  "location": "OpenUrl_And_VerifyTitle.title_should_be(String)"
});
formatter.result({
  "duration": 9657993,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "To Login to Amazon website",
  "description": "",
  "id": "to-login-to-amazon-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate and logon to Amazon application",
  "description": "",
  "id": "to-login-to-amazon-website;navigate-and-logon-to-amazon-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Clicks on SignIn button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters emailID and clicks on continue",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters pwd",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_Clicks_on_SignIn_button()"
});
formatter.result({
  "duration": 18721345474,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_enters_emailID_and_clicks_on_continue()"
});
formatter.result({
  "duration": 2221729394,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_enters_pwd()"
});
formatter.result({
  "duration": 106720631,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 30409640417,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027YP1007518DT\u0027, ip: \u002710.8.101.90\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\SWETA~1.RAN\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 72.0.3626.119, webStorageEnabled: true}\nSession ID: 0d8c930c48a806162791c031b78fe1ef\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepDefination.LoginPage.user_clicks_on_Login_Button(LoginPage.java:40)\r\n\tat ✽.Then User clicks on Login Button(Login.feature:9)\r\n",
  "status": "failed"
});
formatter.uri("ProductSearch.feature");
formatter.feature({
  "line": 1,
  "name": "To verfiy the Product search functionality",
  "description": "",
  "id": "to-verfiy-the-product-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Enter product and verify the search results",
  "description": "",
  "id": "to-verfiy-the-product-search-functionality;enter-product-and-verify-the-search-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enters product in the search box",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "related search should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearch.user_enters_product_in_the_search_box()"
});
formatter.result({
  "duration": 30047386453,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d72.0.3626.119)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027YP1007518DT\u0027, ip: \u002710.8.101.90\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\SWETA~1.RAN\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 72.0.3626.119, webStorageEnabled: true}\nSession ID: 0d8c930c48a806162791c031b78fe1ef\n*** Element info: {Using\u003did, value\u003dtwotabsearchtextbox}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepDefination.ProductSearch.user_enters_product_in_the_search_box(ProductSearch.java:28)\r\n\tat ✽.Given User enters product in the search box(ProductSearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductSearch.user_clicks_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductSearch.related_search_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
});