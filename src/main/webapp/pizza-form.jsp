<%--
  Created by IntelliJ IDEA.
  User: kenyonluce
  Date: 5/31/21
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/pizza-order" method="POST">
    Crust Type: <select name="crustType" id="crust">
                    <option value="crust">1</option>
                    <option value="crust">2</option>
                    <option value="crust">3</option>
                </select><br>
    Sauce Type: <select name="sauceType" id="sauce">
                    <option value="sauce">1</option>
                    <option value="sauce">2</option>
                    <option value="sauce">3</option>
                </select><br>
    Size Type:  <select name="sizeType" id="size">
                    <option value="size">1</option>
                    <option value="size">2</option>
                    <option value="size">3</option>
                </select><br>
    Toppings:   <input type="checkbox" id="1" name="1">
                <label for="1">1</label>
                <input type="checkbox" id="2" name="2">
                <label for="2">2</label>
                <input type="checkbox" id="3" name="3">
                <label for="3">3</label>
                <input type="checkbox" id="4" name="4">
                <label for="4">4</label><br>
    Delivery Address: <label for="address"></label><input type="text" id="address">
</form>
