public class index2 {
    private Long id;
    private String name;
    private float marks;
    private int rollNo;
    
    public index2(Long id, String name, float marks, int rollNo) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }
    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public float getMarks() {
        return marks;
    }


    public void setMarks(float marks) {
        this.marks = marks;
    }


    public int getRollNo() {
        return rollNo;
    }


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public static void main(String[] args) {
        index2 ans = new index2(10l, "dinesh", 88.7f, 57);
        System.out.println("id:"+" "+ans.getId());
        System.out.println("Name:"+" "+ans.getName());
        System.out.println("Marks:"+" "+ans.getMarks());
        System.out.println("RollNo:"+" "+ans.getRollNo());
    }
    
}
