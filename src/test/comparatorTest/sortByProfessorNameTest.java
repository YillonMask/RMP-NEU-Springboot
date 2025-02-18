package test.comparatorTest;

import org.junit.Before;
import org.junit.Test;

import main.java.com.rateneuprofessor.entity.Professor;
import main.java.com.rateneuprofessor.entity.comparator.sortByProfessorName;
import main.java.com.rateneuprofessor.repository.ProfessorRepository;
import main.java.com.rateneuprofessor.repository.impl.ProfessorRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class sortByProfessorNameTest {
    ProfessorRepositoryImpl professorRepository = new ProfessorRepositoryImpl();
    List<Professor> professors = new ArrayList<>();

    @Before
    public void setUp() {
        professors.add(new Professor(1, "Grace Hopper", 1,3.00));
        professors.add(new Professor(2, "Alan Turing", 1,4.00));
        professors.add(new Professor(3, "Fei-Fei Lee", 3,2.50));
        professors.add(new Professor(4, "Ada Lovelace", 2,3.50));
        professors.add(new Professor(5, "Mark Miller", 1,3.00));
    }

    @Test
    public void testSortByProfessorName() {
        professors.sort(new sortByProfessorName());
        String expected = "Ada Lovelace";
        assertEquals(expected, professors.get(0).getName());
        expected = "Alan Turing";
        assertEquals(expected, professors.get(1).getName());
        expected = "Fei-Fei Lee";
        assertEquals(expected, professors.get(2).getName());
        expected = "Grace Hopper";
        assertEquals(expected, professors.get(3).getName());
        expected = "Mark Miller";
        assertEquals(expected, professors.get(4).getName());
    }
}
