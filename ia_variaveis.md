Boas práticas ao declarar variáveis em Dart
Prefira final quando o valor não mudar:
``` dart
final nome = 'Cauã';
```
Use const para valores constantes:
``` dart
const pi = 3.14;
```
Use nomes claros e em camelCase:
``` dart
String nomeCompleto;
```
Evite dynamic sem necessidade:
``` dart
String nome = 'João';
```
Use tipos explícitos quando melhorar a leitura:
```dart
int idade = 19;
```
Use late apenas quando a variável será inicializada depois:
``` dart
late String endereco;
```
Prefira variáveis não nulas:
``` dart
String cidade = 'São Paulo';
```
Regra geral

final = valor não muda
const = constante fixa
var	= tipo óbvio
late = inicialização futura
dynamic = evitar

O que evitar ao declarar variáveis em Dart
Evitar usar dynamic sem necessidade:
``` dart
dynamic valor = 'texto';
```
Isso reduz a segurança de tipos.

Evitar nomes genéricos:

```dart
var x = 10;
var a = 'João';
```
Prefira:

``` dart
int quantidadeProdutos = 10;
```
Evitar usar late sem precisar:
```dart
late String nome;
```
Se não inicializar depois, pode gerar:
```dart
LateInitializationError
```
Evitar usar var quando o tipo não estiver claro:
```dart
var resultado = buscarDados();
```
Melhor:
```dart
Future<String> resultado = buscarDados();
```
Evitar variáveis mutáveis sem necessidade:
```dart
String nome = 'Ana';
```
Prefira:
```dart
final String nome = 'Ana';
```
Evitar permitir null sem necessidade:
```dart
String? nome;
```
Use ? apenas quando o valor realmente puder ser nulo.

Cuidados com variáveis nulas em Dart

Use ? apenas quando o valor puder ser nulo:
```dart
String? telefone;
```
Verifique null antes de usar:
```dart
if (telefone != null) {
  print(telefone.length);
}
```
Evite usar ! sem certeza:
```dart
telefone!
```
Use ?? para valor padrão:
```dart
String nome = usuario ?? 'Visitante';
```
Prefira variáveis não nulas sempre que possível:
```dart
String cidade = 'São Paulo';
```
Inicialize valores obrigatórios corretamente:
```dart
Pessoa(this.nome);
```