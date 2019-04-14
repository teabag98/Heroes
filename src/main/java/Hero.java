public class Hero {
    private String mName;
    private int mAge;
    private String mWeakness;
    private String mPower;
    private int mId;
    private static List<Hero> instances = new ArrayList<Hero>();


    public Hero(String name){
        mName=name;
    }

    public String getName(){
        return mName;
    }

}