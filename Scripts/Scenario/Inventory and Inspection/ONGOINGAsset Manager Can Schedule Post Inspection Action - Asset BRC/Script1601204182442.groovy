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

WebUI.callTestCase(findTestCase('Components/Authentication/Log In'), [('URL') : GlobalVariable.Environment, ('Username') : findTestData(
            'Authentication/Users').getValue(1, 1), ('Password') : findTestData('Authentication/Users').getValue(2, 1)], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Navigation/Select Capability'), [('temp') : findTestData('Navigation/SelectCapability').getValue(
            1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Create/Create Asset'), [('AssetType') : findTestData('Assets/Create Asset').getValue(
            1, 8), ('SubType') : findTestData('Assets/Asset Sub Types/Defence ST').getValue(1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Search/Search Asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Create/Create Inspection'), [('InspectionType') : findTestData('Inspections/Inspection Type').getValue(
            1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Inspections/Complete Inspection'), [('InspectionType') : findTestData('Inspections/Inspection Type').getValue(
            1, 1), ('InspectionSchedule') : findTestData('Inspections/Inspection Type').getValue(2, 1), ('InspectionGroup') : findTestData(
            'Inspections/Inspection Type').getValue(3, 1), ('AssetSubType') : findTestData('Assets/Asset Sub Types/Defence ST').getValue(
            1, 1), ('InspectionCondition') : findTestData('Inspections/Inspection Condition').getValue(1, 5), ('BRC') : findTestData(
            'Inspections/BRC').getValue(1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Search/Search Asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Validation/Validate Asset BRC'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Search/Search Asset'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Delete/Delete Asset'), [('Password') : findTestData('Authentication/Users').getValue(
            2, 1)], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Authentication/Log Out'), [:], FailureHandling.STOP_ON_FAILURE)

