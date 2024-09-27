Here's a template for your GitHub README file:

---

# Selenium Automation with Java & TestNG

This repository contains automated test scripts using Selenium WebDriver with Java and TestNG for the following scenarios:

1. **Edureka Website Validation**: Automates login, profile update, and other user interactions on the Edureka website.
2. **Flight Booking Website**: Validates the flight booking process, including selecting flights, entering passenger details, and confirming bookings.
3. **Form Validation**: Automates the process of form submission, verifying mandatory fields, field formats, and validation messages.
4. **Add Items to Cart**: Automates the process of searching for items, adding them to the cart, and validating the cart contents.

## Folder Structure

```
├── edureka-validation
│   ├── src
│   │   ├── test
│   │   │   ├── java
│   │   │   │   ├── EdurekaLoginTest.java
│   │   │   │   ├── ProfileUpdateTest.java
│   │   │   │   └── ...
├── flight-booking
│   ├── src
│   │   ├── test
│   │   │   ├── java
│   │   │   │   ├── FlightSearchTest.java
│   │   │   │   ├── FlightBookingTest.java
│   │   │   │   └── ...
├── form-validation
│   ├── src
│   │   ├── test
│   │   │   ├── java
│   │   │   │   ├── FormValidationTest.java
│   │   │   │   └── ...
├── add-to-cart
│   ├── src
│   │   ├── test
│   │   │   ├── java
│   │   │   │   ├── SearchProductTest.java
│   │   │   │   ├── AddToCartTest.java
│   │   │   │   └── ...
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Selenium WebDriver
- TestNG
- Browser Drivers (e.g., ChromeDriver, GeckoDriver)

## Setup Instructions

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/Ashish-ranjan82/Selenium-Projects
   cd selenium-automation
   ```

2. **Install Dependencies:**
   Make sure Maven is installed and run the following command:
   ```sh
   mvn clean install
   ```

3. **Run the Test Cases:**
   You can run the test cases using the following command:
   ```sh
   mvn test
   ```

## Test Scenarios

### 1. Edureka Website Validation
- **Login**: Automates the login process and validates successful login.
- **Profile Update**: Automates updating profile details like name, bio, etc.
- **Additional Interactions**: Additional test cases for different user actions on the website.

### 2. Flight Booking Website
- **Flight Search**: Validates the functionality of searching flights.
- **Flight Booking**: End-to-end booking process validation.

### 3. Form Validation
- **Mandatory Fields Check**: Ensures all required fields are validated.
- **Field Format Validation**: Checks for correct format in inputs like email, phone number, etc.

### 4. Add Items to Cart
- **Product Search**: Automates searching for a product by name or category.
- **Add to Cart**: Verifies that selected items are added to the cart and checks the cart content.

## Reporting and Logs

- Test results are generated using TestNG's default reports.
- Logs for each test case can be found in the `target/surefire-reports` directory.

