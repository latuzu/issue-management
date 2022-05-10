package com.saygili.issuemanagement2.service;

import com.saygili.issuemanagement2.dto.IssueDto;
import com.saygili.issuemanagement2.entity.Issue;
import com.saygili.issuemanagement2.entity.IssueHistory;
import com.saygili.issuemanagement2.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<Issue> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

    Boolean delete(Issue issue);
}
