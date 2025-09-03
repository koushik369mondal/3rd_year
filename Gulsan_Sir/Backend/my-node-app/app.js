const express = require('express');
const app = express();
app.set('view engine', 'ejs');
app.get('/', (req, res) => {
    const items = ['Apple', 'Banana', 'Cherry', 'Date'];
    res.render('index', { fruits: items });
});
app.listen(3000, () => {
    console.log('Server is running on port 3000');
});