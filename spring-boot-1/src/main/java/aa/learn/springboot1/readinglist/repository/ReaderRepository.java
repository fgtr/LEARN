package aa.learn.springboot1.readinglist.repository;

import aa.learn.springboot1.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/05 3:33 PM
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {

}
