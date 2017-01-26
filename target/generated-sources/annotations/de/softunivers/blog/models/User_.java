package de.softunivers.blog.models;

import de.softunivers.blog.models.Comment;
import de.softunivers.blog.models.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-24T16:55:38")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> fname;
    public static volatile SingularAttribute<User, String> lname;
    public static volatile CollectionAttribute<User, Post> postCollection;
    public static volatile CollectionAttribute<User, Comment> commentCollection;
    public static volatile SingularAttribute<User, Integer> id;

}