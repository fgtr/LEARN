[ FEATURES ]
+ H2 Database
	* build.grandle
		runtimeOnly 'com.h2database:h2'
	* application.yml
		spring.datasource.url: jdbc:h2:tcp://localhost/~/dev/h2/data/spring-boot-1
	> 2018-10-4 15:55
+ Security
	HTML设置： `<form th:action="@{/reader/registry}" method='POST'>` 
	    或 `<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />`
	> SecurityConfig, login.html
	> 2018-10-19 14:33
+ Lombok
	> build.grandle，ReadItem
	> 2018-10-19 10:22:39
+ HTTPS / HTTP转HTTPS
	> SpringBoot1Application
	> 2018-10-20 20:45
+ 配置属性Bean
	@ConfigurationProperties(prefix = "amazon")
	> AmazonProperties, ReadingListController
	> 2018-10-22 11:32
+ 不同情景的Profile
	针对 生产/开发/测试 等不同情景分别应用不同的配置
	> application.yml, SecurityConfig
	> 2018-10-22 16:00
+ Error / Exception 页面
	支持 Google / Baidu / Stackoverflow 搜索异常信息
	> 2018-10-22 20:37
