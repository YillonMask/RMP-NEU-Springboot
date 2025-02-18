package com.rateneuprofessor.repository;

import java.util.List;

import com.rateneuprofessor.entity.Campus;

/**
 * Repository interface for Campus repository.
 */
public interface CampusRepository {
    /**
     * Get all campuses.
     *
     * @return List of all campuses.
     */
  public List<Campus> getAllCampus();
}
