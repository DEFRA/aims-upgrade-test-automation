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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/button_DefectsWork'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/button_ADD'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/span_6 - Asset Defect'))

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/a_Structural damage to asset'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/textarea_Defect Comments _e____5b43d6c5-20f_7ab4a5'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/input_Quantity _e____2a441be7-0ea4-4aca-809_7185a7'), 
    '100')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/input_Units _e____13cfcf0c_9aea_4eec_b146_9_593660'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/a_cm'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/input_Location_____c645d3cc-0785-4427-9a69-_0ca61c'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/input_Search_locationSearchTextbox'), 
    'cv37 6sb')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/button_Search'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/input_Search_btnSave'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/button_Create'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Create/Create Defect/Page_AMX Web Application - Home/td_ST2000031'), 
    1)

