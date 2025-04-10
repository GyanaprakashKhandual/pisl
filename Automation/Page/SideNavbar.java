package Page;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideNavbar {

    WebDriver driver;
    WebDriverWait wait;

    public SideNavbar(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@id='hamburger']")
    WebElement hamBurElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/div/a/div/span")
    WebElement procElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[1]/a/div")
    WebElement createRRElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[2]/a/div")
    WebElement rrListElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[3]/a/div")
    WebElement rrApprovalElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[4]/a/div")
    WebElement rateComparativeElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[5]/a/div")
    WebElement rateApprovalsElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[1]/ul/li[6]/a/div")
    WebElement purchaseOrderElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/div/a/div/span")
    WebElement masterManagWebElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[1]/a/div")
    WebElement locationElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[2]/a/div")
    WebElement activityElement;
    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[3]/a/div")
    WebElement subActivityElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[4]/a/div")
    WebElement uomElement;
    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[5]/a/div")
    WebElement gsElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[6]/a/div")
    WebElement itemElement;
    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[7]/a/div")
    WebElement brandElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[8]/a/div")
    WebElement organisatioElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[9]/a/div")
    WebElement siteElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[10]/a/div")
    WebElement siteStaffElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[2]/ul/li[11]/a/div")
    WebElement contractorElement;
    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[3]/div/a/div/span")
    WebElement rrStatusElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[4]/div/a/div/span")
    WebElement userManagWebElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[4]/ul/li[1]/a/div")
    WebElement usersElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[4]/ul/li[2]/a/div")
    WebElement rolesElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[4]/ul/li[3]/a/div")
    WebElement managePermissionElement;
    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[5]/div/a/div/span")
    WebElement dprWebElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[6]/div/a/div/span")
    WebElement dmrWebElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[6]/ul/li[1]/a/div")
    WebElement createDMRElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[6]/ul/li[2]/a/div")
    WebElement dmrStatusElement;

    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[7]/div/a/div/span")
    WebElement inventoryWebElement;
    @FindBy(xpath="/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[7]/ul/li[1]/a/div")
    WebElement inventoryElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[8]/a")
    WebElement supporElement;

    @FindBy(xpath = "/html/body/my-app/app-dashboard-layout/div/div[1]/div/app-navigation-side-panel/div/ul/div/li[9]/a")
    WebElement logouElement;
    By loadingOverlayLocator = By.cssSelector("div.loading-foreground"); // Using locator, not @FindBy

    private void waitForLoadingOverlayToDisappear() {
        try {
            List<WebElement> overlays = driver.findElements(loadingOverlayLocator);
            if (overlays != null && !overlays.isEmpty()) {
                wait.until(ExpectedConditions.invisibilityOfAllElements(overlays));
            }
        } catch (Exception e) {
            System.out.println("No loading overlay found or already disappeared.");
        }
    }

    private void Logout() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(logouElement)).click();
    }
    public void chooseLogout() {
        Logout();
        wait.until(ExpectedConditions.urlContains("login"));
    }
    private void openSupport() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(supporElement)).click();
    }

    public void chooseSupport() {
        openSupport();
        wait.until(ExpectedConditions.urlContains("support"));
    }
    private void openDPRSection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(dprWebElement)).click();
    }
    public void chooseDPR() {
        openDPRSection();
        wait.until(ExpectedConditions.urlContains("dpr"));
    }

    private  void openRRSection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(rrStatusElement)).click();
    }
    public void chooseRRStatus() {
        openRRSection();
        wait.until(ExpectedConditions.urlContains("rrstatus"));
    }

    private void openProcurementSection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(procElement)).click();
    }

    public void chooseCreateRR() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(createRRElement)).click();
        wait.until(ExpectedConditions.urlContains("procurement"));
    }

    public void chooseRRList() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(rrListElement)).click();
        wait.until(ExpectedConditions.urlContains("view-RR-list"));
    }

    public void chooseRRApprovals() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(rrApprovalElement)).click();
        wait.until(ExpectedConditions.urlContains("prlist"));
    }

    public void chooseRateComparative() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(rateComparativeElement)).click();
        wait.until(ExpectedConditions.urlContains("rate-comparative"));
    }

    public void chooseRateApprovals() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(rateApprovalsElement)).click();
        wait.until(ExpectedConditions.urlContains("rate-approval"));
    }

    public void choosePurchaseOrder() {
        openProcurementSection();
        wait.until(ExpectedConditions.elementToBeClickable(purchaseOrderElement)).click();
        wait.until(ExpectedConditions.urlContains("purchase-order"));
    }

    private void openMasterManagementSection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(masterManagWebElement)).click();
    }

    public void chooseLocationMaster () {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(locationElement)).click();
        wait.until(ExpectedConditions.urlContains("location"));

    }

    public void chooseactivityMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(activityElement)).click();
        wait.until(ExpectedConditions.urlContains("structure"));

    }

    public void chooseSubActivityMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(subActivityElement)).click();
        wait.until(ExpectedConditions.urlContains("activity"));

    }

    public void chooseUOMMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(uomElement)).click();
        wait.until(ExpectedConditions.urlContains("uom"));
    }
    public void chooseGSTMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(gsElement)).click();
        wait.until(ExpectedConditions.urlContains("gst"));
    }

    public void chooseItemMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(itemElement)).click();
        wait.until(ExpectedConditions.urlContains("item"));
    }
    public void chooseBrandMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(brandElement)).click();
        wait.until(ExpectedConditions.urlContains("brand"));
    }
    public void chooseOrganisation() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(organisatioElement)).click();
        wait.until(ExpectedConditions.urlContains("organisation"));
    }

    public void chooseSiteMastera() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(siteElement)).click();
        wait.until(ExpectedConditions.urlContains("site"));
    }

    public void chooseSiteStafMaster() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(siteStaffElement)).click();
        wait.until(ExpectedConditions.urlContains("siteStaff"));
    }

    public void chooseContractorManager() {
        openMasterManagementSection();
        wait.until(ExpectedConditions.elementToBeClickable(contractorElement)).click();
        wait.until(ExpectedConditions.urlContains("contractor"));
    }

    private void openUserManagement() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(userManagWebElement)).click();
    }

    public void chooseUsers() {
        openUserManagement();
        wait.until(ExpectedConditions.elementToBeClickable(usersElement)).click();
        wait.until(ExpectedConditions.urlContains("users"));
    }

    public void chooseRoles() {
        openUserManagement();
        wait.until(ExpectedConditions.elementToBeClickable(rolesElement)).click();
        wait.until(ExpectedConditions.urlContains("roles"));
    }

    public void chooseManagepermision() {
        openUserManagement();
        wait.until(ExpectedConditions.elementToBeClickable(managePermissionElement)).click();
        wait.until(ExpectedConditions.urlContains("manage-permission"));
    }

    private void openDMRSection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(dmrWebElement)).click();
    }
    public void chooseCreateDMR() {
        openDMRSection();
        wait.until(ExpectedConditions.elementToBeClickable(createDMRElement)).click();
        wait.until(ExpectedConditions.urlContains("dmrform-material-record"));

    }
    public void chooseDMRStatus() {
        openDMRSection();
        wait.until(ExpectedConditions.elementToBeClickable(dmrStatusElement)).click();
        wait.until(ExpectedConditions.urlContains("dmr"));
    }

    private void openInventorySection() {
        waitForLoadingOverlayToDisappear();
        hamBurElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(inventoryWebElement)).click();
    }

    public void chooseInventory() {
        openInventorySection();
        wait.until(ExpectedConditions.elementToBeClickable(inventoryElement)).click();
        wait.until(ExpectedConditions.urlContains("inventory"));
    }
 
}
