
public class Exc16 {
    public static void main(String[] args) {
        String[] names = {
            "Ayush", "Komal", "Shilpa", "Vivek", "Chhavi", "Krian" ,
            
        };
        int[] rollNumbers = {101,102,103,104,105,106};
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Please ensure you are accessing valid indices within the array.");
        }
        System.out.println("All student details displayed successfully! Learning to handle exceptions makes your code robust.");
        System.out.println("All Done");
    }
}