package com.rateneuprofessor.service;

import java.util.List;

import com.rateneuprofessor.entity.Course;

/**
 * Service interface for Course service.
 */
public interface CourseService {
    /**
     * add a course to the database
     * @param courseName
     * @param name
     * @param courseCode
     * @param campusId
     */
    void addCourse(String courseName, String name, String courseCode, Integer campusId);

    /**
     * Search course by course name
     * @param name
     * @return List of courses
     */
    List<Course> searchCourseByName(String name);

    /**
     * Search course by course code
     * @param code
     * @return List of courses
     */
    List<Course> searchCourseByCode(String code);

    /**
     * Delete a course by courseId
     * @param courseId
     */
    void deleteCourse(Integer courseId);
}
