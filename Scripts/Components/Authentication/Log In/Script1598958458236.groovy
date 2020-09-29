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

WebUI.navigateToUrl(GlobalVariable.Environment)

WebUI.setText(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_User Name_UserName'), Username)

WebUI.setText(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_Password_Password'), Password)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_WARNING_submitButton'), 15)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Log In/Page_Log in/input_WARNING_submitButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Log In/AD/Page_Sign in to your account/input_Sign in_loginfmt'), 'jon.hatfield@defradev.onmicrosoft.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Log In/AD/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/AIMS/Log In/AD/Page_Sign in to your account/input_Enter password_passwd'), 
    '+LR8B84vOGJ1Jty4R01Xiw==')

WebUI.delay(2)

WebUI.click(findTestObject('AIMS/Log In/AD/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.delay(2)

WebUI.click(findTestObject('AIMS/Log In/AD/Page_Sign in to your account/StaySignedIn'))

WebUI.delay(2)

if (WebUI.verifyElementClickable(findTestObject('AIMS/Log In/Page_AIMS-AMX - Home/input_If there was no error_btnCancel'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('AIMS/Log In/Page_AIMS-AMX - Home/input_If there was no error_btnCancel'))
} else {
    WebUI.click(findTestObject('AIMS/Log In/Page_AIMS-AMX - Home/Page_AIMS-AMX - Home/button_Refresh'))
}

WebUI.delay(5)

