class Repeat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Set<> list=new Hashset()<>;
int n=sc.nextInt();
int arr[]=new int[n];int arr1[]=new int[n];int tot=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(!list.add(arr[i])
{
arr1[i]=arr[i];tot++;
}
}
for(int j:arr1)
{
if(j!=0)
System.out.println(j);
}
}
