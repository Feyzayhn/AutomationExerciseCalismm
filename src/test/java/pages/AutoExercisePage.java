package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage {

    public AutoExercisePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "section#slider")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginLink;
    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(name = "name")
    public WebElement nameBoxSignup;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBoxSignup;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(css = ".radio-inline")
    public List<WebElement> genderList;
    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInformationText;
    @FindBy(css = "#password")
    public WebElement passwordBoxNewSignup;
    @FindBy(css = "#days")
    public WebElement dayDDM;
    @FindBy(css = "#months")
    public WebElement monthDDM;
    @FindBy(css = "#years")
    public WebElement yearDDM;
    @FindBy(id = "newsletter")
    public WebElement newsletter;
    @FindBy(id = "optin")
    public WebElement partners;
    @FindBy(css = "#first_name")
    public WebElement firstnameBoxNewSignup;
    @FindBy(css = "#country")
    public WebElement country;
    @FindBy(css = "#state")
    public WebElement state;
    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;
    @FindBy(css = "a>.fa.fa-user")
    public WebElement loggedInAsUsername;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//h2[.='Account Deleted!']")
    public WebElement accountDeletedMessage;
    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccount;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBoxLogin;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordBoxLogin;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement yourEmailPasswordIncorrectText;
    @FindBy(css = "#dismiss-button>div")
    public List<WebElement> dismissButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    //06
    @FindBy(css = ".fa.fa-envelope")
    public WebElement contactUs;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTitle;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBoxContact;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxContact;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBoxContact;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageBoxContact;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(css = ".btn.btn-primary.pull-left.submit_form")
    public WebElement submitContact;

    @FindBy(css = ".status.alert.alert-success")
    public WebElement successMessage;

    @FindBy(css = ".btn.btn-success")
    public WebElement homeButtonContact;

    @FindBy(xpath = "//*[.=' Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement emailAdressMessage;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement testCasesTitle;

    //TC08
    @FindBy(css = ".material-icons.card_travel")
    public WebElement productsButton;

    @FindBy(css = ".title.text-center")
    public WebElement allProduct;

    @FindBy(xpath = "//*[@class='features_items']//*[@class='col-sm-4']/div/div/div/p")
    //*[@class='col-sm-4']/div/div/div/p
    public List<WebElement> productList;

    @FindBy(css = "a>.fa.fa-plus-square")
    public List<WebElement> viewProduct;
    @FindBy(css = ".product-information")
    public WebElement productInformation;

    @FindBy(css = ".product-information>h2")
    public WebElement productName;

    @FindBy(xpath = "(//*[@class='product-information']//p)[1]")
    public WebElement productCategory;

    @FindBy(xpath = "//div//span//span")
    public WebElement productPrice;

    @FindBy(xpath = "(//*[@class='product-information']//p)[2]")
    public WebElement productAvailability;

    @FindBy(xpath = "(//*[@class='product-information']//p)[3]")
    public WebElement productCondition;

    @FindBy(xpath = "(//*[@class='product-information']//p)[4]")
    public WebElement productBrand;


    //TC09

    @FindBy(css = "input#search_product")
    public WebElement searchProduct;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(css = ".title.text-center")
    public WebElement searhcedProducts;

    @FindBy(xpath = "//*[@class='productinfo text-center']/p")
    public List<WebElement> searchedProductNames;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement wantedProduct;

    //TC10

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(css = "#susbscribe_email")
    public WebElement susbscribeEmail;

    @FindBy(css = ".fa.fa-arrow-circle-o-right")
    public WebElement subscriptionOkButton;

    @FindBy(xpath = "//*[@class='alert-success alert']")
    public WebElement subscriptionOkMessage;

    //TC11

    @FindBy(css = ".fa.fa-shopping-cart")
    public WebElement cartButton;

    //TC12
    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement addToCart1;

    @FindBy(css = ".btn.btn-success.close-modal.btn-block")
    public WebElement continioShopping;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    public WebElement addToCart2;
    @FindBy(css = "a>u")
    public WebElement viewCart;

    @FindBy(xpath = "//tr//td//a//img")
    public List<WebElement> productListCart;

    @FindBy(xpath = "//tr[1]//td[3]//p")
    public WebElement firstProductPrice;

    @FindBy(xpath = "//tr[2]//td[3]//p")
    public WebElement secondProductPrice;

    @FindBy(xpath = "//tr[1]//td[4]//button")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "//tr[2]//td[4]//button")
    public WebElement secondProductQuantity;

    @FindBy(xpath = "//tr[1]//td[5]//p")
    public WebElement firstProductTotal;

    @FindBy(xpath = "//tr[2]//td[5]//p")
    public WebElement secondProductTotal;

    //TC13
    @FindBy(css = ".fa.fa-plus-square")
    public List<WebElement> viewButtonProductList;
    @FindBy(css = ".product-information")
    public WebElement productDetail;

    @FindBy(css = "#quantity")
    public WebElement quantity;

    @FindBy(css = ".btn.btn-default.cart")
    public WebElement addToCartButton;

    @FindBy(xpath = "//tr//td[4]//button")
    public WebElement quantityInCart;


    //TC14
    @FindBy(css = ".active")
    public WebElement shoppingCart;

    @FindBy(css = ".btn.btn-default.check_out")
    public WebElement proceedToChechkoutButton;

    @FindBy(css = "div>p>a>u")
    public WebElement registerLogin;

    @FindBy(css = ".btn.btn-default.add-to-cart")
    public List<WebElement> addToCartList;

    @FindBy(css = "heading")
    public List<WebElement> detailsReviewList;
    @FindBy(css = ".form-control")
    public WebElement descriptionBox;
    @FindBy(css = ".btn.btn-default.check_out")
    public WebElement placeHolderButton;

    @FindBy(xpath = "//*[@data-qa='name-on-card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//*[@data-qa='card-number']")
    public WebElement cardNumber;
    @FindBy(css = ".form-control.card-cvc")
    public WebElement cardCvv;

    @FindBy(css = ".form-control.card-expiry-month")
    public WebElement cardDate;

    @FindBy(css = ".form-control.card-expiry-year")
    public WebElement cardYear;

    @FindBy(css = ".form-control.btn.btn-primary.submit-button")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//*[.='Congratulations! Your order has been confirmed!']")
    public List<WebElement> successMessageOrder;

    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    public WebElement accountDeletedTitle;

    @FindBy(css = ".btn.btn-primary")
    public WebElement continueButtonDelete;

    //TC15
    @FindBy(css = ".fa.fa-lock")
    public WebElement signupLoginButton;

    //TC17

    @FindBy(css = ".fa.fa-times")
    public WebElement xButton;
    @FindBy(css = ".text-center>b")
    public WebElement cartIsEmpty;

    //TC18
    @FindBy(css = ".left-sidebar>h2")
    public WebElement category;
    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;
    @FindBy(xpath = "//a[@href='#Men']/span")
    public WebElement menCategory;

    @FindBy(css = ".title.text-center")
    public WebElement womenProducts;

    @FindBy(css = "#Women>div>ul>li")
    public List<WebElement> womenCategoryList;
    @FindBy(xpath = "//*[@id='Women']/div/ul/li/a[.='Dress ']")
    public WebElement dressLink;
    @FindBy(xpath = "//*[@id='Men']/div/ul/li/a[.='Jeans ']")
    public WebElement jeansLink;
    @FindBy(css = "#Men>div>ul>li")
    public List<WebElement> menCategoryList;
}






