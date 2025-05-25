import java.util.Scanner;

public class Ex4{
    public static void main(String[] agrs){
        int marks[] = new int[5];
        Scanner in = new Scanner(System.in);
        int total =0;
        for (int i=0;i<5;i++){
        System.out.println("Enter marks");
        marks[i]= in.nextInt();
        total = total + marks[i];

    }

    double average = total / 5;
    System.out.println("The Average = " + average);

}
}