import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohort1;
    Cohort cohort2;
    Cohort cohortAll;

    @Before
    public void initialize() {

        emptyCohort = new Cohort();
        cohort1 = new Cohort();
        cohort2 = new Cohort();
        cohortAll = new Cohort();

        Student student1 = new Student(1, "Jason");
        Student student2 = new Student(2, "Sid");

        student1.addGrade(100);
        student1.addGrade(99);

        student2.addGrade(90);
        student2.addGrade(80);

        cohort1.addStudent(student1);
        cohort2.addStudent(student2);
        cohortAll.addStudent(student1);
        cohortAll.addStudent(student2);

    }

    @Test
    public void testIfAddStudentWorks() {
        assertEquals(1, cohort1.getStudents().size());
        assertEquals(1, cohort2.getStudents().size());
        assertEquals(2, cohortAll.getStudents().size());
    }

    @Test
    public void testIfGetStudentWorks() {
        assertEquals(1, cohortAll.getStudents().get(0).getId());
        assertEquals(2, cohortAll.getStudents().get(1).getId());
        assertEquals(1, cohort1.getStudents().get(0).getId());
        assertEquals(2, cohort2.getStudents().get(0).getId());
        assertEquals(2, cohortAll.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks() {
        assertEquals(99.5, cohort1.getCohortAverage(), 0);
        assertEquals(85, cohort2.getCohortAverage(), 0);
        assertEquals(92, cohortAll.getCohortAverage(), 0.5);
    }
}