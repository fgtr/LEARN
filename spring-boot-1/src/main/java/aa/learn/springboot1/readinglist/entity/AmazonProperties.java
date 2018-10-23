package aa.learn.springboot1.readinglist.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/22 10:44 AM
 */
@Component
//@EnableConfigurationProperties
@ConfigurationProperties(prefix = "amazon")
public class AmazonProperties {
    @Setter @Getter
    private String associateId;
}
