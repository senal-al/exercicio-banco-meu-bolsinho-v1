## Situação para aprendizagem.  

Você foi contratado pelo banco Meu Bolsinho S/A. Agora, você deve criar um software que atenda aos requisitos abaixo:

Uma classe genérica chamada Conta:  
Parâmetros da classe:  
* Número da conta;
* Nome do titular;  
* Idade; 
* Saldo da conta.
  
Construtores da conta:  
- Padrão;  
- Personalizados com atributos iguais aos da classe.
  
Métodos:
- Gets e Sets. OBS.: NÃO CRIAR SET PARA SALDO da conta.  
- Saldo e Depósito. São métodos sem retorno.  
- Empréstimo, esse método aumenta o saldo, caso seja utilizado, ou seja, é um “crédito” que vai entrar no saldo, mas há débito, pois será necessário quitar o empréstimo.  
- Saque, esse método deduz o saldo, caso seja utilizado.  
- Depósito, esse método aumenta o saldo, caso seja utilizado.  

Uma classe com herança chamada ContaEmpresarial:  
Parâmetros da classe:  
* Limite para Saque;  
* Limite para Empréstimos.
  
Construtores da conta:
* Padrão;  
* Personalizado, herdado da super classe e com os parâmetros da classe.
  
Métodos:  
* Gets e Sets, para os parâmetros da classe;  
* Empréstimo, há uma taxa adicional de R$ 50,00 ao se fazer um empréstimo. Este é um método sobrecarregado.  
* Saque, há uma taxa adicional de R$ 5,00 ao se fazer um saque. Este é um método sobrecarregado.  
Uma classe com herança chamada ContaPessoaFisica:

Parâmetros da classe:  
* Limite para Saque;  
* Limite para Empréstimos.

Construtores da conta:  
* Padrão;  
* Personalizado, herdado da super classe e com os parâmetros da classe.

Métodos:  
* Gets e Sets, para os parâmetros da classe;  
* Empréstimo, há uma taxa adicional de R$ 15,00 ao se fazer um empréstimo. Este é um método sobrecarregado.  
* Saque, há uma taxa adicional de R$ 3,00 ao se fazer um empréstimo. Este é um método sobrecarregado.
 
Uma classe com herança chamada ContaPoupança:  
Parâmetros da classe:  
* Rendimento, fixo em 0.07;

Construtores da conta:  
* Padrão;  
* Personalizado, herdado da super classe.

Métodos:  
* Get, para o parâmetro da classe;  
* Rendimentos, este método atualiza com saldo da conta.  

Cria uma classe chamada Aplicação, é nela os seguintes objetos:  
* Duas contas empresariais;  
* Três contas Pessoa Física;  
* Duas Contas poupanças;  
### Restrições:  
Você deve em cada conta, solicitar todos os dados de um usuário, utilize o Scanner.  
* Não será permitido realizar um saque, se o saldo da conta estiver sem valor, ou seja, sem dinheiro.  
* Não será possível realizar empréstimo se o tipo de conta for poupança.
 
>[!IMPORTANT]
>Ao final, seu programa deve emitir um extrato de todas as contas cadastradas. Não esqueça também de listar no extrato, os seus respectivos donos.

>[!NOTE]
>**Seu projeto deve ser publicado no GitHub como público.**
>Ao entregar seu projeto, **NÃO É NECESSÁRIO enviar os códigos fontes**, **envie o link para o seu repositório no GitHub**.
