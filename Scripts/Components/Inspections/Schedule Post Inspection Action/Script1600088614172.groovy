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

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/span_Note This Asset is below Required Condition'), 
    2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/input_Below Required Condition_newitem_asse_da141f'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Description  Instruction_e____577c_9069f5'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Inspections'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/td_Post Inspection Process'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Edit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/input_Post Inspection Action_e____d16279a3__d7e92c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/a_Significant Fix'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/input_Proposed Funding Programme_e____e96c6_2302a2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/a_NA'))

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Probability of Failure_e____b6dc9b_9df1ed'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Consequence of Failure_e____95f372_36d953'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_BRC Assessment Comments_e____daa7f_733185'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Reason for Choosing Rate and Regim_ca8271'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Mitigation Measures_e____582bf50b-_4c5571'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/textarea_Designated Engineer Comments_e_____09917a'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Complete'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/AIMS/Components/Inspection/Post Inspection Process/Page_AMX Web Application - Home/td'))

