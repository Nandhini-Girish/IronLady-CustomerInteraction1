function sendMessage() {
    let input = document.getElementById("userInput");
    let message = input.value;

    if (message === "") return;

    addMessage("You", message, "user");

    fetch("http://localhost:8080/api/chat", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ message: message })
    })
    .then(response => response.json())
    .then(data => {
        addMessage("Iron Lady AI", data.reply, "bot");
    });

    input.value = "";
}

function addMessage(sender, message, className) {
    let chatBox = document.getElementById("chat-box");
    let msg = document.createElement("div");
    msg.className = className;
    msg.innerHTML = `<b>${sender}:</b> ${message}`;
    chatBox.appendChild(msg);
    chatBox.scrollTop = chatBox.scrollHeight;
}

