import { PersonService } from './shared/services/person.service';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { TextMarkerDirective } from './shared/directives/text-marker.directive';
import { ListPersonsComponent } from './shared/components/list-persons/list-persons.component';
import { ListApiComponent } from './shared/components/list-api/list-api.component';

@NgModule({
  declarations: [
    AppComponent,
    TextMarkerDirective,
    ListPersonsComponent,
    ListApiComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
