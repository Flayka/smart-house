package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature = 35;
    private int minTemperature = 5;
    private int currentTemperature;
    private boolean on;

//       public int getMaxTemperature() {
//           return maxTemperature;
//       }
//
//       public void setMaxTemperature(int maxTemperature) {
//           this.maxTemperature = maxTemperature;
//       }
//
//       public int getMinTemperature() {
//           return minTemperature;
//       }
//
//       public void setMinTemperature(int minTemperature) {
//           this.minTemperature = minTemperature;
//       }
//
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
        return;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }
}
