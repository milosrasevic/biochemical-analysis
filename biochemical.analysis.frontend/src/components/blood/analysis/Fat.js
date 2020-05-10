import React, { Component } from 'react'

class Fat extends Component {
    constructor(props) {
        super(props);

        this.state = {
            cholesterol: '',
            HDLcholesterol: '',
            LDLcholesterol: '',
            triglycerides: ''
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
                <h6 className="mt-2">Fat</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputCholesterol">Cholesterol:</label>
                    <input type="text" name="cholesterol" value={this.state.cholesterol} onChange={this.handleChange} className="form-control my-form-control" id="inputCholesterol"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputHDLcholesterol">HDL Cholesterol:</label>
                    <input type="text" name="HDLcholesterol" value={this.state.HDLcholesterol} onChange={this.handleChange} className="form-control my-form-control" id="inputHDLcholesterol"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputLDLcholesterol">LDL Cholesterol:</label>
                    <input type="text" name="LDLcholesterol" value={this.state.LDLcholesterol} onChange={this.handleChange} className="form-control my-form-control" id="inputLDLcholesterol"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputTriglycerides">Triglycerides:</label>
                    <input type="text" name="triglycerides" value={this.state.triglycerides} onChange={this.handleChange} className="form-control my-form-control" id="inputTriglycerides"/>
                </div>
            </div>
        )
    }
}

export default Fat;
