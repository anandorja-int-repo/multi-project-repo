package PatternProgram;

public class PatternBasicProgram {

    public String starRightTriangle(int num) {
        String result = "";
        String temp;
        for (int i = 0; i < num; i++) {
            temp = "";
            for (int j = 0; j <= i; j++) {
                String s;
                s = "* ";
                temp += s;
            }
            temp = temp.trim();
            result += temp + "\n";
        }
        return result;
    }

    public String leftTrianglePattern(int num) {
//        String result = "";
//        for (int i = 0; i < num; i++) {
//            for (int j = 2 * (num - i); j >= 0; j--) {
//                String s;
//                s = " ";
//                result += s;
//            }
//            for (int j = 0; j <= i; j++) {
//                String s;
//                s = "* ";
//                result += s;
//            }
//            result += "\n";
//        }
//        return result;

        String result = "";
        String temp  ;
      //  int num = 5;
        for (int i = 0; i<num;i++){
            temp = "";
            for(int j=(num-(i+1));j>0;j--){
                String s;
                s = "  ";
                temp +=s;
            }
            for (int j=0;j<=i;j++){
                String s;
                s ="* ";
                temp +=s;
            }
            temp=temp.replaceAll("\\s+$","");
            result += temp + "\n";
        }
        return result;
    }

    public String numberPramid(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                String s;
                s = " ";
                result += s;
            }
            for (int k = 1; k <= i; k++) {
                String s;
                s = " ";
                result += k + s;

            }
            result += "\n";
        }
        return result;
    }

    public String reversepramid(int num) {
        String result = "";
        for (int i = num; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                String s;
                s = "*";
                result += s;
            }
            result += "\n";
        }
        return result;
    }

    public String upperStarTriangle(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num - i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int k = 0; k <= i; k++) {
                String s;
                s = "*";
                result += s;
            }
            result += "\n";
        }
        return result;
    }

    public String mirrorTriangle(int num) {
        String result = "";
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = i; j <= num - 1; j++) {
                String s;
                s = "*" + " ";
                result += s;
            }
            result += "\n";
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = i; j <= num; j++) {
                String s;
                s = "*" + " ";
                result += s;
            }
            result += "\n";
        }

        return result;

    }

    public String downwardStarpattern(int num) {
        String result = "";
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                String s;
                s = "*" + " ";
                result += s;
            }
            result += "\n";
        }
        return result;
    }

    public String MirrorLowerStarPattern(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = i; j <= num; j++) {
                String s;
                s = "*" + " ";
                result += s;
            }
            result += "\n";
        }
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = i; j <= num - 1; j++) {
                String s;
                s = "*" + " ";
                result += s;
            }
            result += "\n";
        }
        return result;


    }

    public String printDiamondShape(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                String s;
                s = "*";
                result += s;
            }
            result += "\n";
        }


        for (int i = num - 1; i > 0; i--) {
            for (int j = 1; j <= num - i; j++) {
                String s;
                s = " ";
                result += s;
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                String s;
                s = "*";
                result += s;
            }
            result += "\n";
        }
        return result;
    }

    public String PrintSquareStarPattern(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= 2 && j >= 2 && i <= 4 && j <= 4) {
                    String s;
                    s = " ";
                    result += s;
                } else {
                    String s;
                    s = "*";
                    result += s;
                }
            }
            result += "\n";
        }
        return result;
    }
}






