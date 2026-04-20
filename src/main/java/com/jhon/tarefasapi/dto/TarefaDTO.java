package com.jhon.tarefasapi.dto;

import com.jhon.tarefasapi.enums.Status;
import java.time.LocalDate;

public class TarefaDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private Status status;
    private boolean concluida;

    public TarefaDTO(){

    }

    public TarefaDTO(Long id, String titulo, String descricao, LocalDate data, Status status, boolean concluida){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
        this.concluida = concluida;
    }

    public Long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    public boolean getConcluida(){
        return concluida;
    }
}
