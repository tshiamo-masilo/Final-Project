package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.Requirements;
import testing.demo.repositories.RequirementsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RequirementsService {

    @Autowired
    private RequirementsRepository requirementsRepo;

    public Requirements saveRequirements(Requirements requirements) {
        return requirementsRepo.save(requirements);
    }

    public List<Requirements> getAllRequirements() {
        return requirementsRepo.findAll();
    }

    public Optional<Requirements> getRequirementsById(Long id) {
        return requirementsRepo.findById(id);
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
