package DZ1;

public class Task125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        int i=0, j=s.length()-1;
        while(i<j){
            char ci =s.charAt(i);
            char cj = s.charAt(j);

            if(!Character.isLetterOrDigit(ci)) i++;
            else if(!Character.isLetterOrDigit(cj)) j--;
            else{
                if(Character.toLowerCase(ci)!=Character.toLowerCase(cj))
                    return false;

                i++; j--;
            }
        }
        return true;
    }
}
}
