package com.example.urlHit.service;

import com.example.urlHit.model.VisitUrl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {
    static Map<String,Integer> map=new HashMap<>();
    public VisitUrl getVisits(String username) { // business logic


        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        VisitUrl visit=new VisitUrl(username,count);
        return visit;
    }
}
