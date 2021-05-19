import React, { useState } from "react";
import CartProduct from "./CartProduct";
import "./App.css";

export default function PurchaseOK({ items, totalPrice, setTotalPrice }) {
  return (
    <div className="purchaseholder">
      <div>
        <h1>Purchase successful!</h1>
        <h2>Your purchase:</h2>
        
      </div>
    </div>
  );
}
