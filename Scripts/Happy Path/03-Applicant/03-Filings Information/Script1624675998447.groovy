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

//Filings Information
WebUI.waitForElementClickable(findTestObject('03-Applicant/03-Fillings Information/01-toggle_ARatedCarrier'), GlobalVariable.Wait)

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/01-toggle_ARatedCarrier'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/02-toggle_FilingsRequired'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/03-multi-dropDown_requiredFilings'))

WebUI.check(findTestObject('03-Applicant/03-Fillings Information/04-checkBox_SelectAll'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/05-txt_USDot'))

WebUI.setText(findTestObject('03-Applicant/03-Fillings Information/05-txt_USDot'), '12345678')

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/06-toggle_OthersAllowed'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/07-toggle_AllowedOperatePast'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/08-toggle_OperatorsWork_NO'))

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/09_toggle_DOTNumber'))

WebUI.setText(findTestObject('03-Applicant/03-Fillings Information/10_txt_DOT'), '12345678')

WebUI.click(findTestObject('03-Applicant/03-Fillings Information/11_btn_Next'))

