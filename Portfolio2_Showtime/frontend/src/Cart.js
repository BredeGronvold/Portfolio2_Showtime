import React, { useState } from "react";
import "./App.css";
import CartProduct from "./CartProduct";
import { Link } from "react-router-dom";

export default function Cart({ items, totalPrice, setTotalPrice, price }) {
  
  return (
    <div>
      {items.map((item) => (
        <CartProduct
          name={item.product.name}
          price={item.product.price}
          picture={item.product.picture}
          totalPrice={totalPrice}
          setTotalPrice={setTotalPrice}
        />
      ))}
      <div className="stroke"></div>
      <div className="totalPrice">
        <p>Total price: {price},-</p>
      </div>
      <div className="checkoutHolder">
        <Link to="/purchasesuccessful">
          <button>CHECKOUT</button>
        </Link>
      </div>
    </div>
  );
}
