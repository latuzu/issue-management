package com.saygili.issuemanagement2.repository;

import com.saygili.issuemanagement2.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
