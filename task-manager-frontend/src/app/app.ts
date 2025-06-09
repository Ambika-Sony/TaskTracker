import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TasksComponent } from './tasks/tasks.component'; // <--- ADD THIS LINE

@Component({
  selector: 'app-root',
  standalone: true, // This is crucial for standalone components
  imports: [
    RouterOutlet,
    TasksComponent // <--- ADD TasksComponent HERE
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'task-manager-frontend';
}