/*
Program: Assignment 05: Metric to Imperial Converter
Programmer: Faith Cameron
LMD: 2026-02-04
*/

//  Input field | id = "value"
const valueInput = document.getElementById("value");

//  Dropdown options where the user selects a conversion type | id ="type"
const typeSelect = document.getElementById("type");

// Convert button | id = "convert"
const convertBtn = document.getElementById("convert");

// Result paragraph / output | id = "result"
const result = document.getElementById("result");

// Event listener (alternative to "om click" to avoid using inline html)
convertBtn.addEventListener("click", function () {
    
  // Converts input from String number to actual number
  const value = Number(valueInput.value);

  // Stores selected option from dropdown menu in the variable "type"
  const type = typeSelect.value;

  // Validation 1: ensuring user entered a value. If the input is empty show a message and stop the function
  if (valueInput.value === "") {
    result.textContent = "Enter a value first.";
    return;
  }

  // Validation 2: Ensure user choses a conversion type. If they dont, show a message and stop function
  if (type === "") {
    result.textContent = "Select a conversion type.";
    return; // stops the click function here
  }

  // "answer" stores converted number result.  "inputUnit" / "outputUnit" stores the unit labels for final result display
  let answer = 0;
  let inputUnit = "";
  let outputUnit = "";

  // Determine which conversion to run based on the dropdown "type" value. Each one calculates the conversion and sets the correct unit labels

  // Celsius > Fahrenheit
  if (type === "cToF") {
    answer = (value * 9) / 5 + 32;
    inputUnit = "°C";
    outputUnit = "°F";

    // Kilometers > Miles
  } else if (type === "kmToMi") {
    answer = value * 0.621371;
    inputUnit = "km";
    outputUnit = "miles";

    // Kilograms > Pounds
  } else if (type === "kgToLb") {
    answer = value * 2.20462;
    inputUnit = "kg";
    outputUnit = "lb";

    // Centimeters > Inches
  } else if (type === "cmToIn") {
    answer = value * 0.393701;
    inputUnit = "cm";
    outputUnit = "in";
  }

  // Display the final result. "toFixed(2)" rounds the answer to 2 decimal places for cleaner output. "result.textContent" updates the p id = "result" element text
  result.textContent =
    value + " " + inputUnit + " = " + answer.toFixed(2) + " " + outputUnit;
});
