package dev.ericdrake;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;

public class EducationServiceTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Test
    public void testStudentsByClass(){
//        //Given
//        Student chiemeka = new Student("Chiemeka Anunkor", "Java");
//        Student emmanuel = new Student("Emmanuel Dada", "Java");
//        Student eric = new Student("Eric Drake", "Java");
//        Student ezekiel = new Student("Ezekiel Thawngcung", "Java");
//        Student hatice = new Student("Hatice Kacer-Kaymaz", "Java");
//        Student lan = new Student("Lan Kostrikin", "Java");
//        Student sajedeh = new Student("Sajedeha Ahmadi", "Java");
//
//        Student abdul = new Student("Abdulaziz", "Data");
//        Student sonalee = new Student("Sonalee Bhattacharyya", "Data");
//
//        Student paul = new Student("Paul Okoh", "WebDev");
//        Student nutan = new Student("Nutan Pal", "WebDev");
//        Student erick = new Student("Erick Estrada", "WebDev");
//
//        List<Student> allStudents = Arrays.asList(chiemeka, emmanuel, eric, ezekiel, hatice, lan, sajedeh, abdul,
//                sonalee, paul, nutan, erick);
//
//        given(studentDataObject.getAllStudents()).willReturn(allStudents);
//
//        //When
//        List<Student> javaStudents = clientBusinessObjectImpl.getAllStudentsBySubject("Java");
//
//        //Then
//        assertThat(javaStudents, hasSize(7));
//        assertThat(javaStudents, hasItems(chiemeka, emmanuel, eric, ezekiel, hatice, lan, sajedeh));

        // Given
        Student studentJM = new Student("Joy Ma", "Spanish");
        Student studentJH = new Student("Julio Hernandez", "Algebra");
        Student studentJJ = new Student("Jenny Jones", "Calculus");
        List<Student> allStudents = Arrays.asList(studentJM, studentJH, studentJJ);

        given(studentDataObject.getAllStudents()).willReturn(allStudents);

        // When
        List<Student> mathStudents = clientBusinessObjectImpl.getAllStudentsBySubject("math");

        // Then
        assertThat(mathStudents.size(), is(2));
        assertThat(mathStudents, hasItems(studentJJ, studentJH);
    }
}
