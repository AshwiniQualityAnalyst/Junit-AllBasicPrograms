package StringSplitter;

public class SplitExample {

	public static void main(String[] args) {
		StringSplitter("28/12/2018", "/");
		StringSplitter("GeeksforGeeks:A Computer Science Portal", ":");
		StringSplitter("geekss@for@geekss", "@");
		StringSplitter("GeeksforGeeksforStudents", "for");
		StringSplitter("Geeks for Geeks", " ");
		StringSplitter("word1, word2 word3@word4?word5.word6", "[, ?.@]+");
		//***************************************************************//
		StringSplitterWithLimit("geekss@for@geekss", "@", 2);
		StringSplitterWithLimit("geekss@for@geekss", "@", 5);
		StringSplitterWithLimit("geekss@for@geekss", "@", -2);
		StringSplitterWithLimit("geekss@for@geekss", "s", -2);
		StringSplitterWithLimit("geekss@for@geekss", "s", 0);
	}

	static void StringSplitter(String str , String ProvideStringToBeSplit)
	{
		String[] arrayOfstr = str.split(ProvideStringToBeSplit);
		for(String temp : arrayOfstr)
		{
			System.out.println(temp);
		}
		System.out.println();
	}

	static void StringSplitterWithLimit(String str , String ProvideStringToBeSplit , int limit)
	{
		String[] arrayOfstr = str.split(ProvideStringToBeSplit, limit);
		for(String temp : arrayOfstr)
		{
			System.out.println(temp);
		}
		System.out.println();
	}

}
