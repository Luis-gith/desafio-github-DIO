var a = 1;
//para funcionar, troque tipo para unknonw
//a = 'Robin';
var isWinter = false;
var count = 5;
var pName = 'Marcus';
var names = ['Jonathan', 'Levi', 'Luke', 'Trevor'];
var starks;
(function (starks) {
    starks[starks["John"] = 0] = "John";
    starks[starks["Brandon"] = 1] = "Brandon";
    starks[starks["Ed"] = 2] = "Ed";
    starks[starks["Catlyn"] = 3] = "Catlyn";
})(starks || (starks = {}));
;
var br = starks.Brandon;
function getName() {
    return "Brandon";
}
