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

'Maximize Browser'
WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

'Navigate to URL'
WebUI.navigateToUrl('http://www.automationpractice.com')

'Wait for the image of the product we want to be visible'
WebUI.waitForElementPresent(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0)

'Scroll to image of the product we want'
WebUI.scrollToElement(findTestObject('Page_My Store/img_replace-2x img-responsive'), 0, FailureHandling.STOP_ON_FAILURE)

'Mouse over image of the product we want'
WebUI.mouseOver(findTestObject('Page_My Store/img_replace-2x img-responsive'))

'Get the cost of the product to be added to the cart'
originalCost = WebUI.getText(findTestObject('Page_My Store/span_16.51'))

'Strip dollar sign off the original cost'
originalCostStripped = originalCost.substring(1)

'Convert stripped original cost from string to float'
float originalCostFloat = Float.parseFloat(originalCostStripped)

'Wait for element visible'
WebUI.waitForElementVisible(findTestObject('Page_My Store/span_Add to cart'), 0)

'Click button'
WebUI.click(findTestObject('Page_My Store/span_Add to cart'))

'Wait for element Total-products to be visible'
WebUI.waitForElementVisible(findTestObject('Page_My Store/Modal/Total-products'), 0)

'Get cost of products'
productsCost = WebUI.getText(findTestObject('Page_My Store/Modal/Total-products'))

'Strip dollar sign off products cost'
productsCostStripped = productsCost.substring(1)

'Convert stripped product cost from string to float'
float productsCostFloat = Float.parseFloat(productsCostStripped)

'Check the products cost matches the original cost of the item added to cart'
try {
    assert productsCostFloat == originalCostFloat
    println('Expected Product price found')
}
catch (Exception e) {
    throw e
} 

'Get the shipping cost'
shippingCost = WebUI.getText(findTestObject('Page_My Store/Modal/Total-shipping'))

'Strip dollar sign off the shipping cost'
shippingCostStripped = shippingCost.substring(1)

'Convert stripped shipping cost from string to float'
float shippingCostFloat = Float.parseFloat(shippingCostStripped)

'Add product price and shipping together'
float productsPlusShippingCost = productsCostFloat + shippingCostFloat

'Round up the cost to two decimal places'
float expectedCost = productsPlusShippingCost.round(2)

'Get the Cart total price'
totalCost = WebUI.getText(findTestObject('Page_My Store/Modal/Total'))

'Strip the dollar sign off the total cost'
totalCostStripped = totalCost.substring(1)

'Convert stripped total cost from string to float'
float totalCostFloat = Float.parseFloat(totalCostStripped)

'Check the cart total cost matches what is expected based on product cost and shipping cost'
try {
    assert expectedCost == totalCostFloat
    println('Expected total price including shipping found')
}
catch (Exception e) {
    throw e
} 


'Close the Browser'
WebUI.closeBrowser()

