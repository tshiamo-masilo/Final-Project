import { Component, OnInit } from "@angular/core";
@Component({
  selector: "app-application",
  templateUrl: "./application.component.html",
  styleUrls: ["./application.component.css"],
})
export class ApplicationComponent implements OnInit {
  ngOnInit(): void {}
}

@Component({
  selector: "app-application",
  templateUrl: "./application.component.html",
})
export class AppApplication {
  application: any;

  Submit() {
    console.log("form submitted");
  }

}
