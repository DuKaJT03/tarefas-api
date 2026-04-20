package com.jhon.tarefasapi.controller;

import com.jhon.tarefasapi.dto.TarefaDTO;
import com.jhon.tarefasapi.model.Tarefa;
import com.jhon.tarefasapi.service.TarefaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
@Tag(name = "Tarefas", description = "Operações relacionadas a tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    @Operation(summary = "Listar todas as tarefas")
    public List<TarefaDTO> listar() {
        return service.listar();
    }

    @PostMapping
    @Operation(summary = "Criar uma nova tarefa")
    @ApiResponse(responseCode = "200", description = "Tarefa criada com sucesso")
    public Tarefa criar(@RequestBody @Valid Tarefa tarefa){
        return service.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody @Valid Tarefa tarefa){
        return service.atualizar(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
