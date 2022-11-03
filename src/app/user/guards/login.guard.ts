import { Injectable } from '@angular/core';
import { TokenService } from '../services/token.service';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginGuard implements CanActivate {
  
  constructor(private tokenService:TokenService,private router:Router){}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    this.tokenService.getFromSessionStorage();
      if(this.tokenService.isTokenExpired()){
        sessionStorage.clear();
        this.router.navigate(['/login']);
        return false;
      }else{
        return true;
      }
  }
  
}

/*=====================Activation of Login gaurd in routing============================
{
    path: 'login', component: LoginComponent
  },
  {
    path: '',
    loadChildren: () => import('./master-layout/master-layout.module').then(m => m.MasterLayoutModule),
    canActivate: [ LoginGuard ]
  },
  {
    path: '**',
    redirectTo: '',
    pathMatch: 'full'
  }
];
*/
