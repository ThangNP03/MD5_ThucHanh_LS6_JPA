package ra.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Comment;
import ra.reponsitory.CommentRepository;

import java.util.List;

@Service
public class CommentServiceIMP implements ICommentService{

    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<Comment> findALl() {
        return commentRepository.findALl();
    }

    @Override
    public Comment findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
            commentRepository.deleteById(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);

    }
}
