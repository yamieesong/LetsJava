
public class LottoDuplicatePrevention {

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
            for(int x = 0; x < 6; x++) {
               
               int num = 0;
               num = (int)(Math.random() * 45)+1;
               boolean tf = true;
               for(int jj = 0; jj <  6; jj++) {
                  if(lotto[i][jj] == num) {
                     tf = false;
                     break;
                  }
               }
               
               if(tf) {
                  lotto[i][x] = num;
               }else {
                  x = x-1;
               }
            }
         }
         
         for(int i = 0; i < lineNum; i++) {
               System.out.print((i+1) + "회차 : ");
               for(int x = 0; x < 6; x++) {
                  System.out.print(lotto[i][x] + " \t");
               }
               System.out.println(" ");
        }
         
      }

}