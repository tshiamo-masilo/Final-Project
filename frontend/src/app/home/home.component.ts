import { Component,OnInit, } from '@angular/core';
import schoolsData from '../schools.json';




@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})



export class HomeComponent implements OnInit {

  schools: any[] = schoolsData;
  schoolFilter: any = { Institution_Name: '' };
  suburbFilter: any = {Suburb: ''};

  //  --PAGINATE--
  
  POSTS: any;
  page: number = 1;
  count: number = 0;
  tableSize: number = 20;
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

  //  --/PAGINATE--

  transform(list: any[], value: string) {
  

    return value ? list.filter(file => file.Suburb === value) : list;
  }



}

