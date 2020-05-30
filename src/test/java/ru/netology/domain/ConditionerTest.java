package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldGetHigherTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(34);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 35;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetLowerTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();;
        int actual = conditioner.getCurrentTemperature();
        int expected = 19;
        assertEquals(expected, actual);
    }

    @Test
    void shouldTempIsMaxTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 35;
        assertEquals(expected, actual);
    }

    @Test
    void shouldTempIsMinTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();;
        int actual = conditioner.getCurrentTemperature();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldTempAboveMaxTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 35;
        assertEquals(expected, actual);
    }
    @Test
    void shouldTempBelowMinTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(2);
        conditioner.decreaseCurrentTemperature();;
        int actual = conditioner.getCurrentTemperature();
        int expected = 5;
        assertEquals(expected, actual);
    }

}
