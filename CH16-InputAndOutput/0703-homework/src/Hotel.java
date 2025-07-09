public class Hotel {
    private String id;
    private String name;
    private String address;
    private String phone;
    // 可根據 hotels.csv 欄位數量擴充

    public Hotel(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return id + "," + name + "," + address + "," + phone;
    }
}

