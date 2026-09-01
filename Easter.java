// Zaid Zamani
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    private double[] algorithimValues = new double[30]; 
    private int algorithimValuesIndex = 0;
    
    public void addAlgorithimValue(double value){
        this.algorithimValues[this.algorithimValuesIndex] = value;
        ++this.algorithimValuesIndex;
    }
    public double getPreviousAlgorithimValue(){
        if (this.algorithimValuesIndex <= 0){
            return 0;
        }
        return this.algorithimValuesIndex-1; 
    }
    public double getAlgorthimValueByLetter(char letter)
    {
        int index = 97-(letter);
        return this.algorithimValues[index]; //97 is asci 'c'

    }

}


