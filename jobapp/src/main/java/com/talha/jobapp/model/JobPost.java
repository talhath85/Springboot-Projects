package com.talha.jobapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data //to remove tons of boilerplate code such as getters, setters, toString() etc.
@NoArgsConstructor //creates a constructor without args passed
@AllArgsConstructor //creates a constructor with args passed
@Component
@Entity
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDescription;
    private int reqExperience;
    private List<String> postTechStack;


}
