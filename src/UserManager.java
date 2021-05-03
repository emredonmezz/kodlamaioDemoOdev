public class UserManager {
    public void addUser(User user){
        System.out.println(user.fullName + "Kullanıcı oluşturuldu");
    }
    public void deleteUser(User user){
        System.out.println(user.fullName + "Kullanıcı silindi");
    }
    public void updateUser(User user){
        System.out.println(user.fullName + "Kullanıcı güncellendi");
    }
}
