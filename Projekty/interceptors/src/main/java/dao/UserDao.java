package dao;

import beans.User;

public interface UserDao {
    public User read(long id);
    public boolean save(User user);
}
