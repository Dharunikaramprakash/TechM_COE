import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './pages/home/home.component';
import { CoursesComponent } from './pages/courses/courses.component';

import { RatingPipe } from './rating.pipe';
import { RouterModule } from '@angular/router';
import { EnrollComponent } from './pages/enrollment/enrollment.component';
import { FormsModule } from '@angular/forms';
import { InstructorsComponent } from './pages/instructors/instructors.component';
import { HttpClientModule,provideHttpClient,withFetch } from '@angular/common/http';
import { FilterPipe } from './pipes/filter.pipe';
import { SortPipe } from './pipes/sort.pipe';
@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    HomeComponent,
    EnrollComponent,
    InstructorsComponent,
    FilterPipe,
    SortPipe,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
   
  ],
  providers: [
    provideClientHydration(),
    provideHttpClient(withFetch())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
