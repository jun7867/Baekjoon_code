#그룹 단어 체커
#문자열

N=int(input())
count=N

for _ in range(N):
	word=input()
	for i in range(len(word)-1) :
		if word.find(word[i]) > word.find(word[i+1]) :
			count-=1
			break
print(count)	
