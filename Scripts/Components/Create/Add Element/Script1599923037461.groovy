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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/button_Elements'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/button_ADD Multiple'))

WebUI.delay(2)

SelectElementType = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/a_Access Point'), 
    'text', 'equals', ElementType, true)

System.out.println(ElementType)

WebUI.click(SelectElementType)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/input_Element Types_saveButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/button_Confirm'))

ConfirmElementAdded = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Add Element/Page_AMX Web Application - Home/td_Access Point'), 
    'text', 'equals', ElementType, true)

WebUI.verifyElementPresent(ConfirmElementAdded, 2)

WebUI.click(ConfirmElementAdded)

