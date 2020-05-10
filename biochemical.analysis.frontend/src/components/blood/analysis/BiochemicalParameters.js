import React, { Component } from 'react'

class BiochemicalParameters extends Component {
    constructor(props) {
        super(props);

        this.state = {
            serumLook: '',
            glucose: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white">
                <h6 className="mt-2">Biochemical parameters</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputSerumLook">Serum look:</label>
                    <input type="text" name="serumLook" value={this.state.serumLook} onChange={this.handleChange} className="form-control my-form-control" id="inputSerumLook"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputGlucose">Glucose:</label>
                    <input type="text" name="glucose" value={this.state.glucose} onChange={this.handleChange} className="form-control my-form-control" id="inputGlucose"/>
                </div>
            </div>
        )
    }
}

export default BiochemicalParameters