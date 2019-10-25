import { Component } from '@angular/core';

@Component({
  selector:"header-component",
  templateUrl:"./header.component.html"
})
export class HeaderComponent {
  msg:string="Welcome to Angular with header message";
}
