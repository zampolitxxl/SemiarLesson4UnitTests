import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Iterator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class Seminar4Test2 {

    @Test
    public  void CardTest(){
        CreditCard mockCreditCard = mock(CreditCard.class);
        when(mockCreditCard.getCardNumber()).thenReturn("123456789");
        when(mockCreditCard.getCardHolder()).thenReturn("Vasili Petrov");
        when(mockCreditCard.getExpiryDate()).thenReturn("12/23");
        when(mockCreditCard.getCvv()).thenReturn("480");

        PaymentForm payment = new PaymentForm(mockCreditCard);

        payment.pay(100);
        verify(mockCreditCard, times(1)).charge(500);







//
    }
}
