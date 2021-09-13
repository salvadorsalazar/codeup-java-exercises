public class Fighter{
    //instance variables
        public String name;//can be change to private as well , but keeping informat to view later as example.
    //intellij formats autaomatically : getters and setters
        private int hitPoints;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int maxDamage;//can be change to private as well , but keeping informat to view later as example.
    //intellij formats autaomatically : getters and setters

    //methods
    public void printStats(){
            System.out.println(name + " has " + hitPoints +
            " hit points and can do "+ maxDamage + " damage");

        }


        public void battleRoar(){
            System.out.println("I am " + name +", prepare to die!");

        }
//YOU CALL A STATIC ETHOD WITH A CLASS NAME (E.G. D20.ROLL20()
    //BUT YOU CAN CALL NON-STATIC METHOD USING REFERNCE VARUABLE NAME (E.G.KILLORE.ATTACKROLL()
        public int attackRoll(){
        return D20.roll20();
        }


       //default contructor
        public Fighter(){
         }

         public  Fighter(String name,int hitPoints,int maxDamage){
            System.out.println(" a new fighter enters");
            this.name = name;
            this.hitPoints=hitPoints;
            this.maxDamage = maxDamage;
            this.printStats();
        }


//  -------------      VISIBILTY-----------










//---------DONT DO THIS : PUT THE MAIN METHOD IN THE CLASS DEFINTION
//                   public static void main(String[] args){
//                        Fighter arata = new Fighter();
//                        arata.name = "Arata";
//                        arata.hitPoints = 17;
//                        arata.maxDamage = 14;
//                        arata.printStats();
//                   }




    }

