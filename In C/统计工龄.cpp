////快速排序
///*
//10-排序4 统计工龄（20 分）
//给定公司N名员工的工龄，要求按工龄增序输出每个工龄段有多少员工。
//输入格式:
//
//输入首先给出正整数N（≤10
//?5
//?? ），即员工总人数；随后给出N个整数，即每个员工的工龄，范围在[0, 50]。
//输出格式:
//
//按工龄的递增顺序输出每个工龄的员工个数，格式为：“工龄:人数”。每项占一行。如果人数为0则不输出该项。
//输入样例:
//
//8
//10 2 0 5 7 2 5 2
//输出样例:
//
//0:1
//2:3
//5:2
//7:1
//10:1
//*/
//
//#include <stdio.h>
//int temp=0;
//void quick_Sort(int workTime[],int len);
//void quickSort(int workTime[],int left,int right);
//int selectCenter(int workTime[],int left,int right);
//void swap(int workTime[],int left,int right);
//void printTime(int workTime[]);
//int main(){
//	int N; 
//	scanf("%d",&N);
//	
//	int workTime[N];
//	while(N--){
//		scanf("%d",&workTime[temp++]);
//	}
//	
//	quick_Sort(workTime,temp);
//	
////	printTime(workTime);
//	for(int i = 0;i<temp;i++){
//		printf("%d，",workTime[i]);	
//	}	
//	return 0;
//	
//}
//
//void quick_Sort(int workTime[],int len) {
//	quickSort(workTime,0,len-1);	
//}
//
//void quickSort(int workTime[],int left,int right){
//	int i,j;
//	int center = selectCenter(workTime,left,right);
//	for(i = left,j=right-1;i<=j;) {
//		while(workTime[++i]<workTime[center])
//		while(workTime[--j]>workTime[center])
//
//		swap(workTime,i,j);
//
//	}
//	swap(workTime,i,right-1);
//	if(left<right){
//		
//		quickSort(workTime,left,i-1);
//
//		quickSort(workTime,i+1,right);
//}
//
//}
//
//int selectCenter(int workTime[],int left,int right){
//	int center=(left + right)/2;
//	//printf("%d,%d,%d",left,center,right);
//	if(workTime[left]>workTime[center]) {
//		swap(workTime,left,center);
//	}
//	if(workTime[left]>workTime[right]){
//		swap(workTime,left,right);
//	}
//	if(workTime[center]>workTime[right]) {
//		swap(workTime,center,right);
//	}
//	
//	swap(workTime,center,right-1);
//	return right-1;
//	
//}
//
//void swap(int workTime[],int left,int right) {
//	int temp = workTime[right];
//	workTime[right]=workTime[left];
//	workTime[left]=temp;
//	printf("swap %dto %d\n",left,right);
//} 
//
//void printTime(int workTime[]) {
//	int count = 0;
//	int time = workTime[0];
//	printf("%d:",time);
//	for(int i = 0;i<temp;i++) {
//		if(workTime[i+1]==workTime[i]){
//			count++;
//		}
//		else{
//			printf("%d",count+1);
//			time=workTime[i+1];
//			printf("\n%d:",time);
//		}
//	}
//}
//


#include <stdio.h>
int main(){
	int count[50];
	int N,temp=0;
	//初始化
	for(int i =0;i<50;i++){
		count[i]=0;
	} 
	scanf("%d",&N);
	while(N--){
		scanf("%d",&temp);
		count[temp]++;
	}
	
	for(int j =0;j<50;j++){
		if(count[j]!=0){
			printf("%d:%d",j,count[j]);
		}
	}
	return 0; 
}

