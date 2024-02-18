import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> generateTruthTable() {
        List<String> truthTable = new ArrayList<>();
        for (int p = 0; p <= 1; p++) {
            for (int q = 0; q <= 1; q++) {
                for (int r = 0; r <= 1; r++) {
                    int result = p & (q ^ r);
                    truthTable.add(p + " | " + q + " | " + r + " | " + result);
                }
            }
        }
        return truthTable;
    }

    public static void main(String[] args) {
        List<String> truthTable = generateTruthTable();
        for (String row : truthTable) {
            System.out.println(row);
        }
    }
}