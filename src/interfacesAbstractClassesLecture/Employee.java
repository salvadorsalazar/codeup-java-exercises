package interfacesAbstractClassesLecture;

abstract public class Employee implements Manageable {

    public abstract String doWork();

//    public void somethingElse(){
//        System.out.println("something else");
//    }

    public void onboardWithEmployer(){
        System.out.println("onbaording...");
    }
    public void quit(){
        System.out.println("i quit");
    }


    public abstract void syncUp();
}
