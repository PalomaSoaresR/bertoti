# Layered Architecture Style
Bom: custo benefício e simplicidade
Ruim: implantação e elasticidade
Sistema desenvolvido: sistema de controle de acesso de um condominio, não necessida de elasticidade pois serão pucos dados adicionados, e sendo simples e de baixo custo beneficio faz sentido fazer para algo simples.

# Pipeline Architecture Style
Bom: custo benefício e simplicidade
Ruim: elasticidade e tolerancia de erro
Sistema desenvolvido: sistema de folha de pagamento e poderiamos resolver a tolerancia de erro com validações de dados antes de salvar

# Microkernel Architecture Style
Bom: custo benefício e simplicidade
Ruim: elasticidade e tolerancia de erro
Sistema desenvolvido: controle de estoque para pequenas empresas, pois seria simples e com baixo custo, por ser pequena empresa seria mais facil de controlas erros e não precisaria ter elasticidade pois a empresa não é de grande porte

# Service-Based Architecture Style
Bom: tolerancia de erro e modularidade
Ruim: elasticidade e performace 
Sistema desenvolvido: sistema de cadatro de uma portaria 

# Event-Driven Architecture Style
Bom: evolução e performace
Ruim: simplicidade e testabilidade
Sistema desenvolvido: sistema de analise de mercado financeiro, pois sua evolução permitiria que novos dados fossem processados

# Microservices Architecture
Bom: elasticidade e escalabilidade
Ruim: custo beneficio e simplicidade
Sistema desenvolvido: sistema de uma loja virtual, onde pode haver compras, reclamações, pesquisas, acompanhamento de pedido, pagamento, com sua boa elasticidade facilitaria a adição de novos dados processados e sua escalabilidade ajuda com os varios serviços que essa mesma loja ira ter.