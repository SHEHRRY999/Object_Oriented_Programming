import java.util.*;

class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        System.out.print("Enter difficulty (1.2 to 3.8): ");
        double degreeOfDifficulty = scanner.nextDouble();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter score " + i + ": ");
            double score = scanner.nextDouble();
            scores.add(score);
        }
        Collections.sort(scores);
        scores.remove(0);
        scores.remove(scores.size() - 1);

        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        double totalScore = sum * degreeOfDifficulty * 0.6;
        System.out.println("The overall score " + totalScore);
    }
}
