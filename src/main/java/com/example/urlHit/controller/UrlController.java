package com.example.urlHit.controller;

import com.example.urlHit.model.VisitUrl;
import com.example.urlHit.service.UrlService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count")
public class UrlController {
    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService=urlService;
    }

    @GetMapping("/username/{username}/count")
    public VisitUrl getCount(@PathVariable String username) {
        VisitUrl visit=urlService.getVisits(username);
        return visit;
    }
}
