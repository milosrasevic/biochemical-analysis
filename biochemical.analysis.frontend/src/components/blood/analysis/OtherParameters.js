import React, { Component } from 'react'

class OtherParameters extends Component {
    constructor(props) {
        super(props)

        this.state = {
            fibrinogen: '',
            proteins: false
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white">
                <h6 className="mt-2">Other parameters</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputFibrinogen">Fibrinogen:</label>
                    <input type="text" name="fibrinogen" value={this.state.fibrinogen} onChange={this.handleChange} className="form-control my-form-control" id="inputFibrinogen"/>
                </div>
                <div className="form-group my-form-group mb-4">
                    <label htmlFor="inputProteins">Proteins:</label>
                    <input type="checkbox" name="proteins" value={this.state.proteins} onChange={this.handleChange} className="form-control my-form-control" id="inputProteins"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputPT">PT:</label>
                    <input type="text" name="PT" value={this.state.PT} onChange={this.handleChange} className="form-control my-form-control" id="inputPT"/>
                </div>
            </div>
        )
    }
}

export default OtherParameters;
