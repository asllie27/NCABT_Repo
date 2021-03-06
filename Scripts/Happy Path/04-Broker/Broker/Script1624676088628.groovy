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

//Broker
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('04-Broker/01-dropDown_Agency'), B_Agency, false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('04-Broker/02-dropDown_AgentName'), B_AgentName, false)

WebUI.click(findTestObject('04-Broker/03-toggle_BrokerAcct'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('04-Broker/04-dropDown_Retailer'), 'American Business Insurance Services', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('04-Broker/05-dropDown_AgentName'), 'SubJames Business', false)

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.selectOptionByLabel(findTestObject('04-Broker/Policy Contacts/01-dropDown_SubmissionSpecialist'), 'Ashley Bond', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/Policy Contacts/02-dropDown_PSR'), 'Christina Millard', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/Policy Contacts/03-dropDown_TeamLeader'), 'Bryan Burnett', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/Policy Contacts/04-dropDown_InternalUW'), 'John Tucker Ericson', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/Policy Contacts/05-dropDown_ProductUW'), 'Abby Scott', false)

WebUI.click(findTestObject('04-Broker/10-btn_Next'))

