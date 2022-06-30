var GoT = /** @class */ (function () {
    function GoT() {
        this.name = "Brandon";
        this.saying = GoT.castle;
    }
    GoT.prototype.hello = function (person) {
        console.log("Hello, " + person);
    };
    GoT.castle = "Winterfell";
    return GoT;
}());
var ned = new GoT;
ned.saying = "Winter is coming to";
console.log(ned.saying);
console.log(GoT.castle);
ned.hello("Robert");
