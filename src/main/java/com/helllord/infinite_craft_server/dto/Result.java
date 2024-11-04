package com.helllord.infinite_craft_server.dto;

import com.helllord.infinite_craft_server.model.Element;

public class Result {
    public static final Result NOTHING = new Result(new Element(0, "Nothing", ""));
    public final String result;
    public final String emoji;
    public final Boolean isNew = false;

    public Result(Element element) {
        result = element.text;
        emoji = element.emoji;
    }
}
