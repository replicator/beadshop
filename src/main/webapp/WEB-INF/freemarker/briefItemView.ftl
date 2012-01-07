<h2>${item.name}</h2>
<img class="thumbnail" src="${item.logo}" width="140" height="140"/>
<p>${item.description}</p>
<div>Price: ${item.price}</div>
<span><a class="btn" href="#" onclick="app.loadPageContent('itemDetails', ${item.id})">Details &raquo;</a></span>
<span><a class="btn" href="#" onclick="app.loadPageContent('buyItem', ${item.id})">Buy &raquo;</a></span>