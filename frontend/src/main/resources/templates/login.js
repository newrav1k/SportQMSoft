const API_HOST = 'http://localhost:8081';

// Проверка данных перед отправкой формы
function validateLoginForm() {
    const emailInput = document.getElementById('login-email');
    const passwordInput = document.getElementById('login-password');

    if (!emailInput.value.trim()) {
        alert('Введите email.');
        return false;
    }

    if (!passwordInput.value.trim()) {
        alert('Введите пароль.');
        return false;
    }

    return true;
}

// Обработчик отправки формы входа
async function submitLoginForm(event) {
    event.preventDefault();

    if (!validateLoginForm()) return;

    const username = document.getElementById('login-email').value;
    const password = document.getElementById('login-password').value;

    try {
        const response = await fetch(`${API_HOST}/login`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username, password }),
        });

        const result = await response.json();

        if (response.ok) {
            // Сохранение данных пользователя
            localStorage.setItem('user', JSON.stringify(result));

            alert('Добро пожаловать!');
            window.location.href = '/dashboard.html'; // Перенаправление на дашборд
        } else {
            alert(result.message || 'Ошибка входа. Проверьте ваши данные.');
        }
    } catch (error) {
        console.error('Ошибка:', error);
        alert('Произошла ошибка. Пожалуйста, попробуйте позже.');
    }
}

// Назначение обработчика события
document.getElementById('login-form').addEventListener('submit', submitLoginForm);

// Проверка, если пользователь уже вошел
function checkLoggedInUser() {
    const user = localStorage.getItem('user');
    if (user) {
        const parsedUser = JSON.parse(user);
        alert(`Вы уже вошли как ${parsedUser.name || 'пользователь'}.`);
        window.location.href = '/dashboard.html';
    }
}

// Выполнение проверки при загрузке страницы
checkLoggedInUser();