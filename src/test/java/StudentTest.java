import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void createStudentTest() {
        Student student1 = new Student(1, "Jason");
        Student studentNull = null;
        assertNull(studentNull);
        assertNotNull(student1);
    }

    @Test
    public void testStudentFields(){
        Student student1 = new Student(1, "Jason");
        assertEquals(1, student1.getId());
        assertSame("Jason", student1.getName());
        assertSame(0, student1.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student student1 = new Student(1, "Jason");
        student1.addGrade(100);
        assertSame(100, student1.getGrades().get(0));
        student1.addGrade(69);
        assertSame(69, student1.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student student1 = new Student(1, "Jason");
        student1.addGrade(100);
        student1.addGrade(99);
        assertEquals(99.5, student1.getGradeAverage(), 0);
    }
}
