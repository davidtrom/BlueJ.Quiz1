import java.lang.StringBuilder;
import java.lang.String;
import java.lang.*;

//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang3.StringUtils;

public class StringUtilities {
    
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        baseValue += valueToBeAdded;
        return baseValue;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        //StringBuffer myString = new StringBuffer(valueToBeReversed);
        //String reversedVal = myString.reverse();
        StringBuilder myString = new StringBuilder(valueToBeReversed) ;
        //System.out.println(myString);
        //String nameRev = valueToBeReversed.reverse();
        return myString.reverse().toString();
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int wordLength = word.length();
        //System
        int mid=wordLength / 2;
        char m = word.charAt(mid);
        return m;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        //StringBuilder myString = new StringBuilder(value);
        String myString= value.replace(charToRemove.toString(),"");
        //myString.deleteCharAt(charToRemove);
        //myString.toString(); 
        return myString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        StringBuilder myString = new StringBuilder(sentence) ;
        String lastWord = myString.substring(myString.lastIndexOf(" ")+1,myString.length());
       
        lastWord.toString();
        
        return lastWord;
       
    }
}
