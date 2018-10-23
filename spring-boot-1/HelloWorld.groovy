@RestController
class HelloSpringBootCLIByGroovy {

	@RequestMapping("/")
	String home() {
		return "spring-boot: Hello World."
	}
	
}

