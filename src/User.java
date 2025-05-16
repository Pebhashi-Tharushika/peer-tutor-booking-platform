public abstract class User {
     private int id = 0;
     private String name;
     private static int nextId = 1;

     User(String name) {
          this.name = name;
          this.id = nextId++;
     }

     abstract String getRole();

     @Override
     public String toString() {
          return getRole() + "[ID=" + id + ", name=" + name + ']';
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
}
