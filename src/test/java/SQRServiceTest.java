import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.services.SQRService;

public class SQRServiceTest {
    @Test
    public void largeRange() {
        SQRService service = new SQRService();

        int expected = 23;
        int actual = service.calcSqr(1000, 3000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void smallRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(111, 120);

        Assertions.assertEquals(expected, actual);
    }

}
