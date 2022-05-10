package com.saygili.issuemanagement2.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {
    private int number;
    private int size;
    private Sort sort;
    private int totalPage;
    private Long totalElements;
    private List<T> content;

    public void setStat(Page page, List<T> list) {
        number = page.getNumber();
        size = page.getSize();
        sort = page.getSort();
        totalPage = page.getTotalPages();
        totalElements = page.getTotalElements();
        content = list;
    }
}
