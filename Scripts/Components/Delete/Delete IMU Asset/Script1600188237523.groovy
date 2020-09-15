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

WebUI.click(findTestObject('Object Repository/AIMS/Components/Delete/Delete Asset/Page_AIMS-AMX - Home/i_Open In New Window_fal fa-trash-alt'))

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Delete/Delete Asset/Page_AIMS-AMX - Home/input_Password Required_TextBoxPassword'), 
    findTestData('Authentication/Users').getValue(2, 1))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Delete/Delete Asset/Page_AIMS-AMX - Home/input_Password Required_btnDelete'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Delete/Delete Asset/Page_AIMS-AMX - Home/input_Are you sure you want to delete this _1b18cd'))

WebUI.delay(1)

