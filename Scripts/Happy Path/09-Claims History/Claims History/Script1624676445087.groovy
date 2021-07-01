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

WebUI.waitForElementClickable(findTestObject('09-Claims History/01-txt_LossRunDate'), GlobalVariable.Wait)

WebUI.click(findTestObject('09-Claims History/01-txt_LossRunDate'))

WebUI.click(findTestObject('09-Claims History/01-txt_LossRunDate'))

WebUI.setText(findTestObject('09-Claims History/01-txt_LossRunDate'), CH_LossRunDate)

WebUI.click(findTestObject('09-Claims History/select_Please SelectGN'))

WebUI.selectOptionByLabel(findTestObject('09-Claims History/select_Please SelectGN'), CH_GroundupNet, false)

WebUI.setText(findTestObject('09-Claims History/03-txt_LossTotal'), CH_LossTotal)

WebUI.setText(findTestObject('09-Claims History/04-txt_LossCap'), CH_IncLoss)

WebUI.setText(findTestObject('09-Claims History/05-txt_PropertyDamage'), CH_PDIncLoss)

WebUI.setText(findTestObject('09-Claims History/06-txt_ClaimCount_BIPIP'), CH_ClaimCount)

WebUI.setText(findTestObject('09-Claims History/07-txt_ClaimCount_Damage'), CH_ClaimCount_PD)

WebUI.setText(findTestObject('09-Claims History/08-txt_OpenClaims'), CH_OpenClaims)

WebUI.setText(findTestObject('09-Claims History/09-txt_NetLoss'), '1500')

WebUI.setText(findTestObject('09-Claims History/10-txt_TotalClaim'), '1500')

WebUI.setText(findTestObject('09-Claims History/11-txt_NumberClaims_Cargo'), '1500')

WebUI.setText(findTestObject('09-Claims History/12-txt_NumberClaims_GenLiab'), '1500')

WebUI.click(findTestObject('09-Claims History/btn_Next'))

