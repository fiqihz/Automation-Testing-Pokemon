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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.pokemon.com/us/')

WebUI.click(findTestObject('Pokemon_1/Page_The Official Pokmon Website  Pokemon.com  Pokemon.com/button_Accept All'))

WebUI.click(findTestObject('Pokemon_1/Page_The Official Pokmon Website  Pokemon.com  Pokemon.com/span_Pokdex'))

WebUI.setText(findTestObject('Pokemon_1/Page_Pokdex  Pokemon.com/input_Name or Number_searchInput'), 'Pikachu')

WebUI.click(findTestObject('Pokemon_1/Page_Pokdex  Pokemon.com/input_Name or Number_search'))

WebUI.click(findTestObject('Pokemon_1/Page_Pokdex  Pokemon.com/img'))

WebUI.scrollToElement(findTestObject('Pokemon_1/Page_Pokdex  Pokemon.com/div_Pikachu      0025'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Pokemon_1/Page_Bulbasaur  Pokdex/a_Explore More Pokmon'))

WebUI.scrollToElement(findTestObject('Pokemon_1/Page_Bulbasaur  Pokdex/a_Surprise Me'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

