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

    public Requirements getRequirementsById(int id) {
        return requirementsRepo.findById(id);
    }

    public String deleteRequirementsById(int id) {
        requirementsRepo.deleteById(id);
        return "Requirement with Id:" + id + " is deleted";
    }

    public String deleteAllRequirements() {
        requirementsRepo.deleteAll();
        return "All Requirements are deleted";
    }

    public Requirements updateRequirements(Requirements requirements) {
        Requirements existing = requirementsRepo.findById(requirements.getId());
        existing.setRequirementsId(requirements.getRequirementsId());
        existing.setStreamId(requirements.getStreamId());
        existing.setMaths(requirements.getMaths());
        existing.setNaturalScience(requirements.getNaturalScience());
        existing.setTechnology(requirements.getTechnology());
        existing.setEconomicManagementScience(requirements.getEconomicManagementScience());
        existing.setArtAndCulture(requirements.getArtAndCulture());
        existing.setSocialScience(requirements.getSocialScience());
        return existing;
    }
}
