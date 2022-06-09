N = int(input())
segundos = N % 60 % 60
a = N % 3600
minutos = a / 60
horas = N / 3600
print("%d:" %horas + "%d:" %minutos + "%d" %segundos)