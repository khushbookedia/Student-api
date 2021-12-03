package com.neosoft.Studentapi.Service;

import com.neosoft.Studentapi.Dao.ProjectDao;
import com.neosoft.Studentapi.Entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public Project createProject(Project project) {
        return projectDao.save(project);
    }

    @Override
    public Project getProject(int projectId) {
        return projectDao.findById(projectId).get();
    }

    public Project updateProject(int id, Project project){
        Project existingProject = getProject(id);
        existingProject.setProjectName(project.getProjectName());
        existingProject.setDuration(project.getDuration());
        return projectDao.save(existingProject);
    }
}
