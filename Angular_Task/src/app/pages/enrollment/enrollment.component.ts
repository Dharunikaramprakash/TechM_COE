import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-enroll',
  templateUrl: './enrollment.component.html',
  styleUrls: ['./enrollment.component.css']
})
export class EnrollComponent implements OnInit {
  courseName: string = '';
  formSubmitted = false; 
  enrollData = { name: '', email: '', phone: '', course: '' }; 
  courses: string[] = [
    "Big Data", 
    "Machine Learning & AI", 
    "Cybersecurity & Ethical Hacking", 
    "Python for Data Science",
    "Full Stack Development",
    "Cloud Computing and DevOps"
  ]; 

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      this.courseName = params['course'] || 'Unknown Course';
      this.enrollData.course = this.courseName; 
    });
  }

  onSubmit() {
    alert("Your form has been submitted successfully! Our team will contact you shortly.");
    
    console.log("Form Submitted:", this.enrollData);
    
    
    this.formSubmitted = true;

    
    this.enrollData = { name: '', email: '', phone: '', course: '' };

    
    setTimeout(() => {
      this.formSubmitted = false; 
    }, 5000);
  }

  goBack() {
    window.history.back();
  }
}
