package dao;

import model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("fakeDao")
public class FakePersonDataAccessService {
    private static List<Person> DB = new ArrayList<>();
    public int insertPerson(UUID id,Person person){
        DB.add(new Person(id,person.getName()));
        return 1;
    }
}
