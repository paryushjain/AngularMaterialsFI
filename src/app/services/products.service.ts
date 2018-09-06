import { Injectable, ApplicationRef, ChangeDetectorRef } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/product';
import { environment } from '../../environments/environment';


@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private product: Product;
  private productCart: Product[];
  private favproductCart: Product[];
  private headers: HttpHeaders = new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded',
    'Access-Control-Allow-Origin': '*'
  });
  constructor(private http: HttpClient) {
    this.productCart = [];
    this.favproductCart = [];
  }
  getProductTypesList(): any {
    return this.http.get<Product[]>('http://localhost:3000/productList');
  }
  

 

  addProduct(product: Product): Observable<Product> {
    console.error(product);
    return this.http.post<Product>(
      environment.serverUrl + '/addproduct',
      JSON.stringify({ product}),
      { headers: this.headers }
    );
  }

  
}
