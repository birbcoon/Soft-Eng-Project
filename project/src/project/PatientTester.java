package project;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTester{
    @Test
    void createAppointment_test(){
        Date d = new Date();
        Person p1 = new Person("Sean", "Northcutt");
        int SSN1 = 848484;
        Patient pat1 = new Patient(p1, SSN1);
        Appointment expected_appt = new Appointment(d, pat1, "stomach hurts");

        Person p2 = new Person("Carson", "Davis");
        int SSN2 = 48299382;
        Patient pat2 = new Patient(p2, SSN2);
        pat2.createAppointment(d, pat2, "sick");
        assertNotEquals(expected_appt, pat2.appointment);
    }
}