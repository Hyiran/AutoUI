package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.bfm.util.HibernateUtil;

/**
 * Home object for domain model class Tbinstructionhgmortagage.
 * @see com.bfm.db.bean.Tbinstructionhgmortagage
 * @author Hibernate Tools
 */
public class TbinstructionhgmortagageHome {

	private static final Log log = LogFactory
			.getLog(TbinstructionhgmortagageHome.class);

	private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void persist(Tbinstructionhgmortagage transientInstance) {
		log.debug("persisting Tbinstructionhgmortagage instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tbinstructionhgmortagage instance) {
		log.debug("attaching dirty Tbinstructionhgmortagage instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tbinstructionhgmortagage instance) {
		log.debug("attaching clean Tbinstructionhgmortagage instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tbinstructionhgmortagage persistentInstance) {
		log.debug("deleting Tbinstructionhgmortagage instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tbinstructionhgmortagage merge(
			Tbinstructionhgmortagage detachedInstance) {
		log.debug("merging Tbinstructionhgmortagage instance");
		try {
			Tbinstructionhgmortagage result = (Tbinstructionhgmortagage) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tbinstructionhgmortagage findById(
			com.bfm.db.bean.TbinstructionhgmortagageId id) {
		log.debug("getting Tbinstructionhgmortagage instance with id: " + id);
		try {
			Tbinstructionhgmortagage instance = (Tbinstructionhgmortagage) sessionFactory
					.getCurrentSession().get(
							"com.bfm.db.bean.Tbinstructionhgmortagage", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tbinstructionhgmortagage instance) {
		log.debug("finding Tbinstructionhgmortagage instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.bfm.db.bean.Tbinstructionhgmortagage")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
