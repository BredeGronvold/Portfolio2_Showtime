import React, { useState, useEffect } from "react";
import Product from "./Product";

export default function Shop({ setCartItems, cartItems }) {
  useEffect(() => {
    fetchItems();
  }, []);

  const [items, setItems] = useState([]);

  const fetchItems = async () => {
    const data = await fetch("https://localhost:8080/api/items");
    const items = await data.json();
    console.log(items);
    setItems(items);
  };

  return (
    <div className="test">
      {items.map((item) => (
        <Product
          name={item.name}
          price={item.price}
          picture={item.pictureURL}
          shortdescription={item.shortdescription}
          setCartItems={setCartItems}
          cartItems={cartItems}
        />
      ))}
    </div>
  );
}
