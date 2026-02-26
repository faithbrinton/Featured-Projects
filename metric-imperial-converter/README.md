# Assignment 05 – Metric to Imperial Converter (PROG2700/1440)

## Description
This project was created for Assignment 05 in PROG2700/1440 – Client-Side Programming. It demonstrates how JavaScript performs basic “backend” logic in a client-side web application and how HTML, CSS, and JavaScript work together to build an interactive Metric to Imperial unit converter.

The project includes a Backend Logic Check section to explain how JavaScript handles input and calculations, followed by a full mini project that converts metric values to imperial units directly in the browser.

## Backend Logic Check
In this project, JavaScript uses an event listener instead of inline HTML onclick. The Convert button is connected to JavaScript using addEventListener("click"), which runs the conversion logic when the user clicks the button.

document.getElementById("value") retrieves the value entered into the input field. Even though the input type is set to number, the value is returned as a string.

Number(valueInput.value) is used to convert the input value from a string into a number so mathematical calculations can be performed correctly.

The result is displayed by updating the paragraph element with id="result" using result.textContent, allowing the converted value to appear immediately on the page.

One improvement implemented in this project is input validation. If the user leaves the value blank or does not select a conversion type, an error message is displayed instead of performing the calculation.

## Files Included
index.html – HTML structure for the converter interface  
style.css – CSS file used to style the page  
script.js – JavaScript file containing conversion logic  
screenshots/ – Folder containing screenshots of the rendered web page  

## How to Run
This program runs in a web browser.

Open index.html in any modern web browser  
Enter a value, select a conversion type, and click Convert  
The result will display on the page  

## Expected Output
The page displays a Metric to Imperial converter with:

An input field for numeric values  
A dropdown menu to select conversion type  
A Convert button  
A result area showing converted values with units (example: 10 km = 6.21 miles)  

At least four conversion types are supported, and results appear immediately after clicking Convert.