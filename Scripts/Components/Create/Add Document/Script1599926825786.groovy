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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/button_Documents'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/button_ADD'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/a_RE - Asset List'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/Page_AMX Web Application - Home/ChooseFile'))

WebUI.uploadFile(findTestObject('AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/Page_AMX Web Application - Home/ChooseFile'), 
    'C:\\\\Automation.doc')

not_run: WebUI.sendKeys(findTestObject('AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/Page_AMX Web Application - Home/ChooseFile'), 
    'C:\\Automation.doc')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/textarea_Comments_e____3d1ae6ae-a9e2-41b4-9_0aa639'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/input_Source _e____ba35c346_60c7_4db6_8f36__6c642c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/a_EA - Environment Agency'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/input_Author _e____56d8536f_e13e_4df7_bb28__bbefaa'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/a_EA - Environment Agency_1'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/button_Create'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Document/Page_AMX Web Application - Home/td_Test Automation'))

