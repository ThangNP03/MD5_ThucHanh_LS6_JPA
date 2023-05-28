package ra.service;

import ra.model.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findALl();

    Comment findById(Long id);

    void deleteById(Long id);

    void save(Comment comment);
}
