import { Product } from './../../models/product';
import {Component} from '@angular/core';
import {MatTableDataSource, MatPaginator, MatSort} from '@angular/material';
import { OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';
import { Observable } from 'rxjs/Observable';
import {DataSource} from '@angular/cdk/collections';
import { ViewChild } from '@angular/core';


/**
 * @title Table with filtering
 */
@Component({
  selector: 'app-showproduct',
  styleUrls: ['showproduct.component.css'],
  templateUrl: 'showproduct.component.html',
})


export class ShowproductComponent implements OnInit {
  
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;
  
  dataSource: MatTableDataSource<Product>;
  displayedColumns: string[] = ['product_name', 'product_description', 'product_price','product_quantity','payment_mode'];
  constructor(private productService: ProductsService){
    this.productService.getProductTypesList().subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
      console.log(JSON.stringify(data));
      this.dataSource.sort = this.sort;
     // console.log('datasource is : ' + this.dataSource);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;
   });

  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  
  ngOnInit() {
  }
  
}

// export class ProductsDataSource implements OnInit  {
//   // constructor(private productService: ProductsService) {
//   //   super();
//   // }
//   // connect(): Observable<Product[]> {
//   //   //debugger;
//   //   return this.productService.getProductTypesList();
//   // }
//   // disconnect() {}
//   this.productService.getProducts().subscribe(data => {
//     this.dataSource = new MatTableDataSource(data);
//     this.dataSource.sort = this.sort;
//     // console.log('datasource is : ' + this.dataSource);
//     this.dataSource.paginator = this.paginator;
//     this.dataSource.sort = this.sort;
//   });

