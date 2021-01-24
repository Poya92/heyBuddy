import java.util.ArrayList;

public class UserHandler {

    private ArrayList<User> userList;

    public UserHandler(ArrayList<User> userList) {
        importUserList(userList);
    }

    private void importUserList (ArrayList<User> userList) {
        this.userList = userList;
    }

    private ArrayList<User> findMatchingUsers() {
    }

    private void notifyMatchingUsers() {
    }
}
