import React, { useState } from "react";

export default function Product({
  name,
  price,
  shortdescription,
  picture,
  setCartItems,
  cartItems,
  setCartCounter,
  cartCounter,
}) {
  const product = {
    name: name,
    price: price,
    picture: picture,
  };

  const onButtonClick = () => {
    setCartItems([
      ...cartItems,
      {
        product,
      },
    ]);

    /** setCartCounter(cartCounter + 1) **/
  };

  return (
    <div>
      <div className="product">
        <div className="imgholder">
          <img src={picture}></img>
        </div>

        <div className="productInfo">
          <h1>{name}</h1>
          <p>{shortdescription}</p>
          <h3>{price},-</h3>
          <button onClick={onButtonClick}> Add to cart</button>
        </div>
      </div>
    </div>
  );
}
