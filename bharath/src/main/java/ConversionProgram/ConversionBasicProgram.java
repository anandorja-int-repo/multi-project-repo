package ConversionProgram;

import java.lang.Math;

public class ConversionBasicProgram {


    public int binaryToOctual(long binaryNumber) {

        int decimalnumber = 0, i = 0, octualnumber = 0;

        // binary to decimal
        while (binaryNumber != 0) {
            int rem = (int) binaryNumber % 10;
            decimalnumber = decimalnumber + rem * (int) Math.pow(2, i);
            i = i + 1;
            binaryNumber = binaryNumber / 10;
        }

        i = 1;
        while (decimalnumber != 0) {
            int rem = decimalnumber % 8;
            octualnumber = octualnumber + rem * i;
            i = i * 10;
            decimalnumber = decimalnumber / 8;
        }

        return octualnumber;
    }

    public int octualToDecimal(int num) {
        int result = 0;
        int copyofnum = num;

        for (int i = 0; copyofnum > 0; i++) {
            int rem = copyofnum % 10;
            double p = Math.pow(8, i);
            result += (rem * p);
            copyofnum = copyofnum / 10;
        }
        return result;
    }

    public int decimalToOctual(int num) {
        int octualnumber = 0;
        int cuntval = 1;
        while (num != 0) {
            int rem = num % 8;
            octualnumber = octualnumber + rem * cuntval;
            cuntval = cuntval * 10;
            num = num / 8;
        }
        return octualnumber;
    }

    public int hexadecimalToDecimal(String val) {

        int length = val.length();
        int base = 1;
        int decimalValue = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (val.charAt(i) >= '0' && val.charAt(i) <= '9') {
                decimalValue = decimalValue + (val.charAt(i) - 48) * base;
                base = base * 16;
            } else if (val.charAt(i) >= 'A' && val.charAt(i) <= 'F') {
                decimalValue = decimalValue + (val.charAt(i) - 55) * base;
                base = base * 16;
            }
        }
        return decimalValue;
    }

    public String decimalToHexadecimal(int decimalnum) {
        int remainder;
        char[] heaxadecival = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        String hexavalue = "";

        while (decimalnum > 0) {
            remainder = decimalnum % 16;
            hexavalue = heaxadecival[remainder] + hexavalue;
            decimalnum = decimalnum / 16;
        }
        return hexavalue;
    }

    public int decimalToBinary(int num) {

        int count = 0;
        int binarynumber = 0;
        while (num > 0) {
            int remainder = num % 2;
            double temp = Math.pow(10, count);

            binarynumber = (int) (binarynumber + remainder * temp);
            num = num / 2;
            count++;
        }
        return binarynumber;
    }

    public int binaryToDecimal(long binarynumber) {
        int decimalnumber = 0, i = 0;

        while (binarynumber > 0) {
            int rem = (int) binarynumber % 10;
            decimalnumber = decimalnumber + rem * (int) Math.pow(2, i);
            i++;
            binarynumber = binarynumber / 10;
        }
        return decimalnumber;
    }

    public double StringToDouble(String val) {

        double temp = Double.parseDouble(val);
        return temp;
    }

    public String doubleToString(double val) {
        String temp = String.valueOf(val);
        return temp;
    }

    public long stringToLong(String val) {
        long temp = Long.parseLong(val);
        return temp;

    }

    public String longToString(long val) {

        String temp = val + "";
        temp.getClass().getName();
        return temp;
    }


}
