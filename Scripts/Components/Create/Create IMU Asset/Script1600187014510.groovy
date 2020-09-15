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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/span_Inspections  Assessment'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/span_Manage IMUs'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/span_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/a_Visual Inspection'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Water Management Area _e____bec72fa6__9a416c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/a_WMD - West Midlands'))

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Name _e____da6a8e6f-9c30-49eb-a899-5e_d11a24'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Description _e____57948ca4-2e8e-4c12-_9538be'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Probability _e____7b6ca4c8_3816_4c39__7ffab3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/a_High'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Consequence _e____64fb164e_4d7c_4ea4__0de28c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/a_Medium'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Default Inspector_e____db4b6876_148e__c835e0'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/a_Jon Hatfield'))

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/textarea_Comments_e____232c67b8-b84b-483e-9_3a0ceb'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/button_Create'))

WebUI.delay(2)

IMUid = WebUI.getAttribute(findTestObject('Object Repository/AIMS/Components/Create/Create IMU Asset/Page_AMX Web Application - Home/input_Reference_____e82e2a47-47f9-4a04-9ba7_32ef0c'),
	'value')

GlobalVariable.IMUid = IMUid