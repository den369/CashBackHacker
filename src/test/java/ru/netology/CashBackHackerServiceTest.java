package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {

    CashBackHackerService service = new CashBackHackerService();


    @Test
    public void showUnderBoundary() {
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void showAboveBoundary() {
        int amount = 1450;
        int actual = service.remain(amount);
        int expected = 550;
        assertEquals(actual, expected);
    }

    @Test
    public void showZeroAmount() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void showEqualsBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}