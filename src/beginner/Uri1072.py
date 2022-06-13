N=[]
somain=0
somaout=0
a=int(input())
for n in range (1,(a+1)):
    N.append(input())
for n in N:
    if (10<=int(n)<=20):
        somain+=1
    elif (int(n)>20) or(int(n)<10):
        somaout+=1
print(somain,"in")
print(somaout,"out")