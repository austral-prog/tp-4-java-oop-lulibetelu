package com.template;

public class Elevator {
    int minFloor;
    int maxFloor;
    int maxPeople;
    int currentFloor;
    int currentPeople;
    public Elevator(int minFloor, int maxFloor, int maxPeople){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPeople = maxPeople;
        this.currentFloor = 0;
        this.currentPeople = 0;
    }
    public void moveToFloor(int n){
        if (n <= this.maxFloor) {
            this.currentFloor = n;
        }
    }
    public int getCurrentFloor(){
        return this.currentFloor;
    }
    public void addPassenger(){
        if (this.currentPeople < this.maxPeople){
            this.currentPeople += 1;
        }
    }
    public int getPassengerCount(){
        return this.currentPeople;
    }
    public void removePassenger(){
        this.currentPeople -= 1;
    }

}
