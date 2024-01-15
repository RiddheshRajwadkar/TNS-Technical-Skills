package Day6.MultiLevel_inheritance;

public class State extends Country{
    
    private String stateName;
    private String festival;
    private String language;
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public String getFestival() {
        return festival;
    }
    public void setFestival(String festival) {
        this.festival = festival;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public String toString() {
        return "State [stateName=" + stateName + ", festival=" + festival + ", language=" + language + ", getCountryName()=" + getCountryName() + ", getPopulation()=" + getPopulation() + ", getCapital()=" + getCapital() + "]";
    }

    
}
