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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/button_Location'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/button_New'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/button_ADD'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/input_Search_locationSearchTextbox'), 
    'b93 0hn')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/input_Search_btnSave'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_1'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_Point Description'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_Grid Reference'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_Longitude'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_Latitude'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_Point Index'), 
    1)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Location/Page_AMX Web Application - Home/td_DistancefromLastPoint'), 
    1)

WebUI.click(findTestObject('Object Repository/Page_AMX Web Application - Home/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_AMX Web Application - Home/button_Create'))

WebUI.delay(4)

