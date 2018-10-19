package aa.learn.springboot1.readinglist.web;

import aa.learn.springboot1.readinglist.entity.ReadItem;
import aa.learn.springboot1.readinglist.repository.ReadingListRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/02 5:09 PM
 */
@Controller
@RequestMapping("/reading-list")
public class ReadingListController {

    private int count;

    @Resource
    private ReadingListRepository readingListRepository;

//    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    @GetMapping("/{reader}")
    public String readersBooks(@PathVariable String reader, Model model) {
        List<ReadItem> readingList = readingListRepository.findByReader(reader);
        model.addAttribute("books", readingList);
        model.addAttribute("name", reader);
        return "reading-list/reading-list";
    }

    @PostMapping("/{reader}")
    public String addReadItem(@PathVariable("reader") String reader, ReadItem readItem
//                            , Model model
                        ) {
        System.out.println(count++);
        readItem.setReader(reader);
        readingListRepository.save(readItem);
        return "redirect:/reading-list/{reader}";
//        return readersBooks(reader, model);
    }

}
