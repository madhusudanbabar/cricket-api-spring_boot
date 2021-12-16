package com.krypton.entities;

public class Player {
    String name;
    int runs;
    int balls;
    boolean isOut;
    boolean didBat;

    public boolean isDidBat() {
        return didBat;
    }

    public void setDidBat(boolean didBat) {
        this.didBat = didBat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    public Player() {
    }

    public Player(String name, int runs, int balls, boolean isOut, boolean didBat) {
        this.name = name;
        this.runs = runs;
        this.balls = balls;
        this.isOut = isOut;
        this.didBat = didBat;
    }
}
