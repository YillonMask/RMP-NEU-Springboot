package com.rateneuprofessor.controller;

import com.rateneuprofessor.service.ProfessorService;
import com.rateneuprofessor.service.impl.ProfessorServiceImpl;
import com.rateneuprofessor.utils.GsonTools;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    private ProfessorService professorService = new ProfessorServiceImpl();

    @PostMapping("/professor")
    public String addProfessor(
            @RequestParam("name") String name,
            @RequestParam("campus_id") Integer campusId
    ) {
        professorService.addProfessor(name, campusId);
        return GsonTools.success("Professor added successfully");
    }
}