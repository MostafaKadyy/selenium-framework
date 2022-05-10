$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:UserRegitiration.feature");
formatter.feature({
  "name": "user registration",
  "description": "\tI want to check that the user can register in our commerce website.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.step({
  "name": "he entered  \t\"\u003cfirsName\u003e\" , \"\u003clastName\u003e\", \"\u003cemail\u003e\", \"\u003ccompanyName\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firsName",
        "lastName",
        "email",
        "companyName",
        "password"
      ]
    },
    {
      "cells": [
        "mostafa",
        "mortkgos",
        "hamada@kaday.com",
        "kxoxo",
        "123456ss"
      ]
    },
    {
      "cells": [
        "hasavfdn",
        "modrkaos",
        "sm2bass6@nashna.com",
        "xoxko",
        "123456ss"
      ]
    },
    {
      "cells": [
        "hasdfsan",
        "morjskos",
        "amog6a4r@nadnaa.com",
        "xkoxo",
        "123456ss"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.he_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he entered  \t\"mostafa\" , \"mortkgos\", \"hamada@kaday.com\", \"kxoxo\" , \"123456ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.he_entered(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_sucsessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.he_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he entered  \t\"hasavfdn\" , \"modrkaos\", \"sm2bass6@nashna.com\", \"xoxko\" , \"123456ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.he_entered(String,String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-COEV6PK\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.phantomjs.PhantomJSDriver\nCommand: [2a437f80-d015-11ec-9cc4-61fc5ce7e36e, clickElement {id\u003d:wdc:1652154994713}]\nCapabilities {acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: phantomjs, cssSelectorsEnabled: true, databaseEnabled: false, driverName: ghostdriver, driverVersion: 1.2.0, handlesAlerts: false, javascriptEnabled: true, locationContextEnabled: false, nativeEvents: true, platform: XP, platformName: XP, proxy: Proxy(direct), rotatable: false, takesScreenshot: true, version: 2.1.1, webStorageEnabled: false}\nElement: [[PhantomJSDriver: phantomjs on XP (2a437f80-d015-11ec-9cc4-61fc5ce7e36e)] -\u003e id: register-button]\nSession ID: 2a437f80-d015-11ec-9cc4-61fc5ce7e36e\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:591)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy31.click(Unknown Source)\r\n\tat pages.PageBase.clickButton(PageBase.java:28)\r\n\tat pages.UserRegistrationPage.userRegisteration(UserRegistrationPage.java:60)\r\n\tat steps.UserRegistration.he_entered(UserRegistration.java:39)\r\n\tat ✽.he entered  \t\"hasavfdn\" , \"modrkaos\", \"sm2bass6@nashna.com\", \"xoxko\" , \"123456ss\"(file:UserRegitiration.feature:7)\r\nCaused by: java.io.UncheckedIOException: java.net.SocketException: Connection reset\r\n\tat org.openqa.selenium.remote.http.netty.NettyHttpHandler.makeCall(NettyHttpHandler.java:80)\r\n\tat org.openqa.selenium.remote.http.AddSeleniumUserAgent.lambda$apply$0(AddSeleniumUserAgent.java:42)\r\n\tat org.openqa.selenium.remote.http.Filter.lambda$andFinally$1(Filter.java:56)\r\n\tat org.openqa.selenium.remote.http.netty.NettyHttpHandler.execute(NettyHttpHandler.java:51)\r\n\tat org.openqa.selenium.remote.http.AddSeleniumUserAgent.lambda$apply$0(AddSeleniumUserAgent.java:42)\r\n\tat org.openqa.selenium.remote.http.Filter.lambda$andFinally$1(Filter.java:56)\r\n\tat org.openqa.selenium.remote.http.netty.NettyClient.execute(NettyClient.java:124)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSCommandExecutor.execute(PhantomJSCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy31.click(Unknown Source)\r\n\tat pages.PageBase.clickButton(PageBase.java:28)\r\n\tat pages.UserRegistrationPage.userRegisteration(UserRegistrationPage.java:60)\r\n\tat steps.UserRegistration.he_entered(UserRegistration.java:39)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:45)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:65)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:135)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:673)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:220)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:945)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:193)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:808)\r\n\tat org.testng.TestRunner.run(TestRunner.java:603)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:429)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:423)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:383)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:326)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1249)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1092)\r\n\tat org.testng.TestNG.run(TestNG.java:1060)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\nCaused by: java.net.SocketException: Connection reset\r\n\tat java.base/sun.nio.ch.SocketChannelImpl.throwConnectionReset(SocketChannelImpl.java:394)\r\n\tat java.base/sun.nio.ch.SocketChannelImpl.read(SocketChannelImpl.java:426)\r\n\tat io.netty.buffer.PooledByteBuf.setBytes(PooledByteBuf.java:258)\r\n\tat io.netty.buffer.AbstractByteBuf.writeBytes(AbstractByteBuf.java:1132)\r\n\tat io.netty.channel.socket.nio.NioSocketChannel.doReadBytes(NioSocketChannel.java:350)\r\n\tat io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:151)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)\r\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)\r\n\tat io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)\r\n\tat io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)\r\n\tat io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)\r\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\r\n\tat java.base/java.lang.Thread.run(Thread.java:833)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_sucsessfully()"
});
formatter.result({
  "status": "skipped"
});
});