import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChartsModule } from 'ng2-charts/ng2-charts';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import {MatDividerModule} from '@angular/material/divider';




import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MainNavComponent } from './main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatButtonModule, MatInputModule, MatSelectModule, MatRadioModule, MatCardModule, MatGridListModule, MatMenuModule, MatTreeModule } from '@angular/material';
import { ReactiveFormsModule } from '@angular/forms';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { ProfileComponent } from './profile/profile.component';
import { Dashboard2Component } from './dashboard2/dashboard2.component';
import { SideNavComponent } from './side-nav/side-nav.component';
import { PieChartComponent } from './pie-chart/pie-chart.component';
import { LibraryFoldersComponent } from './library-folders/library-folders.component';
import { LibraryComponent } from './library/library.component';
import { FormComponent } from './form/form.component';




@NgModule({
  declarations: [
    AppComponent,
    MainNavComponent,
    DashboardComponent,
    LogoutComponent,
    ProfileComponent,
    Dashboard2Component,
    SideNavComponent,
    PieChartComponent,
    LibraryFoldersComponent,
    LibraryComponent,
    FormComponent,

  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    MatSidenavModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatListModule,
    AppRoutingModule,
    LayoutModule,
    MatButtonModule,
    MatInputModule,
    MatSelectModule,
    MatRadioModule,
    MatCardModule,
    ReactiveFormsModule,
    MatGridListModule,
    MatMenuModule,
    MatDividerModule,
    RouterModule,
    ChartsModule,
    MatTreeModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  
 }
