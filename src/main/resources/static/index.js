const todoListContainer = document.getElementById("todoListContainer");

let fetchedVideoList = [];

const loadFetchedVideoList = () => {
    fetchedVideoList.map(videoList => addToDo(videoList.title));
}

// Method to get todoList from Api
const fetchVideos = async () => {
// fetch is built in javascript api for my HTTP request
    const response  = await fetch("http://localhost:8000/api/todolist/get/all");
    const  data = await response.json();
    fetchedVideoList = data;
    console.log('fetchedVideoList', fetchedVideoList)
    loadFetchedVideoList();
}

fetchVideos();

// Method to add new HTML element on DOM
const addToDo = (title) => {
    const position = "beforeend";

    const item = `
        <div class="card">
            <div class="card-content">
                <p class="title has-text-centered">${title}</p>
            </div>
            <footer class="card-footer">
                <a href="#" class="card-footer-item">Save</a>
                <a href="#" class="card-footer-item">Edit</a>
                <a href="#" class="card-footer-item">Delete</a>
            </footer>
        </div>
    `

    todoListContainer.insertAdjacentHTML(position, item);
}







