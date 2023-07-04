package com.sefaerkan.javatemelleri;

public class Statements {
    public static void main(String[] args) {
        int x = 5;
        //System.out.println(x);
        x = x +1;
        //System.out.println(x);
        x++;
        //.out.println(x);
        x--;
        //System.out.println(x);
        x = x * 5;

        int y = 4;
        //System.out.println(x>y);
        //System.out.println(x<y);

        y = 30;
        //System.out.println(x > y);
        //System.out.println(x>=y);
        //System.out.println(x==y);

        // and &&
        // or ||

        x = 5;
        y = 4;
        int z = 5;
        //System.out.println(x<y && z<y);
        //System.out.println(x<y || z<y);

        //If statements = eğer durumu

        if (x < y) {
            //System.out.println("y is bigger");
        } else if(x > y) {
            //System.out.println("x is bigger");
        } else {
            //System.out.println("x = y");
        }

        //Switch
        int day = 3;
        String dayString = "";

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case  2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
        }
        //System.out.println(dayString);
    }
}
