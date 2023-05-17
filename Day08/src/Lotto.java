public class Lotto {

   //사용자의 입력값에 따라 달라지는 동적배열
   public static void main (String[] args) {
      /* 사용법 validation check */
      if(args.length != 1) {
         System.out.println("사용법 : java Lotto <뽑기횟수>");
         System.out.println("ex) java Lotto 10");
         return;
      }
      
      /* 인자값 validation check */
      if(Integer.parseInt(args[0]) <= 0) {
         System.out.println("뽑기횟수는 1 이상의 정수로 입력해주세요");
         System.out.println("사용법 : java Lotto <뽑기횟수>");
         System.out.println("ex) java Lotto 10");
         return;
      }
   
      /* 로또번호(2차원 배열) 길이와 인덱스 부여 */
      int lineNum = Integer.parseInt(args[0]);
      int[][] lotto = new int[lineNum][6];   
      
      /* 로또번호(2차원 배열) 초기화 및 출력 */
      System.out.println("생성된 로또 번호들 입니다.");
      
      
      
      for(int i = 0; i < lineNum; i++) { 
         System.out.print((i+1) + "회차 : ");
            
        while(true) {
           
           int num = (int)(Math.random() * 45)+1;
           
           boolean check = true;
           int checkArr = 0;
           for(int x=0; x <= checkArr ; x ++) {
              if(lotto[i][x] == num) {
                 check = false;
                 break;
              }
              
              if(check = true) {
                 lotto[i][x] = num;
                 checkArr++;
              }
              if(checkArr == 5) {
                 break;
              }
              
           }
           System.out.print(lotto[i][checkArr] + "\t"); 
        }
      }
      
      
      
   }
}