<div class="well">
    <h5>Categories</h5>
    <ul>
    <#list categories as category>
        <li><a href="#" onclick="app.loadPageContent('category', ${category.id})">${category.name}</a></li>
    </#list>
    </ul>
</div>