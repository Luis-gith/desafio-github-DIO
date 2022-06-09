
const getAdmins = (team) => {
    let adms = []; //acessando elementos com [key, value]
    for ([key, value] of team) {
        if(value ==='adm') {
            adms.push(key);
        }
    }
    return adms;
}

const getUsers = (teamR) => {
    let users = []; //acessando elementos com [key, value]
    for ([key, value] of teamR) {
        if(value === 'user') {
            users.push(key);
        }
    }
    return users;
}

const staff = new Map();
staff.set('Arthur A', 'adm');
staff.set('Arthur C', 'user');
staff.set('Carla', 'user');
staff.set('Gibel', 'user');
staff.set('Fagundes', 'adm');
staff.set('Lara H', 'adm');
staff.set('Levi', 'user');
staff.set('Luís F', 'adm');

console.log("\nInitializing role verfication... Administrators:");
console.log(getAdmins(staff));

console.log("Normal users:");
console.log(getUsers(staff),"\n");