package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setNumberOfCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadioStation(6);
        assertEquals(6, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(9);
        assertEquals(9,radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(10);
        assertEquals(9,radio.getNumberOfCurrentRadioStation());
    }

    @Test
    void nextNumberOfRadioStation() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadioStation(7);
        radio.nextNumberOfRadioStation();
        assertEquals(8, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(9);
        radio.nextNumberOfRadioStation();
        assertEquals(0, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    void prevNumberOfRadioStation() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadioStation(5);
        radio.prevNumberOfRadioStation();
        assertEquals(4, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(0);
        radio.prevNumberOfRadioStation();
        assertEquals(9, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    void setVolumeOfSound() {
        Radio radio = new Radio();
        radio.setVolumeOfSound(3);
        assertEquals(3, radio.getVolumeOfSound());
        radio.setVolumeOfSound(10);
        assertEquals(10, radio.getVolumeOfSound());
        radio.setVolumeOfSound(12);
        assertEquals(10, radio.getVolumeOfSound());
        radio.setVolumeOfSound(-2);
        assertEquals(10, radio.getVolumeOfSound());
    }

    @Test
    void increaseVolumeOfSound() {
        Radio radio = new Radio();
        radio.setVolumeOfSound(5);
        radio.increaseVolumeOfSound();
        assertEquals(6, radio.getVolumeOfSound());
        radio.setVolumeOfSound(10);
        radio.increaseVolumeOfSound();
        assertEquals(10, radio.getVolumeOfSound());
        radio.setVolumeOfSound(11);
        radio.increaseVolumeOfSound();
        assertEquals(10, radio.getVolumeOfSound());
    }

    @Test
    void decreaseVolumeOfSound() {
        Radio radio = new Radio();
        radio.setVolumeOfSound(4);
        radio.decreaseVolumeOfSound();
        assertEquals(3, radio.getVolumeOfSound());
        radio.setVolumeOfSound(0);
        radio.decreaseVolumeOfSound();
        assertEquals(0, radio.getVolumeOfSound());
        radio.setVolumeOfSound(-1);
        radio.decreaseVolumeOfSound();
        assertEquals(0, radio.getVolumeOfSound());
    }
}