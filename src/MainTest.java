import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testGenerateTruthTable() {
        List<String> expected = List.of(
                "0 | 0 | 0 | 0",
                "0 | 0 | 1 | 0",
                "0 | 1 | 0 | 0",
                "0 | 1 | 1 | 0",
                "1 | 0 | 0 | 0",
                "1 | 0 | 1 | 1",
                "1 | 1 | 0 | 1",
                "1 | 1 | 1 | 0"
        );
        assertEquals(expected, Main.generateTruthTable());
    }
}