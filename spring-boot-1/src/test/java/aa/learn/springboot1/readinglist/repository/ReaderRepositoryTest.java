package aa.learn.springboot1.readinglist.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/05 7:40 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReaderRepositoryTest {
    @Resource
    private ReaderRepository readerRepository;

    @Test
    public void findById() {
        System.out.println(readerRepository.findById("jeff").orElse(null));
    }

}