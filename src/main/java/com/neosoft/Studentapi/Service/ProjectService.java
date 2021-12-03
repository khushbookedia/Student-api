package com.neosoft.Studentapi.Service;

import com.neosoft.Studentapi.Entity.Project;

public interface ProjectService {

    public Project createProject(Project project);

    public Project getProject(int projectId);

    public Project updateProject(int id, Project project);
}
