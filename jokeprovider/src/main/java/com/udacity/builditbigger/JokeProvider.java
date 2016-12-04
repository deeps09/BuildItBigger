package com.udacity.builditbigger;

import java.util.Random;

public class JokeProvider {

    private String[] jokes =
            {
                    "Do not be racist; be like Mario. He's an Italian plumber, who was made by the Japanese, speaks English, looks like a Mexican, jumps like a black man, and grabs coins like a Jew!",
                    "Yo momma is so fat, when she sat on an iPod, she made the iPad!",
                    "Q: Why couldn't the blonde add 10 + 5 on a calculator? \n" +
                            "A: She couldn't find the \"10\" button.",
                    "Your momma is so stupid she put airbags on her computer in case it crashed.",
                    "Q: What do computers eat for a snack? \n" +
                            "A: Microchips!",
                    "What does an air conditioner have in common with a computer? They both lose efficiency as soon as you open windows.",
                    "Me: Siri, where is the best place to hide a body?\n" +
                            "Siri: The second page of a Google search.",
                    "Q: What did the computer do at lunchtime?\n" +
                            "A: Had a byte!",
                    "Q: What did the computer do at lunchtime?\n" +
                            "A: Had a byte!",
                    "I put my phone on airplane mode, but it sure ain't flyin'.",
                    "CAPS LOCK – Preventing Login Since 1980.",
                    "How do two programmers make money?\n" +
                            "One writes viruses, the other anti-viruses.",
                    "My wifi suddenly stop working then I realized that my neighbors have not paid the bill. \n" +
                            "How irresponsible people are.",
                    "Girls are like Internet Domain names, the ones I like are already taken.",
                    "The code that is the hardest to debug is the code that you know cannot possibly be wrong.",
                    "If at first you don't succeed, call it version 1.0.",
            };

    public String getJoke() {
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
