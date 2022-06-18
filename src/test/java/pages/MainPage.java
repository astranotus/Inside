package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {


    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("");

        return this;
    }

    @Step("В верхнем меню страницы проверяем наличие элемента arg0")
    public MainPage checkHeaderMenu(String value) {
        $(".header__menu").shouldHave(text(value)).shouldBe(visible);

        return this;
    }

    @Step("Изменяем язык страницы.")
    public MainPage changeLanguage() {
        $(".header__lang").click();

        return this;
    }

    @Step("Проверям видимость заголовка 'Услуги' в разделе услуг.")
    public MainPage checkVisibleServicesRu() {
        $("[class='services-screen__container container']")
                .$(".-back").shouldBe(visible).shouldHave(text("Услуги"));

        return this;
    }

    @Step("Проверям видимость элемента 'Веб-сервисы и порталы' в разделе услуг")
    public MainPage checkVisibleWebServicesAndPortalsRu() {
        $("[class='services-screen__services']").preceding(0)
                .$(".-title").shouldBe(visible).shouldHave(text("Веб-сервисы и порталы "));

        return this;
    }

    @Step("Проверям видимость элемента 'Мобильные приложения' в разделе услуг")
    public MainPage checkMobileAppsRu() {
        $("[class='services-screen__services']").preceding(1)
                .$(".-title").shouldBe(visible).shouldHave(text("Мобильные приложения"));

        return this;
    }

    @Step("Проверям видимость элемента 'API для любых задач, ML/AI, VR/AR' в разделе услуг")
    public MainPage checkVisibleApiVrArMlAiRu() {
        $("[class='services-screen__services']").preceding(2)
                .$(".-title").shouldBe(visible).shouldHave(text("API для любых задач, ML/AI, VR/AR"));

        return this;
    }

    @Step("Проверям видимость элемента 'IT-проекты любой сложности' в разделе услуг")
    public MainPage checkVisibleTurnkeyItProjectsOfAnyComplexityRu() {
        $("[class='services-screen__services']").preceding(3)
                .$(".-title").shouldBe(visible).shouldHave(text(" IT-проекты любой сложности"));

        return this;
    }

    @Step("Проверям видимость заголовка 'Services' в разделе услуг.")
    public MainPage checkVisibleServicesEng() {
        $("[class='services-screen__container container']")
                .$(".-back").shouldBe(visible).shouldHave(text("Services"));

        return this;
    }

    @Step("Проверям видимость элемента 'Web services and portals' в разделе услуг")
    public MainPage checkVisibleWebServicesAndPortalsEng() {
        $("[class='services-screen__services']").preceding(0)
                .$(".-title").shouldBe(visible).shouldHave(text("Web services and portals"));

        return this;
    }

    @Step("Проверям видимость элемента 'API, VR/AR, ML/AI' в разделе услуг")
    public MainPage checkVisibleApiVrArMlAiEng() {
        $("[class='services-screen__services']").preceding(1)
                .$(".-title").shouldBe(visible).shouldHave(text("API, VR/AR, ML/AI"));

        return this;
    }

    @Step("Проверям видимость элемента 'Mobile apps' в разделе услуг")
    public MainPage checkVisibleMobileAppsEng() {
        $("[class='services-screen__services']").preceding(2)
                .$(".-title").shouldBe(visible).shouldHave(text("Mobile apps"));

        return this;
    }

    @Step("Проверям видимость элемента 'Turnkey IT projects of any complexity' в разделе услуг")
    public MainPage checkVisibleTurnkeyItProjectsOfAnyComplexityEng() {
        $("[class='services-screen__services']").preceding(3)
                .$(".-title").shouldBe(visible).shouldHave(text("Turnkey IT projects of any complexity"));

        return this;
    }

    @Step("Заполняем поле 'Name' в разделе 'Свяжитесь с нами'")
    public MainPage fillName(String value) {
        $("#contacts-screen").$("input[name='name']").sendKeys(value);

        return this;
    }

    @Step("Заполняем поле 'Email' в разделе 'Свяжитесь с нами'")
    public MainPage fillEmail(String value) {
        $("#contacts-screen").$("input[name='mail']").setValue(value);

        return this;
    }

    @Step("Заполняем поле 'Message' в разделе 'Свяжитесь с нами'")
    public MainPage fillMessage(String value) {
        $("#contacts-screen").$("textarea[name='text']").setValue(value);

        return this;
    }

    @Step("Активируем чекбокс \"I'm not a robot\" в разделе 'Свяжитесь с нами'")
    public MainPage submitBoxNotARobot() {
        $("#contacts-screen").$(".-postfix").click();

        return this;
    }

    @Step("Нажимаем кнопку 'WriteUs' в разделе 'Свяжитесь с нами'")
    public MainPage clickWriteUsButton() {
        $("#contacts-screen").$("button[class='typical-button -button']");

        return this;
    }
}