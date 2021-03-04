package com.tts.Users_swaggerAPI.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Userid ")
    private long id;
    @ApiModelProperty(notes = "User's firstname")
    @NotEmpty(message = "Please provide a firstname")
    @Size(min = 2, max = 20)
    private String firstName;
    @NotEmpty(message = "Please provide a lastName")
    @Size(min = 2, max = 20)
    private String lastName;
    @NotEmpty(message = "State cannot be empty,Please enter the Users State")
    @Size(min = 2, max = 20)
    private String state;

    public UserV2() {

    }

    public UserV2(long id, @Size(min = 3, max = 25) String firstName, @Size(min = 2, max = 20) String lastName, @Size(min = 2, max = 20) String state) {
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
