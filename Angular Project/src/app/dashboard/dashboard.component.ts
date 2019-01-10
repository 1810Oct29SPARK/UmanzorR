import { Component } from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  /** Based on the screen size, switch from standard to one column per row */
  public pieChartLabels: string[] = ["Janurary", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
	public pieChartData: number[] = [21, 39, 10, 14, 16, 29, 22, 44, 66, 33, 32, 23];
	public pieChartType: string = 'pie';
	public pieChartOptions: any = {
		'backgroundColor': [
			"#FF6384",
			"#4BC0C0",
			"#FFCE56",
			"#E7E9ED",
			"#36A2EB",
			"#FF0000",
			"#800000",
			"#FFFF00",
			"#808000",
			"#CD5C5C",
			"#F08080",
			"#FA8072"
		]
	}
  
  constructor(private breakpointObserver: BreakpointObserver) {}
}
