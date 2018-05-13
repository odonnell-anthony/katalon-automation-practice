import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'Navigate to URL'
WebUI.navigateToUrl('http://www.automationpractice.com')

WebUI.waitForElementPresent(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0)

WebUI.scrollToElement(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0, FailureHandling.STOP_ON_FAILURE)

'Mouse over element'
WebUI.mouseOver(findTestObject('Page_My Store/img_replace-2x img-responsive'))

WebUI.getText(findTestObject('Page_My Store/span_16.51'))

'Wait for element visible'
WebUI.waitForElementVisible(findTestObject('Page_My Store/span_Add to cart'), 0)

'Click button'
WebUI.click(findTestObject('Page_My Store/span_Add to cart'))

WebUI.delay(1)

WebUI.getText(findTestObject('Page_My Store/Modal/Total-products'))

WebUI.getText(findTestObject('Page_My Store/Modal/Total-shipping'))

WebUI.getText(findTestObject('Page_My Store/Modal/Total'))

WebUI.click(findTestObject('Page_My Store/Modal/Proceed_button'))

WebUI.verifyElementPresent(findTestObject('Page_Order - My Store/h1_Shopping-cart summaryYour s'), 0)

WebUI.getText(findTestObject('Page_Order - My Store/Total_products'))

WebUI.getText(findTestObject('Page_Order - My Store/Total_shipping'))

WebUI.getText(findTestObject('Page_Order - My Store/Total_price_without_tax'))

WebUI.getText(findTestObject('Page_Order - My Store/Total_price'))

WebUI.click(findTestObject('Page_Order - My Store/Proceed_to_checkout'))

WebUI.focus(findTestObject('Page_Login/input_email_create'))

String Mail = CustomKeywords.'randomEmail.getEmail'('testing', 'testing.test')

WebUI.sendKeys(findTestObject('Page_Login/input_email_create'), Mail)

WebUI.click(findTestObject('Page_Login/button_Create an account'))

WebUI.waitForElementPresent(findTestObject('Page_Login - My Store/label_Mr.'), 0)

WebUI.click(findTestObject('Page_Login - My Store/label_Mr.'))

WebUI.focus(findTestObject('Page_Login - My Store/input_customer_firstname'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_customer_firstname'), 'test')

WebUI.focus(findTestObject('Page_Login - My Store/input_customer_lastname'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_customer_lastname'), 'testing')

WebUI.focus(findTestObject('Page_Login/input_passwd'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_passwd'), 'testing')

WebUI.focus(findTestObject('Page_Login - My Store/day_dropdown'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/day_dropdown'), 1)

WebUI.focus(findTestObject('Page_Login - My Store/month_dropdown'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/month_dropdown'), 1)

WebUI.focus(findTestObject('Page_Login - My Store/years_dropdown'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/years_dropdown'), 33)

WebUI.click(findTestObject('Page_Login - My Store/label_Receive special offers f'))

WebUI.click(findTestObject('Page_Login - My Store/label_Sign up for our newslett'))

WebUI.scrollToElement(findTestObject('Page_Login - My Store/input_firstname'), 0)

WebUI.focus(findTestObject('Page_Login - My Store/input_company'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_company'), 'Testing')

WebUI.focus(findTestObject('Page_Login - My Store/input_address1'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_address1'), '99 defect street')

WebUI.focus(findTestObject('Page_Login - My Store/input_city'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_city'), 'Automationville')

WebUI.scrollToElement(findTestObject('Page_Login - My Store/state_dropdown'), 0)

WebUI.focus(findTestObject('Page_Login - My Store/state_dropdown'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/state_dropdown'), 1)

WebUI.focus(findTestObject('Page_Login - My Store/input_postcode'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_postcode'), '00000')

WebUI.scrollToElement(findTestObject('Page_Login - My Store/input_phone_mobile'), 0)

WebUI.focus(findTestObject('Page_Login - My Store/input_phone_mobile'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_phone_mobile'), '00000000000')

WebUI.click(findTestObject('Page_Login - My Store/button_Register'))

WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/button_Proceed to checkout_processAddress'), 0)

WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout_processAddress'))

WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/label_I agree to the terms of'), 0)

WebUI.click(findTestObject('Page_Order - My Store/label_I agree to the terms of'))

WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout_processCarrier'))

WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/cheque'), 0)

WebUI.click(findTestObject('Page_Order - My Store/cheque'))

WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/button_I confirm my order'), 0)

WebUI.click(findTestObject('Page_Order - My Store/button_I confirm my order'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/success'), 0)

WebUI.delay(10)

'Close the Browser'
not_run: WebUI.closeBrowser()

