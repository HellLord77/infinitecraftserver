package com.helllord.infinite_craft_server.controller;

import com.helllord.infinite_craft_server.dto.Result;
import com.helllord.infinite_craft_server.service.PairService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class RootController {
    public final PairService pairService;

    @GetMapping("pair")
    public Result pair(@RequestParam String first, @RequestParam String second) {
        return pairService.getResult(first, second);
    }
}
