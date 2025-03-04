public class Scan10 {
    public static void main(String[] args) {
        boolean passedDoor = true;
        boolean missedDoor = false;
        int doorCounter = 0;
        boolean passedDoors = false;

        if (passedDoor) {
            System.out.println("You have passed the first door!");
            doorCounter = doorCounter + 1;
        }
        if (passedDoor) {
            System.out.println("You have passed the second door!");
            doorCounter = doorCounter + 1;
        }
        if (passedDoor) {
            System.out.println("You have passed the third door");
            doorCounter = doorCounter + 1;

        }
        if (doorCounter == 3) {
            passedDoors = true;

        }  if (passedDoors) {
            System.out.println("Congratulation you won the program! ");

        }
        }
    }

