import React, { useState } from 'react'
import LoginForm from './LoginForm'
import axios from 'axios'

export default function ProductHandler(props) {

    const [product, setProduct] = useState({id: "", name: "", price: "", pictureURL: "", shortdescription: "", description: ""})



    const submitHandler = e => {
        e.preventDefault();

        axios.post("https://localhost:8080/api/addItem", product)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })

    }

     return (
        <div>
            
        </div>
    )
}
