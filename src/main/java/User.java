public class User {
    private String userId;
    private double lat;
    private double lon;
    private double minMatchDistance;

    public double getMinMatchDistance() {
        return minMatchDistance;
    }

    public void setMinMatchDistance(double minMatchDistance) {
        this.minMatchDistance = minMatchDistance;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getUserId() {
        return userId;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }
}
