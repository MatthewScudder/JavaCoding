package Questions;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "±ðÍµÀÁ  Don't Be Lazy! 1273 ###$$$";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
