package com.etec.escola.Controller;
import com.etec.escola.Models.Aluno;
import com.etec.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {
    private final AlunoService alunoService;
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno>listadeAlunos(){
        return alunoService.buscarAlunos();
    }

    @PostMapping
    public Aluno salvarNovoAluno(@RequestBody Aluno dadosAluno){
        return alunoService.salvarAluno(dadosAluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAluno(@PathVariable Long id){
        return alunoService.buscarAlunoId(id);
    }


    @DeleteMapping("/{id}")
    public void excluirAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
    }

}
