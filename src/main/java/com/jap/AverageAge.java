package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData){
        int[] resultantArray = new int[ageRawData.length];
        String output = "";
        try{
            for(int i = 0 ; i < ageRawData.length ;i++){
                resultantArray[i] = Integer.parseInt(ageRawData[i]);

            }
            double sum = 0;
            for (int i = 0; i < resultantArray.length; i++) {
                sum = sum + resultantArray[i];
            }
            output = Double.toString(sum / resultantArray.length);



        }catch(NumberFormatException e){
            output = e.toString();
        }
        return output;
    }

    public static void main(String[] args) {
        AverageAge obj = new AverageAge();
        AverageAge obj2 = new AverageAge();
        String[] age = {"35", "26", "32", "44"};
        String[] age2 = {"35","26","thirty-two","44"};
        String output = obj.averageAgeCalculator(age);
        System.out.println("output = " + output);
        String output2 = obj.averageAgeCalculator(age2);
        System.out.println("output2 = " + output2);
    }
}