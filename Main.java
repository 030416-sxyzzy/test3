package test;
import java.lang.constant.ConstantDescs;
import java.lang.invoke.StringConcatFactory;
import java.util.*;
//public class Main {
//	static List<List<Integer>> list =new ArrayList<>();
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		int[] v=new int[n+1];
//		List<Integer>t =new ArrayList<Integer>();
//		dfs(n, v, t);
//		for(int i=0;i<list.size();i++) {
//			for(int j=0;j<list.get(i).size();j++) {
//				System.out.print(" "+list.get(i).get(j));
//			}
//			System.out.println();
//		}
//	}
//	public static void dfs(int n,int[] v,List<Integer>t) {
//		if(t.size()==n) {
//			list.add(new ArrayList<>(t));
//			return;		
//		}
//		for(int i=1;i<=n;i++) {
//			if(v[i]==1) continue;
//			v[i]=1;
//			t.add(i);
//			dfs(n, v, t);
//			v[i]=0;
//			t.remove(t.size()-1);
//		}
//	}
//
//}


//public class Main{
//	static boolean falg=false;
//	static List<Integer>[] list;
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		int m=scanner.nextInt();
//		list=new List[n+1];
//		for(int i=0;i<=n;i++) {
//			list[i]=new ArrayList<Integer>();
//		}
//		for(int i=0;i<m;i++) {
//			int x=scanner.nextInt();
//			int y=scanner.nextInt();
//			list[x].add(y);
//			list[y].add(x);
//		}
//		int x=scanner.nextInt();
//		int y=scanner.nextInt();
//		falg=false;
//		Set<Integer>set=new HashSet<Integer>();
//		dfs(x, y, x, 0, set);
//		if(!falg) {
//			System.out.println(-1);
//		}
//		else {
//			int ans=0;
//			for(int i=1;i<=n;i++) {
//				if(i==x||i==y||list[i].size()==0) continue;
//				set=new HashSet<Integer>();
//				set.add(x);
//				falg=false;
//				dfs(x, y, x, i, set);
//				if(!falg) {
//					ans++;
//				}
//				
//			}
//			System.out.println(ans);
//		}
//	}
//	public static void dfs(int s,int t,int u,int i,Set<Integer>set) {
//		if(u==t) {
//			falg=true;
//			return;
//		}
//		for(int x:list[u]) {
//			if(set.contains(x)||x==i) {
//				continue;
//			}
//			set.add(x);
//			dfs(s, t, x, i, set);
//		}
//	}
//}


//public class Main{
//	static int n,k,ans=0;
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		n=scanner.nextInt();
//		k=scanner.nextInt();
//		dfs(1, 0, 0);
//		System.out.println(ans);
//		
//	}
//	public static void dfs(int last,int sum,int cnt) {
//		if(cnt==k) {
//			if(sum==n) {
//				ans++;
//			}
//			return ;
//		}
//		for(int i=last;sum+i*(k-cnt)<=n;i++) {
//			dfs(i, sum+i, cnt+1);
//		}
//	}
//}



//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		int[] a=new int[n];
//		int[][] dp=new int[n][10];
//		for(int i=0;i<n;i++) {
//			a[i]=scanner.nextInt();
//		}
//		for(int i=0;i<n;i++) 
//			Arrays.fill(dp[i], Integer.MAX_VALUE);
//		String s=a[0]+"";
//		int k=s.charAt(s.length()-1)-'0';
//		dp[0][k]=0;
//		for(int i=1;i<n;i++) {
//			for(int j=0;j<10;j++) {
//				if(dp[i-1][j]!=Integer.MAX_VALUE) {
//					dp[i][j]=dp[i-1][j]+1;
//				}	
//			}
//			s=a[i]+"";
//			int left=s.charAt(0)-'0';
//			int right=s.charAt(s.length()-1)-'0';
//			dp[i][right]=Math.min(dp[i][right], dp[i-1][left]);
//			dp[i][right]=Math.min(dp[i][right], i);
//			
//		}
//		int res=n+1;
//		for(int i=0;i<10;i++) {
//			res=Math.min(res, dp[n-1][i]);
//		}
//		System.out.println(res);
//		
//	}
//}


//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		for(int i=0;i<n;i++) {
//			int m=scanner.nextInt();
//			Set<Integer>set=new HashSet<Integer>();
//			for(int j=0;j<m;j++) {
//				int x=scanner.nextInt();
//				if(set.contains(x)) {
//					continue;
//				}
//				System.out.print(x+" ");
//				set.add(x);
//			}
//			System.out.println();
//		}
//	}
//}


//public class Main{
//	public static void main(String[] args) {
//		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		int[] a=new int[n];
//		int c=scanner.nextInt();
//		for(int i=0;i<n;i++) {
//			a[i]=scanner.nextInt();
//			map.put(a[i],map.getOrDefault(a[i], 0)+1);
//		}
//		long res=0;
//		for(int i=0;i<n;i++) {
//			int b=a[i]-c;
//			res+=map.getOrDefault(b, 0);
//		}
//		System.out.println(res);
//	}
//}


