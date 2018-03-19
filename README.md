# ListCalculator
The script is to generate a list of random numbers between -25 and 25, based on any chosen list length, then calculates and displays the average of the given list's odd number elements.

CODED in IntelliJ.

HISTORY: this is a modified version of FunExercises' Exercise1 activity (https://github.com/sskreber/FunExercises), adapted to the IntelliJ platform from Android Studio.

FIXED ISSUES compared to its draft version: (1) changed the variable of the average into a double (from int) for more precise calculation; (2) added another increase to a while loop’s event calculator (itemNumber) so that it’ll increase even if the number is not off, to help the loop move onto the next number; (3) fixed modulo operation: for negative numbers, it should be „x % 2 == -1” (not „x % 2 == 1”). (4) removed a printing command from a while loop and placed it outside of it (the result  should be printed only once).
