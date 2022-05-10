package com.saygili.issuemanagement2.service.impl;

import com.saygili.issuemanagement2.dto.IssueDto;
import com.saygili.issuemanagement2.entity.Issue;
import com.saygili.issuemanagement2.repository.IssueRepository;
import com.saygili.issuemanagement2.service.IssueService;
import com.saygili.issuemanagement2.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if (issue.getDate() == null) {
            throw new IllegalArgumentException("Issue date cannot be null");
        }

        Issue issueEntity = modelMapper.map(issue, Issue.class);
        issueEntity = issueRepository.save(issueEntity);

        return modelMapper.map(issueEntity, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return modelMapper.map(issueRepository.getById(id), IssueDto.class);
    }

    @Override
    public TPage<Issue> getAllPageable(Pageable pageable) {
        Page<Issue> page = issueRepository.findAll(pageable);
        TPage tPage = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(page.getContent(), IssueDto[].class);
        tPage.setStat(page, Arrays.asList(dtos));
        return tPage;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }

    @Override
    public Boolean delete(Issue issue) {
        return Boolean.TRUE;
    }
}
