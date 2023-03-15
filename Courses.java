public enum Courses {
	HISTORY_101(1, "History 101"),
	ENGLISH_101 (2, "English 101"),
	MATH_101 (3, "Math 101"),
	PHILOSOPHY_101 (4, "Philosophy 101"),
	PSYCHOLOGY_101 (5, "Psychology 101");

	private int id;
	private String displayValue;

	private Courses(int id, String displayValue) {
		this.id = id;
		this.displayValue = displayValue;
	}

	public int getID() {
		return id;
	}

	public String getDisplayValue() {
		return displayValue;
	}
}