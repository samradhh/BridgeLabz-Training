import java.util.Scanner;

public class StudentTestScores {
        private double[] scores;

        public StudentTestScores(double[] scores) {
            this.scores = scores;
        }

        public double calculateAverage() {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            return scores.length > 0 ? sum / scores.length : 0;
        }

        public double getHighestScore() {
            double highest = scores[0];
            for (double score : scores) {
                if (score > highest) {
                    highest = score;
                }
            }
            return highest;
        }

        public double getLowestScore() {
            double lowest = scores[0];
            for (double score : scores) {
                if (score < lowest) {
                    lowest = score;
                }
            }
            return lowest;
        }

        public void displayScoresAboveAverage() {
            double average = calculateAverage();
            System.out.println("Scores above average (" + average + "):");
            for (double score : scores) {
                if (score > average) {
                    System.out.println(score);
                }
            }
        }

        public static void main(String[] args) {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter the number of Students:");
            int n = r.nextInt();
            try {
                double[] studentScores = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter score for student " + (i + 1) + ":");
                    studentScores[i] = r.nextDouble();
                }
                StudentTestScores test = new StudentTestScores(studentScores);
                
                System.out.println("Average: " + test.calculateAverage());
                System.out.println("Highest: " + test.getHighestScore());
                System.out.println("Lowest: " + test.getLowestScore());
                test.displayScoresAboveAverage();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter numeric values only.");
            }
        }
}