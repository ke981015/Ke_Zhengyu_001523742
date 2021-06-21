package Business;

import Business.Role.Role;
import javax.swing.*;

public class Global {
    private static Global instance = null;

    public synchronized static Global getInstance(){
        if (instance == null){
            instance = new Global();
        }

        return instance;
    }

    private Role user; // current login user

    private JFrame frame;

    public Role getUser() {
        return user;
    }

    public void setUser(Role user) {
        this.user = user;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }


    public void login(Role user){
        this.user = user;
    }

    public void logout(){
        this.user = null;
        Router.getInstance(null).back(-1);
    }
}
