package com.talha.SpringBootRest.service;

import com.talha.SpringBootRest.model.JobPost;
import com.talha.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId) {

        return repo.getJob(postId);

    }

    public void updatejob(JobPost jobPost) {

        repo.updateJob(jobPost);

    }

    public void deleteJob(int postId) {

        repo.deleteJob(postId);

    }
}
