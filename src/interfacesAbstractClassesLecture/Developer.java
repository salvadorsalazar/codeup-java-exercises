
package interfacesAbstractClassesLecture;

class Developer extends Employee {

    public String doWork() {
        return "Writing code...";
    }

    @Override
    public void quit() {
        System.out.println("Here is my 2 weeks notice.");
    }

    @Override
    public void syncUp() {
        System.out.println("Schedule Zoom meeting");
    }

    @Override
    public void syncup() {

    }

    @Override
    public void escalateQuestion() {
        System.out.println("Ping in Slack");
    }
}