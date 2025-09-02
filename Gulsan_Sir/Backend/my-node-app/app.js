const express = require('express');
const app = express();

// Start the server
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

// Set the template engine to EJS
app.set('view engine', 'ejs');

// Serve static files (optional)
app.use(express.static('public'));

app.get('/', (req, res) => {
    res.render('index', { siteTitle: 'My EJS Site', user: 'Kaushik Mandal',
    items: ['Item 1', 'Item 2', 'Item 3'] });
});