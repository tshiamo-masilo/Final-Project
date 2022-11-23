package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.entities.Requirements;
import testing.demo.repositories.RequirementsRepo;

import java.util.List;

@Service
public class RequirementsService {

    @Autowired
    private RequirementsRepo requirementsRepo;

    public Requirements saveRequirements(Requirements requirements) {
        return requirementsRepo.save(requirements);
    }

    public List<Requirements> getAllRequirements() {
        return requirementsRepo.findAll();
    }

    public Requirements getRequirementsById(Long id) {
        return requirementsRepo.findById(id).get();
    }

    public String deleteRequirementsById(Long id) {
        requirementsRepo.deleteById(id);
        return "Requirement with Id:" + id + " is deleted";
    }

    public String deleteAllRequirements() {
        requirementsRepo.deleteAll();
        return "All Requirements are deleted";
    }

}
