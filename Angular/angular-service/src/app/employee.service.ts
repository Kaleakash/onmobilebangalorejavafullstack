import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(public http:HttpClient) { }

  storeEmployeeDetails(empObj):Observable<string>{
   return this.http.
   post("http://localhost:8080/storeEmployeeInfo",empObj,
   {responseType:'text'}); 
  }
}
