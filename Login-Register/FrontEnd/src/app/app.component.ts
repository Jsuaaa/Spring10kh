import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HelloWorldService } from './services/hello-world.service';
import { response } from 'express';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'login-register';
  text:any;

  constructor(private helloWorldService:HelloWorldService){}

  ngOnInit(): void {

  }
}

    // this.helloWorldService.helloWorld().subscribe({
    //   next: (response)=>{
    //     console.log(response);
    //   }
    // })