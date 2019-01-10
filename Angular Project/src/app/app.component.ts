import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
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

	// events on slice click
	public chartClicked(e: any): void {
		console.log(e);
	}

	// event on pie chart slice hover
	public chartHovered(e: any): void {
		console.log(e);

	}
}