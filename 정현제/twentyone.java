package grap_my_hand;

import java.util.Scanner;

public class twentyone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int tc=0; tc<T; tc++) {
			int N = scan.nextInt();	// ������ ����
			int[][] arr = new int[N][2];	// �� �������� ����, ���� ����
			int count = N;			// ������ �� �ִ� ���Ի���� �ִ� �ο���
			
			for(int i=0; i<N; i++) {
				arr[i][0] = scan.nextInt();	
				arr[i][1] = scan.nextInt();
			}
			
			// ������ ���� ���� or ���� �ɻ� �Ǵ��ϱ�
			for(int i=0; i<N; i++) {
				boolean docu = true;	// �����ɻ� �Ǵ�
				boolean pt = true;		// �����ɻ� �Ǵ�
				
				for(int j=0; j<N; j++) {	// �����ɻ� ���� �Ǵ�
					if(arr[i][0] < arr[j][0]) {	// �ڽź��� ���� ������ �������� �ο��� �������(���ڰ� �� Ŭ���)
						docu = false;
						break;
					}
				}
				
				for(int j=0; j<N; j++) {	// �����ɻ� ���� �Ǵ�
					if(arr[i][1] < arr[j][1]) {	// �ڽź��� ���� ������ �������� �ο��� �������(���ڰ� �� Ŭ���)
						pt = false;
						break;
					}
				}
				
				// ����, ���� ���� ��� �ڽź��� �������� �ο��� ������� => ���� X
				if(docu == true && pt == true) {
					count --;
				}
			}
			
			System.out.println(count);
		}
		
		scan.close();
	}

}
