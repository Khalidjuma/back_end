//package voter.voter.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import voter.voter.repository.LoginRepository;
//
//@RestController
//@RequestMapping
//public class LoginController<LoginForm> {
//    private final LoginRepository loginRepository;
//    public LoginController(LoginRepository loginRepository){
//        this.loginRepository=loginRepository;
//    }
//    @PostMapping
//    public ResponseEntity<String> login(@RequestBody LoginForm loginForm) {
//        String username=loginForm.username();
//        String password=loginForm.getpassword();
//        boolean isValidCredentials=loginRepository.isValidCredentials(username,password);
//        if (isValidCredentials){
//            return ResponseEntity.ok("login successeful");
//        }
//        else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalidcredentials");
//        }
//    }
//}
