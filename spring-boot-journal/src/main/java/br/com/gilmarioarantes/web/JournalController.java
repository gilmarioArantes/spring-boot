package br.com.gilmarioarantes.web;

import br.com.gilmarioarantes.domain.Journal;
import br.com.gilmarioarantes.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repo;

    @RequestMapping(value="/journal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody List<Journal> getJournal(){
        return repo.findAll();
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("Journal", repo.findAll());
        return "index";
    }
}
