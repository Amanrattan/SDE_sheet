package String;

public class HalvesString {
    public boolean halvesAreAlike(String s) {
        int s1=0,s2=0;
        int mid = s.length()/2;
        for(int i =0;i <mid;i++){
            char a = Character.toLowerCase(s.charAt(i));
            if( a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                s1 = s1 + 1;
            }
            // char a = Character.toLowerCase(s.charAt(i));
            //     if(a == 'a' || a=='e' || a =='i'|| a=='o'|| a=='u') s1++;
        }

        for(int j = s.length()-1 ;j >=  mid;j--){
            char b = Character.toLowerCase(s.charAt(j));

            if( b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'){
                s2 = s2 + 1;
            }
        }
        if(s1 == s2){
            return true;
        }
        return false;
    }
}
