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

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Search/Search Asset/Page_AIMS-AMX - Home/input_Post Inspection Actions where BRC ove_135588'), 
    GlobalVariable.AMXid)

not_run: WebUI.setText(findTestObject('Object Repository/AIMS/Components/Search/Search Asset/Page_AIMS-AMX - Home/input_Post Inspection Actions where BRC ove_135588'), 
    '782207')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Search/Search Asset/Page_AIMS-AMX - Home/button_Post Inspection Actions where BRC ov_6f865e'))

WebUI.delay(5)

AssetSearch = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Search/Search Asset/Page_AIMS-AMX - Home/div_782194'), 
    'text', 'equals', GlobalVariable.AMXid, true)

not_run: AssetSearch = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Search/Search Asset/Page_AIMS-AMX - Home/div_782194'), 
    'text', 'equals', '782207', true)

WebUI.click(AssetSearch)

WebUI.delay(4)

