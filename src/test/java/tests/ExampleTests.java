package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.TestData;



public class ExampleTests extends BaseTest {

    @ValueSource(strings = {"Услуги", "Вакансии", "Проекты", "О нас", "Контакты"})
    @Owner("astranotus8@gmail.com")
    @Feature("Главное верхнее меню")
    @DisplayName("Проверка элементов верхнего меню на русском языке")
    @ParameterizedTest(name = "Открытие главной страницы, проверка наличия элеметнов верхнего меню на русском языке.")
    public void mainPageHeaderMenuCheckRus(String testData) {
        mainPage
                .openPage()
                .checkHeaderMenu(testData);
    }

    @ValueSource(strings = {"Service", "Vacancies", "Projects", "About us", "Contacts"})
    @Owner("astranotus8@gmail.com")
    @Feature("Главное верхнее меню")
    @DisplayName("Проверка элементов верхнего меню на английском языке")
    @ParameterizedTest(name = "Открытие главной страницы, проверка наличия элеметнов верхнего меню на английском языке.")
    public void mainPageHeaderMenuCheckEng(String testData) {
        mainPage
                .openPage()
                .changeLanguage()
                .checkHeaderMenu(testData);
    }

    @Owner("astranotus8@gmail.com")
    @Feature("Раздел 'Услуги' на главной странице")
    @DisplayName("Проверка вдимости элементов раздела 'Услуги' Ru")
    @Description("Тест проверяет видимость элементов 'Веб-сервисы и порталы', 'Мобильные приложения', " +
            "'API для любых задач, ML/AI, VR/AR', 'IT-проекты любой сложности' раздел услуг на русском языке")
    @Test
    public void checkServicesRu() {  //displayed:false></div>, Actual value: hidden, тест падает из-за неправильной верстки, элементы отображаются корректно.
        mainPage                     //Решение: если сайт под контролем ручных тестироващиков, то создать баг с низким приорететом и критичностью.
                .openPage()
                .checkVisibleServicesRu()
                .checkVisibleWebServicesAndPortalsRu()
                .checkMobileAppsRu()
                .checkVisibleApiVrArMlAiRu()
                .checkVisibleTurnkeyItProjectsOfAnyComplexityRu();
    }

    @Owner("astranotus8@gmail.com")
    @Feature("Раздел 'Услуги' на главной странице")
    @DisplayName("Проверка вдимости элементов раздела 'Услуги' Eng")
    @Description("Тест проверяет видимость элементов 'Web services and portals', 'API, VR/AR, ML/AI', " +
            "'Mobile apps', 'Turnkey IT projects of any complexity")
    @Test
    public void checkServicesEng() {  //displayed:false></div>, Actual value: hidden, тест падает из-за неправильной верстки, элементы отображаются корректно.
        mainPage                      //Решение: если сайт под контролем ручных тестироващиков, то создать баг с низким приорететом и критичностью.
                .openPage()
                .checkVisibleServicesEng()
                .checkVisibleWebServicesAndPortalsEng()
                .checkVisibleApiVrArMlAiEng()
                .checkVisibleMobileAppsEng()
                .checkVisibleTurnkeyItProjectsOfAnyComplexityEng();
    }

    @Owner("astranotus8@gmail.com")
    @Feature("Раздел 'Свяжитесь с нами'")
    @DisplayName("Проверка формы 'Свяжитесь с нами'")
    @Description("Тест проверяет заполнение форма 'Свяжитесь с нами' и отправку сообщения")
    @Test
    public void contactUs() {
        mainPage.openPage()
                .fillName(TestData.name)
                .fillEmail(TestData.email)
                .fillMessage(TestData.message)
                .submitBoxNotARobot()
                .clickWriteUsButton();
    }
}
