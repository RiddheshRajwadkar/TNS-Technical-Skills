package Day6.MultiLevel_inheritance;

public class City extends State{
    
    private String cityName;
    private String places;
    private float areas;
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getPlaces() {
        return places;
    }
    public void setPlaces(String places) {
        this.places = places;
    }
    public float getAreas() {
        return areas;
    }
    public void setAreas(float areas) {
        this.areas = areas;
    }
    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", places=" + places + ", areas=" + areas + ", toString()" + super.toString() + "]";
    }

    

}
