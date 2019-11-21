import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import {HeaderComponent} from './header.component'
import {FooterComponent} from './footer.component'
import { AppComponent } from './app.component';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';

@NgModule({
  declarations: [
    AppComponent,HeaderComponent,FooterComponent, Child1Component, Child2Component
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }





