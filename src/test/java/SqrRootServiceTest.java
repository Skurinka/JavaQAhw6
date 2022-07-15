import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SqrRootService;

public class SqrRootServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrtservice.csv")
    public void testDiapason(int expected, int dia1, int dia2) {
        SqrRootService service = new SqrRootService();


        int actual = service.calcSqrt(dia1,dia2);

        Assertions.assertEquals(expected,actual);

    }
}
