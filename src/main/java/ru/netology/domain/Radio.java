package ru.netology.domain;

public class Radio {
    private int numberOfCurrentRadioStation;
    private int maxNumberOfRadioStation = 9;
    private int volumeOfSound;
    private int minVolumeOfSound = 0;
    private int maxVolumeOfSound = 100;

    public Radio() {
    }

    public Radio(int maxQuantityOfRadioStation) {
        this.maxNumberOfRadioStation = maxQuantityOfRadioStation - 1;
    }

    public int getNumberOfCurrentRadioStation() {
        return numberOfCurrentRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int numberOfCurrentRadioStation) {
        if (numberOfCurrentRadioStation > this.maxNumberOfRadioStation) {
            return;
        }
        this.numberOfCurrentRadioStation = numberOfCurrentRadioStation;
    }

    public void nextNumberOfRadioStation() {
        if (this.numberOfCurrentRadioStation < this.maxNumberOfRadioStation) {
            this.numberOfCurrentRadioStation += 1;
        } else {
            this.numberOfCurrentRadioStation = 0;
        }
    }

    public void prevNumberOfRadioStation() {
        if (this.numberOfCurrentRadioStation == 0) {
            this.numberOfCurrentRadioStation = this.maxNumberOfRadioStation;
        } else {
            this.numberOfCurrentRadioStation -= 1;
        }
    }

    public Radio(int volumeOfSound, int minVolumeOfSound, int maxVolumeOfSound) {
        this.minVolumeOfSound = minVolumeOfSound;
        this.maxVolumeOfSound = maxVolumeOfSound;
        this.volumeOfSound = volumeOfSound;
    }

    public int getVolumeOfSound() {
        return volumeOfSound;
    }

    public void setVolumeOfSound(int volumeOfSound) {
        if (volumeOfSound > this.maxVolumeOfSound) {
            return;
        }
        if (volumeOfSound < this.minVolumeOfSound) {
            return;
        }
        this.volumeOfSound = volumeOfSound;
    }

    public void increaseVolumeOfSound() {
        if (this.volumeOfSound < this.maxVolumeOfSound) {
            this.volumeOfSound += 1;
        }
    }

    public void decreaseVolumeOfSound() {
        if (this.volumeOfSound > this.minVolumeOfSound) {
            this.volumeOfSound -= 1;
        }
    }
}
