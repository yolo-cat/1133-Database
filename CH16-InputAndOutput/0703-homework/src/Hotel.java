public class Hotel {
    private String id;
    private String name;
    private String region;
    private String town;
    private String address;
    private String phone;
    // 可根據 hotels.csv 欄位數量擴充

    public Hotel(String id, String name, String region, String town, String address, String phone) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.town = town;
        this.address = address;
        this.phone = phone;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getRegion() { return region; }
    public String getTown() { return town; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return id + "," + name + "," + region + "," + town + "," + address + "," + phone;
    }
}
