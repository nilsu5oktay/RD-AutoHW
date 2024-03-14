package Tests;

import Pages.QAElementsPageCss;
import org.testng.annotations.Test;

public class Odev14 extends Tests.BaseTest {

    @Test
    public void testQAToolsButtonsPage() {
        QAElementsPageCss css = new QAElementsPageCss();
        css.openElementsMenuPages("Buttons").clickMeButtons().verifyClickMeButtonsMesage();
    }

    @Test
    public void testQAToolsWebTables() throws InterruptedException {
        QAElementsPageCss css = new QAElementsPageCss();
        css.openElementsMenuPages("Web Tables")
                .pressWebTablesButtons("Add")
                .fillFirstName("Nil").fillLastName("Oktay").fillEmail("nilsuoktay@gmail.com").fillAge("27").fillSalary("100").fillDepartment("QA").pressWebTablesButtons("Submit")
                .pressEntryEdit("nilsuoktay@gmail.co")
                .fillFirstName("Nilsu").fillLastName("Oktay").fillEmail("nilsuoktay@gmail.com").fillAge("27").fillSalary("200").fillDepartment("QAAutomation").pressWebTablesButtons("Submit")
                .waitForIt(500);
    }
}





