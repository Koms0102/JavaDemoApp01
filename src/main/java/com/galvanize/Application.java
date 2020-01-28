package com.galvanize;

public class Application {
    public static void main(String[] args) {

        System.out.println("hello World");
    }

    boolean isActive(String status) {
        // Implement your solution
        boolean returnVal = false;
        if (status.equals("active")) {
            returnVal = true;
        } else {
            returnVal = false;
        }

        return returnVal;
    }

    String grade(int input) {
        // Implement your solution

        String gradeVal = " ";

        if(input >= 90){
            gradeVal="A";
        }

        else
            if(input>=80){
            gradeVal="B";
        }
        else
            if(input>=70){
            gradeVal="C";
        }

        else
            if(input>=60){
                gradeVal="D";

        }

        else gradeVal = "F";

        return gradeVal;
    }


    public static void main(String[] args) {
        int i=45;
        while(i<=50){
            System.out.println(i);
            i++;
        }
    }

}
