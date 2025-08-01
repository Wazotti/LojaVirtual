function filtrarCategoria(categoria) {
  const filtrados = produtos.filter(p => p.categoria === categoria);
  renderizarProdutos(filtrados);
}

function mostrarTodosProdutos() {
  renderizarProdutos(produtos);
}