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

mydate = new Date()

formattedDate = mydate.format('dd-MM-yyyy')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Edit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Name_e____6dfe88e7-3d6d-42f7-9d33-5e9_07c442'), 
    'Automation Edited')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Primary Purpose _e____e90cb9a3_fae1_4_a6aa96'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_Flood Risk Management'))


WebUI.delay(2)

//Asset Complex does not require selection of this field

if (AssetType != 'Asset Complex') {
WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Protection Type _e____52b86f75_4e28_4_890d39'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_FluvialTidal'))
WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/tr_DescriptionTest AutomationTarget Condition'))
WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/textarea_Test Automation'), 
    'Tested Automation Edited')
WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Target Condition_e____c5a810cc_59b7_4_542066'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_1 - Very Good'))
}

if (AssetType == 'Asset Complex') {
	WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Complex/Page_AMX Web Application - Home/input_Asset Description'), 'Test Automation Edited')

}
WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/textarea_Comments_e____d8071954-74f8-4dfd-b_20e506'), 
    'Test Automation Edited')

WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'))

WebUI.delay(2)

if (AssetType == 'Defence') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Natural  Engineered Asset (Not valid - m_84efe3'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Current SOP (Not valid - must contain a _6b1f12'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Current SOP Date (Not valid - must conta_8158ab'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP (Not valid - must contain a v_35447d'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP DQF (Not valid - must contain_86e98f'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP DQF Date (Not valid - must co_3dfdc6'), 
        1)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Details'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Natural  Engineered Asset _e____660d3_974b15'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_Engineered'))

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Current SOP _e____bb06b32d-6e01-44c8-_d458b8'), 
        '5')

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Current SOP Date'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Design SOP _e____3b139a12-bbae-4df0-9_f2fe7e'), 
        '5')

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Design SOP DQF _e____76b1208e_2ff8_49_9e6894'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_1 - Good'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Design SOP DQF Date'), 
        formattedDate)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'))

    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design DCL (mAOD) (Not valid - must cont_1d73bb'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design UCL (mAOD) (Not valid - must cont_a68c9d'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual DCL (mAOD) (Not valid - must cont_573c04'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual UCL (mAOD) (Not valid - must cont_5b06a6'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual DCL Date (Not valid - must contai_b31490'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual UCL Date (Not valid - must contai_5adf5f'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual DCL DQF (Not valid - must contain_39d379'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual UCL DQF (Not valid - must contain_db96d9'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual DCL DQF Date (Not valid - must co_5b8063'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Actual UCL DQF Date (Not valid - must co_790777'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Required DCL (mAOD) (Not valid - must co_6a5679'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Required UCL (mAOD) (Not valid - must co_e08b40'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Effective Crest Level (mAOD) (Not valid _06ddf0'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Effective Crest Level Date (Not valid - _f3cd76'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Effective Crest Level DQF (Not valid - m_52f2ff'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Effective Crest Level DQF Date (Not vali_831839'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Verified Crest Levels (Not valid - must _326d5e'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Crest Level Date (Not valid - must conta_bc37b0'), 
        1)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Dimensions'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Design DCL (mAOD) _e____3aa8bd5d-e20e_a55adf'), 
        '5')

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Actual DCL (mAOD) _e____4d3ed3dd-37d7_35e075'), 
        '5')

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Actual DCL DQF _e____094e9fe0_a3a1_49_bcd348'))

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_1 - - 0.01m to 0.05m vertical accuracy (T_8ad1c7'))

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Required DCL (mAOD) _e____52b0b338-4e_32d4d4'), 
        '5')

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Effective Crest Level (mAOD) _e____f7_a0cd74'), 
        '5')

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Effective Crest Level DQF _e____46ab8_19d4a9'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_2 - - 0.05m to 0.15m vertical accuracy (T_cdf4bf'))

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Verified Crest Levels _e____91b0ba30__2d42d8'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_2 - No'))

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Design UCL (mAOD) _e____d0f6b73e-8d06_962c2a'), 
        '5')

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Actual UCL (mAOD) _e____1151e724-34ca_09e09b'), 
        '5')

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Actual UCL DQF _e____a12d5831_a1fd_4c_65486f'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_3 - - 0.15m to 0.75m vertical accuracy (T_80aba7'))

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Required UCL (mAOD) _e____3e866e2a-9d_18aa8c'), 
        '5')

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Actual DCL Date _e____85b7451f-8fea-4_b84cb7'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Actual DCL DQF Date _e____7931e79e-b5_6459f9'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Effective Crest Level Date _e____76dd_467f9c'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Crest Level Date _e____7be220d8-fac1-_1ead70'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Actual UCL Date _e____04b392bb-1955-4_99eb3d'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Actual UCL DQF Date _e____9b5617a5-30_1c58d0'), 
        formattedDate)

    WebUI.setText(findTestObject('Object Repository/AIMS/Components/Edit/Page_AMX Web Application - Home/input_Effective Crest Level DQF Date _e_____fb402f'), 
        formattedDate)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'))

    WebUI.delay(5)

    //When the Save button is no longer visible this indicates that the Asset has been successfully edited
    WebUI.verifyElementNotPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'), 
        2)

    WebUI.delay(2)
}

if (AssetType == 'Channel') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Current SOP (Not valid - must contain a _6b1f12'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Current SOP Date (Not valid - must conta_8158ab'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP (Not valid - must contain a v_35447d'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP DQF (Not valid - must contain_86e98f'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/li_Design SOP DQF Date (Not valid - must co_3dfdc6'), 
        1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/li_Culvert Type (Not valid - must contain a_216214'), 
        1)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Details'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/input_Culvert Type _e____55412cbc_ba2c_4130_420cc2'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/a_Box'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Current SOP _e____bb06b32d-6e01-44c8-_66a9cf'), 
        '5')

    WebUI.delay(2)

    WebUI.setText(findTestObject('AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Current SOP Date'), 
        formattedDate)

    WebUI.setText(findTestObject('AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Design SOP _e____3b139a12-bbae-4df0-9_8683d5'), 
        '5')

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/input_Design SOP DQF _e____76b1208e_2ff8_49_9e6894'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/a_1 - Good'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('AIMS/Components/Edit/Edit Asset/Channel/Page_AMX Web Application - Home/Page_AMX Web Application - Home/input_Current DQF Date'), 
        formattedDate)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'))

    WebUI.delay(5)

    //When the Save button is no longer visible this indicates that the Asset has been successfully edited
    WebUI.verifyElementNotPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'), 
        2)

    WebUI.delay(2 //When the Save button is no longer visible this indicates that the Asset has been successfully edited
        )
} else {
    WebUI.verifyElementNotPresent(findTestObject('Object Repository/AIMS/Components/Edit/Edit Asset/Page_AMX Web Application - Home/button_Save'), 
        2)

    WebUI.delay(2)
}

