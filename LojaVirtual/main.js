let carrinho = [];

function renderizarProdutos(lista = produtos) {
  const container = document.getElementById("produtos-container");
  container.innerHTML = "";

  if (lista.length === 0) {
    container.innerHTML = `
      <div class="col-span-full text-center text-gray-500">
        Nenhum produto encontrado para sua busca.
      </div>
    `;
    return;
  }

  lista.forEach(produto => {
    const card = document.createElement("div");
    card.className = "bg-white shadow p-4 rounded";

    card.innerHTML = `
      <div class="flex items-center justify-center h-48 bg-zinc-50 rounded overflow-hidden cursor-pointer" onclick="abrirModalImagem('${produto.imagem}', '${produto.nome}')">
          <img
            src="${produto.imagem}"
            alt="${produto.nome}"
            class="max-h-full max-w-full object-contain transition-transform duration-200 hover:scale-105"
          />
      </div>
      <h3 class="text-lg font-semibold mt-2">${produto.nome}</h3>
      <p class="text-zinc-600 text-sm">R$ ${produto.valor.toFixed(2)}</p>
      <p class="text-zinc-500 text-xs">Estoque: ${produto.estoque}</p>
      <button onclick="adicionarAoCarrinho(${produto.id})"
          class="mt-2 bg-black text-white px-4 py-1 rounded disabled:opacity-50"
          ${produto.estoque === 0 ? "disabled" : ""}>
          Adicionar ao Carrinho
      </button>
    `;

    container.appendChild(card);
  });
}

function adicionarAoCarrinho(id) {
  const produto = produtos.find(p => p.id === id);
  const itemCarrinho = carrinho.find(p => p.id === id);

  const totalAdicionados = itemCarrinho ? itemCarrinho.quantidade : 0;

  if (produto && totalAdicionados < produto.estoque) {
    if (itemCarrinho) {
      itemCarrinho.quantidade++;
    } else {
      carrinho.push({ ...produto, quantidade: 1 });
    }
  }

  atualizarCarrinho();
}

function atualizarCarrinho() {
  const lista = document.getElementById("lista-carrinho");
  const contador = document.getElementById("contador-carrinho");
  lista.innerHTML = "";

  carrinho.forEach(item => {
    const li = document.createElement("li");
    li.textContent = `${item.nome} - ${item.quantidade}x (R$ ${(item.valor * item.quantidade).toFixed(2)})`;
    lista.appendChild(li);
  });

  const totalItens = carrinho.reduce((soma, item) => soma + item.quantidade, 0);
  contador.textContent = totalItens;
}

function toggleCarrinho() {
  const aside = document.getElementById("carrinho");
  aside.classList.toggle("hidden");
}

function fecharCarrinho() {
  document.getElementById("carrinho").classList.add("hidden");
}

function finalizarCompra() {
  if (carrinho.length === 0) {
    alert("O carrinho está vazio.");
    return;
  }

  for (const item of carrinho) {
    const produtoOriginal = produtos.find(p => p.id === item.id);
    if (!produtoOriginal) continue;
    if (item.quantidade > produtoOriginal.estoque) {
      alert(`Estoque insuficiente para "${item.nome}". Disponível: ${produtoOriginal.estoque}, no carrinho: ${item.quantidade}.`);
      return;
    }
  }

  carrinho.forEach(item => {
    const produtoOriginal = produtos.find(p => p.id === item.id);
    if (produtoOriginal) {
      produtoOriginal.estoque = Math.max(0, produtoOriginal.estoque - item.quantidade);
    }
  });

  alert("Compra finalizada com sucesso!");
  carrinho = [];
  atualizarCarrinho();
  renderizarProdutos(produtos);
}

function pesquisarProduto(termo) {
  const termoNormalizado = termo?.toString().trim().toLowerCase();
  if (!termoNormalizado) {
    renderizarProdutos(produtos);
    return;
  }

  const resultados = produtos.filter(p =>
    p.nome.toLowerCase().includes(termoNormalizado)
  );

  renderizarProdutos(resultados);
}

function abrirModalImagem(src, alt) {
  const modal = document.getElementById("modal-imagem");
  const imgAmpliada = document.getElementById("imagem-ampliada");

  imgAmpliada.src = src;
  imgAmpliada.alt = alt;

  modal.classList.remove("hidden");
}

function fecharModalImagem() {
  const modal = document.getElementById("modal-imagem");
  modal.classList.add("hidden");
}

document.getElementById("fechar-modal").addEventListener("click", fecharModalImagem);

document.getElementById("modal-imagem").addEventListener("click", (e) => {
  if (e.target.id === "modal-imagem") fecharModalImagem();
});

document.addEventListener("DOMContentLoaded", () => {
  renderizarProdutos(produtos);
});

function togglePesquisa() {
  const barra = document.getElementById("barra-pesquisa");

  if (barra.classList.contains("w-0")) {
    barra.classList.remove("w-0", "opacity-0");
    barra.classList.add("w-40", "opacity-100");
    barra.focus();
  } else {
    barra.classList.remove("w-40", "opacity-100");
    barra.classList.add("w-0", "opacity-0");
  }
}