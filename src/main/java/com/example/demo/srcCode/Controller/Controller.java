package com.example.demo.srcCode.Controller;

import com.example.demo.DTOs.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    // Hiermit kannst du über deinen Browser testen ob die Anwendung am Start ist. Gib ein: localhost:8080/hello
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    // Teste mit Postman einen get-request an localhost:8080/getExample
    //
    @RequestMapping(value = "/getExample", method = RequestMethod.GET)
    public String gibtHttpParameterZurueck(@RequestParam String parameter1, @RequestParam int parameter2) {
        String ichBesteheAusParameter1und2 = "Parameter1: " + parameter1 + " Parameter2: " + parameter2;
        return ichBesteheAusParameter1und2;

    }

    List<User> userListFuerBeiSpiel = new ArrayList<>();
    //Auch mit Postman testen. Einen POST Request erstellen. Der Body muss alls User Attribute enthalten. Das Ganze
    //im JSON Format. Beispiel habe ich euch per Whatsapp geschickt.
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {

        userListFuerBeiSpiel.add(user);
        return user.toString();
    }


}
