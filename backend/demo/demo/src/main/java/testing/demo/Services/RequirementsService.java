package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.RequirementsRepo;
import testing.demo.model.Requirements;

import java.util.List;
@Service
public class RequirementsService {
    @Autowired
    private RequirementsRepo requirementsRepo;
      public Requirements saveRequirements(Requirements requirements){
          return requirementsRepo.save(requirements);
//                Requirements requirements1 = requirements.build(requirements.getId(),
//                requirements.getStreamId(),requirements.getRequirementsId(),
//                requirements.getMaths(),requirements.getNaturalScience(),
//                requirements.getTechnology(),requirements.getEconomicManagementScience(),
//                requirements.getArtAndCulture(),requirements.getSocialScience());

    }
    public List<Requirements> getAllRequirements(){
        return requirementsRepo.findAll();
    }
    public Requirements getRequirementsById(int id){
        return requirementsRepo.findById(id);
    }
    public String deleteRequirementsById(int id){
        requirementsRepo.deleteById(id);
        return "Requirement with Id:"+id+" is deleted";
    }
    public String deleteAllRequirements(){
        requirementsRepo.deleteAll();
        return "All Requirements are deleted";
    }
    public Requirements updateRequirements(Requirements requirements){
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
