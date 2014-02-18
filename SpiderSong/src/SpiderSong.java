
public class SpiderSong {
	static String swallowstr = "I don't know why she swallowed that fly. \n";
	static String diestr = "Perhaps she'll die";
	static String womanstr = "There was an old woman who slallowed a ";
	static String shestr = "She swallowed the ";
	static String catchstr = " to catch the ";
	
	static String Verse() { //each line is a verse from the original 
		String result = "";
		result = result + womanstr + "fly, \n" + swallowstr + diestr + "\n" + "\n";
		result = result + womanstr + "spider, \n" + "That wriggled and iggled and jiggled inside her. \n" + shestr + "spider" + catchstr + "fly \n" + swallowstr + "\n";

		result = result + womanstr + "bird, \n" + "How absurd to swallow a bird. \n ";
		result = result + womanstr + "cat \n" + "imagine that to swallow a cat. \n" + shestr + "cat" + endVerse() + "\n";
		result = result + womanstr + "dog \n" + "What a gog to swallow a dog. \n" + shestr + "dog" + catchstr + "cat \n" + shestr + "cat" + endVerse() + "\n";
		result = result + womanstr + "whale, \n" + "What a fail to swallow a whale. \n" + shestr + "whale" + catchstr + "dog \n" + shestr + "dog" + catchstr + "cat, \n" + shestr + "cat" + endVerse() + "\n";
		return result;
	}
	
	static String endVerse() {
		return catchstr + "bird \n" + shestr + "bird" + catchstr + "spider, \n" + shestr + "spider" + catchstr + "fly, \n" + swallowstr + diestr + "\n";
	}
	
	public static void main(String[] args) {
		System.out.print(Verse());
	}
}
