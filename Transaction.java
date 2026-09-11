package hospitalManagemant;

import java.time.LocalDateTime;
public class Transaction {
    static int idGenerator = 3000;
    int id;
    int dectorId;
    int patientId;
    String status;
    LocalDateTime time;

    public Transaction(int dectorId, int patientId) {
        this.dectorId = dectorId;
        this.patientId = patientId;
        this.id = idGenerator++;
        this.status = "Book";
        this.time = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDectorId() {
        return dectorId;
    }
    public void setDectorId(int dectorId) {
        this.dectorId = dectorId;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id
                + ", dectorId=" + dectorId
                + ", patientId=" + patientId
                + ", status=" + status
                + ", time=" + time + "]";
    }
}