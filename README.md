# Primeiro API

Este é um guia sobre como criar e testar uma API básica. Neste exemplo, vou mostrar como configurar operações CRUD (Create, Read, Update, Delete) usando uma API local.

## Estrutura da API

## Utilizando Postman

Primeiro passo no postman é a API está estruturada em uma coleção que inclui os seguintes métodos:

- **GET**: Para obter informações.
- **POST**: Para criar novos registros.
- **PUT**: Para atualizar registros existentes.
- **DELETE**: Para remover registros.

  Como no exemplo:

![Tela de Requisições](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20112231.png)

## Configuração da URL

Como a API está rodando localmente na sua máquina, use a seguinte URL para acessar os endpoints:
http://localhost:8080/o-seu-projeto


- `localhost` refere-se à sua máquina local.
- `8080` é a porta que a API está escutando.
- `/o-seu-projeto` é o caminho para o seu projeto na API.

![Tela da URL](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20112538.png)

## Testando o Endpoint POST

Para enviar uma requisição POST, você precisa configurar os parâmetros no corpo da requisição. No exemplo abaixo, a API adiciona um ID automaticamente. Siga estes passos:

1. Selecione a aba **Body** ao lado de **Headers**.
2. Escolha o formato **raw** e selecione **JSON**.
3. Insira os dados da seguinte forma:

```json
{
  "titulo": "lavar louça",
  "descricao": "lavar panela e pratos"
}
```
Como o exeplo:
![Tela do post](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20113204.png)

quando clicamos em send, mandamos a requisição para o localhost e ele nos retorna o status 200 ok caso dê sucesso, caso o contrario pesquise o erro.
```json
{
  "id": 1,
  "titulo": "lavar louça",
  "descricao": "lavar panela e pratos"
}
```
no meu caso ele me retornaria assim se deu bem sucedido a requisição.



## Testando o Endpoint GET

Neste caso para testar o endpoint GET e pegar todas as informações Insira a URL no campo.


Como o exeplo:

![Tela do GET](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20112945.png)
Salve a configuração e clique em send.

Clique em Send para recuperar os dados e visualizar todos.


## Testando o Endpoint PUT

para testarmos este endpoint precisamos configurar a URL de forma correta, passando o ID no final.
http://localhost:8080/o-seu-projeto/Id-que-deseja-alterar 


- `localhost` refere-se à sua máquina local.
- `8080` é a porta que a API está escutando.
- `/o-seu-projeto` é o caminho para o seu projeto na API.
- `Id-que-deseja-alterar` é o id do objeto que deseja alterar.

Após isso no meu caso coloque o titulo e a descrição que deseja modificar, clique em send e espere o retorno.


Como o exemplo a seguir:
![Tela do GET](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20184307.png)


## Testando o Endpoint Delete



para testarmos este endpoint precisamos configurar a URL de forma correta, passando o ID no final.
http://localhost:8080/o-seu-projeto/Id-que-deseja-alterar 


- `localhost` refere-se à sua máquina local.
- `8080` é a porta que a API está escutando.
- `/o-seu-projeto` é o caminho para o seu projeto na API.
- `Id-que-deseja-alterar` é o id do objeto que deseja alterar.

Após isso clique em send que ele apagara aquela onformação vinculada aquele ID


Como o exemplo a seguir:
![Tela do GET](https://github.com/gu1334/primeiro-api/blob/main/fotos/Captura%20de%20tela%202024-08-15%20184643.png)

