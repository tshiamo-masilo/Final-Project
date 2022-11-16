
  @Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
  )}
export class LoginComponent implements OnInit {
  public loginForm!: FormGroup;
  


  constructor(
    private formBuilder: FormBuilder,
    private loginApi: LoginService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: new FormControl("", Validators.required),
      password: new FormControl("", Validators.required),
    })
    }

  login() {

    this.loginApi.onLogin(this.loginForm.value).subscribe((res:any)=>{
      alert("Successfully login!");
      this.loginForm.reset();
      this.router.navigate(['home']);
    })
    
  }
  onSubmit() {
    if (this.loginForm.valid) {
    } else {
      ValidateForm.validateAllformfields(this.loginForm);
    }
  }
}
