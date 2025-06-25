import java.util.Scanner;

public class Userarray2 {
    public static void main (String args[]) {
        Scanner scan= new Scanner(System.in);

        int x[][] = new int[3][]; 

        
        x[0] = new int[2];
        x[1] = new int[3];
        x[2] = new int[5];

        //  user input
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter " + x[i].length + " values for row " + i + ":");
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = scan.nextInt();
            }
        }

        // Print array
        System.out.println("The array is:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
		