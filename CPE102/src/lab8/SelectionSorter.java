package lab8;

public class SelectionSorter {

	private Coin[] coins;

	public SelectionSorter(Coin[] coins) {
		this.coins = coins;
	}

	public void sort() {
		sort(coins);
	}

	public void sort(Coin[] a) {
		int i, j, first;
		Coin temp;
		for (i = a.length - 1; i > 0; i--) {
			first = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) // locate smallest element between
										// positions 1 and i.
			{
				if (a[j].getValue() > a[first].getValue())
					first = j;
			}
			temp = a[first]; // swap smallest found with element in position i.
			a[first] = a[i];
			a[i] = temp;
		}
	}
}
