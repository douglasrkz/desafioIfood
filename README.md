# Desafio Ifood
Este projeto consiste em uma API desenvolvida em Java, utilizando Java Spring, AWS Simple Queue Service, MongoDB e AWS Simple Storage Service.

## Endpoints da API

API PRODUTO:

```
POST /api/product - Cria um novo produto
GET /api/product - Consulta todos os produtos
PUT /api/product/{id} - Atualiza um produto
DELETE /api/product/{id} - Deleta um produto
```
Corpo da Requisição:
```
{
  "title": "Teste",
  "description": "",
  "ownerId": "4444",
  "categoryId": "a6s5d41a6s5d1",
  "price": 1000
}
```
API CATEGORIA
```
POST /api/category - Cria uma nova categoria
GET /api/category - Consulta todas as categorias
PUT /api/category/{id} - Atualiza uma categoria
DELETE /api/category/{id} - Deleta uma categoria
```
Corpo da Requisição:
```
{
  "id": "392828",
  "title": "Teste",
  "description": "",
  "ownerId": "44444"
}
```
# Banco de Dados

O projeto utiliza MongoDB como banco de dados.
