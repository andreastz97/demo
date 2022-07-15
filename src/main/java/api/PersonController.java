package api;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PersonService;

@RequestMapping("/api")
@RestController

public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("person")
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

}
