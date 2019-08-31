package site.zido.movie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping
public class IndexController {
    @Value("${movie.home}")
    private String path;

    @GetMapping
    public String index(Model mav) {
        File p = new File(path);
        File[] files = p.listFiles();
        List<Movie> movies;
        if (files == null || files.length == 0) {
            mav.addAttribute("movies", Collections.EMPTY_LIST);
        } else {
            movies = new ArrayList<>(files.length);
            for (File file : files) {
                movies.add(new Movie("/movie/" + file.getName(), file.getName()));
            }
            mav.addAttribute("movies", movies);
        }
        return "index";
    }

    @GetMapping("/movie/{name:.+}")
    public String movie(@PathVariable("name") String filename, Model mav) {
        mav.addAttribute("name", filename);
        mav.addAttribute("path", "/resources/" + filename);
        return "movie";
    }
}
