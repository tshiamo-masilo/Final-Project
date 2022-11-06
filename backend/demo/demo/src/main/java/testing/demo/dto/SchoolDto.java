package testing.demo.dto;

import lombok.Builder;

@Builder
public class SchoolDto {

    private Long SchoolId;
    private String School_Name;
    private String School_Id;
    private String Admin_name;
    private String Admin_Emp_No;
    private String Postal_Address;
    private String Street_name;
    private String Suburb;
    private String City;
    private String Postal_code;
}
