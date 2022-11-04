class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        int carry = 0;
        int j = b.length() - 1;
        String res = "";
        for (int i = a.length()-1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry += 1;
            }
            res = carry % 2 + res;
            carry /= 2;
            j--;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;
    }
}
