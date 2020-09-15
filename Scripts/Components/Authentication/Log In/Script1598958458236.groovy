import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.TestEnv)

WebUI.setText(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_User Name_UserName'), Username)

WebUI.setText(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_Password_Password'), Password)

WebUI.waitForElementClickable(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_WARNING_submitButton'), 15)

WebUI.delay(2)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AIMS/Log In/Page_Log in/span_Version 6.7.2857.0'))

WebUI.click(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_WARNING_submitButton'), FailureHandling.STOP_ON_FAILURE)

