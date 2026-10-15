# Selenium Web Automation Testing

## Overview

This project demonstrates web automation testing using Java, Selenium WebDriver, and TestNG. It focuses on testing login functionality, validating username input through positive and negative test scenarios, and structuring additional security-related test cases.

The project uses [SauceDemo](https://www.saucedemo.com/) as a mock web application to demonstrate browser automation, test execution, and assertion-based validation.

It also applies the **Page Object Model (POM)** to separate page interactions from test logic, making the code easier to organize, maintain, and extend.

## Technologies Used

* **Java** — Programming language
* **Selenium WebDriver 4.47.0** — Browser automation
* **TestNG 7.11.0** — Test execution and assertions
* **Maven** — Dependency management and project configuration
* **Chrome, Firefox, and Edge** — Supported browsers through the WebDriver manager class

## Project Structure

```text
Selenium-Task/
├── src/
│   └── main/
│       └── java/
│           ├── DriverManger/
│           │   └── DriverManger.java
│           ├── base/
│           │   ├── BasePage.java
│           │   └── BaseTest.java
│           ├── pages/
│           │   ├── DeletedAccountPage.java
│           │   ├── NetworkDropPage.java
│           │   ├── SecuritySwipePage.java
│           │   └── UsernameCreationPage.java
│           ├── advancedTests/
│           │   ├── ReuseDeletedAccountUsername.java
│           │   ├── networkDropDuringSubmission.java
│           │   └── SecuritySwipeBackClearsData.java
│           └── usernameTests/
│               ├── UsernameCreationTest.java
│               ├── UsernameNegativeTestBlank.java
│               ├── UsernameNegativeTestDuplicate.java
│               ├── UsernameNegativeTestNonEnglish.java
│               ├── UsernameNegativeTestTooLong.java
│               ├── UsernameNegativeTestTooShort.java
│               ├── UsernameNegativeTestWithSpecialCharacters.java
│               └── UsernameNegativeTestWithoutNumber.java
├── pom.xml
└── README.md
```

## Test Scenarios

### 1. Positive Testing

* **Successful Login:** Verifies that valid credentials allow navigation to the inventory page.

### 2. Negative Username Testing

The project includes test cases that attempt login using different invalid username inputs:

* **Blank Username:** Submits the login form without entering a username.
* **Duplicate Username:** Attempts to use a username that is already taken.
* **Non-English Characters:** Tests a username containing Arabic characters.
* **Excessive Length:** Tests a username longer than the specified 15-character limit.
* **Insufficient Length:** Tests a username shorter than the specified 8-character minimum.
* **Special Characters:** Tests a username containing special characters.
* **Missing Numbers:** Tests a username without numeric characters.

These tests check whether the application navigates to the inventory page after submission.

### 3. Advanced Test Scenarios

Additional test classes demonstrate how security and error-handling scenarios can be structured:

* **Deleted Account Username Reuse:** Attempts to log in with credentials associated with a deleted account.
* **Network Interruption During Submission:** Submits login credentials and checks the browser's current URL.
* **Browser Navigation and Input State:** Tests whether the username field is cleared after browser navigation.

**Note:** These advanced scenarios are structural examples. SauceDemo does not implement the custom account-deletion, username-creation, or security features they describe. Their assertions do not establish that those behaviors have been verified against a real implementation.

## Framework Design

### Page Object Model (POM)

The project separates page interactions from test cases using dedicated page classes.

* **BasePage:** Provides a shared WebDriver instance for page objects.
* **BaseTest:** Initializes the browser and opens SauceDemo before each test.
* **Page Classes:** Encapsulate page elements and browser interactions.
* **Test Classes:** Execute test scenarios and validate results using TestNG assertions.

### Browser Management

The `DriverManger` class centralizes WebDriver initialization and supports Chrome, Firefox, and Edge. Chrome-specific options are configured when Chrome is selected.

### Assertions

TestNG assertions are used to verify expected outcomes, such as successful navigation to the inventory page or remaining outside that page after submitting invalid input.

## Prerequisites

Before running the project, install:

* Java Development Kit (JDK)
* Maven
* Google Chrome, Mozilla Firefox, or Microsoft Edge
* An IDE such as IntelliJ IDEA or Eclipse

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/SaraSamyFahmy/Selenium-Task.git
```

### 2. Open the Project

Import the project into your preferred Java IDE as a Maven project.

### 3. Install Dependencies

From the project root directory, run:

```bash
mvn clean install
```

### 4. Run the Tests

The test classes use TestNG annotations and extend `BaseTest`. You can execute them through your IDE's TestNG runner.

To run tests through Maven, configure a TestNG suite or a compatible Maven test runner and ensure that the test classes are included in the test source directory.

**Note:** The supplied code places test classes under `src/main/java`, whereas Maven conventionally discovers tests under `src/test/java`. You may need to move the test classes or adjust your Maven configuration before running them through Maven.

## Current Scope and Limitations

* The implemented login interactions use SauceDemo's existing login page.
* Username validation scenarios represent requirements that SauceDemo may not enforce.
* The account deletion, username creation, and network interruption scenarios require a suitable application or test environment to verify their intended behavior.
* The browser navigation test demonstrates navigation and field-state checks but does not simulate an actual security event or swipe gesture.
* The current browser setup initializes Chrome by default.

## Author

**Sara Samy Fahmy**

[GitHub Profile](https://github.com/SaraSamyFahmy)

[Project Repository](https://github.com/SaraSamyFahmy/Selenium-Task)
