import { Component, OnInit } from '@angular/core';
import { FakeServiceService } from '../fake-service.service';
import { Fake } from '../fake';

@Component({
  selector: 'app-fake-component',
  templateUrl: './fake-component.component.html',
  styleUrls: ['./fake-component.component.css']
})
export class FakeComponentComponent implements OnInit {

  constructor(public fakeService:FakeServiceService) { } //DI
  fakeRecord:Fake[];
  ngOnInit() {
  }
  loadData(){
    this.fakeService.loadJsonData();
  }

  loadDataTableFormat() {
    this.fakeService.loadJsonTable().
    subscribe(data=>this.fakeRecord=data);
    
  }
}
