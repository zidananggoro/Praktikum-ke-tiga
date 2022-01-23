package Modul6;

public class City {
    private static final double EARTH_EQUATORIAL_RADIUS = 6378.13780;
    static final double CONVERT_DEGREE_TO_RADIANS = Math.PI/180D;
    private static final double CONVERT_KM_TO_MILE = 0.621371;
    private String nama;
    private Double longitude;
    private Double latitude;
    public City(String nama, double latitude, double longitude){
        this.nama = nama;
        this.longitude = longitude * CONVERT_DEGREE_TO_RADIANS;
        this.latitude = latitude * CONVERT_DEGREE_TO_RADIANS;
    }
    public String getNama() {return this.nama; }
    public double getLatitude(){ return this.latitude; }
    public double getLongitude(){return  this.longitude; }
    public double measureDistance(City city){
        double deltaLongitude = (city.getLongitude() - this.getLongitude());
        double deltalatitude = (city.getLatitude() - this.getLatitude());
        double a = Math.pow(Math.sin(deltalatitude /2D),2D)+
                Math.cos(this.getLatitude()) * Math.cos(city.getLatitude())* Math.pow(Math.sin(deltaLongitude / 2D), 2D);
        return CONVERT_KM_TO_MILE * EARTH_EQUATORIAL_RADIUS * 2D * Math.atan2(Math.sqrt(a), Math.sqrt(1D - a ));
    }
    public String toString(){return getNama();}
}
