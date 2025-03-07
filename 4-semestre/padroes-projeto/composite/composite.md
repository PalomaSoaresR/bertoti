- **Composite (agrega somente interfaces)**  
    - Ele compõe objetos em estrutura de árvores (estrutura composta, que corresponde a objetos individuais e grupos de forma igual).  
    - Fazemos uma classe abstrata que possui métodos que usaremos nos “arquivos” e nas “pastas”.  
    - Os métodos são:  
        - `exibir()` → Exibe o conteúdo (arquivos, pastas, menus, etc.).  
        - `getNome()` → Retorna o nome do componente.  
        - Para objetos compostos (pastas):  
            - `adicionar(Componente c)` → Adiciona um componente à estrutura.  
            - `remover(Componente c)` → Remove um componente da estrutura.  
            - `getFilhos()` → Retorna a lista de componentes filhos.  
                - `List<composite> filhos = new ArrayList<>();`  
                - Métodos `add` e `remove` para gerenciá-los.  
    
    > Objetos individuais usam somente `exibir()` e `getNome()`.
