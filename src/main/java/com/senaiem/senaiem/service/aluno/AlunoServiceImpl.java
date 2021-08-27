package com.senaiem.senaiem.service.aluno;

import com.senaiem.senaiem.model.Aluno;
import com.senaiem.senaiem.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findById(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    @Override
    public void save(Aluno aluno) {
       alunoRepository.save(aluno);
    }
}
