<h1 align="center"> :robot: Проект по автоматизации тестирования в рамках обучения на курсе QA.GURU </h1>

## :rocket: Технологический стек

IntelliJ IDEA, Java, Gradle, JUnit5, Selenide, Selenoid, Jenkins, Allure Report, Allure TestOps,
Jira, Github, Telegram

<p  align="center"

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/IDEA-logo.svg"></code>
<code><img width="5%" title="Java" src="images/logo/java-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/logo/junit5-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/selenide-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/selenoid-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/jenkins-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/allure-Report-logo.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/allure-ee-logo.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/jira-logo.svg"></code>
<code><img width="5%" title="Github" src="images/logo/git-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>
</p>

## UI тесты

* ✅ Selenoid. Проверка результата поиска по значению 'BrowserStack'
* ✅ Browserstack. Проверка результата поиска по значению 'BrowserStack'
* ✅ Browserstack. Открытие страницы из результатов поиска по запросу 'Tver'
* ✅ Проверка страниц getting started


### Отчёт о прохождении автотестов в Allure Report

<p align="center">
  <img src="images/readme/Allure_Report_1.png">
</p>

<p align="center">
  <img src="images/readme/Allure_Report_2.png">
</p>

### Хранение тестовой документации в Allure TestOps

<p align="center">
  <img src="images/readme/Allure_TestOps1.png">
</p>

<p align="center">
  <img src="images/readme/Allure_TestOps2.png">
</p>

### Интерграция с Jira

<p align="center">
  <img src="images/readme/Jira.png">
</p>

### Пример запуска теста в Selenoid

<p  align="left"
<code><img width="60%" title="Selenoid" src="images/readme/demo1.gif"></code>
</p>

### Пример запуска теста в BrowserStack

<p  align="left"
<code><img width="60%" title="Selenoid" src="images/readme/demo2.gif"></code>
</p>

### Уведомления о прохождении автотестов в Telegram

<p align="center">
  <img src="images/readme/Telegram_1.png">
</p>

<p align="center">
  <img src="images/readme/Telegram_2.png">
</p>

Serve report:

```bash
allure serve build/allure-results
```

### Запуск в Jenkins

Статистика по запускам <br >
<p align="center">
  <img src="images/readme/jenkins1.png">
</p>

Параметры запуска <br >
<p align="center">
  <img src="images/readme/jenkins2.png">
</p>

### Как запустить

Перед выполением необходимо:

* запустить сервер (browserstack или selenoid)

### Запуск тестов с помощью BrowserStack:

```
gradle clean test -DdeviceHost=browsertack
```

### Запуск тестов с помощью Selenoid:

```
gradle clean test -DdeviceHost=selenoid
```

### Запуск тестов с незаполненными свойствами browserstack:

```
gradle -DdeviceHost=browserstack -Duser={put here browserstack user} -Dkey={put here browserstack access key} -Dapp={put here your browserstack app id} clean test
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
