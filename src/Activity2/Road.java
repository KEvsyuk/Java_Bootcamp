/*
Exercise:
 Road ===> from, to, distance(50km), arrived | methods ==> getters and setters, toString | create constructor to set empty values for all fields
 Transport ===> id, consumption = 10/100km, fuelTank(1l) | methods ==> getters and setters, toString, move(road)
 TransportManagement ===> static Array of transports, roads | methods:
            initSystem(5, 7)
            getTransports, getRoads, setRoad(roadObject, index), setTransport(transportObject, index)
 */
package Activity2;

public class Road {
    private String from;
    private String to;
    private float distance;

    private boolean arrived = false;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public float getDistance() {
        return distance;
    }

    public boolean getArrived(){
        return arrived;
    }

    public Road(String from, String to, float distance){
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Road(){
        this.from = null;
        this.to = "";
        this.distance = 0;
    }
}
