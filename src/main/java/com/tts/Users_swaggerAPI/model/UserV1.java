package com.tts.Users_swaggerAPI.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class UserV1 {


    @Id
    @ApiModelProperty(notes = "Userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ApiModelProperty(notes = "Please enter your first Name")
    private String firstName;
    @ApiModelProperty(notes = "Please enter your last name")
    private String lastName;
    @ApiModelProperty(notes = "Please enter your state , State cannot be empty")
    private String state;

    public UserV1() {

    }

    public UserV1(long id, String firstName, String lastName, String state) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
