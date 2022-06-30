class GoT {
    name : string = "Brandon";
    static castle : string = "Winterfell"
    saying : string;

    constructor() {
        this.saying = GoT.castle;
    }

    hello(person : string) {
        console.log("Hello, " + person);
    }
}

var ned = new GoT;
ned.saying = "Winter is coming to";
console.log(ned.saying);
console.log(GoT.castle);
ned.hello("Robert");