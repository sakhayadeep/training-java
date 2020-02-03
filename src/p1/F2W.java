package p1;

public class F2W {
	public static String getWords(long amount) {
		String word = "";
		String unit[] = {""," one "," two ", " three "," four ", " five ", " six ", " seven ", " eight ", " nine ", " ten ", " eleven ", " twelve ", " thirteen ", " fourteen ", " fifteen "," sixteen ", " seventeen ", " eighteen ", " nineteen "};
		String tens[] = {"", " ten ", " twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninety "};
		String cunit[] = {" Crores ", " lakhs ", " thousands ", " hundreds ", " only"};
		long nunit[] = {10000000l, 100000l, 1000l, 100l, 1l};
		for (int i = 0; i < nunit.length; i++) {
			int v = (int)(amount/nunit[i]);
			amount = amount%nunit[i];
			if(v > 0) {
				if (v>19) {
					word = word+tens[(int)(v/10)]+unit[(int)(v%10)]+cunit[i];
				}else {
					word += unit[v]+cunit[i];
				}
				
			}
		}
		return word;
	}
}
