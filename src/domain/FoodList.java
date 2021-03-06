/**
 * 
 */
package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * @author Olga
 *
 */
@XmlRootElement
@XmlSeeAlso(Food.class)
public class FoodList  extends ArrayList <Food> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 719829350870195994L;

	/**
	 * 
	 */
	public FoodList(Collection <?extends Food> c)
	{
		// TODO Auto-generated constructor stub
		super(c);
	}
	
	public FoodList() {
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "Foods")
	public List <Food> getFoods() {
		return this;
		
	}
	
	public void addFoods (List<Food> foods) {
		this.addAll(foods);
	}

}
