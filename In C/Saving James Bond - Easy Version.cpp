/*

This time let us consider the situation in the movie "Live and Let Die" in which James Bond, the world's most famous spy, was captured by a group of drug dealers. He was sent to a small piece of land at the center of a lake filled with crocodiles. There he performed the most daring action to escape -- he jumped onto the head of the nearest crocodile! Before the animal realized what was happening, James jumped again onto the next big head... Finally he reached the bank before the last crocodile could bite him (actually the stunt man was caught by the big mouth and barely escaped with his extra thick boot).

Assume that the lake is a 100 by 100 square one. Assume that the center of the lake is at (0,0) and the northeast corner at (50,50). The central island is a disk centered at (0,0) with the diameter of 15. A number of crocodiles are in the lake at various positions. Given the coordinates of each crocodile and the distance that James could jump, you must tell him whether or not he can escape.

Input Specification:

Each input file contains one test case. Each case starts with a line containing two positive integers N (¡Ü100), the number of crocodiles, and D, the maximum distance that James could jump. Then N lines follow, each containing the (x,y) location of a crocodile. Note that no two crocodiles are staying at the same position.

Output Specification:

For each test case, print in a line "Yes" if James can escape, or "No" if not.

Sample Input 1:

14 20
25 -15
-25 28
8 49
29 15
-35 -2
5 28
27 -29
-8 -28
-20 -35
-25 -20
-13 29
-30 15
-35 40
12 12
Sample Output 1:

Yes
Sample Input 2:

4 13
-12 12
12 12
-12 -12
12 -12
Sample Output 2:

No
*/

#include <stdio.h>
#include <math.h>
#define Maxsize 100
#define Island_Radius 7.5
typedef struct Point Position;
struct Point {
	int x,y;
};

Position P[Maxsize];
int Visited[Maxsize];

int DFS(int V);
int FirstJump(int V);
int Jump(int V1,int V);
int N,MaxJump;
int main() {
	int V=0;//N is the number of crocodiles
	int flag=0;
	scanf("%d %d",&N,&MaxJump);
	while(V<N) {
		scanf("%d %d",&P[V].x,&P[V].y);
		V++;
	}
	
	for(int x=0;x<N;x++) {
		Visited[x]=0;
	}
	
	for(int W=0;W<N;W++) {
	
		if(Visited[W]!=1&&FirstJump(W)) {
			flag=DFS(W);
			if(flag) {
				printf("Yes");
				break;
			}			
		}
	}
	if(!flag){
		printf("No");
	
	}
	return 0;
}

int FirstJump(int V) {
	int flag;
	if(sqrt(P[V].x*P[V].x+P[V].y*P[V].y)<=MaxJump+Island_Radius) {
		flag = 1;
	}
	else {
		flag = 0;
	}
	return flag;
}
int Jump(int V1,int V2) {
	int flag;
	if(sqrt((P[V2].x-P[V1].x)*(P[V2].x-P[V1].x)+(P[V2].y-P[V1].y)*(P[V2].y-P[V1].y))<=MaxJump) {
		flag=1;
	}
	else {
		flag=0;
	}
	return flag;
}
int isSafe(int V) {
	return abs(P[V].x)+MaxJump>=50||abs(P[V].y)>=50;
}
int DFS(int V) {

	int flag=0;
	Visited[V]=1;
	if(isSafe(V)) {
	
		flag = 1;
	}

	for(int x=0;x<N;x++) {
		if(Visited[x]!=1&&Jump(V,x)) {
			flag = DFS(x);	
			if(flag)
				break;
			
		}
	
	}
	return flag;
}



