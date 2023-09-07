package com.bootcode.project.utilss;

import java.util.Random;

public class optGenerator {

    public int getOTP(){
        Random random = new Random();
        int minValue = 111111;
        int maxValue = 999999;

        return minValue + random.nextInt(maxValue - minValue);
    }
    public int getOTP4(){
        Random random = new Random();
        int minValue = 1111;
        int maxValue = 9999;

        return minValue + random.nextInt(maxValue - minValue);
    }


    public static void main(String[] args) {
        optGenerator otpGenerator = new optGenerator();
        for(int i = 0; i< 100; i++){
            int otp = otpGenerator.getOTP4();
            System.out.println("OTP = " + otp);
        }







    }
}
