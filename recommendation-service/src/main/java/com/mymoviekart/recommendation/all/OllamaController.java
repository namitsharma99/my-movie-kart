package com.mymoviekart.recommendation.all;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ollama")
@CrossOrigin("*")
public class OllamaController {

    private OllamaChatModel chatModel;

    public OllamaController (OllamaChatModel ollamaChatModel) {
        chatModel = ollamaChatModel;
    }

    @GetMapping("/test")
    public String getAnswer() {
        return "ok";
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {

        String response = chatModel.call(message);
        return ResponseEntity.ok(response);
    }

}
