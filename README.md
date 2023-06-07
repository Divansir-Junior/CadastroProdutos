Este código em Java implementa um sistema de cadastro de produtos, cálculo do total e subtotal de um pedido, além de exibir informações do cliente e o horário da compra. Ele pode ser útil para demonstrar uma funcionalidade básica de gerenciamento de pedidos.

O código consiste em quatro partes principais:

Classe OrderItens: Essa classe representa um item do pedido e possui campos como nome do produto, preço do produto, quantidade e subtotal. O cálculo do subtotal é realizado no método calculateSubTotal(). A classe também possui métodos getter e setter para acessar e definir os valores dos campos, bem como um método toString() para exibir os detalhes do item do pedido.

Classe OrderUsers: Essa classe representa os dados do cliente, como nome, e-mail e data de nascimento. Ela possui construtores, métodos getter e setter, e um método toString() para exibir as informações do cliente.

Enumeração OrderStatus: Essa enumeração define os possíveis status de um pedido, como "PROCESSING", "DELIVERED", etc. Ela é utilizada na classe Order para definir o status do pedido.

Classe Order: Essa classe representa um pedido e contém os campos momento (horário da compra) e status. Ela possui construtores, métodos getter e setter, e um método toString() para exibir o resumo do pedido.
