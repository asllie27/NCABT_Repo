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


WebUI.scrollToPosition(10, 10)

//1-9
for (int i = 1; i <= 9; i++) {

	WebUI.scrollToPosition(10, 10)
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('06-Vehicle/01-btn_Add'))
	
	WebUI.waitForElementClickable(findTestObject('06-Vehicle/02-dropDown_Year'), GlobalVariable.Wait)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/02-dropDown_Year'), V_Year, false)
	
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('06-Vehicle/03-txt_Make'), V_Make)
	
	WebUI.setText(findTestObject('06-Vehicle/04-txt_Model'), V_Model)
	
	WebUI.setText(findTestObject('06-Vehicle/05-txt_VIN'), 'CAR0000000000000' + i)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/20-dropDown_RegisteredState'), V_RegisteredState, false)
	
	WebUI.setText(findTestObject('06-Vehicle/06-txt_Style'), 'STYLE TEST')
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/07_dropDown_VehicleType'), 'Power Unit', false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/08-dropDown_GrossVehicle'), V_GrossVehicleWeight, false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/09-dropDown_VehicleDescription'), V_VehicleDescription, false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/10-dropDown_VehicleBusinessClass'), V_BusinessClass, false)
	
	//Toggle
	WebUI.click(findTestObject('06-Vehicle/11-toggle_CompFT'))
	
	WebUI.click(findTestObject('06-Vehicle/11-toggle_CompFT'))
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/12-dropDown_CompFT'), V_CompFT, false)
	
	WebUI.click(findTestObject('06-Vehicle/13-toggle_Collision'))
	
	WebUI.click(findTestObject('06-Vehicle/13-toggle_Collision'))
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/14-dropDown_CollDed'), V_Collision, false)
	
	//END
	WebUI.setText(findTestObject('06-Vehicle/15-txt_StatedAmt'), V_StatedAmount)
	
	//Set to NO
	WebUI.click(findTestObject('06-Vehicle/16-toggle_Cargo'))
	
	//Set to YES
	WebUI.click(findTestObject('06-Vehicle/16-toggle_Cargo'))
	
	//Set to NO
	WebUI.click(findTestObject('06-Vehicle/17-toggle_Refrigeration'))
	
	//Set to YES
	WebUI.click(findTestObject('06-Vehicle/17-toggle_Refrigeration'))
	
	WebUI.scrollToElement(findTestObject('06-Vehicle/18-dropDown_UseClass'), GlobalVariable.Wait)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/18-dropDown_UseClass'), V_UseClass, false)
	
	WebUI.waitForElementClickable(findTestObject('06-Vehicle/19-btn_AddVehicle'), GlobalVariable.Wait)
	
	WebUI.click(findTestObject('06-Vehicle/19-btn_AddVehicle'))
}

//10-12
for (int i = 10; i <= 12; i++) {

	WebUI.scrollToPosition(10, 10)
	
	WebUI.waitForElementClickable(findTestObject('06-Vehicle/01-btn_Add'), GlobalVariable.Wait)
	
	WebUI.click(findTestObject('06-Vehicle/01-btn_Add'))
	
	WebUI.waitForElementClickable(findTestObject('06-Vehicle/02-dropDown_Year'), GlobalVariable.Wait)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/02-dropDown_Year'), V_Year, false)
	
	WebUI.setText(findTestObject('06-Vehicle/03-txt_Make'), V_Make)
	
	WebUI.setText(findTestObject('06-Vehicle/04-txt_Model'), V_Model)
	
	WebUI.setText(findTestObject('06-Vehicle/05-txt_VIN'), 'CAR000000000000' + i)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/20-dropDown_RegisteredState'), V_RegisteredState, false)
	
	WebUI.setText(findTestObject('06-Vehicle/06-txt_Style'), 'STYLE TEST')
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/07_dropDown_VehicleType'), 'Power Unit', false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/08-dropDown_GrossVehicle'), V_GrossVehicleWeight, false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/09-dropDown_VehicleDescription'), V_VehicleDescription, false)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/10-dropDown_VehicleBusinessClass'), V_BusinessClass, false)
	
	//Toggle
	WebUI.click(findTestObject('06-Vehicle/11-toggle_CompFT'))
	
	WebUI.click(findTestObject('06-Vehicle/11-toggle_CompFT'))
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/12-dropDown_CompFT'), V_CompFT, false)
	
	WebUI.click(findTestObject('06-Vehicle/13-toggle_Collision'))
	
	WebUI.click(findTestObject('06-Vehicle/13-toggle_Collision'))
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/14-dropDown_CollDed'), V_Collision, false)
	
	//END
	WebUI.setText(findTestObject('06-Vehicle/15-txt_StatedAmt'), V_StatedAmount)
	
	//Set to NO
	WebUI.click(findTestObject('06-Vehicle/16-toggle_Cargo'))
	
	//Set to YES
	WebUI.click(findTestObject('06-Vehicle/16-toggle_Cargo'))
	
	//Set to NO
	WebUI.click(findTestObject('06-Vehicle/17-toggle_Refrigeration'))
	
	//Set to YES
	WebUI.click(findTestObject('06-Vehicle/17-toggle_Refrigeration'))
	
	WebUI.scrollToElement(findTestObject('06-Vehicle/18-dropDown_UseClass'), GlobalVariable.Wait)
	
	WebUI.selectOptionByLabel(findTestObject('06-Vehicle/18-dropDown_UseClass'), V_UseClass, false)
	
	WebUI.waitForElementClickable(findTestObject('06-Vehicle/19-btn_AddVehicle'), GlobalVariable.Wait)
	
	WebUI.click(findTestObject('06-Vehicle/19-btn_AddVehicle'))
}

WebUI.click(findTestObject('06-Vehicle/btn_Next'))

