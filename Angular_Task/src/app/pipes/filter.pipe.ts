import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {
  transform(courses: any[], minDuration: number): any[] {
    if (!courses || !minDuration) {
      return courses;
    }

    return courses.filter(course => course.duration >= minDuration);
  }
}
