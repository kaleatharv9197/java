package hospitalManagemant;

public class Patient {
    static int idGenerator = 1000;
    int id;
    String name;
    long phoneNumber;
    public Patient(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = idGenerator++;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Patient [id=" + id
                + ", name=" + name
                + ", phoneNumber=" + phoneNumber + "]";
    }
}