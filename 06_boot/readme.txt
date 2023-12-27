
# boot mysql mybatis 연동 의존성
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.1.4</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
        <version>8.0.32</version>
</dependency>	


# JSP 의존성
	<dependency>
	    <groupId>org.apache.tomcat.embed</groupId>
	    <artifactId>tomcat-embed-jasper</artifactId>
	</dependency>
	<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
	</dependency>

# db연동 4가지 정보 프레임워크 버전
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/testdb?characterEncoding=UTF8
spring.datasource.username=root
spring.datasource.password=root1234

# db연동 4가지 정보 boot버전
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/testdb?useUnicode=true&serverTimezone=Asia/Seoul
spring.datasource.username=root
spring.datasource.password=1234

# devtools 
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-devtools</artifactId>
</dependency>

# lombok
<dependency>
	<groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
</dependency>

# thymeleaf 의존성 설정
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>

# Swagger3 의존성 설정
	<dependency>
	    <groupId>io.springfox</groupId>
	    <artifactId>springfox-boot-starter</artifactId>
	    <version>3.0.0</version>
    </dependency>


#####################################################################
//Swagger2: http://localhost:8090/swagger-ui.html
//Swagger3: http://localhost:8090/swagger-ui/index.html
@Configuration
@EnableWebMvc
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
				.useDefaultResponseMessages(false)
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("컨트롤러패키지지정"))
				.paths(PathSelectors.any())
				.build();
	}
}
#####################################################################


