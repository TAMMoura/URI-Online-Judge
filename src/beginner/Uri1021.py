n = input().split(".")
real, centavos = n
real = int(real)
centavos = int(centavos)

nota100 = real / 100
real -= int(nota100) * 100
nota50 = real / 50
real -= int(nota50) * 50
nota20 = real / 20
real -= int(nota20) * 20
nota10 = real / 10
real -= int(nota10) * 10
nota5 = real / 5
real -= int(nota5) * 5
nota2 = real / 2
real -= int(nota2) * 2
moeda1 = real
moeda50 = centavos / 50
centavos -= int(moeda50) * 50
moeda25 = centavos / 25
centavos -= int(moeda25) * 25
moeda10 = centavos / 10
centavos -= int(moeda10) * 10
moeda5 = centavos / 5
centavos -= int(moeda5) * 5
moeda01 = centavos

print("NOTAS:")
print ("%i nota(s) de R$ 100.00" % nota100)
print("%i nota(s) de R$ 50.00" % nota50)
print("%i nota(s) de R$ 20.00" % nota20)
print("%i nota(s) de R$ 10.00" % nota10)
print("%i nota(s) de R$ 5.00" % nota5)
print("%i nota(s) de R$ 2.00" % nota2)
print("MOEDAS:")
print("%i moeda(s) de R$ 1.00" % moeda1)
print("%i moeda(s) de R$ 0.50" % moeda50)
print("%i moeda(s) de R$ 0.25" % moeda25)
print("%i moeda(s) de R$ 0.10" % moeda10)
print("%i moeda(s) de R$ 0.05" % moeda5)
print("%i moeda(s) de R$ 0.01" % moeda01)