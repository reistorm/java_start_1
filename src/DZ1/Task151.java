package DZ1;

public class Task151 {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c !=' '){
                sb = new StringBuilder();
                do{
                    sb.append(s.charAt(i));
                    i++;
                }
                while(i < s.length() && s.charAt(i) !=' ') {
                    stack.push(sb.toString());
                }
            }
            i++;
        }

        sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if(!stack.isEmpty()){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}


// решение преподавателя
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') { //ищем последний символ слова
                end -= 1;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') { // ищем первый символ слова
                start -= 1;
            }
            sb.append(" "); // добавляю пробел
            sb.append(s.substring(start + 1, end + 1)); // добавляем слово в строку, которое я нашла
            end = start - 1; // убавляем слово с концом
        }
        if (sb.length() > 0) { // если строка пустая, то удалим лишний пробел
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
