//entrega nome de cada key(fname, lname, age)
const person = {fname:"Luís Felipe", lname:"Belasco Silva", age:18};

function forIn(object) {
  for (a in object) {
  console.log(a);
 }
}

forIn(person);

//entrega o valor em cada key
function forIn2(object) {
  for (b in object) {
    console.log(object[b])
  }
}

forIn2(person);