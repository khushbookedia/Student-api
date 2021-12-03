package com.neosoft.Studentapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Column(name = "project_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projectId;

    @NotNull
    private String projectName;

    @NotNull
    private int duration;


//    @ManyToOne(fetch = FetchType.EAGER, optional = true)
//    @JoinColumn(name = "student_id")
//    private Student student;
//    @JoinTable(name = "student_project", joinColumns = @JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = true),
//            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = true))


    public Project(@NotNull String projectName, @NotNull int duration) {
        this.projectName = projectName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", duration=" + duration +
                '}';
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
