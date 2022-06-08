linha1 = input().split(" ")
a , b , c = linha1

maiorAB = (int(a) + int(b) + abs(int(a) - int(b))) / 2
resultado = (int(maiorAB) + int(c) + abs(int(maiorAB) - int(c))) / 2

print("%d eh o maior" %resultado)