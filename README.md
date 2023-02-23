

# Hotel_Reservation-Selenium-TestNG




##  [HOTEL PLANISPHERE](https://hotel.testplanisphere.dev/en-US/plans.html) is a complete End-To project where an  is automated by writing test suites using selenium-webdriver and TestNg as testing framework and generate test reports from Allure.
The following modules are testing automated:

- Sign up
- Sign in
- Reservation
- Logout





## Technology:

**Tool:**  Selenium Webdriver

**IDE:**  Intellij IDEA

**Build tool:**  Maven

**Language:**  Java

**Testing Framework:**  TestNG

**Test Report Tool:**  Allure



## Prerequisite:
- Need to install jdk 18, Maven
- Configure Environment variable for jdk 18, Maven
- Clone this project and unzip it
- Open the project folder
- Double click on "build.maven" and open it through IntellIJ IDEA
- Let the project build successfully
- Click on "Terminal" and run the automation scripts


## Run The Automation Script By The Following Command:


```bash
  mvn clean test 
```

- Selenium will open the browser and start automating.



## How To Generate Allure Report:
- Download [Latest one ](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/) & check allure version

```bash
  allure --version
```

- Extract and copy Bin location and add to system env path

- Run below command :

```bash
  mvn clean test 
```

- Run your suite from .XML file

- Copy Allure-result path location

- Open cmd and paste Allure-result path location the below cmd line :

```bash
  allure serve <Allure-result path location>
```








## Screenshots

Overview:

![](https://github.com/SumiaRia/Hotel_Reservation-Selenium-TestNG/blob/main/allure%20result%20img1.PNG)


Packages: 

![](https://github.com/SumiaRia/Hotel_Reservation-Selenium-TestNG/blob/main/allure%20result%20img2.PNG)
