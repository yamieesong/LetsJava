package poly;

public class App {

	public static void main(String[] args) {
		
		/*Factory 만들기*/
		Factory f = new Factory();
		
		/*recruit()로 채용하기*/
		/*
		f.recruit(new People("Rammy"));
		f.recruit(new People("carry"));
		f.recruit(new People("nancy"));
		f.recruit(new People("metu"));
		*/
		
		f.recruit(new ProductionPosition("Rammy", "설계"));
		f.recruit(new ProductionPosition("carry", "조립"));
		f.recruit(new ProductionPosition("nancy", "QC"));
		f.recruit(new ProductionPosition("metu", "상품화"));
		
		
		
		/*work() 메서드로 일시키기*/
		f.produce();
	}
}
