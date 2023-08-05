package com.hertever.moneytracker.util;

import java.time.LocalDate;

public class MoneyTrackerUtil {

    public static String getCustomPrimaryKey() {
        LocalDate currentDate = LocalDate.now();
        return String.format("%02d-%d", currentDate.getMonthValue(), currentDate.getYear());
    }
}
