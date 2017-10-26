/*
����һ����N�������E���ߵ�����ͼ������DFS��BFS�ֱ��г������е���ͨ�������趥���0��N?1��š���������ʱ�������������Ǵӱ����С�Ķ������������ŵ�����˳������ڽӵ㡣

�����ʽ:

�����1�и���2������N(0<N��10)��E���ֱ���ͼ�Ķ������ͱ��������E�У�ÿ�и���һ���ߵ������˵㡣ÿ���е�����֮����1�ո�ָ���

�����ʽ:

����"{ v
?1
??  v
?2
??  ... v
?k
?? }"�ĸ�ʽ��ÿ�����һ����ͨ���������DFS�Ľ���������BFS�Ľ����

��������:

8 6
0 7
0 1
2 0
4 1
2 4
3 5
�������:

{ 0 1 4 2 7 }
{ 3 5 }
{ 6 }
{ 0 1 2 7 4 }
{ 3 5 }
{ 6 }
*/

#include <stdio.h>
#include <stdlib.h>
#define MAXSIZE 10

int check[MAXSIZE];//check element is visited or not;
typedef struct GNode *PtrToGNode;
struct GNode {
	int Vertex;
	int Edge;
	int G[MAXSIZE][MAXSIZE];
};

typedef PtrToGNode Graph;
typedef struct QNode *PtrToQNode;
struct QNode {
	int front;
	int rear;
	int Q[MAXSIZE];
};

typedef PtrToQNode Queue;

void Add(Queue queue ,int item) {
	if((queue->rear+1)%MAXSIZE ==queue->front) {
		printf("queue is full");
	}
	else {
		queue->rear=(queue->rear+1)%MAXSIZE;
		queue->Q[queue->rear] =item;
	}
}

int Delete(Queue queue) {
	if(queue->front==queue->rear) {
		printf("is empty");
		return -1;
	}
	else {
		queue->front = (queue->front+1)%MAXSIZE;
		return queue->Q[queue->front];
	}
}

void DFS(Graph graph,int vertex) {
	int V; 
	if(check[vertex]!=1) {
		printf("%d ",vertex);
	}
	check[vertex] =1;
	
	for( V=0;V<graph->Vertex;V++) {
//		printf("%d ",V);
		if(check[V]!=1&&graph->G[vertex][V]!=0) {
			DFS(graph,V);
//			printf("��������"); 
		}
	}

}

void BFS(Graph graph,int vertex) {
	int W;
	check[vertex] =1;
	Queue queue = (Queue)malloc(sizeof(struct QNode));
	queue->front=0;
	queue->rear=0;
	Add(queue,vertex);
	
	while(queue->front!=queue->rear) {
		W=Delete(queue);
		printf("%d ",W);
		for(int V=0;V<graph->Vertex;V++) {
			if(check[V]!=1&&graph->G[W ][V]==1) {
			//	printf("%d-",V);
				check[V]=1;
				Add(queue,V);
			}
		}
	}
}
Graph createEmptyGraph(int N1,int N2) {
	int V1;
	int V2; 
	Graph graph = (Graph)malloc(sizeof(struct GNode)); 
	graph->Vertex=N1;
	graph->Edge=N2;
	for(V1=0;V1<graph->Vertex;V1++) {
		for(V2=0;V2<graph->Vertex;V2++) {
			graph->G[V1][V2]=0;
		}
	} 
//	printf("��ӡ��\n");
//	for(int i=0;i<graph->Vertex;i++) {
//		for(int j=0;j<graph->Vertex;j++) {
//			printf("%d\t",graph->G[i][j]); 
//		}
//		printf("\n");
//	} 
	return graph;
}

int main() {
	int N1,N2,V1,V2;
	Graph graph;
	scanf("%d %d",&N1,&N2);
	graph=createEmptyGraph(N1,N2);

	while(N2--) {
		scanf("%d %d",&V1,&V2);
		graph->G[V1][V2]=1;
		graph->G[V2][V1]=1; 
		
	}
//	//��ӡ��
//	printf("��ӡ��\n");
//	for(int i=0;i<graph->Vertex;i++) {
//		for(int j=0;j<graph->Vertex;j++) {
//			printf("%d\t",graph->G[i][j]); 
//		}
//		printf("\n");
//	} 
	for(int i=0;i<graph->Vertex;i++) {
		if(check[i]!=1){
		
			printf("{ "); 
			DFS(graph,i);
			printf("}"); 
			printf("\n");
	}
}
	
	for(int i=0;i<MAXSIZE;i++) {
		check[i] =0;
	}
	for(int j=0;j<graph->Vertex;j++) {
		if(check[j]!=1) {
			printf("{ ");
			BFS(graph,j);
			printf("}\n");
		}
	}
	return 0;
}

