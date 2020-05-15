package Problems;

public class Problem0067 {
    public static String addBinary(String a, String b) {
        return version1(a, b);

    }

    public static String version1(String a, String b) {
        while (a.length()>b.length()){
            b = '0'+b;
        }
        while (a.length()<b.length()){
            a = '0'+a;
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = a.length(); i >= 0 ; i--) {
            if (a.charAt(i) == '0' && b.charAt(i) == '0'){
                if (carry == 0) sb.append('0');
                if (carry == 1) sb.append('1');
                carry = 0;
            }else if (a.charAt(i) != b.charAt(i)){
                if (carry == 0) sb.append('1');
                if (carry == 1) {
                    sb.append('0');
                    carry = 1;
                }
            }else if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if (carry == 0) sb.append('0');
                if (carry == 1) sb.append('1');
                carry = 1;
            }
        }
        return carry==1? sb.append('1').reverse().toString() : sb.reverse().toString();
    }
}
