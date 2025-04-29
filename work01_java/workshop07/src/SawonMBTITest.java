import java.util.Scanner;
/*
 ex)
6명
1 4 4 4 5 3
4가 도출되게만들어라
*/
public class SawonMBTITest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("K전자 신입사원수 입력 >>> ");
		int num = sc.nextInt();//배열의 사이즈
		int[ ] people =new int[num]; //6
	    for(int i=0;i<people.length;i++) {
	    	System.out.println("공백을 기준으로 각 사원에 대한 성격 유형을 직접 입력(1~5) >>> ");
	    	people[i] = sc.nextInt();
	    }
	    for(int i : people) {
	    	System.out.println(i+" ");
	    }
	    int mbtiCount1=0;
	    int mbtiCount2=0;
	    int mbtiCount3=0;
	    int mbtiCount4=0;
	    int mbtiCount5=0;


		for(int mbti : people) {
			switch(mbti) {
			case 1: mbtiCount1+=1; break;
			case 2: mbtiCount2+=1; break;
			case 3: mbtiCount3+=1; break;
			case 4: mbtiCount4+=1; break;
			case 5: mbtiCount5+=1; break;
			}
		}
		System.out.println(""+mbtiCount1+mbtiCount2+mbtiCount3+mbtiCount4+mbtiCount5);
		int[] mbtiCounts = {mbtiCount1,mbtiCount2,mbtiCount3,mbtiCount4,mbtiCount5};
		int answer = 0;
		int max=mbtiCount1;
	for(int i=0;i<mbtiCounts.length;i++) {
		if(mbtiCounts[i]>max) {
			answer=i;
		}
	}
		answer=answer+1;
//		for(int i=0;i<mbtiCounts.length;i++) {
//			for(int j=1;j<mbtiCounts.length;j++) {
//				if(mbtiCounts[i]<mbtiCounts[j])	
//					mbtiCounts[j]=mbtiCounts[i];
//			}
//		}
//		for(int i : mbtiCounts) {
//			System.out.println(i+" ,");
//		}
//		answer=mbtiCounts[4];
//		System.out.println(mbtiCounts[4]);
		System.out.println("정답 :: "+answer);
	}
}










