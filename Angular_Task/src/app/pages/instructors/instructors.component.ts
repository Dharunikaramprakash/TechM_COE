import { Component } from '@angular/core';

@Component({
  selector: 'app-instructors',
  templateUrl: './instructors.component.html',
  styleUrls: ['./instructors.component.css']
})
export class InstructorsComponent {
  instructors = [
    {
      name: 'Ajith Lal',
      title: 'Senior Web Developer',
      description: 'Ajith Lal is a full-stack developer with 10+ years of experience in web technologies, specializing in JavaScript, React, and Node.js.',
      courses: ['Web Development', 'React', 'Node.js'],
      rating: 4.5,
      image: 'assets/images/ajithlal.jpg'
    },
    {
      name: 'Zehra Gunes',
      title: 'Data Science Expert',
      description: 'With a PhD in Data Science, Zehra Gunes has trained thousands of students in Python, Machine Learning, and AI technologies.',
      courses: ['Machine Learning', 'Python', 'AI'],
      rating: 5.0,
      image: 'assets/images/zehra.jpg'
    },
    {
      name: 'Priyanka',
      title: 'Python Expert',
      description: 'Priyanka is a renowned professor with 20+ years of experience, specializing in Python and Software Engineering.',
      courses: [ 'data analysis','machine learning','automation'],
      rating: 4.6,
      image: 'assets/images/priyanka.jpg'
    },
    {
      name: 'Tiji Raju',
      title: 'Cybersecurity Specialist',
      description: 'Tiji Raju is a cybersecurity expert with a background in ethical hacking, network security, and cyber threat intelligence, helping companies secure their systems.',
      courses: ['Cybersecurity', 'Ethical Hacking', 'Network Security'],
      rating: 4.7,
      image: 'assets/images/tiji.jpg'
    },
    {
      name: 'Preeti Singh',
      title: 'Cloud Computing Expert',
      description: 'Preeti Singh is a cloud architect with deep expertise in AWS, Azure, and Google Cloud, specializing in DevOps and scalable cloud infrastructures.',
      courses: ['AWS', 'Azure', 'DevOps'],
      rating: 4.9,
      image: 'assets/images/preeti.jpg'
    }
  ];


  getStars(rating: number | null): number[] {
    return rating !== null ? Array(Math.floor(rating)).fill(0) : [];
  }

  hasHalfStar(rating: number | null): boolean {
    return rating !== null && rating % 1 !== 0;
  }

  goBack() {
    window.history.back();
  }
}
