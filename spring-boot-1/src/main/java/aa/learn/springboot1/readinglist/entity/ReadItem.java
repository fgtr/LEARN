package aa.learn.springboot1.readinglist.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/02 5:03 PM
 */

@Entity
@Data
public class ReadItem {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
