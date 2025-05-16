public abstract class User {
     private static int id = 0;
     private String name;

     User(String name) {
          this.name = name;
          id++;
     }

     public static int getId() {
          return id;
     }

     public static void setId(int id) {
          User.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
}
