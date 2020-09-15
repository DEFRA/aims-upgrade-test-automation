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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Home'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/span_Inspections  Assessment'))

WebUI.delay(2)

InspectionSchedule = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/span_Scheduled (in the next year)'), 
    'text', 'equals', InspectionSchedule, true)

WebUI.doubleClick(InspectionSchedule)

WebUI.delay(2)

InspectionGroup = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/span_FCRM Ad Hoc Inspections'), 
    'text', 'equals', InspectionGroup, true)

WebUI.doubleClick(InspectionGroup)

WebUI.delay(4)

InspectionType = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/span_Ad Hoc Culvert Internal Inspection'), 
    'text', 'equals', InspectionType, true)

WebUI.doubleClick(InspectionType)

WebUI.delay(2)

WebUI.setText(findTestObject('AIMS/Components/Search/Search Inspection/Page_AMX Web Application - Home/input_Logout_textBoxQuickFilter'), 
    GlobalVariable.InspectionID)

WebUI.click(findTestObject('AIMS/Components/Search/Search Inspection/Page_AMX Web Application - Home/button_Logout_quickFilterBtn'))

WebUI.delay(2)

InspectionID = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/div_AAD2000843'), 
    'text', 'equals', GlobalVariable.InspectionID, true)

WebUI.click(InspectionID)

WebUI.delay(4)

WebUI.click(findTestObject('AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/td_Gate'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/button_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('AIMS/Components/Inspection/ENI/Page_AMX Web Application - Home/ENI'))

WebUI.delay(2)

WebUI.setText(findTestObject('AIMS/Components/Inspection/ENI/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_ENI Reason'), 
    'Test Automation')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/button_ Back'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/button_Complete'))

WebUI.delay(8)

'Verify \'Make Appoint\' button has id : \'btnMakeAppointment\''
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/td_Inspection Record Complete _col_e____679_73afb9'), 
    'checked', 'true', 2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Complete/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(6)

