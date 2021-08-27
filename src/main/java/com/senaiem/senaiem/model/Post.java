package com.senaiem.senaiem.model;

import javax.persistence.*;

@Entity(name = "postagem")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 150, nullable = false)
    private String name;

    @Column(name = "descricao", columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "data", length = 100,nullable = false)
    private String date;
    //Didn't implement the date typing 'cause of the time
    //dd/mm/yyyy

    @Column(name = "usuario_fk", nullable = false)
    private Long user_id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
