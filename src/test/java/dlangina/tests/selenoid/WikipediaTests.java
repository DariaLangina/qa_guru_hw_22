package dlangina.tests.selenoid;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
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
  @DisplayName("Добавление Русского языка")
  void settingLanguageTest() {
    back();

    step("Открытие меню", () ->
             $(MobileBy.id("org.wikipedia.alpha:id/menu_icon")).click()
        );
    step("Открытие 'Настройки'", () ->
             $(MobileBy.id("org.wikipedia.alpha:id/main_drawer_settings_container")).click()
        );
    step("Открытие 'Wikipedia languages' раздел", () ->
             $(MobileBy.xpath(("//*[@text='Wikipedia languages']"))).click()
        );
    step("Нажатие кнопки 'Add language'", () ->
             $(MobileBy.xpath(("//*[@text='ADD LANGUAGE']"))).click()
        );
    step("Поиск и выбор языка 'Русский'", () -> {
           $(MobileBy.id("org.wikipedia.alpha:id/menu_search_language")).click();
           $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("russian");
           $(MobileBy.id("org.wikipedia.alpha:id/localized_language_name")).shouldHave(text("Русский"))
                                                                           .click();
         }
        );
    back();
    step("Проверка наличия выбранного языка", () ->
        $(byText("Русский")).shouldBe(visible));
  }
}
