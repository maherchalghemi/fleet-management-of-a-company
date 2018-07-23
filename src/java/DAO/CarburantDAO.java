package DAO;

import java.util.List;

import Model.Carburant;

import org.hibernate.SessionFactory;

/**
 * 
 * Carburant DAO
 * 
 *
 */

public class CarburantDAO implements ICarburantDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	/**
	 * Add Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Override
	public void addCarburant(Carburant carburant) {
		getSessionFactory().getCurrentSession().save(carburant);
	}

	/**
	 * Delete Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Override
	public void deleteCarburant(Carburant carburant) {
		getSessionFactory().getCurrentSession().delete(carburant);
	}

	/**
	 * Update Carburant
	 * 
	 * @param  Carburant carburant
	 */
	@Override
	public void updateCarburant(Carburant carburant) {
		getSessionFactory().getCurrentSession().update(carburant);
	}

	/**
	 * Get Carburant
	 * 
	 * @param  int Carburant Id
	 * @return Carburant 
	 */
	@Override
	public Carburant getCarburantById(int id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Carburant where idCar=?")
									        .setParameter(0, id).list();
		return (Carburant)list.get(0);
	}

	/**
	 * Get Carburant List
	 * 
	 * @return List - Carburant list
	 */
	@Override
	public List<Carburant> getCarburant() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Carburant").list();
		return list;
	}

}
