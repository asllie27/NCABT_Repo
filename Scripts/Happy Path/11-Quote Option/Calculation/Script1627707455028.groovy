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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.math.BigDecimal as BigDecimal
import java.math.RoundingMode as RoundingMode
import java.text.DecimalFormat as DecimalFormat

WebUI.callTestCase(findTestCase('Happy Path/00-Login/Login_STG'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Others/Search_QO'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//Premium Rater
//Auto Liabily Premium
String autoLiab_Premium = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Premium Rater/01-dtxt_AutoLiab_Premium'), 
    'value')

String ap1 = autoLiab_Premium.replace('$ ', '')

String ap2 = ap1.replace(',', '')

Double ap3 = Double.parseDouble(ap2)

BigDecimal autoLiab_Premium_Convert = new BigDecimal(ap3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('Auto Liability Premium is ' + autoLiab_Premium_Convert)

//Physical Damage Premium
String physicalDamage_Premium = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Premium Rater/02-dtxt_PhysicalDamage_Premium'), 
    'value')

String pd1 = physicalDamage_Premium.replace('$ ', '')

String pd2 = pd1.replace(',', '')

Double pd3 = Double.parseDouble(pd2)

BigDecimal physicalDamage_Premium_Convert = new BigDecimal(pd3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('Physical Damge Premium is ' + physicalDamage_Premium_Convert)

//GL Premium
String gl_Premium = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Premium Rater/03-dtxt_GL_Premium'), 
    'value')

String gl1 = gl_Premium.replace('$ ', '')

String gl2 = gl1.replace(',', '')

Double gl3 = Double.parseDouble(gl2)

BigDecimal gl_Premium_Convert = new BigDecimal(gl3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('GL Premium is ' + gl_Premium_Convert)

//Cargo Premium
String cargo_Premium = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Premium Rater/04-dtxt_Cargo_Premium'), 
    'value')

String cargo1 = cargo_Premium.replace('$ ', '')

String cargo2 = cargo1.replace(',', '')

Double cargo3 = Double.parseDouble(cargo2)

BigDecimal cargo_Premium_Convert = new BigDecimal(cargo3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('Cargo Premium is ' + cargo_Premium_Convert)

//Scroll to specific element
CustomKeywords.'scrollQO.scroll_Code.Se_hoverClick'('//input[@formcontrolname=\'riskMgrFeeAL\']')

//Fees and Payments
String riskMngmtFee_AL = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Risk Mngmt Fee/01-dtxt_RiskMngmt_AL'), 
    'value')

String rf_AL1 = riskMngmtFee_AL.replace('$ ', '')

String rf_AL2 = rf_AL1.replace(',', '')

Double rf_AL3 = Double.parseDouble(rf_AL2)

BigDecimal riskMngmtFee_AL_Convert = new BigDecimal(rf_AL3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('Risk Management Fee - AL is ' + riskMngmtFee_AL_Convert)

String riskMngmtFee_PD = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/00-Risk Mngmt Fee/02-dtxt_RiskMngmt_PD'), 
    'value')

String rf_PD1 = riskMngmtFee_PD.replace('$ ', '')

String rf_PD2 = rf_PD1.replace(',', '')

Double rf_PD3 = Double.parseDouble(rf_PD2)

BigDecimal riskMngmtFee_PD_Convert = new BigDecimal(rf_PD3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('Risk Management Fee - PD is ' + riskMngmtFee_PD_Convert)

//Premium Validation
Double premiumExpected = ((autoLiab_Premium_Convert + physicalDamage_Premium_Convert) + gl_Premium_Convert) + cargo_Premium_Convert

BigDecimal premiumExpected_round = new BigDecimal(premiumExpected).setScale(2, RoundingMode.HALF_DOWN)

//Actual Value Conversion form String to Double
String premiumActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/01-dtxt_Premium'), 'value')

String x = premiumActual.replace('$ ', '')

String y = x.replace(',', '')

Double z = Double.parseDouble(y)

BigDecimal premiumActual_Convert = new BigDecimal(z).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Premium is ' + premiumExpected_round)

System.out.println('The Actual Premium is ' + premiumActual_Convert)

WebUI.verifyEqual(premiumExpected_round, premiumActual_Convert)

//Fees Validation
Double feesExpected = riskMngmtFee_AL_Convert + riskMngmtFee_PD_Convert

BigDecimal feesExpected_round = new BigDecimal(feesExpected).setScale(2, RoundingMode.HALF_DOWN)

String feesActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/02-dtxt_Fees'), 'value')

String fees1 = feesActual.replace('$ ', '')

String fees2 = fees1.replace(',', '')

Double fees3 = Double.parseDouble(fees2)

BigDecimal feesActual_Convert = new BigDecimal(fees3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Fees is ' + feesExpected_round)

System.out.println('The Actual Fees is ' + feesActual_Convert)

WebUI.verifyEqual(feesExpected_round, feesActual_Convert)

//START Taxes and Stamping Fee Validation (Calculated)
//FORMULA: PREMIUM * 0.05
//Expected Value Calculation
Double taxesStampingExpected_value = premiumExpected_round * 0.05

BigDecimal taxesStampingExpected_round = new BigDecimal(taxesStampingExpected_value).setScale(2, RoundingMode.HALF_DOWN)

//Actual Value Conversion form String to Double
String taxesStampingActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/03-dtxt_TaxesStamping'), 'value')

String x1 = taxesStampingActual.replace('$ ', '')

String y1 = x1.replace(',', '')

Double z1 = Double.parseDouble(y1)

BigDecimal taxesStampingActual_Convert = new BigDecimal(z1).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The EXPECTED Taxes and Stamping Fee is ' + taxesStampingExpected_value)

System.out.println('The ACTUAL Taxes and Stamping Fee is ' + taxesStampingExpected_round)

WebUI.verifyEqual(taxesStampingExpected_round, taxesStampingActual_Convert)

//END
//START Total Amount Due (Full Pay) Validation (Calculated)
//FORMULA: PREMIUM + FEES + TAXES AND STAMPING
Double totalAmountDueExpected = (premiumExpected_round + feesExpected_round) + taxesStampingExpected_round

BigDecimal totalAmountDueExpected_round = new BigDecimal(totalAmountDueExpected).setScale(2, RoundingMode.HALF_DOWN)

String totalAmountDueFPActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/04-dtxt_TotalAmountDueFullPay'), 
    'value')

String totalFP1 = totalAmountDueFPActual.replace('$ ', '')

String totalFP2 = totalFP1.replace(',', '')

Double totalFP3 = Double.parseDouble(totalFP2)

BigDecimal totalAmountDueFPActual_Convert = new BigDecimal(totalFP3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Total Amount Due (Full Pay) is ' + totalAmountDueExpected_round)

System.out.println('The Actual Total Amount Due (Full Pay) is ' + totalAmountDueFPActual_Convert)

WebUI.verifyEqual(totalAmountDueExpected_round, totalAmountDueFPActual_Convert)

//END
//START Deposit % Validation
String depositActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/05-txt_Deposit'), 'value')

String depositExpected = '10%'

System.out.println('The Expected Deposit % is ' + depositExpected)

System.out.println('The Actual Deposit % is ' + depositActual)

WebUI.verifyMatch(depositExpected, depositActual, false)

//END
//START Deposit Premium Validation (Calculated)
//FORMULA: PREMIUM * DEPOSIT %
//Convert deposit percentage to decimal
String int1 = depositExpected.replaceAll('[%]', '')

int depositExpected_int = Integer.parseInt(int1)

Double depositPercentage = depositExpected_int / 100

System.out.println('Deposit Percentage ' + depositPercentage)

System.out.println('Expected Premium ' + premiumExpected_round)

Double depositPremiumExpected = depositPercentage * premiumExpected_round

BigDecimal depositPremiumExpected_round = new BigDecimal(depositPremiumExpected).setScale(2, RoundingMode.HALF_DOWN)

String depositPremiumActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/06-txt_DepositPremium'), 'value')

String pa1 = depositPremiumActual.replace('$ ', '')

String pa2 = pa1.replace(',', '')

Double pa3 = Double.parseDouble(pa2)

BigDecimal depositPremiumActual_Convert = new BigDecimal(pa3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Deposit Premium is ' + depositPremiumExpected_round)

System.out.println('The Actual Deposit Premium is ' + depositPremiumActual_Convert)

WebUI.verifyEqual(depositPremiumExpected_round, depositPremiumActual_Convert)

//END
//START Total Deposit Amount Validation (Calculated)
//FORMULA: Deposit Premium + Fees + Taxes&StampingFee
Double totalDepositAmountExpected = (depositPremiumExpected_round + feesExpected_round) + taxesStampingExpected_round

BigDecimal totalDepositAmountExpected_round = new BigDecimal(totalDepositAmountExpected).setScale(2, RoundingMode.HALF_DOWN)

String totalDepositAmountActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/07-dtxt_TotalDepositAmount'), 
    'value')

String tda1 = totalDepositAmountActual.replace('$ ', '')

String tda2 = tda1.replace(',', '')

Double tda3 = Double.parseDouble(tda2)

BigDecimal totalDepositAmountActual_Convert = new BigDecimal(tda3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Total Deposit Amount % is ' + totalDepositAmountExpected_round)

System.out.println('The Actual Total Deposit Amount % is ' + totalDepositAmountActual_Convert)

WebUI.verifyEqual(totalDepositAmountExpected_round, totalDepositAmountActual_Convert)

//END
//START Number of Installments Validation
Select getNumOfInstallment = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//select[@formcontrolname=\'numberOfInstallments\']')))

String numOfInstallmentActual = getNumOfInstallment.getFirstSelectedOption().getText()

String numOfInstallmentExpected = '11'

int numOfInstallment_int = Integer.parseInt(numOfInstallmentExpected)

System.out.println('The Number of Installments is ' + numOfInstallmentActual)

WebUI.verifyMatch(numOfInstallmentExpected, numOfInstallmentActual, false)

//END
//START Installment Fee Validation (Calculated)
//FORMULA: ((Total Amount Due - total deposit amount)/number of installments)*.03)
Double intallmentFeeExpected = ((totalAmountDueExpected_round - totalDepositAmountExpected_round) / numOfInstallment_int) * 
0.03

BigDecimal intallmentFeeExpected_round = new BigDecimal(intallmentFeeExpected).setScale(2, RoundingMode.HALF_DOWN)

String intallmentFeeActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/09-dtxt_InstallmentFee'), 'value')

String ifa1 = intallmentFeeActual.replace('$ ', '')

String ifa2 = ifa1.replace(',', '')

Double ifa3 = Double.parseDouble(ifa2)

BigDecimal intallmentFeeActual_Convert = new BigDecimal(ifa3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Installment Fee is ' + intallmentFeeExpected_round)

System.out.println('The Actual Installment Fee is ' + intallmentFeeActual_Convert)

WebUI.verifyEqual(intallmentFeeExpected_round, intallmentFeeActual_Convert)

//END
//START Per Installment Validation (Calculated)
//FORMULA: (Total Amount Due - total deposit amount)/number of installments)+ Installment Fee
Double perIntallmentExpected = ((totalAmountDueExpected_round - totalDepositAmountExpected_round) / numOfInstallment_int) + 
intallmentFeeExpected_round

BigDecimal perIntallmentExpected_round = new BigDecimal(perIntallmentExpected).setScale(2, RoundingMode.HALF_DOWN)

String perIntallmentActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/10-dtxt_PerInstallment'), 'value')

String pia1 = perIntallmentActual.replace('$ ', '')

String pia2 = pia1.replace(',', '')

Double pia3 = Double.parseDouble(pia2)

BigDecimal perIntallmentActual_Convert = new BigDecimal(pia3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Total Per Installment is ' + perIntallmentExpected_round)

System.out.println('The Actual Total Per Installment is ' + perIntallmentActual_Convert)

WebUI.verifyEqual(perIntallmentExpected_round, perIntallmentActual_Convert)

//END
//START Total Amount Due (Installments) Validation (Calculated)
//FOPRMULA: (Per Installment * Number of Installments) + Total Deposit Amount
//String totalAmountDueInsExpected = '$ 755,301.64'
Double totalAmountDueInsExpected = (perIntallmentExpected_round * numOfInstallment_int) + totalDepositAmountExpected_round

BigDecimal totalAmountDueInsExpected_round = new BigDecimal(totalAmountDueInsExpected).setScale(2, RoundingMode.HALF_DOWN)

String totalAmountDueInsActual = WebUI.getAttribute(findTestObject('11-Quote Option/_Calculation/11-dtxt_TotalAmountDueInstallment'), 
    'value')

String tad1 = totalAmountDueInsActual.replace('$ ', '')

String tad2 = tad1.replace(',', '')

Double tad3 = Double.parseDouble(tad2)

BigDecimal totalAmountDueInsActual_Convert = new BigDecimal(tad3).setScale(2, RoundingMode.HALF_DOWN)

System.out.println('The Expected Total Amount Due (Installments) is ' + totalAmountDueInsExpected_round)

System.out.println('The Actual Total Amount Due (Installments) is ' + totalAmountDueInsActual_Convert)

WebUI.verifyEqual(totalAmountDueInsExpected_round, totalAmountDueInsActual_Convert)

