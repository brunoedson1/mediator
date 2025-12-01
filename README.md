# 🧠 Padrão Comportamental Mediator – Central Financeira

Este projeto demonstra o uso do **padrão comportamental Mediator** para organizar a comunicação entre diferentes setores e analistas dentro de um sistema financeiro.  
O objetivo é **reduzir acoplamento**, centralizar regras de interação e facilitar manutenção e extensão das comunicações internas.

---

## 📘 O que é o Padrão Mediator?

O **Mediator** é um padrão que **centraliza a comunicação entre objetos**, evitando conexões diretas entre eles.  
Em vez de cada objeto conversar diretamente com outro, eles interagem exclusivamente com o mediador.

✔ Evita dependências cruzadas  
✔ Facilita mudança das regras de comunicação  
✔ Mantém o sistema mais modular e organizado  

> **Analista → Mediador → Setor Financeiro**  
Não existe comunicação direta entre Analista e Tesouraria, por exemplo.

---

## 🧪 Testes Automatizados
Os testes validam:
- Que o analista não conversa diretamente com a Tesouraria.
- Que cada tipo de solicitação é roteado corretamente pelo mediador.
- Que a resposta combinada (mediador + setor) segue o padrão definido.

---

## ⭐ Benefícios de usar Mediator no sistema financeiro

Baixo acoplamento
Analista não conhece Tesouraria nem seus métodos internos.

Centralização das regras
Mudanças na comunicação são feitas somente no Mediator.

Expansão fácil
Basta adicionar novos setores e métodos no Mediator.

Organização limpa da comunicação
Evita o “caos” de múltiplas interações diretas.

## 🧠 Quando usar?

Use o Mediator quando:
- Vários objetos precisam interagir entre si
- O acoplamento entre eles está crescendo demais
- Mudanças nas interações estão difíceis de implementar
- Quer um ponto central de orquestração
## Exemplos reais:
- Chats com sala (mediador = servidor)
- Módulos de compras conversando com estoque e financeiro
- Sistemas com workflows complexos
