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
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputSodium" className="ml-4">Sodium:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="sodium" value={this.state.sodium} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputSodium"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputPotassium" className="ml-4">Potassium:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="potassium" value={this.state.potassium} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputPotassium"/>
                        </div>
                        <div className="col-2 mr-5">
                            mmol/L
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default ElectrolytesAnalysis;