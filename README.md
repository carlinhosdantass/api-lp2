# api-lp2
## PROPOSTA — 1. O PROBLEMA (A DOR)
Muitas pessoas criam metas pessoais, estudar, treinar, guardar dinheiro, ler mais, mas acabam desistindo depois de poucos dias. O principal motivo não é falta de vontade, e sim falta de motivação contínua. Sem estímulos, sem recompensas e sem acompanhamento claro do progresso, o usuário perde o ritmo e volta aos velhos hábitos.
Os aplicativos de metas que existem hoje normalmente só registram tarefas. Eles não engajam, não dão feedback imediato e não fazem o usuário sentir que está avançando. Falta algo simples, mas essencial: motivar o usuário a continuar.

A API proposta resolve esse problema adicionando uma camada leve de gamificação ao processo de acompanhar metas. Nada complexo: pontos, níveis e conquistas básicos, que funcionam como pequenos incentivos para manter o usuário ativo. Cada meta concluída gera progresso visível, recompensa e um histórico que mostra evolução real.
Com isso, a API ajuda a resolver a verdadeira dor: a dificuldade de manter consistência, oferecendo estímulos simples que aumentam o engajamento e tornam mais provável que o usuário continue seguindo suas metas.

## 2. PÚBLICO-ALVO
Pessoas que querem gerenciar metas pessoais (estudo, hábitos, trabalho, saúde).
##3. ESCOPO (FEATURES PRINCIPAIS) — USER STORIES

**Metas**
Como usuário, quero criar metas com título, descrição e prazo, para organizar meus objetivos pessoais.
Como usuário, quero atualizar o status de uma meta (pendente / em andamento / concluída), para acompanhar o progresso.


**Pontuação**
Como usuário, quero ganhar pontos automaticamente ao concluir uma meta, para me sentir recompensado pelo meu progresso.
Como usuário, quero visualizar meu total de pontos, para acompanhar minha evolução. 


**Conquistas**
Como usuário, quero desbloquear conquistas quando atingir certas marcas (ex: 5 metas concluídas), para me sentir motivado.
Como usuário, quero visualizar todas as minhas conquistas desbloqueadas. 


**Progressão**
Como usuário, quero ter um “nível” calculado com base nos meus pontos, para acompanhar meu crescimento.


**Histórico**
Como usuário, quero poder visualizar meu histórico de metas concluídas, para acompanhar tudo o que já realizei.
## 4. DECISÃO DO PROJETO
**A ideia escolhida:** Sistema de Gamificação de Metas

**Justificativa:** Esse projeto foi escolhido para portfólio porque:


**Tem regras de negócio claras:** cálculo de pontos, verificação de conquistas, progressão de nível.


Mostra conhecimento de arquitetura em camadas (Controller, Service, Repository). 


Pode ser expandido no futuro (gráfico de progresso, ranking, sistema de grupos, etc.). 


## 5. STACK DE TECNOLOGIA PROPOSTA
**Framework:** Spring Boot 3+ 


**Linguagem:** Java 17+ 


**Documentação:** Springdoc (Swagger UI) 


**Persistência de Dados:** Repositório em Memória (HashMap)
