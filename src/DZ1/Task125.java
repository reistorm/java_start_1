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

// решение преподавателя
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) { // !Character.isLetterOrDigit значит пока символ не буква или цифра. Будем двигать 
                // левый указатель вправо пока не выполнится условие 
                left += 1;
            }
            while ( left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                rigth -= 1;
            }
            char leftChar = Character.toLowerCase(s.charAt(left)); // перевод символа в нижний регистр
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
