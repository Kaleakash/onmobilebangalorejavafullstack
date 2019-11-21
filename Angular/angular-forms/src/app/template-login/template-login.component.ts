import { Component, OnInit } from '@angular/core';
import {UserService} from '../user.service';

@Component({
  selector: 'app-template-login',
  templateUrl: './template-login.component.html',
  styleUrls: ['./template-login.component.css']
})
export class TemplateLoginComponent implements OnInit {
  msg:string;
  constructor(public userService:UserService) { }
  //pull the object using constructor based 


  ngOnInit() {
  }
  validateUser(formRef) {
    //console.log("Event Generated")
    //console.log(formRef)
    //let obj = new UserService();
    //this.msg = obj.checkUser(formRef);
    this.msg = this.userService.checkUser(formRef);
  }
}
