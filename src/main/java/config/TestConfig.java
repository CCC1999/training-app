package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 专门用于后台单元测试用
 * @author RanJi
 *
 */

@Configuration
@ComponentScan({"dao","service","controller"})
@Import({JdbcConfig.class})
public class TestConfig {

}
