import {Course} from "./course";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable(
  {
    providedIn: 'root'
  }
)
export class CourseService {

  private courseURL: string = "http://localhost:3100/api/courses"

  constructor(private httpClient: HttpClient) {
  }

  retrieveAll(): Observable<Course[]> {
    return this.httpClient.get<Course[]>(this.courseURL);
  }

  retrieveById(id: number): Observable<Course> {
    return this.httpClient.get<Course>(`${this.courseURL}/${id}`);
  }

  save(course: Course): Observable<Course> {
    if (course.id) {
      return this.httpClient.put<Course>(`${this.courseURL}/${course.id}`, course);
    }
    return this.httpClient.put<Course>(`${this.courseURL}`, course);
  }


  deleteById(courseId:number):Observable<any>{
    return this.httpClient.delete<any>(`${this.courseURL}/${courseId}`);
  }
}


