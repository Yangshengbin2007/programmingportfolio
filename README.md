# Programming Portfolio 2024–2026 | Shengbin Yang
Email: yangshengbin821@gmail.com  
Current High School: Skyline High School — projected graduation 2026

## Certifications / Testing
- Computer Programming 1 — course completion (Skyline HS)
  - Screenshot: https://github.com/Yangshengbin2007/programmingportfolio/blob/main/Screenshot%202025-05-07%20at.jpg
- Computer Programming 2 — course completion
  - Screenshot: https://github.com/Yangshengbin2007/programmingportfolio/blob/main/images/Screenshot%202025-05-%5C.jpg
- Advanced Computer Programming — course completion
  - Screenshot: https://github.com/Yangshengbin2007/programmingportfolio/blob/main/Screenshot%202026-05-18%20at%2012.15.36%20PM.jpeg
- Notes: Include any future test scores or external certifications here (AP CSA, industry certs, etc.) as they become available.

## Project List (6+ projects)
For each project: title, short description, screenshot, code/GitHub link, key concepts demonstrated.

1. Etch-A-Sketch
   - Description: Keyboard-driven drawing program with save/load ability.
   - Screenshot: (see portfolio images)
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: event handling, graphics, file I/O, methods

2. Ball Bounce
   - Description: Simulates a bouncing ball with collision against boundaries.
   - Screenshot: (see portfolio images)
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: loops, animation timing, simple physics, methods

3. Grade Converter
   - Description: Converts numeric grades to letter grades with validation.
   - Screenshot: (see portfolio images)
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: conditionals, input validation, methods

4. Calculator (Object-oriented GUI)
   - Description: Custom GUI calculator built with object-oriented design and reusable button components.
   - Screenshot: (see portfolio images)
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: classes/objects, GUI components, event-driven programming

5. SpaceGame
   - Description: Collision-based space-themed game using OOP concepts.
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: classes/objects, collision detection, arrays/ArrayLists

6. Shape Tester
   - Description: Interactive shape volume & surface area calculator with multiple shape options.
   - Code / Repo: https://github.com/Yangshengbin2007/programmingportfolio
   - Concepts: user input, methods, classes

7. Group Projects / Advanced Projects
   - sanguinize (group) — fun multiplayer-style game. Repo: https://github.com/fugu2000/sanguinize
   - memetale — personal RPG project with story and mechanics. Repo: https://github.com/Yangshengbin2007/memetale
   - Beather — group weather forecast application (web version included). Repo: https://github.com/Sgandre3890/Beather

## Official Activities
- TSA / school tech events — participated (dates vary — include event names and years).
- Group project roles: collaborator on Beather and sanguinize (2025–2026).
- Tutoring/mentoring: assisted classmates with Java basics and project debugging (2024–2026).
- Include any additional competitions, showcases, or leadership roles as they occur.

## Code Samples (3+)
Short, focused examples included here — link to full files in repos for larger context.

A. Classes & Objects — simple Java class example
```java
// Example: Person.java (classes & objects)
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String toString() { return name + " (" + age + ")"; }
}
```
Full project code: https://github.com/Yangshengbin2007/programmingportfolio

B. Arrays / ArrayLists — sorting & search (Java)
```java
// Example: Utils.java (array sort + linear search)
import java.util.ArrayList;
import java.util.Collections;
public class Utils {
    public static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        Collections.sort(list); // demonstrates use of library sort
        return list;
    }
    public static int linearSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) if (list.get(i) == target) return i;
        return -1;
    }
}
```
Full project code: https://github.com/Yangshengbin2007/programmingportfolio

C. Recursion — example (Java)
```java
// Example: Recursion.java (factorial)
public class Recursion {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
```
Full project context: include recursion samples in course assignments (link above).

## Reflections
- Growth summary: Over 2024–2026 I progressed from basic procedural programs (Grade Converter, Ball Bounce) to OOP and group projects (Calculator, SpaceGame, Beather). I improved debugging, project organization, and collaboration skills.
- Future goals: Learn web backend development, improve testing practices, and contribute to open-source projects.

## Code & Media Notes
- Screenshots and larger code samples are stored in the repo's images and project folders. If an image appears missing, open the repo and view images/ or project folders directly.
- Add or replace screenshots in `/images` to update the visuals on this page.

## Submission Checklist
- [x] Certifications/testing included
- [x] At least 6 projects included
- [x] Official activities included
- [x] At least 3 code samples included
- [x] Reflection completed
- [x] Screenshots/media added (link references present)
- [x] Links to repos included

--- 
Notes for merging:
- Update or replace image links with clearer filenames in the repo's images/ directory if any screenshots are broken.
- Add additional certification scores or external test results as they become available.

