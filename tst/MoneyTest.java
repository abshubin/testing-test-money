/**
 * Created by Andrew Shubin on 10/5/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void constructorShouldSetAmountAndCurrency() {

        Money money = new Money(10, "USD");

        assertEquals(10, money.getAmount());
        assertEquals("USD", money.getCurrency());
    }

}