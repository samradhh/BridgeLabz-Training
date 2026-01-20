import java.util.ArrayList;
import java.util.List;

public class CinemaTime {

    private List<String> titles;
    private List<String> showtimes;

    public static class InvalidTimeFormatException extends Exception {
        public InvalidTimeFormatException(String message) {
            super(message);
        }
    }

    public CinemaTime() {
        this.titles = new ArrayList<>();
        this.showtimes = new ArrayList<>();
    }

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time + ". Expected HH:mm (24-hour).");
        }

        titles.add(title);
        showtimes.add(time);
    }

    public List<Integer> searchMovie(String keyword) {
        List<Integer> matches = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++) {
            String t = titles.get(i);
            if (t != null && t.contains(keyword)) {
                matches.add(i);
            }
        }
        return matches;
    }

    public void displayAllMovies() {
        if (titles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }

        for (int i = 0; i < titles.size(); i++) {
            String line = String.format("%d. %s - %s", i + 1, titles.get(i), showtimes.get(i));
            System.out.println(line);
        }
    }

    public String generatePrintableReport() {
        StringBuilder sb = new StringBuilder();
        String[] titlesArray = titles.toArray(new String[0]);
        String[] timesArray = showtimes.toArray(new String[0]);

        int n = Math.min(titlesArray.length, timesArray.length);

        for (int i = 0; i < n; i++) {
            sb.append(i + 1)
              .append(". ")
              .append(titlesArray[i])
              .append(" - ")
              .append(timesArray[i])
              .append(System.lineSeparator());
        }

        return sb.toString();
    }

    private boolean isValidTime(String time) {
        if (time == null) return false;
        if (time.length() != 5 || time.charAt(2) != ':') {
            return false;
        }
        String h = time.substring(0, 2);
        String m = time.substring(3, 5);
        try {
            int hour = Integer.parseInt(h);
            int minute = Integer.parseInt(m);
            return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        CinemaTime cinema = new CinemaTime();

        try {
            cinema.addMovie("Inception", "14:30");
            cinema.addMovie("The Matrix", "18:45");
            cinema.addMovie("Interstellar", "21:00");
        } catch (InvalidTimeFormatException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        cinema.displayAllMovies();

        List<Integer> found = cinema.searchMovie("Matrix");
        System.out.println("Search results for 'Matrix': " + found.size() + " match(es).");
        for (int idx : found) {
            System.out.println(" - " + cinema.titles.get(idx) + " at " + cinema.showtimes.get(idx));
        }

        String report = cinema.generatePrintableReport();
        System.out.println("\nPrintable Report:\n" + report);
    }
}