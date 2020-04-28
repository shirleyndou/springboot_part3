package controller;

import com.springapp.User;
import com.springapp.UserService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user.getId(), user.getName(), user.getSurname());
    }

    @GetMapping
    public String getUser(@PathVariable("id") long Id){
        return userService.getUser(Id);
    }

    @DeleteMapping(path = "{id}")
    public void removeUser(@PathVariable("id") long Id){
        userService.removeUser(Id);
    }


}
