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

## How To Run 

## ✅ Prerequisites

Install the following:

- **Java JDK 8+**
- **Maven 3.8+**
- **Git**
- **Google Chrome**
- **IntelliJ IDEA / Eclipse (Optional)**

Check installations:

```bash
java -version
mvn -version
```
-📥 1. Clone the Repository

git clone https://github.com/Shakhawat1998/SeleniumAssignment.git
cd SeleniumAssignment
📦 2. Install Dependencies

mvn clean install
▶️ 3. Run the Test Suite
Run all tests:


mvn clean test
🎯 4. Run Specific Test Class
Example:
mvn -Dtest=RegisterTests test
Multiple classes:
mvn -Dtest=RegisterTests,LoginTests test
📄 5. Run Using testng.xml
mvn clean test -DsuiteXmlFile=testng.xml
📊 Extent Report
After execution, open the HTML report:
reports/AutomationReport.html


## Video

[▶ Watch the Demo Video](https://drive.google.com/file/d/1EmatZVyGHqZxkgcQpi54Rg_RFCk-1reh/view)


