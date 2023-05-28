package ra.reponsitory;

import ra.model.Comment;

import java.util.List;

public interface CommentRepository {
    List<Comment> findALl();

    Comment findById(Long id);

    void deleteById(Long id);

    void save(Comment comment);
}
