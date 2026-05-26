1. Qual a diferença entre atributo de instância e atributo estático?
Atributo de instância pertence ao objeto. Cada vez que você dá um new, uma nova cópia desse atributo é gerada na memória.

Atributo estático pertence à Classe. Existe apenas uma única cópia dele na memória, que é compartilhada por todos os objetos daquela classe. 

2. Por que utilizamos atributos private?
Utilizamos private para garantir a segurança e o controle sobre os dados do objeto. Isso impede que outras partes do sistema acessem ou modifiquem as variáveis diretamente. Dessa forma, obriga qualquer alteração a passar pelos métodos da classe.

3. O que aconteceria se os atributos fossem public?
Se fossem públicos, o encapsulamento seria quebrado. Qualquer outro programador ou classe do sistema poderia alterar os valores diretamente, ignorando completamente as suas validações.

4. Qual a função do construtor?
A função do construtor é inicializar o objeto no momento de sua criação. Ele garante que o objeto já "nasça" em um estado válido. Se um produto não pode existir sem ter um nome e um preço, o construtor obriga quem está criando o objeto a fornecer essas informações logo de cara, evitando que objetos "incompletos" ou "vazios" fiquem soltos pela memória do programa.

5. Como o encapsulamento ajuda na manutenção do sistema?
O encapsulamento centraliza as regras. Se no futuro a loja mudar a regra e disser: "Agora o preço máximo de um produto não pode passar de R$ 10.000" O encapsulamento facilita isso permitindo que você altere o código em apenas um único lugar. Automaticamente, o sistema inteiro passa a respeitar a nova regra.