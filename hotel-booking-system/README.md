# Assignment 05 - Hotel Room Status Program (PROG 2007/1443)

---

## Description

This program simulates a hotel with 10 floors and 7 rooms per floor using nested `for` loops.

The user is prompted to enter their preferred floor and room at the start of the program.  
All rooms are initially set to **vacant**, and the room selected by the user is marked as **booked** using the `continue` statement.

---

## How the Program Works

1. The program asks the user to enter:
   - A floor number (1–10)
   - A room number (1–7)

2. Two nested `for` loops are used:
   - The outer loop controls floors.
   - The inner loop controls rooms.

3. Inside the inner loop, an `if` statement checks whether the current room matches the user’s selected floor and room.

4. If it matches:
   - The room is printed as **booked**.
   - The `continue` statement skips printing **vacant**.

5. All other rooms are printed as **vacant**.

6. The program displays every floor and room along with their status.

---

## How to Compile and Run

Compile:
gcc main.c -o main

Run:
./main

---

## Expected Output

Please enter the floor you prefer (1-10): 3  
Please enter the room you prefer (1-7): 4  

You selected Floor 3, Room 4  

-----------------------------------
            FLOOR NUMBER: 1  
-----------------------------------
Room number: 1 Status: Vacant  
Room number: 2 Status: Vacant  
...  

-----------------------------------
            FLOOR NUMBER: 3  
-----------------------------------
Room number: 4 Status: Booked  
Room number: 5 Status: Vacant

...  

-----------------------------------
            FLOOR NUMBER: 10 
-----------------------------------
Room number: 7 Status: Vacant  

---

## Notes

- The booked room is determined by user input.
- All other rooms remain vacant.
- The program uses nested loops to simulate hotel floors and rooms.

---