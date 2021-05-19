import React, { useState } from "react";

export default function CartProduct(props, { removeItem }) {
  const [count, setCount] = useState(1);
  const [price, setPrice] = useState(props.price);

  const priceCalc = () => {
    setCount(count + 1);
    setPrice((count + 1) * props.price);
  };

  return (
    <div>
      <div className="cartproduct">
        <div className="cartimgholder">
          <img src={props.picture}></img>
        </div>

        <div className="cartproductInfo">
          <h2>{props.name}</h2>
          <h3>{props.price},-</h3>
          <a onClick={removeItem}>Remove</a>
        </div>

        <div className="quantity">
          <h4>{count}</h4>
          {/* <button onClick={() => priceCalc()}>+</button>*/}
        </div>

        <div className="totalprice">
          <h3>{price},-</h3>
        </div>
      </div>
      <div className="strokemid"></div>
    </div>
  );
}
