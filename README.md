# Automation RR
## Description
This project shows how to automate the Randall-Reilly website using Selenium and Java.

## Installation
1. Clone the repository
2. Open the project in your favorite IDE
3. Build the project using Maven

## Running the tests
Run TestNg.xml

## Approach
1. Page Object Model (POM) design pattern to organize the code. Code is not organized on pages, but on sections (in case of Single Page Applications)
2. Singleton design pattern to handle a single instance of the Selenium WebDriver
3. WebElement wrapper to chain methods. Every element in the page object model only declares the locator and selector, and no action is performed until we use them in the test
4. TestNG to do the assertions

## Project structure:
```
automation-rr
├── pom.xml -- Manage dependencies
├── src -- Source folder
│   ├── element -- WebElement wrapper to chain methods
│   ├── pom -- Page Object Model classes
│   ├── singleton -- Singleton class to handle a single instance of Selenium WebDriver
│   ├── test -- Test classes
│   ├── Main -- Question 4 - Code challenge