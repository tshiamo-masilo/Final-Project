package testing.demo.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.UserCredentialRepo;
import testing.demo.model.UserCredentials;

import java.util.List;

@Service
@AllArgsConstructor
public class UserCredentialsService {

    @Autowired
    private UserCredentialRepo repo;

    public UserCredentials savePerson(UserCredentials userCredentials){
       return repo.save(userCredentials)  ;
    }

    public UserCredentials findPersonById(int id){
       return repo.findById(id).orElse(null);
    }
    public List<UserCredentials> getAllUser(){
        return  repo.findAll();
    }

    public String deleteById(int id){
        repo.deleteById(id);
        return "A person with  Id  " +id +" is deleted!!";
    }
}
