package com.leiyu.springREST.service;

import com.leiyu.springREST.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class RegisterService
{
    @PersistenceContext
    private EntityManager entityManager;

    public RegisterService() {}

    public void createUser(User user)
    {
        this.entityManager.persist(user);
        this.entityManager.flush();
    }

    public User findUserByName(String username)
    {
        String hql = "from User where Username = :username";
        List<User> list = this.entityManager.createQuery(hql).setParameter("username", username).getResultList();
        if ((list == null) || (list.size() == 0)) {
            return null;
        }
        return (User)list.get(0);
    }
}
