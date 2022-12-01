import { HttpClient } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import {
  FormBuilder,
} from "@angular/forms";
import { environment } from "environments/environment";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent implements OnInit {
  [x: string]: any;
  title = "Project-FrontEnd";

  private api: string = environment.apiUrl;

  constructor(
    public http: HttpClient,
    private formBuilder: FormBuilder
  ) {}
  ngOnInit(): void {}
  public ping() {
    this.http.get(`${this.api}/login`).subscribe(
      (data) => console.log(data),
      (err) => console.log(err)
    );
  }
}