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

originalCost = WebUI.getText(findTestObject('Page_My Store/span_16.51'))

println originalCost

originalCostStripped = (originalCost).substring(1)

println originalCostStripped

float originalCostFloat = Float.parseFloat(originalCostStripped);

float originalCostAdded = originalCostFloat + originalCostFloat

float originalCostRounded = originalCostAdded.round(2)

println originalCostRounded

float expected = 33.02

assert originalCostRounded == expected

/*
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

*/
WebUI.delay(10)

'Close the Browser'
not_run: WebUI.closeBrowser()

