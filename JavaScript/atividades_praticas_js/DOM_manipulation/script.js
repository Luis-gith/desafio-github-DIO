function changeMode() {
    changeClasses();
    changeText();
}

function changeClasses() {
    button.classList.toggle(darkClass);
    h1.classList.toggle(darkClass);
    body.classList.toggle(darkClass);
    footer.classList.toggle(darkClass);
}

function changeText() {
    const light = "Light Mode"
    const dark = "Dark Mode"

    if(body.classList.contains(darkClass)) {
        button.innerHTML = light;
        h1.innerHTML = dark + "ON";
        return;
    }
    button.innerHTML = dark;
    h1.innerHTML = light + "ON"

}
const darkClass = 'dark-mode';
const button = document.getElementById('mode-selector');
const h1 = document.getElementById("page-title");
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];


button.addEventListener('click', changeMode);