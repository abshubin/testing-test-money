/**
 * Created by egrstudent on 10/5/16.
 */

import junitparams.*;
import org.junit.runner.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    private static final Object[] getMoney() {

        return new Object[] {
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"},
                new Object[] {30, "JPY"},
                new Object[] {40, "GBP"},
                new Object[] {"AUD", 50}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(
                int amount, String currency) {

        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }

}
