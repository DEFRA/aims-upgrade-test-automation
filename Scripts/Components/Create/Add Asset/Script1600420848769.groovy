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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Tools'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Bulk Update'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/a_Bulk Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/input_Search_FieldSearchTxtBox'), 
    'asset complex 2')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/a_Asset Complex 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Asset Complex 2_btn btn-default drop_5969ea'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/input_Search_guidSearch'), 
    GlobalVariable.AMXid)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/span_Automation'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Update'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Confirm'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/div_Bulk edit completed successfully'), 
    3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Asset/Page_AMX Web Application - Home/button_Close  Refresh'))

