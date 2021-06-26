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

WebUI.waitForElementClickable(findTestObject('03-Applicant/02-Business Details/01-toggle_Venture'), GlobalVariable.Wait)

WebUI.setText(findTestObject('03-Applicant/02-Business Details/02-txt_YearEstablished'), BD_YearEstablished)

WebUI.click(findTestObject('03-Applicant/02-Business Details/02-txt_1stYear'))

WebUI.scrollToPosition(9999999, GlobalVariable.Position_Y)

WebUI.waitForElementClickable(findTestObject('03-Applicant/02-Business Details/03-dropDown_BusinessType'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/02-Business Details/03-dropDown_BusinessType'), BD_BusinessType, 
    false)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/02-Business Details/04-dropDown_MainUse'), BD_MainUse, false)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/02-Business Details/05-dropDown_AcctCategory'), BD_AcctCategory, 
    false)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/02-Business Details/06_dropDown_UWAcctCategory'), BD_UWAcctCategory, 
    false)

WebUI.setText(findTestObject('03-Applicant/02-Business Details/07-txt_Description'), 'TEST Description')

WebUI.setText(findTestObject('03-Applicant/02-Business Details/08-txt_FederalID'), '123456789')

WebUI.setText(findTestObject('03-Applicant/02-Business Details/09-txt_NAICSCode'), '1234567890')

//Writing SubmissionNumber
String quoteNumber = WebUI.getText(findTestObject('03-Applicant/02-Business Details/00-lbl_SubmissionNumber'))

CustomKeywords.'policyNumber.getPolicyNumber.getQuoteNumber'(quoteNumber)
//End
WebUI.click(findTestObject('03-Applicant/02-Business Details/btn_Next'))

