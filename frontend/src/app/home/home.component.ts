import { Component, OnInit } from '@angular/core';
import schoolsData from '../schools.json';

interface School {  
        NatEmis: Number ;
        Institution_Name: String ;
        Status: String ;
        Sector: String ;
        Phase: String ;
        EIRegion: String ;
        EIDistrict: String;
        Addressee: String;
        Town_City: String;
        StreetAddress: String ;
        PostalAddress: String;
        // GIS_Longitude: Number;
        // GIS_Latitude: Number ;
        // Telephone: String;
        // Facsimile: String ;
        cellno: String ;
        E_Mail: String ;
        // RegistrationDate: String ;
        Urban_Rural: String;
        Full_Service_School: String;
        School_Prototype_size: String ;
}  
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})


export class HomeComponent implements OnInit {

  constructor() { }
  ngOnInit(): void {
  }

  schools:School[] = schoolsData;  

}
