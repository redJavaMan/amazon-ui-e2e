# Amazon UI E2E Testing Framework

This repository contains an automated end-to-end testing framework for Amazon's user interface, built with Selenium WebDriver and TestNG in Java.

## Overview

This framework follows the Page Object Model (POM) design pattern to create a scalable and maintainable test automation solution. It provides a structured approach to UI testing of the Amazon website, allowing for robust test scenarios to be implemented with minimal code duplication.

## Project Structure

```
amazon-ui-e2e/
├── src/
│   ├── main/java/
│   │   └── pages/
│   │       ├── Header.java
│   │       ├── HomePage.java
│   │       └── ProductPage.java
│   └── test/java/
│       ├── Base/
│       │   └── BaseTest.java
│       └── tests/
│           └── AddToCartTest.java
├── .gitignore
└── pom.xml
```

## Features

- Page Object Model implementation for better code organization and reusability
- TestNG for test execution and assertions
- ChromeDriver for browser automation
- Maven for dependency management
- Base test class with common setup and teardown operations

## Prerequisites

- Java 11 or higher
- Maven
- Chrome browser
- ChromeDriver matching your Chrome browser version

## Installation

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/amazon-ui-e2e.git
   cd amazon-ui-e2e
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

## Running Tests

To run all tests:

```
mvn test
```

To run a specific test class:

```
mvn test -Dtest=AddToCartTest
```

## Framework Components

### Page Objects

- **HomePage**: Represents Amazon's home page with navigation methods
- **Header**: Represents the header section with search functionality
- **ProductPage**: Represents product search results and product detail pages

### Test Base

- **BaseTest**: Contains common setup and teardown methods, initializes WebDriver and page objects

### Test Classes

- **AddToCartTest**: Tests product search and selection functionality

## Future Enhancements

- Add more test scenarios (checkout, login, etc.)
- Implement cross-browser testing
- Add reporting functionality
- Implement parallel test execution
- Add data-driven testing capabilities
- Configure CI/CD pipeline integration

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
