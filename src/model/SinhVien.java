
package model;


public class SinhVien {
    
    private String id, name, major;
    private boolean gender;

    public SinhVien(String id, String name, String major, boolean gender) {
        this.id = id;
        this.name = name;        
        this.major = major;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name  + ", major=" + major  + ", gender=" + gender+'}';
    }
    
    
  
  
    
}
