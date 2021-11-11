package com.quickpoll.quickpoll.domain;

import javax.persistence.*;

@Entity
public class AOption {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="OPTION_ID")  //OPTION --> NOITPO
    private Long id;

    @Column(name="OPTION_VALUE")
    private String value;

    public AOption(Long id, String value) {

        this.id = id;
        this.value = value;

    }

    public AOption() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

