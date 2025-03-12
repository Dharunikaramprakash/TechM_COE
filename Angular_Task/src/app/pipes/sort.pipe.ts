import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sort'
})
export class SortPipe implements PipeTransform {
  transform(items: any[], field: string): any[] {
    if (!items || !field) {
      return items;
    }
    return items.sort((a, b) => b[field] - a[field]);
  }
}
