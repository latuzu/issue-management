package com.saygili.issuemanagement2.dto;

import com.saygili.issuemanagement2.entity.IssueStatus;

import java.util.Date;

public class IssueHistoryDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;

}
