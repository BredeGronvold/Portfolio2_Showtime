import React, { useState } from "react";
import "./App.css";
import { Link } from "react-router-dom";
import styled from "styled-components";

function Nav({ cartItems }) {
  const [count, setCount] = useState(0);

  const StyledLink = styled(Link)`
  text-decoration: none;
    `;

  return (
    <div>
      <div className="header">
        <StyledLink to="/">
          <h1>Webshop</h1>
        </StyledLink>

        <ul className="nav-links">
          <StyledLink to="/login">
            <li>Add products</li>
          </StyledLink>

          <div className="cartlogo-counter-holder">
            <StyledLink to="/cart">
              <img
                width="35px"
                src="https://cdn.iconscout.com/icon/free/png-256/shopping-cart-452-1163339.png"
              ></img>
            </StyledLink>

            <div className="counter-holder">
              <h3>{cartItems.length}</h3>
            </div>
          </div>
        </ul>
      </div>
    </div>
  );
}

export default Nav;
