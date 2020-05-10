import React, { Component } from 'react'

class KidneysAnalysis extends Component {
    constructor(props) {
        super(props);

        this.state = {
            urea: '',
            creatinine: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded background-white mx-1">
                <h6 className="mt-2">Kidneys condition</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputUrea">Urea:</label>
                    <input type="text" name="urea" value={this.state.urea} onChange={this.handleChange} className="form-control my-form-control" id="inputUrea"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputCreatinine">Creatinine:</label>
                    <input type="text" name="creatinine" value={this.state.creatinine} onChange={this.handleChange} className="form-control my-form-control" id="inputCreatinine"/>
                </div>
            </div>
        )
    }
}

export default KidneysAnalysis;
