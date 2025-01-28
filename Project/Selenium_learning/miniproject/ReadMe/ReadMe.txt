# Royal Caribbean Alaska Cruises - Automation Case Study

## Project Title
Royal Caribbean Alaska Cruises - Automated Search and Filter

## Description
This project involves automating the process of searching for "Rhapsody of the Seas" cruises on the Royal Caribbean website, filtering the results based on specific criteria, sorting the results by price, and displaying the number of results. The automation script performs the following tasks:
1. Opens the Royal Caribbean Alaska Cruises website.
2. Searches for "Rhapsody of the Seas".
3. Clicks on the first search result.
4. Clicks on "Book Now".
5. Filters the results by:
   - Months (select any four months)
   - Departure port (any available port)
   - Destination (any available destination)
   - Length of cruise (number of nights)
6. Sorts the results from lowest to highest prices.
7. Displays the number of results.
8. Closes the browser.

## Installation
To run this automation script, you will need to have the following installed:
- Java Development Kit (JDK)
- Selenium WebDriver
- Browser driver (e.g., ChromeDriver)
- TestNG (optional, for running the tests)

### Steps to Install
1. Install the Java Development Kit (JDK) from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Download and install the appropriate browser driver (e.g., [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)) and add it to your system PATH.
3. Download the Selenium Java bindings from [here](https://www.selenium.dev/downloads/) and add the JAR files to your project.
4. (Optional) Install TestNG for running the tests.

## Usage
1. Clone this repository or download the script files.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Add the Selenium JAR files to your project's build path.
4. Run the automation script.

## Detailed Description
The automation script performs the following steps:
1. Launches the website: [Royal Caribbean Alaska Cruises](https://www.royalcaribbean.com/alaska-cruises)
2. Checks for the presence of the search option.
3. Searches for "Rhapsody of the Seas".
4. Clicks on the first search result (Rhapsody of the Seas | Cruise Ships | Royal Caribbean Cruises).
5. Clicks on "Book Now".
6. Filters the results by selecting any four months.
7. Selects any available departure port.
8. Selects any available destination.
9. Selects the length of cruise (number of nights).
10. Clicks on "See Results".
11. Sorts the results from lowest to highest prices.
12. Displays the number of cruise search results.
13. Closes the browser.

## Key Automation Scope
The key automation scope includes:
- Locating elements by XPath, linkText, and partialLinkText.
- Retrieving web element properties.
- Scrolling into view of web elements.
- Synchronization using Explicit Wait.
- Checking for the presence of web elements.
- Using the Select class to select dropdown options.


