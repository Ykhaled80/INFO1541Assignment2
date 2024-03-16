package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {

    @Test
    void calculateWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double weeklyExpectedPay = Math.round(emp.calculateWeeklyPay() * 100.) / 100.0;
        assertEquals(1237.02, weeklyExpectedPay);

    }

    @Test
    void holidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double actualBonus = Math.round(emp.holidayBonus() * 100.0) / 100.0;
        assertEquals(2164.54, actualBonus);
    }
}