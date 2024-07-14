// C++ program to merge two sorted arrays/
#include<bits/stdc++.h>
using namespace std;

void mergeArrays(int arr1[], int arr2[], int n1,
							int n2, int arr3[])
{
	int i = 0, j = 0, k = 0;
	// traverse the arr1 and insert its element in arr3
	while(i < n1){
	arr3[k++] = arr1[i++];
	}
	
	// now traverse arr2 and insert in arr3
	while(j < n2){
	arr3[k++] = arr2[j++];
	}
	
	// sort the whole array arr3
	sort(arr3, arr3+n1+n2);
}

int main()
{
	int n1,n2;
	cout<<"enter the size of arrays";
	cin>>n1>>n2;
	int arr1[n1],arr2[n2];
	cout<<"Enter the number for Array 1";

	for(int i=0;i<n1;i++)
	{
		int a;
		cin>>a;
		arr1[i]=a;
	}
	cout<<"Enter the Number for Array 2";
	for(int i=0;i<n2;i++)
	{
		int a;
		cin>>a;
		arr2[i]=a;
	}

	int arr3[n1+n2];
	mergeArrays(arr1, arr2, n1, n2, arr3);

	cout << "Array after merging" <<endl;
	for (int i=0; i < n1+n2; i++)
		cout << arr3[i] << " ";

	return 0;
}
