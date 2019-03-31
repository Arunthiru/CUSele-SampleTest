ScreenTest-

1. Install JAVA SDK 8
2. Install Maven
3. Install Git
4. Install Eclipse
5. Download chromedriver
https://chromedriver.storage.googleapis.com/index.html?path=74.0.3729.6/

Set Path Variables
User Variable Path = directory for java sdk 8 Set Maven home in environment Variables

For Windows
Create the following System variables

JAVA_HOME = Path to java sdk
M2_HOME = Path to maven installation
MAVEN_HOME = Path to maven installation
For Windows Edit Path System variable
Add %M2_HOME%\bin
Add directory to your chromedriver.exe under steps file:
{/ScreenTest/src/test/java/seleniumgluecode/test.java}

For Mac
Create the following System variables
export JAVA_HOME=/Library/Java/Home
echo $JAVA_HOME on Terminal to confirm the path
export M2_HOME=/Users/path to maven folder/apache-maven
export PATH=$PATH:$M2_HOME/bin
Add directory to your chromedriver.exe under steps file:
{/ScreenTest/src/test/java/seleniumgluecode/test.java}-->Under "System.setProperty"

Framework Overview
Cucumber Selenium - Testframework leveraging the Cucumber framework with Selenium written in JAVA.

Feature File - The feature file specifies the steps in BDD language style

Step Definition Feature File - Java class whereby the steps from the feature file are 
broken down to be coded into automation tests

Feature PageObject Class - Java class whereby the necessary HTML objects are captured as WebElements 
to be manipulated by the associated model class

Cucumber Reports - Cucumber has a built in report generation whereby Feature files tested are 
automatically written to cucumbers own reporting system

Steps to write an acceptance test
1-Create Feature file and define feature scenario test

2-Create Step definition class & methods for the steps.
              
3-Create Page Object Class and define objects required.
                         
4-Create testrunner class with cucumberoptions api,junit cucumber to run the features file

5- Validate the test results cucumber html report under target folder 
by refreshing the project once the test run is completed.

