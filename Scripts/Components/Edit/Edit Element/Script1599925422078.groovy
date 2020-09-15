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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/span_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/input_Element Description_e____09fc34a2-d4f_31b402'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/input_Element Location_e____39299166-6406-4_38c560'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/input_Element Sequence _e____9ce0d031-fa8a-_055d21'), 
    '1')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/input_Material _e____b37ecb50_059b_48f5_9d6_ce44da'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/span_Aluminium'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/a_Aluminium'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/input_Business Function _e____5777017b_b385_2f4300'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/span_Environment Agency'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/a_Air Quality'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Element/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(2)

