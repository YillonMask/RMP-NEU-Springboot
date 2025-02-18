package com.rateneuprofessor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rateneuprofessor.entity.Campus;
import com.rateneuprofessor.service.CampusService;
import com.rateneuprofessor.service.impl.CampusServiceImpl;
import com.rateneuprofessor.utils.GsonTools;

import java.util.List;

@RestController
public class CampusController {

  private CampusService campusService = new CampusServiceImpl();

  @GetMapping("/campus")
  public String getAllCampus(){
    List<Campus> campus = campusService.getAllCampus();
    if (campus != null){
      return GsonTools.success("Get all campus successfully", campus);
    }else{
      return GsonTools.error("Cannot get campus");
    }
  }
}
