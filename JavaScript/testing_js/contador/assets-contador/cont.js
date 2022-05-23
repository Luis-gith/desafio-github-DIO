var cnum_wrapper = document.getElementById('cnum');
var cnum = 0;

function increment() {
    cnum = cnum + 1;
    cnum_wrapper.innerHTML = cnum;
}

function decrement() {
    cnum = cnum - 1;
    cnum_wrapper.innerHTML = cnum;
}
