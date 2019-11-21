import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';  //
import {FormsModule} from '@angular/forms';   //
import { AppComponent } from './app.component';
import { FakeComponentComponent } from './fake-component/fake-component.component';
import { EmployeeStoreComponent } from './employee-store/employee-store.component';

@NgModule({
  declarations: [
    AppComponent,
    FakeComponentComponent,
    EmployeeStoreComponent
  ],
  imports: [
    BrowserModule,HttpClientModule, FormsModule  //
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
