import { Injectable } from '@angular/core';
 
import { HttpClient } from '@angular/common/http';

 
@Injectable()
export class AppService {
  constructor(private http: HttpClient) { }
 
getCurrentDate(){
  return this.http.get('http://localhost:8080/getCurrentDate');
}

getSystemStats(){  
  return this.http.get('http://localhost:8080/getSystemStats');
}

}
