package com.procasi.alms.core.persistence.dao.daoimplementation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.procasi.alms.core.bean.User;
import com.procasi.alms.core.persistence.dao.UserDao;
import com.procasi.alms.core.util.HibernateUtil;

public class UserDaoImplementation implements UserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {

		// Criteria criteria =
		// getSessionFactory().getCurrentSession().createCriteria(User.class);

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		System.out.println("antes de criterria user");
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", 1L));
		User user = (User) criteria.uniqueResult();
		System.out.println("response");
		System.out.println(user.getIdUser());
		System.out.println(user.getName());
		System.out.println(user.getStatus());
		System.out.println(user.getProfile());

		Criteria criteria2 = session.createCriteria(User.class);
		List<User> results = criteria2.list();
		System.out.println("size in dao:" + results.size());
		for(User u : results) {
			System.out.println("1:" + u.getName());
			System.out.println("2:" + u.getIdUser());
			System.out.println("3:" + u.getProfile());
		}
		return results;

		// List<E> list = getHibernateTemplate().find(queryString)("=?");
		// return (Stock)list.get(0);
	}

}
