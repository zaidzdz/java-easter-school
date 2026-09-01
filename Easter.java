// Zaid Zamani
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    private int[] algorithimValues;
    private int algorithimValuesIndex = 0;
    
    public void addAlgorithimValue(int value){
        this.algorithimValues[this.algorithimValuesIndex] = value;
        ++this.algorithimValuesIndex;
    }
    public double getPreviousAlgorithimValue(){
        if (this.algorithimValuesIndex <= 0){
            return 0;
        }
        return this.algorithimValuesIndex-1; 
    }
    public double getAlgorthimValueByLetter(char letter) (
    )
    {
        return 97-(letter); //97 is asci a

    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
        
        addAlgorithimValue(scanner.nextInt());
        addAlgorithimValue(getPreviousAlgorithimValue() % 19);
        addAlgorithimValue(getPreviousAlgorithimValue() );
        


    }
}


