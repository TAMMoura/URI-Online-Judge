linha1 = input().split(" ")
linha2 = input().split(" ")

cod1, qtd1, valor1 = linha1
cod2, qtd2, valor2 = linha2

pagamento = (int(qtd1) * float(valor1)) + (int(qtd2) * float(valor2))

print("VALOR A PAGAR: R$ %0.2f" %pagamento)