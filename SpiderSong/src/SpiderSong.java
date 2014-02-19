
public class SpiderSong {
	static String swallowstr = "I don't know why she swallowed that fly. \n" + "Perhaps she'll die" + "\n";
	static String womanstr = "There was an old woman who slallowed a ";
	static String shestr = "She swallowed the ";
	static String catchstr = " to catch the ";
	
	static String Verse() { //each line is a verse from the original 
		String result = "";
		result = result + womanstr + "fly, \n" + swallowstr + "\n";
		result = result + womanstr + "spider, \n" + "That wriggled and iggled and jiggled inside her. \n" + shestr + "spider" + catchstr + "fly \n" + swallowstr  + "\n";
		result = result + womanstr + "bird, \n" + "How absurd to swallow a bird. \n ";
		result = result + womanstr + "cat \n" + "imagine that to swallow a cat. \n" + shestr + "cat" + endVerse();
		result = result + womanstr + "dog \n" + "What a gog to swallow a dog. \n" + shestr + "dog" + catchstr + "cat \n" + shestr + "cat" + endVerse();
		result = result + womanstr + "whale, \n" + "What a fail to swallow a whale. \n" + shestr + "whale" + catchstr + "dog \n" + shestr + "dog" + catchstr + "cat, \n" + shestr + "cat" + endVerse();
		return result;
	}
	
	static String endVerse() {
		return catchstr + "bird \n" + shestr + "bird" + catchstr + "spider, \n" + shestr + "spider" + catchstr + "fly, \n" + swallowstr + "\n";
	}
	
	public static void main(String[] args) {
		System.out.print(Verse());
	}
}
