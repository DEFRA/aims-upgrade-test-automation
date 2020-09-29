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

mydate = new Date()

formattedDate = mydate.format('dd-MM-yyyy')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/a_Schedule Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/span_FCRM Inspections'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/span_FCRM Ad Hoc Inspections'))

'Modify text of nspection Type object'
SelectInspectionType = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/a_Ad Hoc Visual Asset Inspection'), 
    'text', 'equals', InspectionType, true)

'Click on required Inspection Type'
WebUI.click(SelectInspectionType)

WebUI.delay(4)

not_run: WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/input_Schedule Date _e____4e3cc39a-21f5-475_3f5123'), 
    formattedDate)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/textarea_Description  Instruction_e____577c_6f50bb'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/input_Create_btnCreateAndView'))

WebUI.delay(5)

InspectionID = WebUI.getAttribute(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/input_Inspection Id_____92754d08-47dd-4309-_1ef252'), 
    'value')

//Capture the Inspection ID and make sure its not blank, confirms inspection is successfully created.
System.out.println(InspectionID)

GlobalVariable.InspectionID = InspectionID

WebUI.verifyNotEqual(InspectionID, 'blank')

not_run: WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/input_Schedule Date _e____4e3cc39a-21f5-475_3f5123'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/b_ Back'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/span_FCRM Ad Hoc Inspections'))

WebUI.delay(2)

formattedDateUS = mydate.format('MM/dd/yyyy')

//Removes the leading 0 from the date
String s = formattedDateUS

s = s.replaceFirst('^0*', '')

System.out.println(formattedDateUS)

System.out.println(s)

InspectionTypeID = ((InspectionType + ' - ') + s)

SelectInspectionID = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Create Inspection/Page_AMX Web Application - Home/a_Ad Hoc Visual Asset Inspection - 9162020'), 
    'text', 'equals', InspectionTypeID, true)

System.out.println(InspectionTypeID)

WebUI.click(SelectInspectionID)

WebUI.delay(4)

