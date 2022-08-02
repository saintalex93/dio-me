import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Book } from './product-item/model/Book';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductListService {

  httpOptions = {
    Headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }

  constructor(private httpClient: HttpClient) { }


  getBooks(): Observable<Book> {
    return this.httpClient.get<Book>('http://localhost:8100')
  }

}
