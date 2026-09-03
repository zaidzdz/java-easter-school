import java.util.Scanner;
// Zaid Zamani
// This program will calculate the date easter falls on given a year after 1583.
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int y = scanner.nextInt();
            Easter easter = new Easter(y);
            easter.addAlgorithimValue('a', y % 19);
            easter.addAlgorithimValue('b', (y / 100));
            easter.addAlgorithimValue('c', y % 100);
            easter.addAlgorithimValue('d', easter.byLetter('b') / 4);
            easter.addAlgorithimValue('e', easter.byLetter('b') % 4);
            easter.addAlgorithimValue('f', (easter.byLetter('b') + 8) / 25);
            easter.addAlgorithimValue('g', (easter.byLetter('b') - easter.byLetter('f') + 1) / 3);
            easter.addAlgorithimValue('h', (19 * easter.byLetter('a')
                    + easter.byLetter('b')
                    - easter.byLetter('d')
                    - easter.byLetter('g') + 15) % 30);
            easter.addAlgorithimValue('i', easter.byLetter('c') / 4); // i
            easter.addAlgorithimValue('k', (easter.byLetter('c') % 4)); // k
            easter.addAlgorithimValue('r', (32 + 2 * easter.byLetter('e') 
            + 2 * easter.byLetter('i') 
            - easter.byLetter('h') 
            - easter.byLetter('k')) % 7
            );
            easter.addAlgorithimValue('m', (easter.byLetter('a') + 11 * easter.byLetter('h') + 22 * easter.byLetter('r')) / 451);
            int nWithoutDiv = (easter.byLetter('h')+easter.byLetter('r') - 7 * easter.byLetter('m') + 114);
            easter.addAlgorithimValue('n',  nWithoutDiv / 31);
            easter.addAlgorithimValue('p',  nWithoutDiv % 31);

            easter.printAll();
        }   
        
    }
}
