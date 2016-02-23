package core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;

@EnableWebMvc 
@Configuration
@ComponentScan({ "com.sgh.*" })
@EnableTransactionManagement
@Import({ SecurityConfig.class })
public class Appconfig {

}
