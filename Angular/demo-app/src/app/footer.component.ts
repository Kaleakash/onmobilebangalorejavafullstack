import {Component} from '@angular/core';

@Component({
  selector:"footer-component",
  template:`

  <h2> {{msg}}</h2>

`,
styles:[`h2{color:blue}`]
})
export class FooterComponent {
  msg:string=`Footer



  Message`;
}
