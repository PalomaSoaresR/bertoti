# Layered Architecture Style - serviços de dia a dia
trade-offs: você fara um  sistema de baixo custo e simples porém será um sistema que não irá possuir uma elasticidade boa com seu dados e nem escalabilidade, então seria um sistema simples
Sistema desenvolvido: sistema de controle de acesso

# Pipeline Architecture Style 
trade-offs: também uma arquitetura de baixo-custo e simples porém com pouca elasticidade, escalabilidade e baixa tolerancia ao erro
Sistema desenvolvido: 

# Microkernel Architecture Style - especificas
trade-offs: uma arquitetura com otimo custo beneficio, simplicidade e performace porém com pouco escalabilidade, elasticidade e pouca toletancia de erro
Sistema desenvolvido: controle de estoque para pequenas empresas, pois seria simples e com baixo custo, por ser pequena empresa seria mais facil de controlas erros e não precisaria ter elasticidade pois a empresa não é de grande porte

# Service-Based Architecture Style - serviços de dia a dia
trade-offs: é uma arquitetura que possui muitos bons requisitos não funcionais porem não possui uma boa escalabilidade mas um pouco mais que as outras  
Sistema desenvolvido: sistema de cadatro de uma portaria 

# Event-Driven Architecture Style - serviços de dia a dia
trade-offs: possui uma arquitetura com um custo beneficio mais alta comparado com as outras e simplicidade menor, porem com escalabilidade, performace e tolerancia de erro bons
Sistema desenvolvido: sistema de analise de mercado financeiro, pois sua evolução permitiria que novos dados fossem processados

# Microservices Architecture - serviços de dia a dia
trade-offs: como visto nos outros quanto mais escalabilidade, elasticidade e evolução maior o custo beneficio e mais dificuldade é encontrada  na arquitetura, que é o caso desta.
Sistema desenvolvido: sistema de uma loja virtual, onde pode haver compras, reclamações, pesquisas e etc, com sua boa elasticidade e evolução, facilitaria a adição de novos dados processados