//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		Stack<Integer> stack = new Stack<>();
//        // 用于存储当前最大值的栈
//        Stack<Integer> maxStack = new Stack<>();
//        
//        // 处理每一行操作
//        for (int i = 0; i < n; i++) {
//            int op = scanner.nextInt();
//            
//            if (op == 0) { // 入库操作
//                int weight = scanner.nextInt();
//                stack.push(weight);
//                
//                // 更新最大值栈
//                if (maxStack.isEmpty() || weight >= maxStack.peek()) {
//                    maxStack.push(weight);
//                } else {
//                    maxStack.push(maxStack.peek());
//                }
//            } else if (op == 1) { // 出库操作
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                    maxStack.pop();
//                }
//            } else if (op == 2) { // 查询操作
//                if (stack.isEmpty()) {
//                    System.out.println(0); // 如果仓库为空，输出 0
//                } else {
//                    System.out.println(maxStack.peek()); // 输出当前最大值
//                }
//            }
//        }
//	}
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            queue.add(i);
//        }
//        int res = 0;
//        while (!queue.isEmpty()) {
//            int x=queue.poll();
//            res++;
//            if (res == m) {
//                System.out.print(x + " ");
//                res = 0;  
//            } else {
//                queue.add(x);
//            }
//        }
//
//       }
//    }

//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		Queue<Integer>queue=new LinkedList<>();
//		int n=scanner.nextInt();
//		for(int i=0;i<n;i++) {
//			int x=scanner.nextInt();
//			if(x==1) {
//				int y=scanner.nextInt();
//				queue.add(y);
//			}
//			if(x==2) {
//				if(!queue.isEmpty()) {
//					queue.poll();
//				}else {
//					System.out.println("lan");
//				}
//			}
//			if(x==3) {
//				if(!queue.isEmpty()) {
//					System.out.println(queue.peek());	
//				}else {
//					System.out.println("qiao");
//				}
//			}
//			if(x==4) {
//				System.out.println(queue.size());
//			}		
//			
//		}
//	}
//}


//public class Main{
//	public static void main(String [] args) {
//		Scanner scanner=new Scanner(System.in);
//		Queue<Integer>queue=new LinkedList<Integer>();
//		int n=scanner.nextInt();
//		int m=scanner.nextInt();
//		int res=0;
//		for(int i=0;i<m;i++) {
//			int x=scanner.nextInt();
//			if(!queue.contains(x)) {
//				res++;
//				if(queue.size()>=n) {
//					queue.poll();
//				}
//				queue.add(x);
//			}
//		}
//		System.out.println(res);
//	}
//}


//public class Main{
//	public static void main(String [] args) {
//		Scanner scanner=new Scanner(System.in);
//		Queue<Integer>queue=new LinkedList<Integer>();
//		int n=scanner.nextInt();
//		int k=scanner.nextInt();
//		int ans=0;
//		for(int i=0;i<n;i++) {
//			int x=scanner.nextInt();
//			if(!queue.contains(x)) {
//				if(queue.size()>=k) {
//					queue.poll();
//					ans+=2;
//					queue.add(x);
//				}else {
//					ans++;
//					queue.add(x);
//				}
//			}
//		}
//		System.out.println(ans);
//	}
//}

//public class Main{
//	public static void main(String [] args) {
//		Scanner scanner=new Scanner(System.in);
//		String string=new String("javaweb");
//		int k=string.indexOf("abc");
//		System.out.println(k);//k=-1
//		StringBuilder stringBuilder=new StringBuilder();
//		stringBuilder.append(1);
//		stringBuilder.append('x');
//		stringBuilder.append("javaweb");
//		stringBuilder.reverse();//反转
//		stringBuilder.insert(0, "2");//索引0的位置插入2
//		System.out.println(stringBuilder);
//		
//	}
//}


//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		String string=scanner.nextLine();
//		int left=0,right=string.length()-1;
//		boolean fa=true;
//		while(left<right) {
//			if(string.charAt(left)!=string.charAt(right)) {
//				fa=false;
//			}
//			left++;
//			right++;
//		}
//		if(fa) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//	}
//}


//public class Main{
//	public static void main(String [] args) {
//		Scanner scanner=new Scanner(System.in);
//		String string=scanner.nextLine();
//		StringBuilder s =new StringBuilder();
//		StringBuilder a =new StringBuilder();
//		char[] ch=string.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			if(ch[i]==' ') {
//				if(a.length()!=0) {
//					int k=a.charAt(0)-'0';
//					if(k>=0&&k<=9) {
//						a.reverse();
//					}
//				}
//				s.append(a.toString()+" ");
//				a=new StringBuilder();
//			}
//			else {
//				char x=ch[i];
//				if((x>='a'&&x<='z')||(x>='A'&&x<='Z')) {
//					x^=32;
//				}
//				a.insert(0, x);
//			}
//			
//		}
//		if(a.length()!=0) {
//				int k=a.charAt(0)-'0';
//				if(k>=0&&k<=9) {
//					a.reverse();
//				}
//		}
//		s.append(a);
//		System.out.println(s);
//		
//	}
//}	


//public class Main{
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		long res=0;
//		for(int i=1;i<=n;i++) {
//            String string=i+"";
//            if(string.contains("2")||string.contains("0")||string.contains("1")||string.contains("9")) {
//            	res+=i;
//            }
//		}
//		System.out.println(res);
//	}
//}

//public class Main{	
//	public static void main(String [] args) {
//		Scanner scanner=new Scanner(System.in);
//		int[] a=new int[10];
//		int res=0;
//		for(int i=0;i<10;i++) {
//			a[i]=scanner.nextInt();
//		}
//		int h=scanner.nextInt();
//		int y=h+30;
//		for(int i=0;i<10;i++) {
//			if(a[i]<=y) {
//				res++;
//			}
//		}
//		System.out.println(res);
//		
//	}
//}

public class Main{
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int[] f=new int[k];
		f[0]=1;
		long sum=0,ans=0;
		for(int i=0;i<n;i++) {
			sum+=scanner.nextLong();
			ans+=f[(int)(sum%k)];
			f[(int)(sum%k)]++;
		}
		System.out.println(ans);	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		











