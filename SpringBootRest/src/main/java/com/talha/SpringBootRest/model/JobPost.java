package com.talha.SpringBootRest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data //to remove tons of boilerplate code such as getters, setters, toString() etc.
@NoArgsConstructor //creates a constructor without args passed
@AllArgsConstructor //creates a constructor with args passed
@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDescription;
    private int reqExperience;
    private List<String> postTechStack;


}
