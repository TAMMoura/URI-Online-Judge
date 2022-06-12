x = int(input())
y = int(input())
somaImpares = 0
for n in range((y + 1), x):
    if (n % 2 != 0):
        somaImpares += n
print(somaImpares)