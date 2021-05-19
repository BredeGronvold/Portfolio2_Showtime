import React, { useState } from 'react'


export default function LoginForm(props) {
    
    const adminUser = {
        email: "admin@admin.com",
        password: "123456"
    }


    const [details, setDetails] = useState({name: "", email: "", password: ""});

    const Loginn = details => {
        console.log(details);

        if (details.email == adminUser.email && details.password == adminUser.password) {
            
            props.setUser({
                name: details.name,
                email: details.email
            });
        } else {
            console.log("Wrong login credentials")
            props.setError("Wrong login credentials")
        }
    } 

    const Logout = () => {
        console.log("Logout");
    }

    const submitHandler = e => {
        e.preventDefault();

        Loginn(details); 
    }

    return (
        <form className="form" onSubmit={submitHandler}>
            <div className="form-inner">
                <h2>Login</h2>
                {(props.error != "") ? ( 
                    <div className="error">
                        {props.error}
                    </div>
                ) : ""}
                <div className="form-group">
                    <label htmlFor="email">Email:</label>
                    <input type="email" name="email" id="email" onChange={e => setDetails({...details, email: e.target.value})} value={details.email}/>
                </div>

                <div className="form-group">
                    <label htmlFor="passoword">Password:</label>
                    <input type="password" name="password" id="password" onChange={e => setDetails({...details, password: e.target.value})} value={details.password}/>
                </div>
                <button onSubmit={submitHandler}>Login</button>
            </div>
        </form>
    )
}
