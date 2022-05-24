let cont = 0;

const CNUM= document.getElementById("cnum");

function increment() {
    cont++;
    CNUM.innerHTML = cont;
}

function decrement() {
    cont--;
    CNUM.innerHTML = cont;
}

/* não consegui fazer funcionar o stop do contador 

if (cont >= 10) {
    document.getElementsByName(adicionar).disabled = true;

}

if (cont <= 0){
    document.getElementsByName(subtrair).disabled = true;
}
*/