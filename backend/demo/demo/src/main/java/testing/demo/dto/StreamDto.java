package testing.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StreamDto {
    private String StreamId;
    private String StreamName;
    private String SchoolId;
    private String Subject1;
    private String Subject2;
    private String Subject3;
    private String Subject4;
}
