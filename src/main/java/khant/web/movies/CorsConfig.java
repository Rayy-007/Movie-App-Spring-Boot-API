//package khant.web.movies;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//    @Configuration
//    public class CorsConfig {
//
//        @Bean
//        public WebMvcConfigurer coresConfigure() {
//            return new WebMvcConfigurer() {
//                @Override
//                public void addCorsMappings(CorsRegistry registry) {
//                    registry.addMapping("/api/**")
//                            .allowedOrigins("http://localhost:5173") // Replace with your React app's origin
//                            .allowedMethods("GET", "POST", "PUT", "DELETE");
//                }
//            };
//        }
//
//}
