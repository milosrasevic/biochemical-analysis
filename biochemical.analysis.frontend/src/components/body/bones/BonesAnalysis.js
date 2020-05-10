import React, { Component } from 'react'

class BonesAnalysis extends Component {
    constructor(props) {
        super(props);

        this.state = {
            iron: '',
            alkalinePhospatase: '',
            uricAcid: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white pb-2">
                <h6 className="mt-2">Bones analysis</h6>
                <div className="form-group my-form-group">
                    <label htmlFor="inputIron">Iron:</label>
                    <input type="text" name="iron" value={this.state.iron} onChange={this.handleChange} className="form-control my-form-control" id="inputIron"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputAlkalinePhosphatase">Alkaline phospatase:</label>
                    <input type="text" name="alkalinePhospatase" value={this.state.alkalinePhospatase} onChange={this.handleChange} className="form-control my-form-control" id="inputAlkalinePhosphatase"/>
                </div>
                <div className="form-group my-form-group">
                    <label htmlFor="inputUricAcid">Thrombocytes:</label>
                    <input type="text" name="uricAcid" value={this.state.uricAcid} onChange={this.handleChange} className="form-control my-form-control" id="inputUricAcid"/>
                </div>
            </div>
        )
    }
}

export default BonesAnalysis;
