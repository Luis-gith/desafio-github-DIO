Um serviço é uma classe com propósito bem definido, utilizada para fazer processamento de dados e, geralmente, não aparece na tela. Contribui para a reutilização: se a lógica for feita separadamente do componente(dentro do service), ele se torna reciclável e fácil de manter.



1. A **injeção de dependência** é utilizada para fornecer aos componentes os serviços que eles podem usar. Para definir uma classe como serviço no Angular, usamos o decorator **@Injectable()**. Esse decorator fornece os metadados que permitem ao Angular injetar os serviços necessários dentro do componente como uma dependência.

