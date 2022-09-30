import { Component } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'UIChallenge';
  name: string = "Test";
  date : any;
  stats : string;
  constructor(private appService: AppService) { }

  ngOnInit() {

    this.appService.getCurrentDate().subscribe((data: any[])=>{
      this.date = data;
    }) ; 

    this.appService.getSystemStats().subscribe((data: any)=>{
      this.stats = data;
    }) ;
  }
}
