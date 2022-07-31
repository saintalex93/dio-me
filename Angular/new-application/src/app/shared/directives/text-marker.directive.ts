import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appTextMarker]'
})
export class TextMarkerDirective implements OnInit {

  @Input() backgroundColor: string = "yellow"
  @Input() textColor: string = "white"

  constructor(private element: ElementRef) {

  }
  ngOnInit(): void {
    this.changeBackground()
  }


  private changeBackground(color: string = 'yellow') {
    this.element.nativeElement.style.backgroundColor = this.backgroundColor || color;
    this.element.nativeElement.style.color = this.textColor;
    this.element.nativeElement.style.fontWeight = "bold";
  }
}
