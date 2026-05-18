package com.allobank.splitbill.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ServiceChargeUtil {

    public static int calculatePct(String githubUsername) {

        int sum = githubUsername
                .toLowerCase()
                .chars()
                .sum();

        return sum % 10;
    }

    public static BigDecimal calculateAmount(
            BigDecimal total,
            int pct
    ) {
        return total.multiply(BigDecimal.valueOf(pct))
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }
}
