# 🛒 NopCommerce Automation Suite

## 📌 Project Overview

This project is a complete **end-to-end automation suite** for the demo e-commerce website  
👉 [https://test470.nop-station.com/](https://test470.nop-station.com/)

The automation covers major user workflows including:

- User Registration (all fields + mandatory fields)
- Login & Logout
- My Account → Addresses (Add new address)
- Change Password
- Wishlist Functionality
- Digital Downloads (sample file download)
- Product Comparison
- Full Checkout Process with gift wrapping option
- Order verification in My Account → Orders

The suite is designed using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** to ensure high scalability, maintainability, and CI/CD readiness.

---

## 🚀 Technology Stack

- **Language:** Java  
- **UI Automation:** Selenium WebDriver  
- **Framework:** TestNG  
- **Design Pattern:** Page Object Model (POM)  
- **Build Tool:** Maven  
- **Reporting:** ExtentReports / Allure  
- **Version Control:** Git + GitHub  
- **Recording Tool:** Any screen recorder  

---






## 📁 Project Structure

📦 **nopcommerce-automation**  
├── 📂 src  
│   ├── 📂 main/java/pages  
│   │   ├── BasePage.java  
│   │   ├── HomePage.java  
│   │   ├── RegisterPage.java  
│   │   ├── LoginPage.java  
│   │   ├── MyAccountPage.java  
│   │   ├── AddressPage.java  
│   │   ├── ChangePasswordPage.java  
│   │   ├── ProductPage.java  
│   │   ├── WishlistPage.java  
│   │   ├── ComparePage.java  
│   │   └── CheckoutPage.java  
│   │
│   ├── 📂 test/java/utils  
│   │   ├── ScrollUtils.java  
│   │   └── WaitUtils.java  
│   │
│   ├── 📂 test/java/tests  
│   │   ├── BaseTest.java  
│   │   ├── RegisterTests.java  
│   │   ├── LoginTests.java  
│   │   ├── AddressTests.java  
│   │   ├── ProductTests.java  
│   │   └── CheckoutTests.java  
│
├── 📄 pom.xml  
├── 📄 testng.xml  
├── 📄 .gitignore  
├── 📄 README.md  
├── 📂 reports  
└── 📂 screenshots  

---

## Video



