package org.example;

public class Radio {
    public int wave;
    public int volume;

    public int getWave() {
        return wave;

    }

    public int getVolume() {
        return volume;
    }

    public void setWave(int newWave) { // ограничение станций
        if (newWave > 9) {
            return;
        }
        if (newWave < 0) {
            return;
        }
        wave = newWave;

    }

    public void setVolume(int newVolume) { // ограничение громкости
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void nextWave() { // следующая станция
        if (wave < 9) {
            wave = wave + 1;

        }
    }

    public void previousWave() { // предыдущая станция
        if (wave > 0) {
            wave = wave - 1;
        }
    }

    public void volumeUp() { // увеличение громкости на 1
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void volumeDown() { // уменьшение громкости на 1
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}