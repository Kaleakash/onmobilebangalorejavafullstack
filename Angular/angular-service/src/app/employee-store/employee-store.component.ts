import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-store',
  templateUrl: './employee-store.component.html',
  styleUrls: ['./employee-store.component.css']
})
export class EmployeeStoreComponent implements OnInit {
  msg:string;
  constructor(public empService:EmployeeService) { }//DI

  ngOnInit() {
  }
  storeEmpInfo(empObj){
    console.log(empObj);
    this.empService.storeEmployeeDetails(empObj).
    subscribe(data=>this.msg=data);
  }
}
