<h2>${category.name}</h2>
<hr/>
<#assign index = -1>
<div class="row">
<#list items as item>
    <#assign index = index + 1>
    <#if index == 3>
        <#assign index = 0>
    </div>
        <#if item_has_next>
        <hr/>
        </#if>
    <div class="row">
    </#if>
    <div class="span4">
        <#include "/briefItemView.ftl">
    </div>
</#list>
<#if index != 0>
</div>
</#if>