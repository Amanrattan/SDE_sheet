package String;

public class LowerCase {
    public String toLowerCase(String s) {
        String ans ="";

        ans += s.toLowerCase();

        return ans;

        // StringBuilder res = new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)>=65 && s.charAt(i)<=90)
        //     {
        //         res.append((char)(s.charAt(i)+32));
        //     }
        //     else
        //     {
        //         res.append(s.charAt(i));
        //     }
        // }
        // return res.toString();
    }
}
