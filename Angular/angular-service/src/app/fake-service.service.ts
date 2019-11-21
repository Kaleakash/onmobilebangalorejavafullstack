import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http';// 
import { Observable } from 'rxjs';
import { Fake } from './fake';

@Injectable({
  providedIn: 'root'
})
export class FakeServiceService {

  constructor(public http:HttpClient) { } //DI 

  loadJsonData(): void {
this.http.get("https://jsonplaceholder.typicode.com/todos").
subscribe(data=>console.log(data),
error=>console.log("Error Generated"+error),
()=>console.log("completed"));
  }

  loadJsonTable():Observable<Fake[]> {
    

    return this.http.get<Fake[]>("https://jsonplaceholder.typicode.com/todos");
  }

  storeEmpDetails() {
    this.http.post("",{})
  }
}

