//package com.mymoviekart.recommendation.service;
//
//import org.springframework.ai.chat.ChatClient;
//import org.springframework.ai.chat.prompt.Prompt;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RecommendationService {
//
//    private final ChatClient chatClient;
//
//    public RecommendationService(ChatClient chatClient) {
//        this.chatClient = chatClient;
//    }
//
//    public String getMovieRecommendations(String userPreferences) {
//        String promptText = "Recommend 5 movies similar to " + userPreferences + ". Provide only the movie titles, one per line.";
//        Prompt prompt = new Prompt(promptText);
//        return chatClient.call(prompt).getResult().getOutput().getContent();
//    }
//}