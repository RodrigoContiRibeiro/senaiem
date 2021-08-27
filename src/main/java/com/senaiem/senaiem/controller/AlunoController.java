package com.senaiem.senaiem.controller;

import com.senaiem.senaiem.model.Aluno;
import com.senaiem.senaiem.service.aluno.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {
    @Autowired
    AlunoServiceImpl alunoService;

    @GetMapping("/alunos")
    public String list(Model model) {
        model.addAttribute("alunos", alunoService.findAll());
        return "/aluno/list";
    }

    @GetMapping("/aluno/add")
    public String add(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "/aluno/add";
    }

    @GetMapping("/aluno/edit/{id}")
    public String edit(Model model, @PathVariable Long id) {
        model.addAttribute("aluno", alunoService.findById(id));
        return "/aluno/edit";
    }

    @GetMapping("/aluno/delete/{id}")
    public String delete(@PathVariable Long id){
        alunoService.deleteById(id);
        return "redirect:/alunos";
    }

    @PostMapping("/aluno/save")
    public String save(Aluno aluno) {
        System.out.println(aluno);
        alunoService.save(aluno);
        return "redirect:/alunos";
    }
}
