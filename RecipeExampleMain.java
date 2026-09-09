package collection_framework;

import java.util.List;

public class RecipeExampleMain {

	public static void main(String[] args) {
		Recipe r1 = new Recipe();
		r1.setName("pineapple raitaa");
		r1.setPreparationTime(30);
		
		List<String> raitaingredients = List.of("curd","sugar","pinweaaple");
		r1.setIngredients(raitaingredients);
		
		Recipe r2 = new Recipe();
		r2.setName("veg burger");
		r2.setPreparationTime(40);
		r2.aadingredients("bun bread");
		r2.aadingredients("moya");
		r2.aadingredients("chesse");
		r2.aadingredients("cucumberrrrr");
		r2.aadingredients("tomnastop");
		r2.aadingredients("letttuce");
		System.out.println("Recipe Name:-"+r1.getName());
		System.out.println("ingredients");
		List<String> firstlist=r1.getIngredients();
		for(String ing: firstlist)
			System.out.println(ing);
		System.out.println("==================================");
		System.out.println("Recipe Name:-"+r2.getName());
		System.out.println("ingredients");
		List<String> secondtlist=r2.getIngredients();
		for(String ing: secondtlist)
			System.out.println(ing);

	}

}
