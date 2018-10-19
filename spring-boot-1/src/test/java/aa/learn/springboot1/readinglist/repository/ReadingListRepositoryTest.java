package aa.learn.springboot1.readinglist.repository;

import aa.learn.springboot1.readinglist.entity.ReadItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/04 10:23 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadingListRepositoryTest {
    @Resource
    ReadingListRepository repository;

    @Test
    public void findByReader() {
        List<ReadItem> items = repository.findByReader("jeff");
        System.out.println(">" + items);
    }
}