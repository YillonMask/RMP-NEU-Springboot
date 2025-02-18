package test.repositoryTest;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

import main.java.com.rateneuprofessor.entity.Campus;
import main.java.com.rateneuprofessor.repository.CampusRepository;
import main.java.com.rateneuprofessor.repository.impl.CampusRepositoryImpl;

public class CampusRepositoryImplTest {

  @Test
  public void testGetAllCampus() {
    CampusRepository campusRepository = new CampusRepositoryImpl();
    List<Campus> campus = campusRepository.getAllCampus();
    assertEquals("Online", campus.get(0).getCampusName());
    assertEquals("Boston", campus.get(1).getCampusName());
    assertEquals("Silicon Valley", campus.get(2).getCampusName());
    assertEquals("Seattle", campus.get(3).getCampusName());
    assertEquals("Oakland", campus.get(4).getCampusName());
  }

}
