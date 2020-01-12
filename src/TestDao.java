import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {
			
		Person p = new Person();
		p.setpId(2);
		p.setPname("Vickky Bhaiya");
		p.setAddress("Banglore");

		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transact = session.beginTransaction();
		//session.save(p)
         p  = (Person)session.get(Person.class,1);
        p.setAddress("USA");
        session.update(p);
		transact.commit();
	}

}
