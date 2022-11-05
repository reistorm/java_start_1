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

