const form = document.getElementById('tasks-form');
const task_list = document.getElementById('tasks');

form.onsubmit = function (e) {
    e.preventDefault();
    const inputField = document.getElementById('tasks-input');
    addTask(inputField.value);
    form.reset();
};

function addTask(description) {
    const tContainer = document.createElement('div');
    const nTask = document.createElement('input');
    const tLabel = document.createElement('label');
    const tDescription_Node = document.createTextNode(description);

    nTask.setAttribute('type' , 'checkbox');
    nTask.setAttribute('name' , description);
    nTask.setAttribute('id' , description);
    
    tLabel.setAttribute('for' , description);
    tLabel.appendChild(tDescription_Node);

    tContainer.classList.add('task-item');
    tContainer.appendChild(nTask);
    tContainer.appendChild(tLabel);

    task_list.appendChild(tContainer);
}

