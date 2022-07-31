import { PersonService } from './shared/services/person.service';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TextMarkerDirective } from './shared/directives/text-marker.directive';
import { ListPersonsComponent } from './shared/components/list-persons/list-persons.component';

@NgModule({
  declarations: [
    AppComponent,
    TextMarkerDirective,
    ListPersonsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
