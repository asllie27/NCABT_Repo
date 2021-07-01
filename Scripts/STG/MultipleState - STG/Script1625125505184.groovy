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

//Login
WebUI.callTestCase(findTestCase('STG/UW_LogIn_STG'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('STG/CreateSubmission_STG'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//Applicant
WebUI.waitForElementClickable(findTestObject('03-Applicant/01-Name and Address/01-txt_BusinessName'), GlobalVariable.Wait)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/01-txt_BusinessName'), NA_BusinessName)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/02-txt_InsuredDBA'), NA_InsuredDBA)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/03-txt_BusinessAddress'), NA_BusinessAddress)

WebUI.scrollToPosition(0, 20)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/04-txt_ZipCode'), NA_ZipCode)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/05-txt_ZipcodeOperation'))

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/05-txt_ZipcodeOperation'), NA_ZipcodeOperation)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/06-txt_BusinessPrincipal'), 'TEST Principal')

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/07-txt_Email'), 'testBT@yopmail.com')

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/08-Phone'), '1234567890')

//ADDED
//AL
not_run: String cityExpected = 'NJ'

not_run: String cityActual = WebUI.getAttribute(findTestObject('03-Applicant/01-Name and Address/Page_BoxTruck/input_State_businessStateInput'), 
    'value')

not_run: System.out.println('Value of Expected City: ' + cityExpected)

not_run: System.out.println('Value of Actual City: ' + cityActual)

not_run: WebUI.verifyMatch(cityExpected, cityActual, false)

//END
WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

//ADDING GARAGING ADDRESS
//Add Garaging Address KY 
/*
WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/01-btn_Add'))

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/02-btn_AddAddress_Blue'))

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/Address Table/03-txt_ZipCode'), '41007')

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'))

WebUI.waitForElementVisible(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'), GlobalVariable.Wait)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'), '001 KY')

WebUI.selectOptionByLabel(findTestObject('03-Applicant/01-Name and Address/Address Table/05-dropDown_City'), 'California', 
    false)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/06-btn_AddAdress_Red'))

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/07-btn_AddEntityAddress'))
*/
//End
//Add Garaging Address KY
/*
WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/01-btn_Add'))

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/02-btn_AddAddress_Blue'))

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/Address Table/03-txt_ZipCode'), '64473')

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'))

WebUI.waitForElementVisible(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'), GlobalVariable.Wait)

WebUI.setText(findTestObject('03-Applicant/01-Name and Address/Address Table/04-txt_Street'), '002 MO')

WebUI.selectOptionByLabel(findTestObject('03-Applicant/01-Name and Address/Address Table/05-dropDown_City'), 'Oregon', false)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/06-btn_AddAdress_Red'))

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/07-btn_AddEntityAddress'))

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/Delete/01-btn_Delete1'))

WebUI.waitForElementVisible(findTestObject('03-Applicant/01-Name and Address/Address Table/Delete/02-btn_PopUpYes'), GlobalVariable.Wait)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/Address Table/Delete/02-btn_PopUpYes'))

WebUI.waitForElementVisible(findTestObject('03-Applicant/01-Name and Address/09-btn_Next'), GlobalVariable.Wait)
*/
//End
WebUI.click(findTestObject('03-Applicant/01-Name and Address/09-btn_Next'))

WebUI.waitForElementClickable(findTestObject('03-Applicant/02-Business Details/01-toggle_Venture'), GlobalVariable.Wait)

//WebUI.click(findTestObject('03-Applicant/02-Business Details/01-toggle_Venture'))
//WebUI.selectOptionByValue(findTestObject('03-Applicant/02-Business Details/01-dropDown_NewVenture'), '4', false)
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

//Changes added table on going testing
/*WebUI.scrollToPosition(9999999, 9999999)

WebUI.waitForElementClickable(findTestObject('03-Applicant/02-Business Details/10-toggle_Subsidiaries'), GlobalVariable.Wait)

WebUI.click(findTestObject('03-Applicant/02-Business Details/10-toggle_Subsidiaries'))

WebUI.setText(findTestObject('03-Applicant/02-Business Details/11-txt_NameOfCompany'), 'TEST Name of Company')

WebUI.selectOptionByValue(findTestObject('03-Applicant/02-Business Details/12-dropDown_TypeOfBusiness'), '2', false)

WebUI.setText(findTestObject('03-Applicant/02-Business Details/13-txt_NumberOfVehicles'), '1234')

WebUI.setText(findTestObject('03-Applicant/02-Business Details/14-txt_Relationship'), 'TEST Relationship')

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('03-Applicant/02-Business Details/15-toggle_CompanyPast'))

WebUI.setText(findTestObject('03-Applicant/02-Business Details/16-txt_NameYearsOfOperation'), 'TEST Names 1 year')
*/
//Writing SubmissionNumber
String quoteNumber = WebUI.getText(findTestObject('03-Applicant/02-Business Details/00-lbl_SubmissionNumber'))

