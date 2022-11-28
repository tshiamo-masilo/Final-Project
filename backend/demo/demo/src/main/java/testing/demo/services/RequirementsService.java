package testing.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.entities.Requirements;
import testing.demo.repositories.RequirementsRepository;

import java.util.List;

@Service
public class RequirementsService {

    @Autowired
    private RequirementsRepository requirementsRepository;

    public Requirements saveRequirements(Requirements requirements) {
        return requirementsRepository.save(requirements);
    }

    public List<Requirements> getAllRequirements() {
        return requirementsRepository.findAll();
    }

    public Requirements getRequirementsById(Long id) {
        return requirementsRepository.findById(id).get();
    }

    public String deleteRequirementsById(Long id) {
        requirementsRepository.deleteById(id);
        return "Requirement with Id:" + id + " is deleted";
    }

    public String deleteAllRequirements() {
        requirementsRepository.deleteAll();
        return "All Requirements are deleted";
    }

    public Requirements updateRequirements(Requirements requirements) {
        return requirements;
    }
}
