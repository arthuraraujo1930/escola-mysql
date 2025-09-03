package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository AlunoRepository;

    public AlunoService(AlunoRepository rep) {
        AlunoRepository = rep;
    }

    public List<Aluno> buscarAlunos() {
        return AlunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return AlunoRepository.save(aluno);
    }

    public Aluno buscarAlunoId(long id) {
        return AlunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno(long id){
        AlunoRepository.deleteById(id);
    }

}
