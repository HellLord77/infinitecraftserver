package com.helllord.infinite_craft_server.repository;

import com.helllord.infinite_craft_server.model.Element;
import com.helllord.infinite_craft_server.model.Pair;
import com.helllord.infinite_craft_server.util.PairID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PairRepository extends CrudRepository<Pair, PairID> {
    @Query("SELECT pair.result FROM Pair AS pair WHERE pair.first.text = :firstText AND pair.second.text = :secondText")
    Optional<Element> findResultByTexts(@Param("firstText") String firstText, @Param("secondText") String secondText);
}
