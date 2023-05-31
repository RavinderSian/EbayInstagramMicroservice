package com.personal.ebayinstagram.model;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.Data;

@Data
public class InstagramPost {
    
    private Long id;
    private List<Long> imageIds;
    private String url;
    private ZonedDateTime dateOfPost;
    private ZonedDateTime dateLastModified;
}
