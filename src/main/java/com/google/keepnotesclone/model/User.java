package com.google.keepnotesclone.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean isLogin;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notespage_id")
    private NotesPage notesPage;
}
