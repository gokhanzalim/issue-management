package com.management.issuemanagement.repository;

import com.management.issuemanagement.entity.Project;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    List<Project> getByProjectCodeContains(String projectCode);

    List<Project> getByProjectCode(String projectCode);

    List<Project> findAll(Sort sort);
}
