N = int(input())
if 0 < N < 1000000:
    cem = N // 100
    cinquenta = N % 100 // 50
    vinte = N % 100 % 50 // 20
    dez = N % 100 % 50 % 20 // 10
    cinco = N % 100 % 50 % 20 % 10 // 5
    dois = N % 100 % 50 % 20 % 10 % 5 // 2
    um = N % 100 % 50 % 20 % 10 % 5 % 2 // 1
    print(N)
    print("%d nota(s) de R$ 100,00" %cem)
    print("%d nota(s) de R$ 50,00" %cinquenta)
    print("%d nota(s) de R$ 20,00" %vinte)
    print("%d nota(s) de R$ 10,00" %dez)
    print("%d nota(s) de R$ 5,00" %cinco)
    print("%d nota(s) de R$ 2,00" %dois)
    print("%d nota(s) de R$ 1,00" %um)