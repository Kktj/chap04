package class06;

public class TakesData {

	public Takes[] takArr = new Takes[12];

	public TakesData() {

		takArr[0] = new Takes("1292001", "C101-01", "B+");
		takArr[1] = new Takes("1292001", "C103-01", "A+");
		takArr[2] = new Takes("1292001", "C301-01", "A");
		takArr[3] = new Takes("1292002", "C102-01", "A");
		takArr[4] = new Takes("1292002", "C103-01", "B+");
		takArr[5] = new Takes("1292002", "C502-01", "C+");
		takArr[6] = new Takes("1292003", "C103-02", "B");
		takArr[7] = new Takes("1292003", "C501-02", "A+");
		takArr[8] = new Takes("1292301", "C102-01", "C+");
		takArr[9] = new Takes("1292303", "C102-01", "C");
		takArr[10] = new Takes("1292303", "C103-02", "B+");
		takArr[11] = new Takes("1292303", "C501-01", "A+");
	}

}
