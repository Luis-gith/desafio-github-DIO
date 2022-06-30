interface Stark {
    name : string;
    age? : number; //question mark makes property optional
}

function printName(stark : Stark) {
    console.log(stark.name);
}

printName({name:'Lewis'});