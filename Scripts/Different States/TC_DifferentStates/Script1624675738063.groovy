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

WebUI.callTestCase(findTestCase('Happy Path/00-Login/UW_LogIn'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Happy Path/02-CreateSubmission/CreateSubmission'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//APPLICANT- NAME AND ADDRESS
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

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.click(findTestObject('03-Applicant/01-Name and Address/09-btn_Next'))

//APPLICANT- BUSINESS DETAILS
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

//APPLICANT- FILLINGS INFORMATION
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

//APPLICANT- ADDITIONAL INTEREST
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

//BROKER
WebUI.waitForElementClickable(findTestObject('04-Broker/01-dropDown_Agency'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('04-Broker/01-dropDown_Agency'), B_Agency, false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/02-dropDown_AgentName'), B_AgentName, false)

WebUI.click(findTestObject('04-Broker/03-toggle_BrokerAcct'))

WebUI.waitForElementClickable(findTestObject('04-Broker/04-dropDown_Retailer'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('04-Broker/04-dropDown_Retailer'), 'American Business Insurance Services', false)

WebUI.selectOptionByLabel(findTestObject('04-Broker/05-dropDown_AgentName'), 'SubJames Business', false)

WebUI.scrollToPosition(0, 9999999)

WebUI.click(findTestObject('04-Broker/10-btn_Next'))

//LIMITS- HAPPY PATH
WebUI.selectOptionByLabel(findTestObject('05-Limits/Limit/06-dropDown_MedicalPayment'), L_MedicalPayment, false)

WebUI.selectOptionByValue(findTestObject('05-Limits/Symbol/06-dropDown_MedicalPayment'), '6', false)

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

//VEHICLE
WebUI.scrollToPosition(10, 10)

WebUI.waitForElementClickable(findTestObject('06-Vehicle/01-btn_Add'), GlobalVariable.Wait)

WebUI.click(findTestObject('06-Vehicle/01-btn_Add'))

WebUI.waitForElementClickable(findTestObject('06-Vehicle/02-dropDown_Year'), GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('06-Vehicle/02-dropDown_Year'), V_Year, false)

WebUI.setText(findTestObject('06-Vehicle/03-txt_Make'), V_Make)

WebUI.setText(findTestObject('06-Vehicle/04-txt_Model'), V_Model)

WebUI.setText(findTestObject('06-Vehicle/05-txt_VIN'), 'CAR00000000000001')

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

WebUI.click(findTestObject('06-Vehicle/btn_Next'))

//DRIVER
WebUI.scrollToPosition(10, 10)

WebUI.waitForElementClickable(findTestObject('07-Driver/01-btn_Add'), GlobalVariable.Wait)

WebUI.click(findTestObject('07-Driver/01-btn_Add'))

WebUI.setText(findTestObject('07-Driver/02-txt_FName'), 'FirstName')

WebUI.setText(findTestObject('07-Driver/03-txt_LName'), D_Lname)

WebUI.setText(findTestObject('07-Driver/04-txt_LicenseNumber'), 'F255-921-50-094-1')

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

WebUI.click(findTestObject('07-Driver/14-btn_AddDriver'))

WebUI.click(findTestObject('07-Driver/15-multiDropDown_DriverFilter'))

WebUI.click(findTestObject('07-Driver/16-checkBox_SelectAll'))

WebUI.click(findTestObject('07-Driver/btn_Next'))

//HISTORICAL COV
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

WebUI.setText(findTestObject('08-Historical Coverage/09-txt_NoVehicle'), '10')

WebUI.click(findTestObject('08-Historical Coverage/10-txt_LossRunDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('08-Historical Coverage/10-txt_LossRunDate'), '03102021')

WebUI.setText(findTestObject('08-Historical Coverage/11-txt_NoPowerUnits'), HC_PowerUnits)

WebUI.setText(findTestObject('08-Historical Coverage/12-txt_NoSpareVehicle'), '300')

WebUI.setText(findTestObject('08-Historical Coverage/13-txt_NoDriver'), '400')

//Gross Revenues WHEN THE VEHICLE AND DRIVER IS ONE
WebUI.setText(findTestObject('08-Historical Coverage/14-txt_CargoLimits'), '12500')

//Total Fleet Mileage WHEN THE VEHICLE AND DRIVER IS ONE
WebUI.setText(findTestObject('08-Historical Coverage/15-txt_RefCargoLimits'), '12500')

WebUI.waitForElementClickable(findTestObject('08-Historical Coverage/16-txt_GrossRevenues'), GlobalVariable.Wait)

//NoOneWayTrips WHEN THE VEHICLE AND DRIVER IS ONE
WebUI.setText(findTestObject('08-Historical Coverage/16-txt_GrossRevenues'), '125000')

//WebUI.setText(findTestObject('08-Historical Coverage/17-txt_TotalFleetMileage'), HC_TotalFleetMileage)
//WebUI.setText(findTestObject('08-Historical Coverage/18-txt_NoOneWayTrips'), '12500')
WebUI.click(findTestObject('08-Historical Coverage/btn_Next'))

//CLAIMS HISTORY
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

WebUI.setText(findTestObject('09-Claims History/10-txt_TotalClaim'), '2')

WebUI.setText(findTestObject('09-Claims History/11-txt_NumberClaims_Cargo'), '2')

WebUI.setText(findTestObject('09-Claims History/12-txt_NumberClaims_GenLiab'), '2')

WebUI.click(findTestObject('09-Claims History/btn_Next'))

//RISK SPECIFICS
//DESTINATION INFO
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

WebUI.click(findTestObject('10-Risk Specifics/01-Destination Information/btn_Next'))

//DRIVER INFO
WebUI.waitForElementClickable(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    GlobalVariable.Wait)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/01-dropDown_DriverHired'), 
    '15', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/02-dropDown_DriverTerminated'), 
    '5', false)

WebUI.selectOptionByLabel(findTestObject('10-Risk Specifics/02-Driver Information/01-Driver Information/03-dropDwon_MVRPulled'), 
    'Annually', false)

WebUI.click(findTestObject('10-Risk Specifics/02-Driver Information/btn_Next'))

//DOT INFO
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

//MAINTENANCE AND SAFETY
WebUI.click(findTestObject('10-Risk Specifics/04-Maintenance or Safety/02-Safety Devices/01-multiDropDown_SafetyDevice_One'))

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

//GENLIAB AND CARGO
//GenLiab
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
    '50')

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/02-Cargo/Commodities Hauled Table/04-btn_AddCommodity'))

WebUI.click(findTestObject('10-Risk Specifics/05-Gen Liab and Cargo/btn_Next'))

//UNDERWRITING QUESTIONS
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

WebUI.scrollToPosition(0, GlobalVariable.Position_Y)

WebUI.check(findTestObject('10-Risk Specifics/06-Underwriting Questions/08-checkBox_Iconfirm'))

WebUI.click(findTestObject('10-Risk Specifics/06-Underwriting Questions/09-btn_Next'))


//QUOTE OPTIONS
WebUI.waitForElementClickable(findTestObject('11-Quote Option/01-btn_DownloadExp'), GlobalVariable.Wait)

WebUI.click(findTestObject('11-Quote Option/01-btn_DownloadExp'))

WebUI.delay(260)

//Upload Start
WebUI.waitForElementClickable(findTestObject('11-Quote Option/03-btn_Upload'), 45)

String quoteNumber = WebUI.getText(findTestObject('11-Quote Option/00-lbl-SubmissionNumber'))

String filePath = ('C:\\Users\\Asllie Sablan\\Downloads\\' + quoteNumber) + '.xlsb'

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


