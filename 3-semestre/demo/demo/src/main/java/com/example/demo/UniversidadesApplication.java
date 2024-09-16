package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UniversidadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversidadesApplication.class, args);
	}

}

class Universidade{
    private final String id;
    private String nome;
 
    // Construtor
    public Universidade(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
 
    public Universidade(String nome) {
        this(UUID.randomUUID().toString(), nome);
    }
 
    public String getId(){
        return id;
    }
 
    public String getNome(){
        return nome;
    }
 
    public void setNome(String nome){
        this.nome = nome;
    }
}

@RestController
@RequestMapping("/universidades")
class RestUniversidades {
    private List<Universidade> uni = new ArrayList<>();
 
    public RestUniversidades(){
        uni.addAll(List.of(
            new Universidade("FATEC"),
            new Universidade("Unifesp")
        ));
    }
 
    @GetMapping
    Iterable<Universidade> getUni(){
        return uni;
    }

    @PostMapping("/cadastrar")
    Universidade postUni (@RequestBody Universidade universidade){
        uni.add(universidade);
        return universidade;

    }


}
