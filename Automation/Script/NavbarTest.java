package Script;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page.SideNavbar;
import Utils.OpenApp;

public class NavbarTest {

    static WebDriver driver;
    static OpenApp utils;
    static SideNavbar navbar;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        utils = new OpenApp(driver);
        navbar = new SideNavbar(driver);

        utils.openInfra("https://staging.pislinfra.com/");
        utils.login("avidusinteractive@gmail.com", "avidus@001");
    }

    @Test
    public void functionalityOfSideBarAnchorTagsCreateRR() {
        navbar.chooseCreateRR();
    }

    @Test
    public void functionalityOfSideBarAnchorTagsRRList() {
        navbar.chooseRRList();
    }

    @Test
    public void functionalityOfSideBarAnchorTagsrrApprovals() {
        navbar.chooseRRApprovals();
    }

    @Test
    public void functionalityOfSideBarAnchorTagsrateComparative() {
        navbar.chooseRateComparative();
    }

    @Test
    public void functionalityOfSideBarAnchorTagsrateApprovals() {
        navbar.chooseRateApprovals();
    }

    @Test
    public void functionalityOfSideBarAnchorTagspurchaseOrder() {
        navbar.choosePurchaseOrder();
    }

    @Test
    public void functionalityOfLocationMaster() {
        navbar.chooseLocationMaster();
    }

    @Test
    public void functionalityOfActivityMaster() {
        navbar.chooseactivityMaster();
    }

    @Test
    public void functionalityOfSubActivityMaster() {
        navbar.chooseSubActivityMaster();
    }

    @Test
    public void functionalityOfUOMMaster() {
        navbar.chooseUOMMaster();
    }

    @Test
    public void functionalityOfGSTMaster() {
        navbar.chooseGSTMaster();
    }

    @Test
    public void functionalityOfItemMaster() {
        navbar.chooseItemMaster();
    }

    @Test
    public void functionalityOfBrandMaster() {
        navbar.chooseBrandMaster();
    }

    @Test
    public void functionalityOfOrganisationMaster() {
        navbar.chooseOrganisation();
    }

    @Test
    public void functionalityOfSiteMaster() {
        navbar.chooseSiteMastera();
    }

    @Test
    public void functionalityOfSiteStaffMaster() {
        navbar.chooseSiteStafMaster();
    }

    @Test
    public void functionalityOfContractorMaster() {
        navbar.chooseContractorManager();
    }

    @Test
    public void functionalityOfrrStatus() {
        navbar.chooseRRStatus(); // Spelling mistake this shoul be rrstauts the link showing
                                 // https://staging.pislinfra.com/#/prstatus while clicking on the RR Status
    }

    @Test
    public void testChooseUsers() {
        navbar.chooseUsers();
    }

    @Test
    public void testChooseRoles() {
        navbar.chooseRoles();

    }

    @Test
    public void testChooseManagePermission() {
        navbar.chooseManagepermision();

    }

    @Test
    public void testChooseDPR() {
        navbar.chooseDPR();
    }

    @Test
    public void testChooseCreateDMR() {
        navbar.chooseCreateDMR();
    }

    @Test
    public void testChooseDMRStatus() {
        navbar.chooseDMRStatus();
    }

    @Test
    public void testChooseInventoryStatus() {
        navbar.chooseInventory();
    }

    @Test 
    public void testChooseSupport() {
        navbar.chooseSupport(); // Support button in the navbar is not Working or is not helping user to visit on any support page
    }

    @Test
    public void testchooseLogout() {
        navbar.chooseLogout();
    }
    @AfterClass
    public static void close() {
        utils.closeBrowser();
    }
}
