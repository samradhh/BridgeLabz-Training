public class TimeZoneDisplay {
    public static void main(String[] args) {
        System.out.println("Current Time Zone: " + java.util.TimeZone.getDefault().getID());

java.time.ZonedDateTime gmtTime = java.time.ZonedDateTime.now(java.time.ZoneId.of("GMT"));
java.time.ZonedDateTime istTime = java.time.ZonedDateTime.now(java.time.ZoneId.of("Asia/Kolkata"));
java.time.ZonedDateTime pstTime = java.time.ZonedDateTime.now(java.time.ZoneId.of("America/Los_Angeles"));

System.out.println("GMT: " + gmtTime);
System.out.println("IST: " + istTime);
System.out.println("PST: " + pstTime);
}
}