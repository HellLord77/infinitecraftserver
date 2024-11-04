package com.helllord.infinite_craft_server.service;

import com.helllord.infinite_craft_server.dto.Result;
import com.helllord.infinite_craft_server.model.Element;
import com.helllord.infinite_craft_server.repository.PairRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PairService {
    public final PairRepository pairRepository;

    public Result getResult(String firstText, String secondText) {
        if (firstText.compareTo(secondText) > 0) {
            String temp = firstText;
            firstText = secondText;
            secondText = temp;
        }

        Optional<Element> result = pairRepository.findResultByTexts(firstText, secondText);
        return result.map(Result::new).orElse(Result.NOTHING);
    }
}
