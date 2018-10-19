package aa.learn.springboot1.readinglist.web;

import aa.learn.springboot1.readinglist.entity.Reader;
import aa.learn.springboot1.readinglist.repository.ReaderRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/05 8:23 PM
 */
@Controller
@RequestMapping("/reader")
public class ReaderController {

    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private ReaderRepository readerRepository;

    @GetMapping("/login")
    public String login() {
        return "reader/login";
    }

    @PostMapping("/login")
//    @ResponseBody
    public String login(@RequestParam("username") String name, Reader reader) {
//        return "Welcome, " + name;
        return "redirect:/reading-list/" + name;
    }

    @GetMapping("/registry")
    public String registry() {
        return "reader/registry";
    }

    @PostMapping("/registry")
    public String registry(Reader reader) {
        reader.setPassword(passwordEncoder.encode(reader.getPassword()));
        readerRepository.save(reader);
        return "redirect:/reader/login";
    }

}
