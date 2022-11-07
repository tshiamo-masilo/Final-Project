package testing.demo.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class RequirementsDto {
    private String StreamId;
    private String RequirementsId;
    private String Maths;
    private String NaturalScience;
    private String Technology;
    private String EconomicManagementScience;
    private String ArtAndCulture;
    private String SocialScience;
}
