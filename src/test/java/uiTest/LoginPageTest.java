package uiTest;

import model.XpathLocators;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPageTest {
    XpathLocators xpath = new XpathLocators();

    @BeforeEach
    public void setUp() {
        open("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
    }

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void login() {
        xpath.InputUserName.val("demo").pressTab().val("demo").pressEnter();
        xpath.InputConfirmationCode.val("0000").pressEnter();
        xpath.IconClose.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Пополнение счёта")
    public void refill() {
        login();
        xpath.MenuItemCards.click();
        xpath.LinkCardPayments.click();
        xpath.WriteOffCard.click();
        xpath.SelectGoldCard.click();
        xpath.InputAmountForCard.val("194").pressEnter();
        xpath.CheckboxAgreeRules.click();
        $x("/html/body/form/div[2]/div[2]/input").val("0000").pressEnter();
        xpath.AlertSuccessfulOperation.shouldBe(visible);
    }

}
