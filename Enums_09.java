enum Levels{
    EASY,
    MEDIUM,
    HARD
}
class setDifficulty{
    Levels level;
    public setDifficulty(Levels level){
        this.level=level;
    }
    public void setDiff(){
        switch(level){
            case EASY:
                System.out.println("Easy Mode");
                break;
            case MEDIUM:
                System.out.println("Medium Mode");
                break;
            case HARD:
                System.out.println("Hard Mode");
                break;
            default:
                System.out.println("No difficulty");
                break;
        }
    }
}

class Enums_09 {
    public static void main(String[] args) {
        setDifficulty sd1=new setDifficulty(Levels.EASY);
        sd1.setDiff();
    }
}