CustomKeywords.'policyNumber.getPolicyNumber.getQuoteNumber'(quoteNumber)

//End
WebUI.click(findTestObject('03-Applicant/02-Business Details/17-btn_Next'))

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

WebUI.waitForElementClickable(findTestObject('03-Applicant/04-Additional Interest/01-btn_AddButton'), GlobalVariable.Wait)

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/01-btn_AddButton'))

WebUI.waitForElementClickable(findTestObject('03-Applicant/04-Additional Interest/02_dropDown_EntityType'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('03-Applicant/04-Additional Interest/02_dropDown_EntityType'), AI_EntityType, false)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/03-txt_Name'), AI_Name)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/04-txt_Address'), AI_Address)

WebUI.setText(findTestObject('03-Applicant/04-Additional Interest/05-txt_ZipCode'), AI_ZipCode)

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/06-datePicker_EffectiveDate'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/08-toggle_Waiver'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/09-toggle_Primary'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/10-btn_AddAdditionalInterest'))

WebUI.click(findTestObject('03-Applicant/04-Additional Interest/11-btn_Next'))

//Broker
WebUI.waitForElementClickable(findTestObject('04-Broker/01-dropDown_Agency'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('04-Broker/01-dropDown_Agency'), B_Agency, false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/02-dropDown_AgentName'), B_AgentName, false)

WebUI.click(findTestObject('04-Broker/03-toggle_BrokerAcct'))

WebUI.waitForElementClickable(findTestObject('04-Broker/04-dropDown_Retailer'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('04-Broker/04-dropDown_Retailer'), 'American Business Insurance Services', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/05-dropDown_AgentName'), 'SubJames Business', false)

//WebUI.click(findTestObject('04-Broker/06-toggle_Incumbent'))
//WebUI.setText(findTestObject('04-Broker/07-txt_AgencyWritten'), '999')
WebUI.scrollToPosition(0, 9999999)

//WebUI.waitForElementClickable(findTestObject('04-Broker/08-toggle_MidtermMove'), GlobalVariable.Wait)
//WebUI.click(findTestObject('04-Broker/08-toggle_MidtermMove'))
//WebUI.selectOptionByValue(findTestObject('04-Broker/09-dropDown_ReasonMove'), '4', false)
WebUI.click(findTestObject('04-Broker/10-btn_Next'))

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/03-dropDown_UMPD'), L_UMPD, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Symbol/01-dropDown_AL'), '1) Any Auto', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/05-dropDown_UnderMPD'), L_UnderPD, false)

//Limits
WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/06-dropDown_MedicalPayment'), L_MedicalPayment, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/06-dropDown_MedicalPayment'), '6', false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/07-dropDown_PIP'), L_PIP, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Symbol/07-dropDown_PIP'), L_PIPSymbol, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/08-dropDown_LiabilityDed'), L_LiabilityDeductible, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/09-dropDown_Comp_FT'), L_CompFT, false)

WebUI.waitForElementClickable(findTestObject('05-Limits/radioBtn_Fire_Theft'), GlobalVariable.Wait)

WebUI.check(findTestObject('05-Limits/radioBtn_Fire_Theft'))

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/10-dropDown_Collision'), L_Collision, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/11-dropDown_GenLiab'), L_GenLiab, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/12-dropDown_Cargo'), L_Cargo, false)

WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/13-dropDown_Ref'), L_RefBreakdown, false)

WebUI.waitForElementClickable(findTestObject('05-Limits/btn_Next'), GlobalVariable.Wait)

WebUI.click(findTestObject('05-Limits/btn_Next'))

//Vehicle
WebUI.scrollToPosition(10, 10)

