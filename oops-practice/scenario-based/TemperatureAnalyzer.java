import java.util.*;
class TemperatureAnalyzer{
    static void analyzeTemperature(float[][] temperature) {
        float maxTemp = Float.MIN_VALUE;
        float minTemp = Float.MAX_VALUE;
        int hotDay = 0, coldDay = 0;
        
        for(int i = 0; i < 7; i++) {
            float daySum = 0;
            for(int j = 0; j < 24; j++) {
                daySum += temperature[i][j];
                if(temperature[i][j] > maxTemp) {
                    maxTemp = temperature[i][j];
                    hotDay = i;
                }
                if(temperature[i][j] < minTemp) {
                    minTemp = temperature[i][j];
                    coldDay = i;
                }
            }
            float avgTemp = daySum / 24;
            System.out.println("Day " + (i+1) + " - Average: " + avgTemp + "°C");
        }
        
        System.out.println("Hottest Day: Day " + (hotDay+1) + " (" + maxTemp + "°C)");
        System.out.println("Coldest Day: Day " + (coldDay+1) + " (" + minTemp + "°C)");
    }
    public static void main(String []args){
        Random r=new Random(60);
        float [][]temperature=new float[7][24];
        for(int i=0;i<7;i++){
            for(int j=0;j<24;j++){
                temperature[i][j]=r.nextFloat()*40;
            }
        }
        analyzeTemperature(temperature);
    }
}