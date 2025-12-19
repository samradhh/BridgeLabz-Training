public class VolumeEarth {
    public static void main(String[] args) {
        int radius = 6378; // in kilometers
        System.out.printf("the volume earth in cubic kilometers is %.2f and cumbic meters is %.2f",(double)(4/3)*Math.PI*Math.pow(radius, 3),(double)(4/3)*Math.PI*Math.pow(radius*1000, 3));
    }
}