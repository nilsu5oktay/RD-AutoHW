package Tests;

import org.testng.annotations.Test;
import Pages.QAElementsPageXPath;

public class Odev15 extends Tests.BaseTest {
    @Test
    public void testQAToolsButtonsPage() {
        QAElementsPageXPath xpath = new QAElementsPageXPath();
        xpath.openElementsMenuPages("Buttons").clickMeButtons().verifyClickMeButtonsMesage();
    }

    @Test
    public void testQAToolsWebTables() throws InterruptedException {
        QAElementsPageXPath xpath = new QAElementsPageXPath();
        xpath.openElementsMenuPages("Web Tables")
                .pressWebTablesButtons("Add")
                .fillFirstName("Nil").fillLastName("Oktay").fillEmail("nilsuoktay@gmail.com").fillAge("27").fillSalary("100").fillDepartment("QA").pressWebTablesButtons("Submit")
                .pressEntryEdit("nilsuoktay@gmail.co")
                .fillFirstName("Nilsu").fillLastName("Oktay").fillEmail("nilsuoktay@gmail.com").fillAge("27").fillSalary("200").fillDepartment("QAAutomation").pressWebTablesButtons("Submit")
                .waitForIt(500);
    }
}
