import "./App.css";
import React, { useState, useEffect } from "react";
import Product from "./Product";
import CartProduct from "./CartProduct";
import Cart from './Cart'

function App(props) {
  useEffect(() => {
    fetchItems();
  }, []);

  const [items, setItems] = useState([]);
  const [totalPrice, setTotalPrice] = useState(0);

  var price = 0;

  const fetchItems = () => {
    setItems(props.cartItems);
  };

  items.map((item) => (price += item.product.price));

  return (
    <div className="cartholder">
      <div className="cart">
        <div>
          <h1 className="shoppingheader">Shoppingcart</h1>
          <div className="cartheader">
            <h3>Product</h3>
            <h3>Quantity</h3>
            <h3>Subtotal</h3>
          </div>

          {items.length != 0 ? (
            <Cart items={items} setTotalPrice={setTotalPrice} totalPrice={totalPrice} price={price}/>
          ) : (
            <h1>Cart is empty</h1>
          )}
          
        </div>
      </div>
    </div>
  );
}

export default App;
