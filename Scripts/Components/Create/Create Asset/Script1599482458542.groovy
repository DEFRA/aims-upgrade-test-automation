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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_All Live Assets'))

WebUI.waitForElementClickable(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Add'), 
    5)

//Needed to select the Add button twice
WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Add'))

WebUI.waitForElementClickable(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Aids to Navigation'), 
    5)

SelectAssetType = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Aids to Navigation'), 
    'text', 'equals', AssetType, true)

System.out.println(AssetType)

WebUI.click(SelectAssetType)

SelectSubType = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/a_Beacon'), 
    'text', 'equals', SubType, true)

System.out.println(SubType)

WebUI.click(SelectSubType)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/input_Name_e____3bfba7b0-e8c0-44be-b2d4-1d6_343fe7'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Primary Purpose _dropDownButton_e____2ae94c'))

WebUI.waitForElementClickable(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/a_Conservation'), 
    5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/a_Conservation'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/input_Asset Description_e____6235d563-07e2-_2eb676'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/input_Map Location (Point)_____926e1699-eba_c57cb8'))

WebUI.delay(2)

//Postcode can be changed to anything valild
WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/input_Search_locationSearchTextbox'), 
    'CV37 6SN')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/input_Search_btnSave'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Asset Owner _dropDownButton_e____a42_a9a11a'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Environment Agency'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/a_Environment Agency'))

WebUI.delay(2)

AMXid = WebUI.getAttribute(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/Page_AIMS-AMX - Home/AMXid2'), 
    'value')

GlobalVariable.AMXid = AMXid

//Creates a variable of the full asset name created.  Allows for validation and subsequent searching and deleting.
LongID = (('Automation (' + AMXid) + ')')

System.out.println(LongID)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/button_Create'))

WebUI.delay(5)

//Inserts the variable into the test object
AssetID = WebUI.modifyObjectProperty(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/li_Automation1 (782182)'), 
    'text', 'equals', LongID, true)

//Valiadtes that the new asset is created and subsequently visible
WebUI.verifyElementPresent(AssetID, 5)

//Validates that all the expected tabs are displayed
if (AssetType == 'Asset Complex') {
    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Asset Type Change'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Details'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Location'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Photos'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Relationships'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Responsibilities'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Restrictions'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_SIA'), 1)
} else {
    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Asset Type Change'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Details'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Dimensions'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Elements'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Location'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Photos'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Relationships'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Responsibilities'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_Restrictions'), 
        1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_SIA'), 1)

    WebUI.verifyElementPresent(findTestObject('AIMS/Components/Create/Verifications/Page_AIMS-AMX - Home/button_TargetsKPI'), 
        1)
}

not_run: WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Home'))

