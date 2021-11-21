import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TaxTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testIncome.csv")
    public void testIncome(double income, double expectedTotalIncome) {
        Tax tax = new Tax();
        tax.increaseIncome(income);

        double expected = expectedTotalIncome;
        double actual = tax.getIncome();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testExpense.csv")
    public void testExpense(double expense, double expectedTotalExpense) {
        Tax tax = new Tax();
        tax.increaseExpense(expense);

        double expected = expectedTotalExpense;
        double actual = tax.getExpense();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test6() {
        Tax tax = new Tax();

        double expected = 6;
        double actual = tax.tax6(100);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test15() {
        Tax tax = new Tax();

        double expected = 0;
        double actual = tax.tax15(100, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseIncome() {
        Tax tax = new Tax();
        tax.increaseIncome(100);
        tax.increaseIncome(200);
        tax.increaseIncome(300);

        double expected = 600;
        double actual = tax.getIncome();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseExpense() {
        Tax tax = new Tax();
        tax.increaseExpense(100);
        tax.increaseExpense(200);
        tax.increaseExpense(300);

        double expected = 600;
        double actual = tax.getExpense();

        Assertions.assertEquals(expected, actual);

    }


}
