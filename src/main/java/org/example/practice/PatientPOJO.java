package org.example.practice;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

class Patient implements Comparable<Patient>{
    private String lastName;
    private String ssn;

    Patient(String lastName, String ssn){
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString(){
        return
                "Patient {" +
                "lastname: "+ this.lastName +
                        "ssn: "+ ssn +
                        "}";

    }

    public String getSSN(){
        return this.ssn;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Patient patient = (Patient) obj;
        return ssn.equals(((Patient) obj).ssn);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(ssn);
    }

    @Override
    public int compareTo(Patient o) {
        return lastName.compareTo(o.getLastName());
    }

    public static Comparator<Patient> patientComparator = Comparator.comparing(Patient::getLastName);
}
public class PatientPOJO {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Sourav", "12345");
        Patient patient2 = new Patient("Wick", "1");
        Patient patient3 = new Patient("John", "12345");

        System.out.println(patient1.equals(patient3));
        System.out.println(patient1.compareTo(patient2));

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient3);
        patients.add(patient2);
        System.out.println(patients);
      //  Collections.sort(patients);
        //System.out.println(patients);//sorted by lastname

        Comparator<Patient> lastnameComparator  = Comparator.comparing(Patient::getSSN);

         Collections.sort(patients,  Patient.patientComparator);
        System.out.println(patients);//sorted by lastname
        Collections.sort(patients,  lastnameComparator);
        System.out.println(patients);//sorted by lastname

        //string to long
        String test = "1234567890123777777";
        Double longTest = Double.parseDouble(test);
        System.out.println(longTest);
    }
}
