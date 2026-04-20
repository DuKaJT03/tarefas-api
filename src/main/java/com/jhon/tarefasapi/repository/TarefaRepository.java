package com.jhon.tarefasapi.repository;

import com.jhon.tarefasapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
