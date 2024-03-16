package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {

    @Test
    void calculateWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double weeklyExpectedPay = Math.round(64325.0 / 52 * 100.) / 100.0;
        assertEquals(1237.02, weeklyExpectedPay);

    }

    @Test
    void holidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double bonus = Math.round(64325.0 *  3.365)/100.0;
        assertEquals(2164.54, bonus);
    }
}