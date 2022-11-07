package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.AdminRepo;
import testing.demo.Repository.UserCredentialRepo;
import testing.demo.model.Admin;
import testing.demo.model.UserCredentials;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo repo;

    public Admin savePerson(Admin admin){
        return repo.save(admin)  ;
    }

    public Admin findPersonById(Long id){
        return repo.findById(id).orElse(null);
    }
    public List<Admin> getAllUser(){
        return  repo.findAll();
    }

    public String deleteById(Long id){
        repo.deleteById(id);
        return "A person with  Id  " +id +" is deleted!!";
    }

}
