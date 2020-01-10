public class Task implements Priority{

    private String name;
    private int priority;
    private boolean isComplete;

    public Task(String name, int priority){
        this.name = name;
        isComplete = false;
        this.priority = priority;
    }

   public void setPriority(int priorityLevel){
        this.priority = priorityLevel;
   }

   public int getPriority(){
        return priority;
   }

   public void doTask(){
     System.out.println("doing task");
     isComplete = true;
     this.setPriority(-1);
   }

    @Override
    public String toString() {
        return "task: "+name+"\nPriority: "+this.getPriority();
    }
}
