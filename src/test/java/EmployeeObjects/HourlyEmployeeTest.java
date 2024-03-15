package EmployeeObjects;

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

}