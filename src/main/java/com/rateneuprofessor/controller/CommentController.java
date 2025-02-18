package com.rateneuprofessor.controller;

import com.rateneuprofessor.service.CommentService;
import com.rateneuprofessor.service.impl.CommentServiceImpl;
import com.rateneuprofessor.utils.GsonTools;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private CommentService commentService = new CommentServiceImpl();

    @PostMapping
    public String addComment(
        @RequestParam("course_id") Integer courseId,
        @RequestParam("rating") Integer rating,
        @RequestParam("content") String content
    ) {
        commentService.addComment(courseId, rating, content);
        return GsonTools.success("Comment added successfully");
    }

    @GetMapping("/professor/{professorId}")
    public String getCommentsByProfessorId(
        @PathVariable("professorId") Integer professorId
    ) {
        return GsonTools.success("Get comments by professor id successfully", 
                commentService.getCommentsByProfessorId(professorId));
    }

    @GetMapping("/course/{courseId}")
    public String getCommentsByCourseId(
        @PathVariable("courseId") Integer courseId
    ) {
        return GsonTools.success("Get comments by course id successfully", 
                commentService.getCommentsByCourseId(courseId));
    }
}