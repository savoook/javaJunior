package lesson21;

import junit.framework.TestCase;
import lesson7.CalkDrobey;
import lesson7.DrobnoeChislo;
import org.junit.Test;

public class TestSuite extends TestCase {
    @Test
    public void testAdd() {
        DrobnoeChislo number1 = new DrobnoeChislo();
        number1.setChislitel(-2);
        number1.setZnamenatel(4);

        DrobnoeChislo number2 = new DrobnoeChislo();
        number2.setChislitel(3);
        number2.setZnamenatel(5);

        DrobnoeChislo expResult = new DrobnoeChislo();
        expResult.setChislitel(2);
        expResult.setZnamenatel(20);

        CalkDrobey calculator = new CalkDrobey();
        DrobnoeChislo actualResult = calculator.summa(number1, number2);

        assertEquals(expResult, actualResult);

    }
}
