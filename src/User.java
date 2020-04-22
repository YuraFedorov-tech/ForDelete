
/*
 *
 *@Data 22.04.2020
 *@autor Fedorov Yuri
 *@project Новая папка
 *
 */

public class User {
    private String name;
    private  boolean isApprove;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", isApprove=" + isApprove +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }

    public User(String name, boolean isApprove) {
        this.name = name;
        this.isApprove = isApprove;
    }
}
