import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { TemplateLoginComponent } from './template-login/template-login.component';
import { ReactiveLoginComponent } from './reactive-login/reactive-login.component';
import {UserService} from './user.service';
@NgModule({
  declarations: [
    AppComponent,
    TemplateLoginComponent,
    ReactiveLoginComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
