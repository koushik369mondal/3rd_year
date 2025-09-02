const express = require('express');
const app = express();
const PORT = 3000;

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

app.get('/product/:id', (req, res) => {
    const productId = req.params.id;
    res.send(`Product ID: ${productId}`);
});

