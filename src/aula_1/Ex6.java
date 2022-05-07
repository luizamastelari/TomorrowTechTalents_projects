package aula_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex6 {
    private Double real_value;

    public void moneyConvertion (Double real_value){
        BigDecimal real = BigDecimal.valueOf(real_value);
        BigDecimal dolar = real.divide(BigDecimal.valueOf(4.7), 2, RoundingMode.HALF_EVEN);
        BigDecimal euros = real.divide(BigDecimal.valueOf(5.08), 2, RoundingMode.HALF_EVEN);
        BigDecimal libra = real.divide(BigDecimal.valueOf(6.13), 2, RoundingMode.HALF_EVEN);

        System.out.println("Dolar: " + dolar);
        System.out.println("Euro: " + euros);
        System.out.println("Libra: " + libra);

    }
}
