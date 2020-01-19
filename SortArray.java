class SortArray
{
static void final_0_and_1(int arr[],int size)
{
	int left=0,right=size-1;
	while(left<right)
	{
		while(arr[left]==0 && left<right)
		left++;
	while(arr[right]==1 && left<right)
		right--;
	if(left<right)
	{
		arr[left]=0;
	}
	else
	{
		arr[right]=1;
	}
	}
}
	public static void main(String s[])
	{
		int a[] = new int[]{0,1,0,1,0,1};
	
	final_0_and_1(a,6);
	for(int i=0;i<6;i++)
	{
		System.out.println(a[i]);
	}
	}
}