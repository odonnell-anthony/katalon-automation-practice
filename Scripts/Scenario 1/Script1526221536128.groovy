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

'Wait for product image visible'
WebUI.waitForElementPresent(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0)

'Scroll to product image'
WebUI.scrollToElement(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0, FailureHandling.STOP_ON_FAILURE)

'Mouse over product image'
WebUI.mouseOver(findTestObject('Page_My Store/img_replace-2x img-responsive'))

'Wait for element visible'
WebUI.waitForElementVisible(findTestObject('Page_My Store/span_Add to cart'), 0)

'Click button'
WebUI.click(findTestObject('Page_My Store/span_Add to cart'))

'Small delay seems to be required'
WebUI.delay(1)

'Click Proceed button'
WebUI.click(findTestObject('Page_My Store/Modal/Proceed_button'))

'Find Shopping cart summary'
WebUI.verifyElementPresent(findTestObject('Page_Order - My Store/h1_Shopping-cart summaryYour s'), 0)

'Proceed to Checkout'
WebUI.click(findTestObject('Page_Order - My Store/Proceed_to_checkout'))

'Focus on email input'
WebUI.focus(findTestObject('Page_Login/input_email_create'))

'Generate random email using custom keyword'
String Mail = CustomKeywords.'randomEmail.getEmail'('testing', 'testing.test')

'Type radom email generated in to email input'
WebUI.sendKeys(findTestObject('Page_Login/input_email_create'), Mail)

'Click on create account'
WebUI.click(findTestObject('Page_Login/button_Create an account'))

'Wait for Mr checkbox to be present on the page'
WebUI.waitForElementPresent(findTestObject('Page_Login - My Store/label_Mr.'), 0)

'Check the Mr check box'
WebUI.click(findTestObject('Page_Login - My Store/label_Mr.'))

'Focus on First name input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_customer_firstname'))

'Type name in to first name input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_customer_firstname'), 'test')

'Focus on Last name input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_customer_lastname'))

'Type name in to Last name input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_customer_lastname'), 'testing')

'Focus on password input field'
WebUI.focus(findTestObject('Page_Login/input_passwd'))

'Type in password to password input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_passwd'), 'testing')

'Focus on day dropdown'
WebUI.focus(findTestObject('Page_Login - My Store/day_dropdown'))

'Select by index from drop down'
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/day_dropdown'), 1)

'Focus on month dropdown'
WebUI.focus(findTestObject('Page_Login - My Store/month_dropdown'))

'Select by index from drop down'
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/month_dropdown'), 1)

'Focus on year dropdown'
WebUI.focus(findTestObject('Page_Login - My Store/years_dropdown'))

'Select by index from drop down - Am I really that old?!'
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/years_dropdown'), 33)

'Check receive special offers'
WebUI.click(findTestObject('Page_Login - My Store/label_Receive special offers f'))

'Check signup for newsletter'
WebUI.click(findTestObject('Page_Login - My Store/label_Sign up for our newslett'))

'Scroll the page down'
WebUI.scrollToElement(findTestObject('Page_Login - My Store/input_firstname'), 0)

'Focus on company input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_company'))

'Type company in to company input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_company'), 'Testing')

'Focus on address 1'
WebUI.focus(findTestObject('Page_Login - My Store/input_address1'))

'Type address in to address input field 1'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_address1'), '99 defect street')

'Focus on city input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_city'))

'Type city in to city input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_city'), 'Automationville')

'Scroll further down the page'
WebUI.scrollToElement(findTestObject('Page_Login - My Store/state_dropdown'), 0)

'Focus on state drop down'
WebUI.focus(findTestObject('Page_Login - My Store/state_dropdown'))

'Select state by index - I dont really live here'
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Login - My Store/state_dropdown'), 1)

'Focus on post code input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_postcode'))

'Input post code in to postcode input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_postcode'), '00000')

'Scroll the page down more'
WebUI.scrollToElement(findTestObject('Page_Login - My Store/input_phone_mobile'), 0)

'Focus on mobile input field'
WebUI.focus(findTestObject('Page_Login - My Store/input_phone_mobile'))

'Type mobile number in to mobile input field'
WebUI.sendKeys(findTestObject('Page_Login - My Store/input_phone_mobile'), '00000000000')

'Click register!'
WebUI.click(findTestObject('Page_Login - My Store/button_Register'))

'Wait until proceed button is present'
WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/button_Proceed to checkout_processAddress'), 0)

'Click the proceed button'
WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout_processAddress'))

'Wait for agree to terms of conditions to be visible'
WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/label_I agree to the terms of'), 0)

'Click to agree to terms of conditions - Without reading them!'
WebUI.click(findTestObject('Page_Order - My Store/label_I agree to the terms of'))

'Click proceed'
WebUI.click(findTestObject('Page_Order - My Store/button_Proceed to checkout_processCarrier'))

'Wait for pay by cheque is present'
WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/cheque'), 0)

'Click to pay by cheque'
WebUI.click(findTestObject('Page_Order - My Store/cheque'))

'Wait for confirm my order to present'
WebUI.waitForElementPresent(findTestObject('Page_Order - My Store/button_I confirm my order'), 0)

'Click confirm my order'
WebUI.click(findTestObject('Page_Order - My Store/button_I confirm my order'))

'Wait for success message'
WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/success'), 0)

'Wait 5 seconds (to bask in automation glory)'
WebUI.delay(5)

'Close the Browser - we are finished'
WebUI.closeBrowser()

