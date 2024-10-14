package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> findAll();

    public void saveUser(User user);

    User getUser(Long id);

    public void deleteUser(Long id);
}
