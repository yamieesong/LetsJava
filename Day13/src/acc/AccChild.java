package acc;

import acc.data.Parent;

public class AccChild extends Parent{
	
	public AccChild() {

		this.publicName = "뽀야미";		//접근가능/상속O 
		/*
		this.defaultName = "뽀야미";		//접근불가/상속X	error
		*/
		this.protectedName = "뽀야미";	//접근가능/상속O
		/*
		this.privateName = "뽀야미";		//접근불가/상속X	error
		*/
	}

}


/*
 * p.227~229
 *상속에서의 접근 제한자
 *1.public은 모두 상속O(제한없음)
 *
 * 2.private 모두 상속x (제한없음)
 * 
 * if(같은패키지일 때){
 * 		3.default, protected 상속O
 * } else {
 * 		3.default 상속X
 * 		4.protected 상속O
 * }
 * 
 */
 
