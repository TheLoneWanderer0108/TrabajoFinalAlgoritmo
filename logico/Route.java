package logico;

import java.io.Serializable;

public class Route implements Serializable {
    private Stop from;
    private Stop to;
    private double distance;
    private int travelTime; // in minutes
    private double fare;
    private String routeNumber;

    public Route(Stop from, Stop to, double distance, int travelTime, double fare, String routeNumber) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.travelTime = travelTime;
        this.fare = fare;
        this.routeNumber = routeNumber;
    }

    public Stop getFrom() { return from; }
    public void setFrom(Stop from) { this.from = from; }
    public Stop getTo() { return to; }
    public void setTo(Stop to) { this.to = to; }
    public double getDistance() { return distance; }
    public void setDistance(double distance) { this.distance = distance; }
    public int getTravelTime() { return travelTime; }
    public void setTravelTime(int travelTime) { this.travelTime = travelTime; }
    public double getFare() { return fare; }
    public void setFare(double fare) { this.fare = fare; }
    public String getRouteNumber() { return routeNumber; }
    public void setRouteNumber(String routeNumber) { this.routeNumber = routeNumber; }
}
