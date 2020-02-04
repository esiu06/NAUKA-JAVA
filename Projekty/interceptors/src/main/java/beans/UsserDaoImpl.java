package beans;

import dao.UserDao;

import java.util.Random;

public class UsserDaoImpl implements UserDao{

    @Override
    @TimeLogger
    public User read(long id) {
        randomPause();
        return new User(id, "Jan", "Kowalski");
    }

    @Override
    public boolean save(User user) {
        return true;
    }

    private void randomPause() {
        int pause = new Random().nextInt(1000);
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
