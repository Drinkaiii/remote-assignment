const buttonLogin = document.querySelector(".loginArea button");
const buttonRegister = document.querySelector(".registerArea button");

const divSwitchLogin = document.querySelector(".switchMode > div:nth-child(1)");
const divSwitchRegister = document.querySelector(".switchMode > div:nth-child(2)");

const blockLogin = document.querySelector(".loginArea");
const blockRegister = document.querySelector(".registerArea");

const inputUsernameLogin = document.querySelector(".loginArea > div:nth-child(1) input");
const inputPasswordLogin = document.querySelector(".loginArea > div:nth-child(2) input");
const inputUsernameRegister = document.querySelector(".registerArea > div:nth-child(1) input");
const inputPasswordRegister = document.querySelector(".registerArea > div:nth-child(2) input");
const inputCheckRegister = document.querySelector(".registerArea > div:nth-child(3) input");

const resultText = document.querySelector(".resultArea > p");

//login
buttonLogin.addEventListener("click", () => {

    if (inputUsernameLogin.value !== "" && inputPasswordLogin.value !== "") {
        const data = JSON.stringify({
            email: inputUsernameLogin.value,
            password: inputPasswordLogin.value
        });
        fetch("/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: data
        })
            .then(response => response.text())
            .then(data => {
                resultText.innerText = data;
                if (data === "Login successful")
                    window.location.href = "/memberPage";
            });
    } else
        resultText.innerText = "Please enter complete infomation";
    //show reuslt text
    resultText.classList.remove("hideClass");
});

//register
buttonRegister.addEventListener("click", () => {

    const xhr = new XMLHttpRequest();
    if (inputUsernameRegister.value !== "" && inputPasswordRegister.value !== "" && inputCheckRegister.value !== "")
        if (inputPasswordRegister.value === inputCheckRegister.value) {
            let data = JSON.stringify({
                email: inputUsernameRegister.value,
                password: inputPasswordRegister.value
            });
            xhr.open("POST", "/register");
            xhr.setRequestHeader("Content-Type", "application/json");
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status === 200)
                    resultText.innerText = xhr.responseText;
                else
                    resultText.innerText = "Connection failed";
            };
            xhr.send(data);
        } else
            resultText.innerText = "Both password need to match";
    else
        resultText.innerText = "Please enter complete infomation";
    //show reuslt text
    resultText.classList.remove("hideClass");
});

//switch to login block
divSwitchLogin.addEventListener("click", () => {
    blockLogin.classList.remove("hideClass");
    blockRegister.classList.add("hideClass");
    resultText.classList.add("hideClass");
});

//switch to register block
divSwitchRegister.addEventListener("click", () => {
    blockLogin.classList.add("hideClass");
    blockRegister.classList.remove("hideClass");
    resultText.classList.add("hideClass");
});

inputUsernameRegister.addEventListener('blur', function () {
    //building
});

//inti process
document.querySelector(".registerArea").classList.add("hideClass");
resultText.classList.add("hideClass");

