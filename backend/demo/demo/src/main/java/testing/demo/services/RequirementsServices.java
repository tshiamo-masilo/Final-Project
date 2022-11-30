package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.Requirements;
import testing.demo.entities.Requirements;
import testing.demo.repositories.RequirementsRepository;

import java.util.List;

@Service
public class RequirementsServices {
    @Autowired
    private RequirementsRepository repository;

    public Requirements saveRequirement(Requirements requirement) {
        return repository.save(requirement);
    }

    public Requirements findRequirementsById(Long id) {
        return repository.findById(id).get();
    }

    public List<Requirements> getAllRequirements() {
        return repository.findAll();
    }

    public String deleteRequirementsById(Long id) {
        repository.deleteById(id);
        return "A Requirements with  Id  " + id + " is deleted!!";
    }

    public String deleteAllRequirements() {
        repository.deleteAll();
        return "All Requirements are deleted!!";
    }
}
