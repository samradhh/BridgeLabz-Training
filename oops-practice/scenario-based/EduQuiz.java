public class EduQuiz {
    private static final String[] correctAnswers = {"A", "B", "C", "A", "B", "C", "A", "B", "C", "A"};
        private static final String[] studentAnswers = {"A", "B", "C", "A", "B", "D", "A", "B", "C", "B"};

        public static void main(String[] args) {
            int score = calculateScore(correctAnswers, studentAnswers);
            double percentage = (score / 10.0) * 100;
            
            System.out.println("\n===== QUIZ RESULTS =====");
            System.out.printf("Score: %d/10 (%.1f%%)\n", score, percentage);
            System.out.println(percentage >= 70 ? "Status: PASS" : "Status: FAIL");
        }

        public static int calculateScore(String[] correct, String[] student) {
            int score = 0;
            System.out.println("===== DETAILED FEEDBACK =====");
            
            for (int i = 0; i < correct.length; i++) {
                boolean isCorrect = correct[i].equalsIgnoreCase(student[i]);
                System.out.printf("Question %d: %s\n", i + 1, isCorrect ? "Correct" : "Incorrect");
                if (isCorrect) score++;
            }
            
            return score;
        }
}