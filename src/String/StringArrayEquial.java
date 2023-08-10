package String;

public class StringArrayEquial {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 ="";
        String str2 ="";

        for(int i =0; i < word1.length;i++){
            str1 += word1[i];
        }

        for(int i =0; i<word2.length;i++){
            str2 += word2[i];
        }

        //string matching
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
