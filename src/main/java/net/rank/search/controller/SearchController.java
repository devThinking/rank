package net.rank.search.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/search")
public class SearchController {
    @GetMapping("")
    public ResponseEntity getSearch() {
        final Map<String, String> result = Map.of("test", "test");
        return ResponseEntity.ok(result);
    }
}
