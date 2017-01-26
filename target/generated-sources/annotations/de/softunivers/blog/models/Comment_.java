package de.softunivers.blog.models;

import de.softunivers.blog.models.CommentPK;
import de.softunivers.blog.models.Post;
import de.softunivers.blog.models.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-24T16:55:38")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Date> createdAt;
    public static volatile SingularAttribute<Comment, Post> post;
    public static volatile SingularAttribute<Comment, CommentPK> commentPK;
    public static volatile SingularAttribute<Comment, String> openion;
    public static volatile SingularAttribute<Comment, User> user;
    public static volatile SingularAttribute<Comment, Date> updatedAt;

}