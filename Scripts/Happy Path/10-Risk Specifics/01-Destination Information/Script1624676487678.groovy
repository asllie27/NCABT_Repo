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

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/01-btn_Add'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/01-btn_Add'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/02-txt_ZipCode'), '32003')

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/03-dropDown_City'))

WebUI.selectOptionByValue(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/03-dropDown_City'), 
    'Fleming Island', false)

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/04-txt_Travel'), '500')

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/05-btn_AddDestination'))

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/01-btn_Add'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/01-btn_Add'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/02-txt_ZipCode'), '07001')

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/04-txt_Travel'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/04-txt_Travel'), '500')

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/01_Destinations Table/05-btn_AddDestination'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/06-txt_0-50'), '500')

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/07-txt_51-200'), '300')

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/08-txt_200'), '200')

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/09-txt_OwnerOperator'), 
    '1000')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.waitForElementVisible(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/10-toggle_NYC'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/10-toggle_NYC'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/11-txt_DescribeExp'), 
    'TEST')

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/btn_Next'))

