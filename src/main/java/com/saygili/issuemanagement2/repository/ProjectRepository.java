package com.saygili.issuemanagement2.repository;

import com.saygili.issuemanagement2.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> getAllByProjectCode(String projectCode);

    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode, String Name);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);
}
