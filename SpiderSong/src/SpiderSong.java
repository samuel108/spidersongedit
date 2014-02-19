/* Things changed from the original in photo.JPG to make "beautiful"
 * 1. removed String diestr and implemented its function into String swallowstr,
 * 2. instead of six verses methods, we have one called Song and each line represents a verse in the original program
 * 3. created method endVerse that contains some code that is repeated in the longer verses, may be good to create loop that creates the swallowed ANIMAL to catch ANIMAL but did not want to change code too much.
 * 4. main only contains Song now 
 */
public class SpiderSong {
	static String swallowstr = "I don't know why she swallowed that fly. \n" + "Perhaps she'll die" + "\n";
	static String womanstr = "There was an old woman who swallowed a ";
	static String shestr = "She swallowed the ";
	static String catchstr = " to catch the ";
	
	static String Song() { //each line is a verse from the original 
		String result = "";
		result = result + womanstr + "fly, \n" + swallowstr + "\n";
		result = result + womanstr + "spider, \n" + "That wriggled and iggled and jiggled inside her. \n" + shestr + "spider" + catchstr + "fly \n" + swallowstr  + "\n";
		result = result + womanstr + "bird, \n" + "How absurd to swallow a bird. \n" + shestr + "bird" + catchstr + "spider, \n" + shestr + "spider" + catchstr + "fly, \n" + swallowstr + "\n";
		result = result + womanstr + "cat \n" + "Imagine that to swallow a cat. \n" + shestr + "cat" + endVerse();
		result = result + womanstr + "dog \n" + "What a hog to swallow a dog. \n" + shestr + "dog" + catchstr + "cat \n" + shestr + "cat" + endVerse();
		result = result + womanstr + "whale, \n" + "What a fail to swallow a whale. \n" + shestr + "whale" + catchstr + "dog \n" + shestr + "dog" + catchstr + "cat, \n" + shestr + "cat" + endVerse();
		result = result + womanstr + "horse, \n" + "She died of course";
		return result;
	}
	
	static String endVerse() {
		return catchstr + "bird \n" + shestr + "bird" + catchstr + "spider, \n" + shestr + "spider" + catchstr + "fly, \n" + swallowstr + "\n";
	}
	
	public static void main(String[] args) {
		System.out.print(Song());
	}
}
