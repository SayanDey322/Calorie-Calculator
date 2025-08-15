
public class UserData {
    private String gender;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;


    public UserData(String gender, int age, double weight, double height, String activityLevel) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
    }


    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }
}
