public class AddTwoBinaryNo {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println("Sum of two binary number: "+addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            String c = "";
            String d = "";
            if (i >= 0) {
                c = String.valueOf(a.charAt(i));
            } else {
                c = "0";
            }
            if (j >= 0) {
                d = String.valueOf(b.charAt(j));
            } else {
                d = "0";
            }

            if ((c.equals("0") && d.equals("1")) ||(c.equals("1") && d.equals("0"))) {
                if (carry == 1) {
                    carry = 1;
                    sb.append("0");
                } else {
                    carry = 0;
                    sb.append("1");
                }
            }
            else if ((c.equals("1") && d.equals("1"))) {
                if (carry == 1) {
                    carry = 1;
                    sb.append("1");
                } else {
                    carry = 1;
                    sb.append("0");
                }
            }

            else {
                if (carry == 1) {
                    carry = 0;
                    sb.append("1");
                } else {
                    carry = 0;
                    sb.append("0");
                }
            }

            i--;
            j--;
        }
        if (carry == 1) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}