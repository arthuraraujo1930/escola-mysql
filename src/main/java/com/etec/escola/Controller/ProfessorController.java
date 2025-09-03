package com.etec.escola.Controller;

import com.etec.escola.Models.Professor;
import com.etec.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professsor")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    @GetMapping
    public List<Professor>listaDeProfessor(){
        return professorService.buscarProfessor();
    }

    @PostMapping
    public Professor salvarNovoProfessor(@RequestBody Professor dadosProfessor){
        return professorService.salvarProfessor(dadosProfessor);
    }

    @GetMapping("/{id}")
    public Professor buscarProfessor(@PathVariable Long id){
        return professorService.buscarProfessorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluirProfessor(@PathVariable Long id){
        professorService.deletarProfessor(id);
    }

}
