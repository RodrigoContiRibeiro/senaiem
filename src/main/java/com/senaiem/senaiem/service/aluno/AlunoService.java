package com.senaiem.senaiem.service.aluno;

import com.senaiem.senaiem.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoService {

    public List<Aluno> findAll();

    public Aluno findById(Long id);

    public void deleteById(Long id);

    public void save(Aluno aluno);
}
