package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @org.junit.jupiter.api.Test
    void increaseHoursPositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(4.5);
        assertEquals(4.5,emp.getHoursWorked());

    }
    @org.junit.jupiter.api.Test
    void increaseHoursNegative() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(-1.5);
        assertEquals(0.0,emp.getHoursWorked());

    }

    @org.junit.jupiter.api.Test
    void increaseHoursBoth() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(4.5);
        emp.increaseHours(-1.5);
        assertEquals(4.5,emp.getHoursWorked());
    }

    @Test
    void fivePercentAnnualRaise(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        double expectedWage = 34.49;
        assertEquals(expectedWage,emp.getWage());
    }

    @Test
    void calculateFortyHoursWeeklyPay(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        double expectedWage =  1149.75;
        assertEquals(expectedWage,emp.calculateWeeklyPay());

    }

    @Test
    void calculateOverFortyHoursWeeklyPay(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);
        double expectedPay =  32.85 * 40 + (32.85*1.5) * (45-40);
        expectedPay = Math.round(expectedPay * 100.0) / 100.0;
        assertEquals(1560.38,expectedPay);
    }


}