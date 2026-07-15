import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[] = new char[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next().charAt(0);
		}
		boolean visited[] = new boolean[n];
		for(int i=0;i<n;i++){
		    if(visited[i]){
		        continue;
		    }
		    int count=0;
		    for(int j=0;j<n;j++){
		        if(arr[i]==arr[j]){
		            count++;
		            visited[j]=true;
		        }
		    }
		    if(count%2!=0){
		        System.out.println(arr[i]);
		        System.exit(0);
		    }
		}
		System.out.println("All are Even");
	}
}