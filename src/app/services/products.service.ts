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
    return this.http.get<Product[]>(environment.clientUrl + '/getProducts');
  }
  addProduct(product) {
    console.log(product);

     this.http.post(
      environment.clientUrl + '/addProduct',
      product).subscribe((response: any) => {
        
        //  sessionStorage.setItem('user', JSON.stringify(response));
          //this.router.navigate(['/dashboard']);
        
        // alert(JSON.stringify(response));
      });
  }

  
}
