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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Navigation/Page_AIMS-AMX - Home/button_Inventory and Inspections'))

//The capability to select is driven from the data table 'Select Capability' all the options are listed in the data table
//When calling this test in another test specify the line number from the data table for the required capability

findTestData('Navigation/SelectCapability').getValue(1, 1)

capability = (('id("' + temp) + '")/div[@class="ng-binding"]')

System.out.println(temp)

System.out.println(capability)

'Modify xpath of Capability Drop Down'
SelectCapability = WebUI.modifyObjectProperty(findTestObject('Object Repository/AIMS/Components/Navigation/Page_AIMS-AMX - Home/div_Inventory and Inspections'), 
    'xpath', 'equals', capability, true)

'Click on required capability'
WebUI.click(SelectCapability)

