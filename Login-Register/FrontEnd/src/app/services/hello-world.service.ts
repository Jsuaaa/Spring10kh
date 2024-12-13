import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = 'http://localhost:8080/';

@Injectable({
  providedIn: 'root'
})
export class HelloWorldService {

  constructor(private http:HttpClient) { }

  helloWorld():Observable<any>{
    return this.http.get<string>(BASIC_URL + 'greeting');
  }

}
