import React, { useState } from "react";
import LoginForm from "./LoginForm";
import { useHistory } from "react-router-dom";
import ProductHandler from "./ProductHandler";
import PostForm from "./PostForm";

function Login(props) {
  const [user, setUser] = useState({ email: "" });
  const [error, setError] = useState(useState(""));

  console.log(props.cartItems);

  return (
    <div>
      {user.email != "" ? (
        <PostForm />
      ) : (
        <LoginForm
          user={user}
          setUser={setUser}
          error={error}
          setError={setError}
        />
      )}
    </div>
  );
}

export default Login;
