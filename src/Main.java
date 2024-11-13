import Abiturient.Abiturient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient[] abiturients = new Abiturient[10];

        abiturients[0] = new Abiturient(1, "John", "Doe", "A.", "123 Main St", "123-456-7890", 85.5);
        abiturients[1] = new Abiturient(2, "Jane", "Smith", "B.", "456 Elm St", "234-567-8901", 92.3);
        abiturients[2] = new Abiturient(3, "Alice", "Johnson", "C.", "789 Oak St", "345-678-9012", 76.8);
        abiturients[3] = new Abiturient(4, "Bob", "Brown", "D.", "321 Maple St", "456-789-0123", 88.4);
        abiturients[4] = new Abiturient(5, "Charlie", "Davis", "E.", "654 Pine St", "567-890-1234", 91.1);
        abiturients[5] = new Abiturient(6, "Emily", "Wilson", "F.", "987 Cedar St", "678-901-2345", 78.6);
        abiturients[6] = new Abiturient(7, "Frank", "Miller", "G.", "159 Spruce St", "789-012-3456", 84.9);
        abiturients[7] = new Abiturient(8, "Grace", "Taylor", "H.", "753 Birch St", "890-123-4567", 93.0);
        abiturients[8] = new Abiturient(9, "Henry", "Anderson", "I.", "852 Fir St", "901-234-5678", 89.7);
        abiturients[9] = new Abiturient(10, "Ivy", "Thomas", "J.", "456 Willow St", "012-345-6789", 90.2);

        System.out.print("Enter name: ");
        String name = scan.nextLine();
        for (Abiturient abit : abiturients) {
            if (abit.getFirstname().equals(name))
                System.out.println("ID: " + abit.getId() +
                        ", Name: " + abit.getFirstname() + " " + abit.getLastname() +
                        ", Address: " + abit.getAdress() +
                        ", Phone: " + abit.getPhone() +
                        ", Score: " + abit.getScore());
        }

        System.out.print("Enter score: ");
        int score = scan.nextInt();
        for (Abiturient abit : abiturients) {
            if (abit.getScore() > score)
                System.out.println("ID: " + abit.getId() +
                        ", Name: " + abit.getFirstname() + " " + abit.getLastname() +
                        ", Address: " + abit.getAdress() +
                        ", Phone: " + abit.getPhone() +
                        ", Score: " + abit.getScore());
        }

        System.out.print("Enter n: ");
        Arrays.sort(abiturients, new Comparator<Abiturient>() {
                    @Override
                    public int compare(Abiturient p1, Abiturient p2) {
                        return -Double.compare(p1.getScore(), p2.getScore());
                    }
                });
        int n = Math.min(scan.nextInt(), abiturients.length);
        for (int i = 0; i < n; i++) {
            Abiturient abit = abiturients[i];
            System.out.println("ID: " + abit.getId() +
                    ", Name: " + abit.getFirstname() + " " + abit.getLastname() +
                    ", Address: " + abit.getAdress() +
                    ", Phone: " + abit.getPhone() +
                    ", Score: " + abit.getScore());
        }







    }
}