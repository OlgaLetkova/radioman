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
        assertEquals(9, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(10);
        assertEquals(9, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    void setNumberOfCurrentRadioStationUseConstructor() {
        Radio radio = new Radio(22);
        radio.setNumberOfCurrentRadioStation(10);
        assertEquals(10, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(21);
        assertEquals(21, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(25);
        assertEquals(21, radio.getNumberOfCurrentRadioStation());
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
    void nextNumberOfRadioStationUseConstructor() {
        Radio radio = new Radio(14);
        radio.setNumberOfCurrentRadioStation(7);
        radio.nextNumberOfRadioStation();
        assertEquals(8, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(13);
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
    void prevNumberOfRadioStationUseConstructor() {
        Radio radio = new Radio(12);
        radio.setNumberOfCurrentRadioStation(5);
        radio.prevNumberOfRadioStation();
        assertEquals(4, radio.getNumberOfCurrentRadioStation());
        radio.setNumberOfCurrentRadioStation(0);
        radio.prevNumberOfRadioStation();
        assertEquals(11, radio.getNumberOfCurrentRadioStation());
    }

    @Test
    void setVolumeOfSound() {
        Radio radio = new Radio();
        radio.setVolumeOfSound(50);
        assertEquals(50, radio.getVolumeOfSound());
        radio.setVolumeOfSound(100);
        assertEquals(100, radio.getVolumeOfSound());
        radio.setVolumeOfSound(101);
        assertEquals(100, radio.getVolumeOfSound());
        radio.setVolumeOfSound(0);
        assertEquals(0, radio.getVolumeOfSound());
        radio.setVolumeOfSound(-1);
        assertEquals(0, radio.getVolumeOfSound());
    }



    @Test
    void increaseVolumeOfSound() {
        Radio radio = new Radio(49, 0, 100);
        radio.increaseVolumeOfSound();
        assertEquals(50, radio.getVolumeOfSound());
    }

    @Test
    void increaseVolumeOfSound1() {
        Radio radio = new Radio(99, 0, 100);
        radio.increaseVolumeOfSound();
        assertEquals(100, radio.getVolumeOfSound());
    }

    @Test
    void increaseVolumeOfSound2() {
        Radio radio = new Radio(100, 0, 100);
        radio.increaseVolumeOfSound();
        assertEquals(100, radio.getVolumeOfSound());
    }


        @Test
        void decreaseVolumeOfSound () {
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