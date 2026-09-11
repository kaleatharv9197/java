package hospitalManagemant;
public class Doctor {
    static int idGenerator = 2000;
    int id;
    String name;
    long phoneNumber;
    boolean isAvailable;
    public Doctor(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isAvailable = true;
        this.id = idGenerator++;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean b) {
        this.isAvailable = b;
    }
    public void setPhoneNumber(long mobileno) {
        this.phoneNumber = mobileno;
    }
    @Override
    public String toString() {
        return "Doctor [id=" + id
                + ", name=" + name
                + ", phoneNumber=" + phoneNumber
                + ", isAvailable=" + isAvailable + "]";
    }
}