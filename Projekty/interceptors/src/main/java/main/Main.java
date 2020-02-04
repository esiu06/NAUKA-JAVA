package main;

import beans.User;
import dao.UserDao;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        UserDao userDao = container.select(UserDao.class).get();
        User user = userDao.read(25L);
        System.out.println(user);

        container.shutdown();
    }
}
