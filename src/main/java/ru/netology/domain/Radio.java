package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int numberOfCurrentRadioStation;
    private int maxNumberOfRadioStation = 9;
    private int volumeOfSound;
    private int minVolumeOfSound = 0;
    private int maxVolumeOfSound = 100;


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
