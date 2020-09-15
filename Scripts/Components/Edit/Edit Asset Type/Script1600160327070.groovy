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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/button_Asset Type Change'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/input_SIA_newitem_assettypechangeactivity'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/a_Dunes'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/input_Asset Type Change Reason _e____84f9ce_d6803e'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/button_Apply This Change'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset Type/Page_AMX Web Application - Home/td_Dunes'), 
    2)

