package project.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.model.*;

import java.util.Date;

class DoctorTest extends Nurse {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdministeredTreatment() {
    }

    @Test
    void testMakeDiagnosis() {
    }



    @Test
    void addPrescription() {
        Date date = new Date();
        Person p = new Person("Johnnie", "Oldfield", 222);
        int SSN = 222;
        Patient pat = new Patient(p);
        Appointment a = new Appointment(date, pat, "Cancer");

        Person d = new Person("Sean", "Northcutt", 5234);
        Doctor doc = new Doctor(d);
        //assertTrue(doc.addPrescription("test"));
    }

}