import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/shared/header/header.component';
import { FooterComponent } from './componentes/shared/footer/footer.component';
import { NavComponent } from './componentes/shared/nav/nav.component';
import { BookstoreComponent } from './componentes/bookstore/bookstore.component';
import { FiltersComponent } from './componentes/bookstore/filters/filters.component';
import { ProductListComponent } from './componentes/bookstore/product-list/product-list.component';
import { ProductItemComponent } from './componentes/bookstore/product-list/product-item/product-item.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    BookstoreComponent,
    FiltersComponent,
    ProductListComponent,
    ProductItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
