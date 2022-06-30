class Person {
    name : string;
    constructor(name : string) {
        this.name = name;
    }

    dance() {
        console.log(this.name + " is dancing.");
    }
}

let bran = new Person("Brandon");
bran.dance();

class bPerson extends Person {
    dance() {
        super.dance();
        console.log(`${this.name} is a better dancer.`)
    }
}

let rob = new bPerson("Robert");
rob.dance();