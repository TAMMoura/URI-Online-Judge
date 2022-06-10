totalDias = int(input())

ano = totalDias // 365
mes = totalDias % 365 // 30
dia = (totalDias % 365) % 30

print(ano, "ano(s)")
print(mes, "mes(es)")
print(dia, "dia(s)")