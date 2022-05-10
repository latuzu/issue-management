package com.saygili.issuemanagement2.repository;

import com.saygili.issuemanagement2.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}
