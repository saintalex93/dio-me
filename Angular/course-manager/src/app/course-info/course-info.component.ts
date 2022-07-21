import {Component, OnInit} from "@angular/core";
import {ActivatedRoute} from "@angular/router";
import {Course} from "../courses/course";
import {CourseService} from "../courses/course.service";
import Swal from 'sweetalert2'

@Component({
  templateUrl: "course-info.component.html"
})

export class CourseInfoComponent implements OnInit {

  course: Course = new Course()

  constructor(private activatedRoute: ActivatedRoute, private courseService: CourseService) {
  }

  ngOnInit(): void {
    if (this.activatedRoute.snapshot.paramMap.get('id')) {
      this.courseService.retrieveById(Number(this.activatedRoute.snapshot.paramMap.get('id'))).subscribe({
        next: course => this.course = course
      })
    }
  }

  save(): void {
    this.courseService.save(this.course).subscribe({
      next: course => Swal.fire({
        icon: 'success',
        title: 'Sucesso!',
        text: `O curso ${course.name} foi salvo com sucesso`,
        confirmButtonColor: '#0d6efd'
      }),
      error: err => Swal.fire({
        icon: 'error',
        title: 'Erro!',
        text: `Erro: ${err}`,
        confirmButtonColor: '#0d6efd'
      })
    })
  }

}
