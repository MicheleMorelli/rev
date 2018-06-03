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

            Map<String, Map<String,Integer>> courses = new HashMap<>();

            courses.put("cs", new HashMap<String,Integer>());
            courses.put("eng", new HashMap<String,Integer>());
            courses.put("mng", new HashMap<String,Integer>());
            courses.get("cs").put("Computer Science", 799);
            courses.get("cs").put("Computing", 600);
            courses.get("cs").put("Information Systems", 300);
            courses.get("eng").put("Mechanical", 100);
            courses.get("eng").put("Civil", 150);
            courses.get("mng").put("Management", 800);

            System.out.println(courses);
            System.out.println(courses.keySet().size() + " departments.");
            System.out.println(courses.get("cs").size() + " courses offered by the comp department");
            for (String i : courses.get("eng").keySet()) {
                if (i.equals("Civil")) {
                    System.out.println(courses.get("eng").get(i) + " students in the Civ eng etc. ");
                }
            }

            courses.get("cs").put("Data Management", 100);
            System.out.println(courses.get("cs"));
        }

}
