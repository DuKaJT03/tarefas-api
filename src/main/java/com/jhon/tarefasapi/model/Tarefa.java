package com.jhon.tarefasapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import com.jhon.tarefasapi.enums.Status;

import java.time.LocalDate;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    private String descricao;
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private Status status;

    private boolean concluida;

    //GETTERS

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getConcluida() {
        return concluida;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData(){
        return data;
    }
    public Status getStatus(){
        return status;
    }

    //SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public void setStatus(Status status){
        this.status = status;
    }
}
