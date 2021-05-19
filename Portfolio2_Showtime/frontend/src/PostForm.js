import React, { Component } from 'react'
import axios from 'axios'

class PostForm extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             price: "",
             name: "",
             description: "",
             pictureURL: ""
        }
    }

    changeHandler = e => {
        this.setState({ [e.target.name]: e.target.value })
    }

    submitHandler = e => {
        e.preventDefault();

        axios.post("https://localhost:8080/api/items/create", this.state)
            .then(response => {
                console.log(response)
            })
            .catch(error => {
                console.log(error)
            })

    }
    render() {
        const { id, name, price, description, pictureURL } = this.state
        return (
            <div>
                
                <form className="submitProductForm"onSubmit={this.submitHandler}>

                <div className="infoholder">
                    <h1>Lorem</h1>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a gall</p>    
                </div>

                <div className="submitholder">
                    <h1>Add products</h1>

                    <div className="form-product">
                        <label>Name: </label>
                        <input type="text" name="name" value={name} onChange={this.changeHandler}/>
                    </div>

                    <div className="form-product">
                        <label>Price: </label>
                        <input type="text" name="price" value={price} onChange={this.changeHandler}/>
                    </div>

                    <div className="form-product">
                        <label >Picture (URL): </label>
                        <input type="text" name="pictureURL" value={pictureURL} onChange={this.changeHandler}/>
                    </div>

                    <div className="form-product">
                        <label >Short description: </label>
                        <input type="text" name="short-description" value={description} onChange={this.changeHandler}/>
                    </div>

                    <div className="form-product-desc">
                        <label >Description: </label>
                        <input className="desc-input" type="text" name="description" value={description} onChange={this.changeHandler}/>
                    </div>

                    
                    

                    <button onSubmit={this.submitHandler}>Add product</button>
                </div>
            </form>
                
            </div>
        )
    }
}

export default PostForm

