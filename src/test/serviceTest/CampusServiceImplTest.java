package test.serviceTest;

import org.junit.Test;

import main.java.com.rateneuprofessor.entity.Campus;
import main.java.com.rateneuprofessor.service.impl.CampusServiceImpl;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CampusServiceImplTest {
    CampusServiceImpl campusService = new CampusServiceImpl();
    @Test
    public void testGetAllCampuses(){
        List<Campus> campus = campusService.getAllCampus();
        assertEquals(14, campus.size());
        assertEquals("Online", campus.get(0).getCampusName());
    }
}
