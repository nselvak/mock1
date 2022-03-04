package sg.edu.nus.mock1.mock1.controller;

import sg.edu.nus.mock1.mock1.model.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class searchBook {
    
    @GetMapping("/")
    public String bookSearch(Model model) {
        model.addAttribute("search", new Search());
        return "search";
    }
}
