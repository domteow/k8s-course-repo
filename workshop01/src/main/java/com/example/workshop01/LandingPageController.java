package com.example.workshop01;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {



    private static final List<String> QUOTES = Arrays.asList(
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."
    );

    private final Random random = new Random();

    @GetMapping("/")
    public String showLandingPage(Model model) {
        String quote = QUOTES.get(random.nextInt(QUOTES.size()));

        model.addAttribute("quote", quote);

        return "index";
    }
}
