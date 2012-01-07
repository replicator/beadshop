<form id="contactDetails">
    <fieldset>
        <legend>Please enter contact information</legend>
        <div class="clearfix">
            <label for="">Name</label>

            <div class="input">
                <input type="text" size="30" name="name" id="xlInput" class="xlarge required">
            </div>
        </div>
        <div class="clearfix">
            <label for="">Phone</label>

            <div class="input">
                <input type="text" size="30" name="phone" id="xlInput" class="xlarge">
            </div>
        </div>
        <div class="clearfix">
            <label for="">Email</label>

            <div class="input">
                <input type="text" size="30" name="email" id="xlInput" class="xlarge">
            </div>
        </div>
        <div class="actions">
            <span><a href="#" class="btn primary" onclick="app.post('/submitOrder/${item.id}.do', $('#contactDetails').serialize())">Buy</a></span>
            &nbsp;
            <span><a href="#" class="btn">Cancel</a></span>
        </div>
    </fieldset>
</form>