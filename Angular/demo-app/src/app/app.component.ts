import { Employee } from './employee';
import { Component } from '@angular/core';

@Component({
  selector: 'abc',       //h2, p, form, user-defined tags
  templateUrl: './app.component.html',    // may be local or external file
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = 'demo-app';
  name:string="Ravi Kumar";
  empId:number=100;
  salary:number=25000;
 empRef:Employee;
empInfo:Array<Employee>;
 constructor() {
   this.empRef = new Employee(123,"Ajay",16000);
   this.empInfo=new Array();
  let emp1 = new Employee(1,"Balaji",14000);
  let emp2 = new Employee(2,"Ramu",16000);
  let emp3 = new Employee(3,"Mahesh",18000);
  let emp4 = new Employee(4,"Rajesh",20000);
  this.empInfo.push(emp1);
  this.empInfo.push(emp2);
  this.empInfo.push(emp3);
  this.empInfo.push(emp4);
 }


  displayEmployeeInfo():string {
    return "Welcome to Angular 8";
  }

}