//1-9
for (int i = 1; i <= 9; i++) {
    WebUI.scrollToPosition(10, 10)

    WebUI.waitForElementClickable(findTestObject('06-Vehicle/01-btn_Add'), GlobalVariable.Wait)

    WebUI.click(findTestObject('06-Vehicle/01-btn_Add'))

    WebUI.waitForElementClickable(findTestObject('06-Vehicle/02-dropDown_Year'), GlobalVariable.Wait)

    WebUI.selectOptionByLabel(findTestObject('06-Vehicle/02-dropDown_Year'), V_Year, false)

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

WebUI.scrollToPosition(10, 10)

//Driver
for (int i = 1; i <= 12; i++) {
    WebUI.waitForElementClickable(findTestObject('07-Driver/01-btn_Add'), GlobalVariable.Wait)

    WebUI.click(findTestObject('07-Driver/01-btn_Add'))

    WebUI.setText(findTestObject('07-Driver/02-txt_FName'), 'FirstName' + i)

    WebUI.setText(findTestObject('07-Driver/03-txt_LName'), D_Lname)

    WebUI.setText(findTestObject('07-Driver/04-txt_LicenseNumber'), 'F255-921-50-094-' + i)

    WebUI.click(findTestObject('07-Driver/05-txt_DOB'))

    WebUI.setText(findTestObject('07-Driver/05-txt_DOB'), D_DOB)

    WebUI.click(findTestObject('07-Driver/06-toggle_OSD'))

    WebUI.selectOptionByLabel(findTestObject('07-Driver/07-dropDown_State'), D_State, false)

    WebUI.setText(findTestObject('07-Driver/08-txt_YDE'), '3')

    WebUI.setText(findTestObject('07-Driver/09-txt-YCDE'), D_YCDE)

    //AddIncident
    WebUI.click(findTestObject('07-Driver/10-btn_AddNewIncident'))

    WebUI.waitForElementVisible(findTestObject('07-Driver/11-dropDown_IncidentType'), GlobalVariable.Wait)

    WebUI.selectOptionByLabel(findTestObject('07-Driver/11-dropDown_IncidentType'), 'At-Fault', false)

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_IncidentDate'), '03182021')

    WebUI.click(findTestObject('07-Driver/12-txt_ConvictionDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_ConvictionDate'), '03202021')

    WebUI.click(findTestObject('07-Driver/13-btn_IncidentSave'))

    //AddIncident
    WebUI.click(findTestObject('07-Driver/10-btn_AddNewIncident'))

    WebUI.waitForElementVisible(findTestObject('07-Driver/11-dropDown_IncidentType'), GlobalVariable.Wait)

    WebUI.selectOptionByLabel(findTestObject('07-Driver/11-dropDown_IncidentType'), 'Not At-Fault', false)

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.click(findTestObject('07-Driver/12-txt_IncidentDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_IncidentDate'), '03202021')

    WebUI.click(findTestObject('07-Driver/12-txt_ConvictionDate'))

    WebUI.setText(findTestObject('07-Driver/12-txt_ConvictionDate'), '03272021')

    WebUI.click(findTestObject('07-Driver/13-btn_IncidentSave'))

    WebUI.click(findTestObject('07-Driver/14-btn_AddDriver'))
}

WebUI.click(findTestObject('07-Driver/15-multiDropDown_DriverFilter'))

WebUI.click(findTestObject('07-Driver/16-checkBox_SelectAll'))

WebUI.click(findTestObject('07-Driver/btn_Next'))

//Historical Coverage
WebUI.waitForElementClickable(findTestObject('08-Historical Coverage/01-txt_PTStartDate'), GlobalVariable.Wait)

WebUI.click(findTestObject('08-Historical Coverage/01-txt_PTStartDate'))

WebUI.setText(findTestObject('08-Historical Coverage/01-txt_PTStartDate'), HC_PolStartDate)

WebUI.click(findTestObject('08-Historical Coverage/Outside/Outside_1'))

//WebUI.click(findTestObject('08-Historical Coverage/02-btn_PTEndDate'))
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

//Claims history
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

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/10-toggle_NYC'))

WebUI.setText(findTestObject('10-Risk Specifics/01-Destination Information/02-Radius of Operations/11-txt_DescribeExp'), 
    'TEST')

//Risk Specifics
WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/btn_Next'))

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    '15', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/02-dropDown_DriverTerminated'), 
    '5', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/03-dropDwon_MVRPulled'), 
    'Annually', false)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/04-toggle_BusinessPrincipal'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/05-toggle_Volunteers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/06-txt_PercentageStaff'), '50')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/07-toggle_HireFromOthers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/08-txt_AnnualCost_1'), '10000')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/09-toggle_HireDriver'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/10-txt_AnnualCost_2'), '10000')

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/11-toggle_LeasingToOthers'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/12-txt_AnnualIncome_1'), '10000')

WebUI.scrollToPosition(100, 200)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/13-toggle_LeaseDriver'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/14-txt_AnnualIncome_2'), '10000')

WebUI.scrollToPosition(400, 500)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/15-toggle_AssumedLiability'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/16-toggle_VehicleHome'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/17-toggle_VehicleOwned'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/18-toggle_AddDelVehicle'))

WebUI.setText(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/19-txt_DescribeAddDelVin'), 
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(700, 800)

//Driver Hiring Criteria
WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/01-toggle_SimilarVin'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/02-toggle_5yrsExp'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/03-toggle_AgreeReport'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/04-toggle_21PrimaryDriver'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/05-toggle_LicensedAndDOT'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/06-toggle_DocumentedForDriver'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/07-toggle_IncentiveProgram'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/08-multiDropDown_BGCheck'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/09-checkBox_SelectAll'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/10-multiDropDown_DriverTraining'))

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/12-checkBox_DT_None'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/02-Driver Hiring Criteria/12-checkBox_DT_None'))

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/btn_Next'))

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

WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/01-toggle_CarryGenLiab'), 
    GlobalVariable.Wait)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/01-toggle_CarryGenLiab'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/02-toggle_Operations'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/03-toggle_Goods'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/04-toggle_Warehousing'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/05-toggle_StorageVehicle'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/06-toggle_LeasingSpace'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/07-toggle_FreightForwarding'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/08-toggle_StorageFuelChemicals'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/09-txt_GLAnnualPayroll'), RS_GLPayroll)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/10-toggle_OperationsOtherThanTrucking'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/10-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/11-toggle_GenLiabLoss'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/01-GenLiab/11-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

//Cargo
WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/01-toggle_RequiredCarryCargo'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/02-toggle_RequireRefBreakdown'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/03-toggle_HazardousMaterials'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/04-toggle_RefUnits'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/05-toggle_StoredTruckOvernyt'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/05-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/06-toggle_CargoLoss'))

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/06-txt_Explain'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/01-btn_Add'))

WebUI.waitForElementVisible(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/02-dropDown_Commodity'), 
    GlobalVariable.Wait)

WebUI.selectOptionByValue(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/02-dropDown_Commodity'), 
    'APPLIANCES', false)

WebUI.setText(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/03-txt_PercentCarry'), 
    '100')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/04-btn_AddCommodity'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/btn_Next'))

WebUI.waitForElementVisible(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'), 
    GlobalVariable.Wait)

//Set to YES
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'))

//Set to NO
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-toggle_ProvideCompensation'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/01-txt_CompensationExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

//Set to YES
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-toggle_EquipmentOperated'))

//Set to NO
WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-toggle_EquipmentOperated'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/02-txt_EquipOperatedExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/03-toggle_RiskPlan'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/03-txt_RiskPlanExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/04-toggle_CompanyNOC'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/04-txt_NocExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.scrollToPosition(0, 9999999)

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/05-toggle_FillingBankruptcy'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/05-txt_BankruptcyExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/06-toggle_AuthSuspended'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/06-txt_SuspensionExplanation'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vestibulum sed arcu non odio euismod lacinia at. Semper auctor neque vitae tempus quam pellentesque nec nam. Sed ullamcorper morbi tincidunt ornare. Id interdum velit laoreet id donec ultrices tincidunt arcu. Tortor at auctor urna nunc id. Pellentesque eu tincidunt tortor aliquam. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Tempor orci dapibus ultrices in iaculis. Sit amet justo donec enim diam vulputate ut pharetra sit. Blandit massa enim nec dui nunc mattis. Elit eget gravida cum sociis. Enim eu turpis egestas pretium aenean pharetra magna ac. Aliquet porttitor lacus luctus accumsan tortor posuere. Vulputate ut pharetra sit amet aliquam id diam maecenas ultricies. Eu volutpat odio facilisis mauris sit amet massa vitae tortor. Risus feugiat in ante metus dictum at. Ac feugiat sed lectus vestibulum mattis ullamcorper velit. Fringilla ph')

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/07-toggle_Covid19'))

WebUI.setText(findTestObject('10-Risk Specifics/06-Underwriting Questions/07-txt_Covid19Vehicle'), '10000')

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.check(findTestObject('10-Risk Specifics/06-Underwriting Questions/08-checkBox_Iconfirm'))

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/09-btn_Next'))

WebUI.waitForElementClickable(findTestObject('11-Quote Option/01-btn_DownloadExp'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/01-btn_DownloadExp'))

WebUI.delay(250)

//Upload Start
WebUI.waitForElementClickable(findTestObject('11-Quote Option/03-btn_Upload'), 45)

String quoteNumber1 = WebUI.getText(findTestObject('11-Quote Option/00-lbl-SubmissionNumber'))

String filePath = ('C:\\Users\\Elijah Siason\\Downloads\\' + quoteNumber1) + '.xlsb'

System.out.println('File Path is: ' + filePath)

CustomKeywords.'uploadfile.uploadFile.uploadFileToTest'(findTestObject('11-Quote Option/03-btn_Upload'), filePath)

WebUI.waitForElementVisible(findTestObject('11-Quote Option/popUp_UploadInProgress'), GlobalVariable.Wait)

WebUI.waitForElementVisible(findTestObject('11-Quote Option/02-btn_CalculatePremium'), GlobalVariable.Wait)

//WebUI.verifyElementVisible(findTestObject('11-Quote Option/popUp_VerifyUpload'))
//Added
WebUI.waitForElementClickable(findTestObject('11-Quote Option/02-btn_CalculatePremium'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/02-btn_CalculatePremium'))

WebUI.waitForElementVisible(findTestObject('11-Quote Option/btn_Next'), GlobalVariable.Wait)

WebUI.waitForElementClickable(findTestObject('11-Quote Option/btn_Next'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/btn_Next'))

