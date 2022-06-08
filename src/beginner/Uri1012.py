linha1 = input().split(" ")
A, B, C = linha1

triangulo = (float(A) * float(C)) / 2
circulo = 3.14159 * float(C) ** 2
trapezio = (float(C) * (float(A) + float(B))) / 2
quadrado = float(B) ** 2
retangulo = float(A) * float(B)

print("TRIANGULO: %0.3f" %triangulo)
print("CIRCULO: %0.3f" %circulo)
print("TRAPEZIO: %0.3f" %trapezio)
print("QUADRADO: %0.3f" %quadrado)
print("RETANGULO: %0.3f" %retangulo)