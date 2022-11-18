import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { debounceTime, Subject } from 'rxjs';
import schoolsData from '../schools.json';


interface School {
  NatEmis: Number;
  Institution_Name: String;
  Status: String;
  Sector: String;
  Phase: String;
  EIRegion: String;
  EIDistrict: String;
  Addressee: String;
  // Town_City: String;
  StreetAddress: String;
  PostalAddress: String;
  // GIS_Longitude: String;
  // GIS_Latitude: String ;
  // Telephone: String;
  // Facsimile: String ;
  cellno: String;
  E_Mail: String;
  // RegistrationDate: String ;
  Urban_Rural: String;
  Full_Service_School: String;
  School_Prototype_size: String;
  ProvinceCD: Number
}
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  template: ``,
  styleUrls: ['./home.component.css']
})


export class HomeComponent implements OnInit {

  // POSTS: any;
  // page: number = 1;
  // count: number = 0;
  // tableSize: number = 30;
  // tableSizes: any = [3, 6, 9, 12];
  // ngOnInit(): void {

  // }

  // onTableDataChange(event: any) {
  //   this.page = event;

  // }
  // onTableSizeChange(event: any): void {
  //   this.tableSize = event.target.value;
  //   this.page = 1;

  // }

  schools: School[] = schoolsData;

//separate


  SearchTag!: String;
  files = [];
  main: {}[] = [];  
  p!: number;

  ngOnInit() {
    for (let i = 1; i <= 100; i++) {
      // this.files.push(this.createFile(i));
    }

    this.main = this.files.slice();
  }



  onPageChange(page: number) {
    this.p = page;
  }

  private createFile(key: String): {} {
    return { 
      Institution_Name: `Institution_Name ${key}`, 
      Sector: `Sector ${key}`, 
      Phase: `Phase ${key}`, 
      StreetAddress: `StreetAddress ${key}`
    };
  }






  

 
}



