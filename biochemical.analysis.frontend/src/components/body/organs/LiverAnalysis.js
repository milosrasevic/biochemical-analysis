import React, { Component } from 'react'

class LiverAnalysis extends Component {
    constructor(props) {
        super(props);

        this.state = {
            ALT: '',
            AST: '',
            gamaGT: '',
            bilirubin: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded background-white mx-1 pb-3">
                <h6 className="mt-2">Liver condition</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputALT">ALT:</label>
                    <input type="text" name="ALT" value={this.state.ALT} onChange={this.handleChange} className="form-control my-form-control" id="inputALT"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputAST">AST:</label>
                    <input type="text" name="AST" value={this.state.AST} onChange={this.handleChange} className="form-control my-form-control" id="inputAST"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputgamaGT">Gama GT:</label>
                    <input type="text" name="gamaGT" value={this.state.gamaGT} onChange={this.handleChange} className="form-control my-form-control" id="inputgamaGT"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputBilirubin">Bilirubin:</label>
                    <input type="text" name="bilirubin" value={this.state.bilirubin} onChange={this.handleChange} className="form-control my-form-control" id="inputBilirubin"/>
                </div>
            </div>
        )
    }
}

export default LiverAnalysis;