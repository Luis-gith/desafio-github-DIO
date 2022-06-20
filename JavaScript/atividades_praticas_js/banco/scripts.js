class ContaBancaria {
    constructor(agencia, numero, tipo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = 0;
    }

    get saldo() {
        return this._saldo;
    }

    set saldo(value) {
        this._saldo = value;
    }

    sacar(value) {
        if (value > this._saldo){
            return "Operação negada: saldo insuficiente";
        }
        this._saldo = this._saldo - value;

        return `Operação concluída. Saldo atual: ${this._saldo}` 
    }
    
    depositar(value) {
        this._saldo = this._saldo + value;
        return `Operação concluída. Saldo atual: ${this._saldo}` 

    }
}

class ContaCorrente extends ContaBancaria {
    constructor(agencia, numero, cartaoCredito) {
        super(agencia, numero,);
        this.tipo = 'corrente';
        this._cartaoCredito = cartaoCredito;
    }

    get cartaoCredito() {
        return this._cartaoCredito;
    }

    set cartaoCredito(value) {
        this._cartaoCredito = value;
    }
}

class ContaPoupança extends ContaBancaria {
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = 'poupança';
    }
}

class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero) {
        super(agencia, numero);
        this.tipo = 'universitária';
    }

    sacar(value) {
        if(value > this._saldo){
            return "Operação negada: saldo insuficiente";
        }
        else if (value > 500){
            return "Operação negada: limite diário é de 500 reais.";
        }

        this._saldo = this._saldo - valor;
        return `Operação concluída. Saldo atual: ${this._saldo}`
    
    }
}
