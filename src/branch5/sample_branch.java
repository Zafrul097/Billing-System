package branch5;

public class sample_branch {
    int id;
    float cgpa;
    String name,address;


    string car_no,blood_group;

    public sample_branch(string car_no, string blood_group) {
        this.car_no = car_no;
        this.blood_group = blood_group;
    }

    public string getCar_no() {
        return car_no;
    }

    public void setCar_no(string car_no) {
        this.car_no = car_no;
    }

    public string getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(string blood_group) {
        this.blood_group = blood_group;
      
    int income;

    public sample_branch(int income) {
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public sample_branch(int id, float cgpa, String name, String address) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
