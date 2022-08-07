package co.develhope.Angelo.Notification.mail.Example.users.service;

import co.develhope.Angelo.Notification.mail.Example.users.entities.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    static List<User> users = Arrays.asList(
            new User("1","Angelo","Zammataro","angelo.zammataro76@gmail.com"),
            new User("2","Mario","Rossi","mariorossi@gmail.com"),
            new User("3","Giulio","Verdi","giulioverdi@gmail.com"),
            new User("4","Giovanna","Gialli","giovannagialli@gmail.com")
    );

    public User getUserById(String userId) {
        Optional<User> userFromDb = users.stream().filter(user -> user.getId().equals(userId)).findAny();
        if (userFromDb.isPresent()) return userFromDb.get();
        return null;
    }
}
