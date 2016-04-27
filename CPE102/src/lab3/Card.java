package lab3;

public class Card {
	char suit;
	int val;

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", };

	public Card(String input) {
		Character[] values = new Character[2];
		for (int i = 0; i < 2; i++) {
			values[i] = input.charAt(i);
		}
		this.suit = Character.toUpperCase(values[1]);
		if (Character.isLetter(values[0])) {
			switch (Character.toUpperCase(values[0])) {
			case 'A':
				val = 1;
				break;
			case 'J':
				val = 11;
				break;
			case 'Q':
				val = 12;
				break;
			case 'K':
				val = 13;
				break;
			}
		} else {
			val = Character.getNumericValue(values[0]);
			//Character.get
		}
	}

	public String getDescription() {
		String desc = "";
		switch (suit) {
		case 'D':
			desc = " of diamonds";
			break;
		case 'H':
			desc = " of hearts";
			break;
		case 'S':
			desc = " of spades";
			break;
		case 'C':
			desc = " of clubs";
			break;
		}
		if (val == 1 || (10 < val)) {
			switch (val) {
			case 1:
				desc = 'A' + desc;
				return desc;
			case 11:
				desc = 'J' + desc;
				return desc;
			case 12:
				desc = 'Q' + desc;
				return desc;
			case 13:
				desc = 'K' + desc;
				return desc;
			}
		} else {
			desc = (new String(numNames[val])).trim().substring(0, 1).toUpperCase()
					+ (new String(numNames[val])).trim().substring(1) + desc;
			return desc;
		}
		return desc;
	}
}
