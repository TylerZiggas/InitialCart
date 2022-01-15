<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
        <title>Order Processed</title>
    </head>
    <body>
        <h1>Thank You For Your Order!</h1>

        <p>Here Is the Information That You Entered:</p><br>

        <label>Your Name</label><br>
        <span>${order.name}</span><br><br>
        <label>Your Email</label><br>
        <span>${order.email}</span><br><br>
        <label>Book Ordered</label><br>
        <span>${order.bookTitle}</span><br><br>

        <p>To request another order, please hit the return button below.</p>

        <form action="" method="get">
            <input type="hidden" name="action" value="return">
            <input type="submit" value="Return" class="buttons">
        </form>
    </body>
</html>