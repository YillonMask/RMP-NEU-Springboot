package com.rateneuprofessor.service;

import java.util.List;

import com.rateneuprofessor.entity.Campus;
/**
 * Service interface for Campus service.
 */
public interface CampusService {
    /**
     * Get all campuses.
     *
     * @return List of all campuses.
     */
  List<Campus> getAllCampus();
}
