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
}
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  template: `
  <input
    type="text"
    [placeholder]="placeholder"
    (keyup)="updateSearch($event.target.value)"
  />`,
  styleUrls: ['./home.component.css']
})


export class HomeComponent implements OnInit {

  title(title: any) {
    throw new Error('Method not implemented.');
  }
  POSTS: any;
  page: number = 1;
  count: number = 0;
  tableSize: number = 30;
  tableSizes: any = [3, 6, 9, 12];
  ngOnInit(): void {

  }

  onTableDataChange(event: any) {
    this.page = event;

  }
  onTableSizeChange(event: any): void {
    this.tableSize = event.target.value;
    this.page = 1;

  }

  schools: School[] = schoolsData;


 
}


