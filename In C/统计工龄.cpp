////��������
///*
//10-����4 ͳ�ƹ��䣨20 �֣�
//������˾N��Ա���Ĺ��䣬Ҫ�󰴹����������ÿ��������ж���Ա����
//�����ʽ:
//
//�������ȸ���������N����10
//?5
//?? ������Ա����������������N����������ÿ��Ա���Ĺ��䣬��Χ��[0, 50]��
//�����ʽ:
//
//������ĵ���˳�����ÿ�������Ա����������ʽΪ��������:��������ÿ��ռһ�С��������Ϊ0��������
//��������:
//
//8
//10 2 0 5 7 2 5 2
//�������:
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
//		printf("%d��",workTime[i]);	
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
	//��ʼ��
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

