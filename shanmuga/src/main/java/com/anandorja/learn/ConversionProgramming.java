package com.anandorja.learn;

public class ConversionProgramming {

    public int binaryToDecimal(int binary) {
        int decimal = 0;
        int i = 0;
        while (binary > 0) {
            int rem = binary % 10;
            decimal = decimal + rem * (int) (Math.pow(2, i++));
            binary = binary / 10;
        }
        return decimal;
    }

    public int binaryToOctal(int binary) {
        int decimal = 0, octal = 0, i = 0;
        while (binary != 0) {
            int remainder = binary % 2;
            decimal = decimal + remainder * (int) (Math.pow(2, i++));
            binary = binary / 10;
        }
        i = 1;
        while (decimal > 0) {
            int remainder = decimal % 10;
            octal = octal + remainder * i;
            i = i * 10;
            decimal = decimal / 8;
        }
        return octal;
    }

    public String decimalToOctal(int decimal) {
        int rem;
        String octal = "";
        char octalChars[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

        while (decimal > 0) {
            rem = decimal % 8;
            octal = octalChars[rem] + octal;
            decimal = decimal / 8;
        }
        return octal;
    }
    public int decimalToHexa(int decimal) {
        int temp;
        int rem;
        int i, j = 0;
        char hexa[] = new char[100];
        temp = decimal;
        while (temp < 10) {
            rem = decimal % 16;
            if (rem < 10) {
                hexa[j++] = (char) (48 + rem);
            } else {
                hexa[j++] = (char) (55 + rem);
            }
            temp = temp / 16;
        }

        for(i=j-1;i>=0;i--){
            return hexa[i];
        }
        return hexa[i];
    }
    public String booleanToString(boolean bool){

        bool = false;
        String str = Boolean.toString(bool);
        return str;
    }
    public Double stringToDouble(String str){
        Double str1 = new Double(str);
        return str1;
    }
    public String doubleToString(double doub){
        String doub1 = Double.toString(doub);
        return doub1;
    }
    public Long stringToLong(String str){
        long number = new Long(str);
        return number;
    }
    public String longToString(long number){
        String str = Long.toString(number);
        return str;
    }
    public char intToChar(int num){
        char c;
        c = (char)(num);
        return c;
    }
    public int charToInt(char a){
        int num;
        num = a - '0';
        return num;
    }
}

