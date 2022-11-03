package testing.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.demo.Services.AdminService;
import testing.demo.model.Admin;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/save")
    public Admin saveAdmin(@RequestBody Admin admin){
        return adminService.savePerson(admin) ;
    }

    @GetMapping("/getAdmin/{id}")
    public Admin findAdminById(@PathVariable int id){

        return adminService.findPersonById(id);
    }
    //Test function
    /*
    @GetMapping("/Testing")
    public String Testing(){
        return "API Working";
    }
*/
    @GetMapping("/getAllAdmin")
    public List<Admin> findAllAdmin(){
        return adminService.getAllUser();
    }


    @DeleteMapping("/deleteAdmin/{id}")
    public String deleteAdminById(@PathVariable int id){
        return adminService.deleteById(id);
    }
}
