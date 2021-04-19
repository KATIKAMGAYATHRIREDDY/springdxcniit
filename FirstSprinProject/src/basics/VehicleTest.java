package basics;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class VehicleTest {
public static void main(String[] args) {
	/*Vehicle vehicle=new Bike();
	vehicle.drive();
	//Car car= new Car();
	//car.drive();
		//Bike bike=new Bike();
		//bike.drive();*/
	
	Resource resource = new ClassPathResource("spring.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	
	Vehicle vehicle = (Vehicle) beanFactory.getBean("vehicle");
	vehicle.drive();
}
	
}
