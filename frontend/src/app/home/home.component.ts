import { Component, OnInit } from '@angular/core';
import schoolsData from '../schools.json';
import { PostService } from '../post.service';

interface School {  
        NatEmis: Number ;
        Institution_Name: String ;
        Status: String ;
        Sector: String ;
        Phase: String ;
        EIRegion: String ;
        EIDistrict: String;
        Addressee: String;
        // Town_City: String;
        StreetAddress: String ;
        PostalAddress: String;
        // GIS_Longitude: String;
        // GIS_Latitude: String ;
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

  title(title: any) {
    throw new Error('Method not implemented.');
  }
  POSTS: any;
  page: number = 1;
  count: number = 0;
  tableSize: number = 8;
  tableSizes: any = [3, 6, 9, 12];
  constructor(private postService: PostService) {}
  ngOnInit(): void {
    this.fetchPosts();
  }
  fetchPosts(): void {
    this.postService.getAllPosts().subscribe(
      (response) => {
        this.POSTS = response;
        console.log(response);
      },
      (error) => {
        console.log(error);
      }
    );
  }
  onTableDataChange(event: any) {
    this.page = event;
    this.fetchPosts();
  }
  onTableSizeChange(event: any): void {
    this.tableSize = event.target.value;
    this.page = 1;
    this.fetchPosts();
  }

  schools:School[] = schoolsData; 
}


