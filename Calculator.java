package org.example;
import static org.junit.jupiter.api.Assertions.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {

public char determineLetterGrade(int numberGrade){
    if(numberGrade < 0) {
    throw new IllegalArgumentException("NumberGrade cannot be negative");

    }  else if(numberGrade < 50){
        return 'B';

    } else if(numberGrade < 70){
        return 'C';

    } else if(numberGrade < 80){
        return 'D';
    } else if(numberGrade < 90){
        return 'E';
    } else {
        return 'A';
    }

}



    public static void main(String[] args) {

    }
}