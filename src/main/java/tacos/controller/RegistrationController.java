package tacos.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.model.RegistrationForm;
import tacos.repo.jpa.UserRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String getRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUser(RegistrationForm registrationForm) {
        userRepository.save(registrationForm.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
