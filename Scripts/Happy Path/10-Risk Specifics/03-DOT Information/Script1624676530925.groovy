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

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/03-DOT Information/01-toggle_DOTNumber'), GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/01-toggle_DOTNumber'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/02-toggle_StayIntrastate'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/03-toggle_IntrastateAuth'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/04-txt_DOTRegistration'))

WebUI.setText(findTestObject('10-Risk Specifics/03-DOT Information/04-txt_DOTRegistration'), '04102021')

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/05-toggle_DOTActive'))

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/03-DOT Information/06-dropDown_Chameleon'), 'Multiple - Major', 
    false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/03-DOT Information/07-dropDown_SaferRating'), 'Satisfactory', 
    false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/03-DOT Information/08-dropDown_CabRating'), 'Yellow', false)

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/09-toggle_policyLevelAccidents'))

WebUI.setText(findTestObject('10-Risk Specifics/03-DOT Information/10-txt_HowMany'), '2')

WebUI.scrollToPosition(0, 9999999)

//Basic Alert - Select Yes or No
WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/01-toggle_UnsafeDriving'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/02-toggle_HoursService'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/03-toggle_DriverFitness'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/04-toggle_ControlledSubstance'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/05-toggle_VehicleMaintenance'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/00_Basic Alert - Select Yes or No/06-toggle_Crash'))

WebUI.click(findTestObject('10-Risk Specifics/03-DOT Information/btn_Next'))

