import java.util.*;


public class Homework13 {

    public static void main(String [] args) {

        int max, count = 1;
        Scanner keyboard = new Scanner(System.in);
        Vector<Integer> inputArray = new Vector<Integer>();

        System.out.print("Enter numbers:  ");
        inputArray.addElement(keyboard.nextInt());


        max = inputArray.firstElement();


        while (inputArray.lastElement() != 0) {

            inputArray.addElement(keyboard.nextInt());

            if (inputArray.lastElement() > max) {
                max = inputArray.lastElement();
                count = 1;
            } else if (inputArray.lastElement() == max)
                count++;
        }

        System.out.println("The largest number is:  " + max);
        System.out.println("The occurence count of the largest number is:  " + count);

    }

}