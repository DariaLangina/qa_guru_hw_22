package dlangina.tests.browserstack.android;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WikipediaTests extends BrowserstackTestBase {

  @AllureId("6918")
  @Test
  @Tag("Browserstack")
  @DisplayName("Проверка результата поиска по значению 'BrowserStack'")
  void searchBrowserStackInWikipedia() {
    step("Установка курсора в поле поиска", () ->
        $(MobileBy.AccessibilityId("Search Wikipedia")).click());
    step("Ввод значения 'BrowserStack' и инициация поиска", () ->
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack"));
    step("Проверка наличия результатов", () -> {
      $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));
    });
  }

  @AllureId("6919")
  @Test
  @Tag("Browserstack")
  @DisplayName("Открытие страницы из результатов поиска по запросу 'Tver'")
  void openingPageFromSearchResultsTest() {
    step("Установка курсора в поле поиска", () ->
        $(MobileBy.AccessibilityId("Search Wikipedia")).click());
    step("Ввод значения 'Tver' в поле и и инициация поиска", () ->
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Tver"));
    step("Проверка наличия результатов", () -> {
      $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));
    });
    step("Нажатие на результат поиска с заголовком 'Tver'", () ->
        $$(byClassName("android.widget.TextView")).find(exactText("Tver")).click());
    step("Проверка заголовка страницы", () -> {
      $(MobileBy.id("org.wikipedia.alpha:id/view_page_subtitle_text")).shouldHave(
          exactText("City of oblast significance in Tver Oblast, Russia"));
    });
  }
}
