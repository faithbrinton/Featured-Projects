// Program: Hotel Room Status System
// Programmer: Faith Cameron
// LMD: 2026-02-06

#include <stdio.h>

int main()
{

  int f, r;
  int enteredFloor, enteredRoom;

    // User input
    printf("Please enter the floor you prefer (1-10): ");
    scanf("%d", &enteredFloor);

    printf("Please enter the room you prefer (1-7): ");
    scanf("%d", &enteredRoom);

  // Loop through floors
  for (f = 1; f <= 10; f++)
  {

    printf("=============================\n\tFLOOR NUMBER: %d\n=============================\n", f);

    // Loop through rooms
    for (r = 1; r <= 7; r++)
    {

      // Booked floor and room (user input)
      if (f == enteredFloor && r == enteredRoom)
      {
        printf("Room number: %d Status: Booked\n", r);
        continue;
      }

      // All other rooms vacant
      printf("Room number: %d Status: Vacant\n", r);
    }
  }

  return 0;
}
