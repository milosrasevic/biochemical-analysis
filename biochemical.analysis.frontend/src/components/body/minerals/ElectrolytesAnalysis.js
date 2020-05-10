import React, { Component } from 'react'

class ElectrolytesAnalysis extends Component {
    constructor(props) {
        super(props);

        this.state = {
            sodium: '',
            potassium: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }


    render() {
        return (
            <div className="col border rounded background-white">
                <h6 className="mt-2">Electrolytes</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputSodium">Sodium:</label>
                    <input type="text" name="sodium" value={this.state.sodium} onChange={this.handleChange} className="form-control my-form-control" id="inputSodium"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputPotassium">Potassium:</label>
                    <input type="text" name="potassium" value={this.state.potassium} onChange={this.handleChange} className="form-control my-form-control" id="inputPotassium"/>
                </div>
            </div>
        )
    }
}

export default ElectrolytesAnalysis;