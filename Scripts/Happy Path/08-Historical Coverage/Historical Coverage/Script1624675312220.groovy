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

WebUI.waitForElementClickable(findTestObject('08-Historical Coverage/01-txt_PTStartDate'), GlobalVariable.Wait)

WebUI.click(findTestObject('08-Historical Coverage/01-txt_PTStartDate'))

WebUI.setText(findTestObject('08-Historical Coverage/01-txt_PTStartDate'), HC_PolStartDate)

WebUI.click(findTestObject('08-Historical Coverage/Outside/Outside_1'))

WebUI.setText(findTestObject('08-Historical Coverage/03-txt_CarrierBroker'), 'TEST INSURANCE')

WebUI.setText(findTestObject('08-Historical Coverage/04-txt_LiabilityLimits'), HC_LiabilityLimits)

WebUI.setText(findTestObject('08-Historical Coverage/05-txt_LiabilityDed'), HC_LiabilityDeductible)

WebUI.setText(findTestObject('08-Historical Coverage/06-txt_ALVehicle'), '150000')

WebUI.setText(findTestObject('08-Historical Coverage/07-txt_PDVechicle'), '12500')

WebUI.setText(findTestObject('08-Historical Coverage/08-txt_TotalPVehicle'), '12500')

WebUI.setText(findTestObject('08-Historical Coverage/09-txt_NoVehicle'), '20')

WebUI.click(findTestObject('08-Historical Coverage/10-txt_LossRunDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('08-Historical Coverage/10-txt_LossRunDate'), '03102021')

WebUI.setText(findTestObject('08-Historical Coverage/11-txt_NoPowerUnits'), HC_PowerUnits)

WebUI.setText(findTestObject('08-Historical Coverage/12-txt_NoSpareVehicle'), '300')

WebUI.setText(findTestObject('08-Historical Coverage/13-txt_NoDriver'), '400')

WebUI.setText(findTestObject('08-Historical Coverage/CollisionDeductible'), HC_CollisionDeductible)

WebUI.setText(findTestObject('08-Historical Coverage/ComprehensiveDeductible'), HC_CompreDeductible)

WebUI.setText(findTestObject('08-Historical Coverage/14-txt_CargoLimits'), '12500')

WebUI.setText(findTestObject('08-Historical Coverage/15-txt_RefCargoLimits'), '12500')

WebUI.waitForElementClickable(findTestObject('08-Historical Coverage/16-txt_GrossRevenues'), GlobalVariable.Wait)

WebUI.setText(findTestObject('08-Historical Coverage/16-txt_GrossRevenues'), '125000')

WebUI.setText(findTestObject('08-Historical Coverage/17-txt_TotalFleetMileage'), HC_TotalFleetMileage)

WebUI.setText(findTestObject('08-Historical Coverage/18-txt_NoOneWayTrips'), '12500')

WebUI.click(findTestObject('08-Historical Coverage/btn_Next'))

