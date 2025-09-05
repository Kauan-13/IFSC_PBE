const express = require('express');
const app = express();
const port = 8080;

app.use(express.json());

app.get('/', (req, res) => {
    res.send("<a href='/hello'> hello </a>");
});

app.get('/hello', (req, res) => {
    res.send('<h1>Hello world!</h1>');
});

app.post('/submit/:id', (req, res) => {
    const id = req.params.id;
    res.send('Dados recebidos via POST: ' + id);
});

app.get('/busca', (req, res) => {
  const algo = req.query.algo;
  const limit = req.query.limit || 10; // valor padrão
  res.send(`Busca por: ${algo}, limit: ${limit}`);
});

app.post('/mostra', (req, res) => {
  const { algo, limit } = req.body;
  res.send(`${algo}: ${limit}`);
});

app.use((req, res) => {
  res.status(404).send('Rota não encontrada');
});

app.listen(port, () => {
    console.log(`Servidor rodando em http://localhost:${port}`);
});