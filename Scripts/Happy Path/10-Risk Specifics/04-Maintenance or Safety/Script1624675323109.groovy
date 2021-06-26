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

//Maintenance Questions
WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/01-dropDown_SafetyMeetings'),
	GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/01-dropDown_SafetyMeetings'),
	'Quarterly', false)

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/02-txt_ChargeClaims'),
	'Test Claims')

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/03-multiDropDown_GaragingType'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/03-checkBox_SelectAll'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/04-multiDropDown_Maintenance'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/04-checkBox_SelectAll'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/04-multiDropDown_Maintenance'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/04-multiDropDown_Maintenance'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/05-toggle_ManageCompany'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/06-toggle_MaintenanceVin'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/07-toggle_DriverFilesReview'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/08-AccidentReview'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/09-multiDropDown_CompanyPractices'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/01-MaintananceQuestions/10-checkBox_SelectAll'))

WebUI.scrollToPosition(0, 9999999)

//Safety Devices
WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/01-multiDropDown_SafetyDevice'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/02-checkBox_Cameras'))

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/03-checkBox_Geographic'))

WebUI.scrollToPosition(0, 9999999)

//Index 1
WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Cameras_Index1/01-toggle_1_CurrentlyPlace'))

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Cameras_Index1/02-txt_1_Description'),
	'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Cameras_Index1/03-txt_1_YearsPlace'),
	'111')

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Cameras_Index1/04-txt_1_Percentage'),
	'100')

//Index 2
WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Geographic_Index2/01-toggle_2_CurrentlyPlace'))

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Geographic_Index2/02-txt_2_Description'),
	'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Geographic_Index2/03-txt_2_YearsPlace'),
	'222')

WebUI.setText(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/Geographic_Index2/04-txt_2_Percentage'),
	'100')

WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/btn_Next'))

