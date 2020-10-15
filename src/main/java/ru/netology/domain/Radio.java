package ru.netology.domain;

public class Radio {
    private int numberOfCurrentRadioStation;
    private int volumeOfSound;

    public int getNumberOfCurrentRadioStation() {
        return numberOfCurrentRadioStation;
    }

    public void setNumberOfCurrentRadioStation(int numberOfCurrentRadioStation) {
        if (numberOfCurrentRadioStation > 9) {
            return;
        }
        this.numberOfCurrentRadioStation = numberOfCurrentRadioStation;
    }

    public void nextNumberOfRadioStation() {
        if (this.numberOfCurrentRadioStation < 9) {
            this.numberOfCurrentRadioStation += 1;
        } else this.numberOfCurrentRadioStation = 0;
    }

    public void prevNumberOfRadioStation() {
        if (this.numberOfCurrentRadioStation == 0) {
            this.numberOfCurrentRadioStation = 9;
        } else this.numberOfCurrentRadioStation -= 1;
    }


    public int getVolumeOfSound() {
        return volumeOfSound;
    }

    public void setVolumeOfSound(int volumeOfSound) {
        if (volumeOfSound > 10) {
            return;
        }
        if (volumeOfSound < 0) {
            return;
        }
        this.volumeOfSound = volumeOfSound;
    }

    public void increaseVolumeOfSound() {
        if (this.volumeOfSound < 10) {
            this.volumeOfSound += 1;
        }
    }

    public void decreaseVolumeOfSound() {
        if (this.volumeOfSound >0) {
            this.volumeOfSound -= 1;
        }
    }
}
