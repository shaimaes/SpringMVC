package fr.formation.inti;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc // indique qu'il faut se rendre dans le dispatcher
@Configuration
@ComponentScan(basePackages = { "fr.formation.inti.*" })
public class WebConfig implements WebMvcConfigurer {

//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("index");
//	}
//
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver bean = new InternalResourceViewResolver();
//
//		bean.setViewClass(JstlView.class);
//		bean.setPrefix("/WEB-INF/view/");
//		bean.setSuffix(".jsp");
//
//		return bean;
//	}
//
//	@Bean(name = "messageSource")
//	public MessageSource getMessageResource() {
//		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
//		messageResource.setBasename("classpath:message");
//		messageResource.setDefaultEncoding("UTF-8");
//
//		return messageResource;
//	}
//
//	@Bean
//	public LocaleResolver localeResolver() {
//		CookieLocaleResolver resolver = new CookieLocaleResolver();
//		resolver.setDefaultLocale(new Locale("en"));
//		resolver.setCookieName("myLocaleCookie");
//		resolver.setCookieMaxAge(4800);
//		return resolver;
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
//		interceptor.setParamName("mylocale");
//		registry.addInterceptor(interceptor);
//	}
//	
//	@Override
//	   public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	       registry
//	               .addResourceHandler("/style/**","/image/**")
//	               .addResourceLocations("/ressources/css/", "/ressources/img/");
//	   }
}