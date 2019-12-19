package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


/**
 * WebConfig配置
 * @author RanJi
 *
 */
@Configuration
//@EnableWebMvc		
public class WebConfig extends WebMvcConfigurationSupport {
	/**
     * jsp视图解析器的bean
     * @return
     */
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
    
    
    /**
     * 配置处理静态资源
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    	super.addResourceHandlers(registry);
    }
    
    /**
     * 解决跨域访问的问题
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**") 		//-- 允许跨域访问的路径
        .allowedOrigins("*")	//-- 允许跨域访问的源
        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")		//-- 允许请求方法
        .maxAge(168000)	//--  预检间隔时间
        .allowCredentials(true);	//--  是否发送cookie
    	super.addCorsMappings(registry);
    }
}
