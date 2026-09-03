public class Easter{
    private int[] algorithimValues = new int[30]; 
    private char[] algorithimLetters = new char[300];
    private int algorithimValuesIndex = 0;
    
    public void addAlgorithimValue(char letter, int value){
        this.algorithimValues[this.algorithimValuesIndex] = value;
        this.algorithimLetters[this.algorithimValuesIndex] = letter;
        if(this.algorithimValuesIndex != algorithimValues.length-1) { //prevent overflow
            ++this.algorithimValuesIndex; 
        }
    }
    public int getPreviousAlgorithimValue(){
        if (this.algorithimValuesIndex <= 0){
            return 0;
        }
        return this.algorithimValuesIndex-1; 
    }
    public int byLetter(char letter)
    {
        //linear search is fine because of small amount of values
        for(int i = 0; i<algorithimLetters.length;i++){
            //this assumes theres only one value for each letter
            if(algorithimLetters[i] == letter){
                return algorithimValues[i];
            }
        }
        return '\u0000'; //null char 

    }
    public void printAll(){
        for(int i = 0;i<algorithimLetters)
    }

}


