const express = require('express');
const app = express();
app.set('view engine', 'ejs');

// Route for rendering the EJS file
app.get('/', (req, res) => {
    const user = { name: 'Alice', role: 'user', loggedIn: false };
    res.render('index', { user });
});

app.listen(3000, () => {
    console.log('Server is running on port 3000');
});