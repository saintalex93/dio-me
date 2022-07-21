import {Component, OnInit} from "@angular/core";
import {Course} from "./course";
import {CourseService} from "./course.service";
import Swal from 'sweetalert2'

@Component({
  templateUrl: './course-list.template.html',
  styles: ["td{vertical-align: middle}"]
})
export class CourseListComponent implements OnInit {
  constructor(private courseService: CourseService) {
  }

  _courses: Course[] = []
  _filterBy: string = "";
  title: string = "Course List"
  filteredCourses: Course[] = []

  ngOnInit(): void {
    this.retrieveAll()
  }

  retrieveAll(): void {
    this.courseService.retrieveAll().subscribe({
      next: courses => {
        this._courses = courses
        this.filteredCourses = this._courses
      },
      error: err => console.log('Error: ', err)
    })
  }

  set filter(value: string) {
    this._filterBy = value
    this.filteredCourses = this._courses.filter((course: Course) => course.name.toLowerCase().indexOf(this._filterBy.toLowerCase()) > -1)
  }

  deleteById(courseId: number): void {
    this.courseService.deleteById(courseId).subscribe({
      next: () => {
        Swal.fire({
          icon: 'success',
          title: 'Sucesso!',
          text: `O curso foi deletado com sucesso`,
          confirmButtonColor: '#0d6efd'
        });
        this.retrieveAll();
      },

      error: err =>  Swal.fire({
        icon: 'error',
        title: 'Erro!',
        text: `Erro ao deletar o curso ${err}`,
        confirmButtonColor: '#0d6efd'
      })
    })
  }

  get filter() {
    return this._filterBy;
  }
}
