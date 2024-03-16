package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    @Test
    void increaseSales() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.increaseSales(500.0);
        emp.increaseSales(-200.0);
        assertEquals(500.0, emp.getSales());
    }

    @Test
    void annualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());

    }

    @Test
    void holidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        double bonus = emp.holidayBonus();
        assertEquals(0, bonus);
    }
}