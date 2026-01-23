package feature_23_1_26;

import java.util.ArrayList;

class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        if (doctor != null && !doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (patient != null && !patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getDoctorName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
        System.out.println("----------------------------------");
    }
}

class Doctor {
    private int doctorId;
    private String doctorName;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void addPatient(Patient patient) {
        if (patient != null && !patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        if (patient == null) return;

        addPatient(patient);
        patient.addDoctor(this);

        System.out.println("Consultation Started");
        System.out.println("Doctor: " + doctorName + " (" + specialization + ")");
        System.out.println("Patient: " + patient.getPatientName());
        System.out.println("Consultation Completed");
        System.out.println("----------------------------------");
    }
}

class Patient {
    private int patientId;
    private String patientName;
    private ArrayList<Doctor> doctors;

    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void addDoctor(Doctor doctor) {
        if (doctor != null && !doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showConsultedDoctors() {
        System.out.println("Patient: " + patientName);
        System.out.println("Consulted Doctors:");
        if (doctors.isEmpty()) {
            System.out.println("No consultations yet");
        } else {
            for (Doctor d : doctors) {
                System.out.println("- " + d.getDoctorName());
            }
        }
        System.out.println("----------------------------------");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("City Hospital");

        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Orthopedics");

        Patient p1 = new Patient(201, "Sarthak");
        Patient p2 = new Patient(202, "Rahul");

        h1.addDoctor(d1);
        h1.addDoctor(d2);

        h1.addPatient(p1);
        h1.addPatient(p2);

        h1.displayHospitalDetails();

        d1.consult(p1);
        d2.consult(p1);

        d1.consult(p2);

        p1.showConsultedDoctors();
        p2.showConsultedDoctors();
    }
}

