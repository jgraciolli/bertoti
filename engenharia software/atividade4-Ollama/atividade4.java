package org.example;

import io.github.ollama4j.Ollama;
import io.github.ollama4j.models.response.ModelDetail;

public class atividade4 {

    public static void main(String[] args) throws Exception {

        Ollama ollama = new Ollama("http://localhost:11434/");
        String model = "qwen3.5:0.8b";
        ollama.pullModel(model);
        ollama.setRequestTimeoutSeconds(200);

        ModelDetail modelDetails = ollama.getModelDetails(model);

        System.out.println(modelDetails);
    }
}
