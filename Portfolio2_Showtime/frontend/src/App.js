import React, { useState, useEffect } from "react";
import "./App.css";
import Nav from "./Nav.js";
import Shoppingcart from "./Shoppingcart";
import Shop from "./Shop";
import Login from "./Login";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import TestShop from "./TestShop";
import PurchaseOK from './PurchaseOK'


function App() {
  const [cartItems, setCartItems] = useState([]);
  const [cartCounter, setCartCounter] = useState(1);


  return (
    <div className="app">
      <Router>
        <div className="nav">
          <Nav cartItems={cartItems} />

          <Switch>
            <Route path="/login" render={(props) => <Login />} />

            <Route
              path="/cart"
              render={(props) => (
                <Shoppingcart
                  cartItems={cartItems}
                  setCartItems={setCartItems}
                />
              )}
            />

            <Route
              path="/purchasesuccessful"
              render={(props) => (
                <PurchaseOK />
              )}
            />

            <Route
              path="/"
              render={(props) => (
                <div className="shopHolder">
                  <div className="shopitems">
                    <Shop
                      {...props}
                      setCartItems={setCartItems}
                      cartItems={cartItems}
                    />
                  </div>
                </div>
              )}
            />
          </Switch>
        </div>
      </Router>
    </div>
  );
}

export default App;
