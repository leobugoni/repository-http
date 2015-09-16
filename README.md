# repository-vraptor[![Build Status](https://drone.io/github.com/clairton/repository-vraptor/status.png)](https://drone.io/github.com/clairton/repository-vraptor/latest)

Converte url para predicates de repository.

Segue exemplos:
```java
http://meudominio.com/app/recurso?nome=abc //retornara o recurso com o nome igual a "abc"

http://meudominio.com/app/recurso?operacao.nome=abc //retornara o recurso com o nome da operacao igual a "abc"

http://meudominio.com/app/recurso?operacao[nome]=abc //retornara o recurso com o nome da operacao igual a "abc"

http://meudominio.com/app/recurso?id=>=1&id=<=11 //retornara o recurso com o id entre 1 e 11

http://meudominio.com/app/recurso?page=2&per_page=10 //retornara a segunda pagina com 10 itens

http://meudominio.com/app/recurso?sort=operacao.id&direction=ASC//ordenara ascendentemente pelo id da operação

http://meudominio.com/app/recurso?sort=operacao.id&direction=DESC//ordenara decrescente pelo id da operação

http://meudominio.com/app/recurso?sort[]=id&sort[]=operacao.id//ordenara pelo id e pelo id da operação
```
Se for informado somente a opção "sort", "direction" assume ASC.

Como pode notar a formato é o seguinte "nomeDoCampo=[operacaoLogica]valorDoFiltro", a operação lógica
não é obrigatório, sendo que se não for informada é assumida como "igual".
As operações lógicas disponíveis são:
* == Igual
* =* Igual ignorando maisculas e minusculas
* * Contém
* !* Não Contém
* ^ Começa Com
* $ Termina Com
* !^ Não Começa Com
* !$ Não Termina Com
* <> Diferente
* ∃  Existe
* ∅  Nulo
* !∅ Não Nulo
* >  Maior
* >= Maior ou Igual
* <  Menor
* <= Menor ou Igual