package aa.learn.springboot1.readinglist.repository;

import aa.learn.springboot1.readinglist.entity.ReadItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/02 5:07 PM
 */
public interface ReadingListRepository extends JpaRepository<ReadItem, Long> {

    List<ReadItem> findByReader(String reader);

//    // 这个的 from 对象名，而不是具体的表名。@ 2018-10-15 10:58:38 > http://blog.720ui.com/2017/springboot_02_data_jpa/
//    @Query("from ReadItem where id = :id")
//    Author findAuthor(@Param("id") Long id);
}
