package hospitalManagemant;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hospital {
   ArrayList<Patient> Patients;
    ArrayList<Doctor> Doctors;
    ArrayList<Transaction> Transactions;
    Scanner sc = new Scanner(System.in);
    final String path = "./src/resources/log.txt";
    public Hospital() {
       Patients = new ArrayList<Patient>();
        Doctors = new ArrayList<Doctor>();
        Transactions = new ArrayList<Transaction>();
    }
    // =========================
    // LOG TRANSACTION
    // =========================
    public void logTransaction(String msg) {
        try {
            FileOutputStream fo = new FileOutputStream(path, true);
               String msgData =msg + System.lineSeparator();
            byte[] data = msgData.getBytes();
            fo.write(data);
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // =========================
    // RECORD BOOKING
    // =========================
    public void recordTransaction(
            int DoctorId,
            int PatientId) {
        String msgData =
                "Appointment with doctor "
                + DoctorId
                + " for patient "
                + PatientId
                + " booked successfully";
        System.out.println(msgData);
        logTransaction(msgData);
    }
    // =========================
    // RECORD CANCELLATION
    // =========================
    public void recordCancellation(
            int DoctorId,
            int PatientId) {
        String msgData =
                "Appointment with doctor "
                + DoctorId
                + " for patient "
                + PatientId
                + " cancelled successfully";
        System.out.println(msgData);

        logTransaction(msgData);
    }
    // =========================
    // ADD DOCTOR
    // =========================
    public void addDoctor(Doctor d) {
        Doctors.add(d);
        System.out.println("Doctor added successfully");
        System.out.println("Doctor ID : " + d.getId());
    }
    // =========================
    // REMOVE DOCTOR
    // =========================
    public void removeDoctor(int id) {
        Iterator<Doctor> itr =  Doctors.iterator();
        while (itr.hasNext()) {
            Doctor d = itr.next();
            if (d.getId() == id) {
                itr.remove();
                System.out.println("Doctor removed successfully");
                return;
            }
        }
        System.out.println( "Doctor with given id not found");      
    }
    // =========================
    // DISPLAY DOCTORS
    // =========================
    public void displayDoctors() {
        if (Doctors.isEmpty()) {
            System.out.println( "No doctors found");
            return;
        }
        for (Doctor d : Doctors) {
            System.out.println(d);
        }
    }
    // =========================
    // ADD PATIENT
    // =========================
    public void addPatient(Patient p) {
        Patients.add(p);
        System.out.println( "Patient added successfully");
        System.out.println("Patient ID : " + p.getId());        
    }
    // =========================
    // REMOVE PATIENT
    // =========================
    public void removePatient(int id) {
        Iterator<Patient> itr =   Patients.iterator();
        while (itr.hasNext()) {
            Patient p = itr.next();
            if (p.getId() == id) {
                itr.remove();
                System.out.println("Patient removed successfully");
                return;
            }
        }

        System.out.println( "Patient with given id not found");
    }
    // =========================
    // DISPLAY PATIENTS
    // =========================
    public void displayPatient() {
        if (Patients.isEmpty()) {
            System.out.println( "No patients found");
            return;
        }
        for (Patient p : Patients) {
            System.out.println(p);
        }
    }
    // =========================
    // GET DOCTOR BY ID
    // =========================
    public Doctor getDoctorByID(int id) {
        for (Doctor d : Doctors) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }
    // =========================
    // GET PATIENT BY ID
    // =========================
    public Patient getPatientByID(int id) {
        for (Patient p : Patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    // =========================
    // SCHEDULE APPOINTMENT
    // =========================
    public void schedulrAppointment(int pid,  int did) {
        Doctor d = getDoctorByID(did);
        Patient p = getPatientByID(pid);
        if (d == null) {
            System.out.println( "Doctor with given id not found");
            return;
        }
        if (p == null) {
            System.out.println("Patient with given id not found");
            return;
        }
        if (d.isAvailable()) {
            d.setAvailable(false);
            Transaction tx = new Transaction(did, pid);
            Transactions.add(tx);
            recordTransaction(did, pid);
        } else {
            System.out.println( "Doctor with given id is not available");
        }
    }
    // =========================
    // CANCEL APPOINTMENT
    // =========================
    public void cancleAppointment(int did, int pid) {
        Doctor d = getDoctorByID(did);
        if (d == null) {
            System.out.println("Doctor with given id not found");
            return;
        }
        Iterator<Transaction> itr =  Transactions.iterator();
        while (itr.hasNext()) {
            Transaction tx = itr.next();
            if (tx.getDectorId() == did
                    && tx.getPatientId() == pid) {
                itr.remove();
                d.setAvailable(true);
                tx.setStatus("Cancel");
                recordCancellation(did, pid);
                return;
            }
        }
        System.out.println(
                "Booking with given doctor id " + "and patient id not found");
    }
    // =========================
    // UPDATE DOCTOR
    // =========================
    public void updateDoctor(int id) {
        for (Doctor d : Doctors) {
            if (d.getId() == id) {
                System.out.println( "Enter updated mobile number");
                long mobileno = sc.nextLong();
                d.setPhoneNumber(mobileno);
                System.out.println(
                        "Record updated successfully");
                return;
            }
        }
        System.out.println("Doctor with given id not found");
    }
    // =========================
    // UPDATE PATIENT
    // =========================
    public void updatePatient(int id) {
        for (Patient p : Patients) {
            if (p.getId() == id) {
                System.out.println( "Enter updated mobile number");
                long mobileno = sc.nextLong();
                p.setPhoneNumber(mobileno);
                System.out.println( "Record updated successfully");
                return;
            }
        }
        System.out.println( "Patient with given id not found");
    }
    // =========================
    // DISPLAY TRANSACTIONS
    // =========================
    public void displayTransactions() {
        if (Transactions.isEmpty()) {
            System.out.println( "No transactions found");
            return;
        }
        for (Transaction tx : Transactions) {
            System.out.println(tx);
        }
    }
}