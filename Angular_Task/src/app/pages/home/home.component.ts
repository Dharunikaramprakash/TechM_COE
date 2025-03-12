import { Component, ElementRef, ViewChild, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements AfterViewInit {
  @ViewChild('carousel', { static: false }) carousel!: ElementRef;

  courses = [
    { title: 'Big Data', image: 'assets/images/bd.jpg' },
    { title: 'Data Science', image: 'assets/images/ds.jpg' },
    { title: 'Full Stack', image: 'assets/images/fs.png' },
    { title: 'Cyber Security', image: 'assets/images/cs.jpg' },
    { title: 'Cloud Computing', image: 'assets/images/cloudcomputing.jpg' }
  ];

  ngAfterViewInit() {
    
    if (!this.carousel) {
      console.error('Carousel element not found!');
    }
  }

  scroll(amount: number) {
    if (this.carousel && this.carousel.nativeElement) {
      this.carousel.nativeElement.scrollBy({ left: amount, behavior: 'smooth' });
    }
  }
}
