import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'printList',
  // Ao alterar a variável, ele faz a chamada do pipe novamente.
  pure: false
})
export class PrintListPipe implements PipeTransform {

  transform(value: string[], ...args: unknown[]): unknown {
    if (value.length > 0) {
      return value.join(' ')
    }
    return "";
  }

}
