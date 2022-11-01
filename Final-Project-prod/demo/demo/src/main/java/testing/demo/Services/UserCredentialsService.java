package testing.demo.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.UserCredentialRepo;
import testing.demo.model.UserCredentials;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class UserCredentialsService {
    @Autowired
    private UserCredentialRepo repo;
    public UserCredentials savePerson(UserCredentials userCredentials){
        if (repo.count()<3){
            userCredentials.setRole("admin");
        }else{
            userCredentials.setRole("student");
        }
       return repo.save(userCredentials)  ;
    }

    public UserCredentials findPersonById(int id){
       return repo.findById(id).orElse(null);
    }
    public List<UserCredentials> getAllUser(){
        return  repo.findAll();
    }

//    public UserCredentials findPersonByUsername(String username, String password){
//        return repo.findLogin(username,password);
//    }

    public String deleteById(int id){
        repo.deleteById(id);
        return "A person with  Id  " +id +" is deleted!!";
    }
}
