<div class="row">
    <h2>${item.name}</h2>
    <img class="thumbnail" src="${item.logo}" width="256" height="256"/>
    <div>${item.description}</div>
    <div>Price: $${item.price}</div>
    <p><a class="btn" href="#" onclick="app.loadPageContent('buyItem', ${item.id}')">Buy &raquo;</a></p>
</div>
<h2>Comments</h2>
<div class="row">
    <#list item.comments as comment>
        <hr/>
        <div>
            ${comment.text}
        </div>
    </#list>
</div>