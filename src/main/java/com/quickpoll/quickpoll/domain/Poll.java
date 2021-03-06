package com.quickpoll.quickpoll.domain;

import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="POLL_ID")
    private Long id;

    @Column(name="QUESTION")
    @NotEmpty
    private String question;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="POLL_ID")
    @OrderBy
    @Size(min=2, max = 6)
    private Set<AOption> AOptions;

    public Poll(Long id, String question, Set<AOption> AOptions) {

        this.id = id;
        this.question = question;
        this.AOptions = AOptions;

    }

    public Poll() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<AOption> getOptions() {
        return AOptions;
    }

    public void setOptions(Set<AOption> AOptions) {
        this.AOptions = AOptions;
    }
}
