package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcWhenFewResult() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(200, 500);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCalcWhenZeroResult() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenOneResult() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}

