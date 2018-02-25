package controller;

import model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UsersService;

@Controller
public class UserController {

    private UsersService usersService;
    @Autowired
    @Qualifier(value = "usersService")
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping (value = "users", method = RequestMethod.GET)
    public String listUsers (Model model){
        model.addAttribute("users", new Users());
        model.addAttribute("listUsers", this.usersService.listUsers());
        return "users";
    }

    @RequestMapping (value = "/users/add", method = RequestMethod.POST)
    public String addUser (@ModelAttribute("users") Users users){
        if(users.getId() == 0){
            this.usersService.addUser(users);
        }else {
            this.usersService.updateUsers(users);
        }
        return "redirect:/users";
    }
    @RequestMapping ("/remove/ {id}")
    public String removeUser(@PathVariable("id") int id){
        this.usersService.removeUser(id);
        return "redirect:/users";
    }
    @RequestMapping("edit/{id}")
    public String editUser(@PathVariable ("id") int id,Model model){
        model.addAttribute("users", this.usersService.getUserById(id));
        model.addAttribute("listUsers", this.usersService.listUsers());
        return "users";
        }


        @RequestMapping("userData/{id}")
    public String userData (@PathVariable("id") int id, Model model){
        model.addAttribute("users",this.usersService.getUserById(id));
        return "userData";
        }
}
