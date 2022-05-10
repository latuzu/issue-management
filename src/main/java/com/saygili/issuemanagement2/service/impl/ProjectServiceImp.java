package com.saygili.issuemanagement2.service.impl;

import com.saygili.issuemanagement2.entity.Project;
import com.saygili.issuemanagement2.repository.ProjectRepository;
import com.saygili.issuemanagement2.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImp(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        if (project.getProjectCode().isEmpty()) {
            throw new IllegalArgumentException("Project code cannot be null");
        }

        return projectRepository.save(project);
    }

    @Override
    public Project getById(Long id) {
        return null;
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
