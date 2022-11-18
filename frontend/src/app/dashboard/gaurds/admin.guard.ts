import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { Route } from '@angular/router';
import { TokenService } from 'app/user/services/token.service';
import { contants } from 'app/global-functions/contants';

@Injectable({
  providedIn: 'root'
})
export class AdminGuard implements CanActivate {
  role: any;
  constructor(private tokenService:TokenService,private router:Router) {
    //this.role = sessionStorage.getItem(contants.role);
  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      this.tokenService.getFromSessionStorage();
      if ("Admin" === sessionStorage.getItem(contants.role) ||"ADMIN" === sessionStorage.getItem(contants.role)) {
        return true;
      } else {
        this.router.navigate(['/home']);
        return false;
      }
      //return true;
  }
  
}

/*
this.tokenService.getFromSessionStorage();
      if(this.tokenService.isTokenExpired()){
        sessionStorage.clear();
        this.router.navigate(['/login']);
        return false;
      }else{
        return true;
      }
  }


import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { contants } from '../global/global.contants';
import { Roles } from '../global/roles';

@Injectable({
  providedIn: 'root'
})
export class AdminGuard implements CanActivate {

  role: string | null;

  constructor(private router: Router) {
    this.role = sessionStorage.getItem(contants.role);
  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

    if (this.role === Roles.Admin || this.role === Roles.Super_Admin) {
      return true;
    } else {
      this.router.navigate(['/dashboard']);
      return false;
    }

  }

}
*/
