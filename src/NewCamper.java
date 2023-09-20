public class NewCamper {
    private String name;
    private String phone;
    private String street;
    private String city;
    private String zip;
    private String days;
    private boolean water;
    private boolean wifi;
    private boolean dump;
    private boolean electric;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setDump(boolean dump) {
        this.dump = dump;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getDays() {
        return days;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isDump() {
        return dump;
    }

    public boolean isElectric() {
        return electric;
    }
}
