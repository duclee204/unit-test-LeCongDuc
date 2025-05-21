import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_MixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 8.1, 10.0, 7.9)));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0, 8.0)));
    }

    @Test
    public void testCountExcellentStudents_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-2.0, 11.0, null)));
    }

    @Test
    public void testCalculateValidAverage_MixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()), 0.0001);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(8.0, 8.0, 8.0)), 0.0001);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.0001);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.calculateValidAverage(Arrays.asList(-2.0, 11.0, null)), 0.0001);
    }
}
