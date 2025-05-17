# calc-lib - Biblioteca Java para operações matemáticas.

Biblioteca que fornece métodos simples para operações matemáticas básicas!

Faça computações revolucionárias, nunca antes vistas, tal como:

- adição (😯)
- subtração (😨)
- multiplicação (🤯) e + outras.

## Instalação

Copia e cola no teu pom:
```xml
<dependency>
  <groupId>org.fbp</groupId>
  <artifactId>calc-lib</artifactId>
  <version>0.1</version>
</dependency>
```

Taca isso no terminal:
```shell
mvn install
```
## Uso

Isso aqui:
```java
import org.fbp.Calculator;

public class Main {

  public static void main(String[] args) {
    System.out.println("Soma: " + Calculator.sum(2, 3));
    System.out.println("Subtração: " + Calculator.subtract(5, 3));
    System.out.println("Multiplicação: " + Calculator.multiply(5, 3));
    System.out.println("Divisão: " + Calculator.divide(6, 3));
    System.out.println("Potência: " + Calculator.toTheN(2, 3));
  }

}
```

Vai resultar nisso aqui:
```shell
Soma: 5.0
Subtração: 2.0
Multiplicação: 15.0
Divisão: 2.0
Potência: 8.0
```