package q5;
import java.util.*;


public class Q1 {

        public static void main(String[] args) {
            new Q1().run();
        }
        class Course {
            private String name;
            private int id;
            Course(String name, int id) {
                this.name = name;
                this.id = id;
            }

            @Override
            public String toString() {
                return this.name;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }
        public void run() {

            Map<String, ArrayList<Course>> courses = new HashMap<>();

            courses.put("cs", new ArrayList<Course>());
            courses.put("eng", new ArrayList<Course>());
            courses.put("mng", new ArrayList<Course>());
            courses.get("cs").add(new Course("Computer Science", 799));
            courses.get("cs").add(new Course("Computing", 600));
            courses.get("cs").add(new Course("Information Systems", 300));
            courses.get("eng").add(new Course("Mechanical", 100));
            courses.get("eng").add(new Course("Civil", 150));
            courses.get("mng").add(new Course("Management", 800));

            System.out.println(courses);
            System.out.println(courses.keySet().size() + " departments.");
            System.out.println(courses.get("cs").size() + " courses offered by the comp department");
            for (Course i : courses.get("eng")) {
                if (i.getName().equals("Civil")) {
                    System.out.println(i.getId() + " students in the Civ eng etc. ");
                }
            }

            courses.get("cs").add(new Course("Data Management", 100));
            System.out.println(courses.get("cs"));


        }

}
