package dlangina.tests.selenoid;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;

import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WikipediaTests extends SelenoidTestBase {

  @AllureId("7181")
  @Test
  @Tag("Selenoid")
  @DisplayName("Successful search in wikipedia android app")
  void searchTest() {
    back();

    step("Type search", () -> {
      $(MobileBy.AccessibilityId("Search Wikipedia")).click();
      $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
    });
    step("Verify content found", () ->
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title"))
            .shouldHave(sizeGreaterThan(0)));
  }
}
