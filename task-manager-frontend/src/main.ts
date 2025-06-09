// src/main.ts
import { bootstrapApplication } from '@angular/platform-browser';
// appConfig might be present, you can keep it or remove if not used explicitly
// import { appConfig } from './app/app.config';
import { App } from './app/app'; // <--- Correct path to your 'App' component
import { provideHttpClient } from '@angular/common/http'; // <--- THIS LINE IS CRUCIAL

bootstrapApplication(App, { // <--- Bootstrap your 'App' component
  providers: [
    // ... other providers if any, typically appConfig if it exists
    provideHttpClient() // <--- THIS LINE IS CRUCIAL - it tells Angular to provide HttpClient
  ]
}).catch((err) => console.error(err));