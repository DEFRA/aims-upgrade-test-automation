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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/button_Relationships'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/button_Select'))

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/input_concat(id(, , txtSearch, , ))_txtSearch'), 
    GlobalVariable.AMXidDep)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/input_concat(id(, , btnSearch, , ))_btnSearch'))

WebUI.delay(2)

RelationID = (('Automation (' + GlobalVariable.AMXidDep) + ')')

System.out.println(RelationID)

AddRelationship = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/a_Automation (782231)'), 
    'text', 'equals', RelationID, true)

WebUI.delay(2)

WebUI.click(AddRelationship)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/a_Remove Association'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Relationship/Page_AMX Web Application - Home/button_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Create/Asset Aid to Navigation/Page_AIMS-AMX - Home/span_Home'))

WebUI.delay(4)

