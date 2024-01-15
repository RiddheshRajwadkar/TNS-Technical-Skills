package Day6.Multiple_inheritance;

public class MultilevelInheritanceDemo {
    
    public static void main(String[] args) {
        
        City obj = new City();

        obj.setCityName("Dehli");
        obj.setPlaces("India Gateway");
        obj.setAreas(3561564864.551f);
        obj.setStateName("Dehli");
        obj.setFestival("Diwali");
        obj.setLanguage("Hindi");
        obj.setPopulation(215151l);
        obj.setCapital("Dehli");
        obj.setCountryName("India");

        System.out.println(obj);
    }
}
