import React, { Component } from 'react';
import { sendResults } from '../store/actions/resultsActions';
import { connect } from 'react-redux';

class Homepage extends Component {
    constructor(props) {
        super(props);

        this.state = {
            leukocytes: '',
            erythrocytes: '',
            thrombocytes: '',
            hematocrit: '',
            hemoglobin: ''
        }
    }

    handleChange = (e) => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    handleSubmit = () => {
        let bloodAnalysis = {
            leukocytes: this.state.leukocytes,
            erythrocytes: this.state.erythrocytes,
            thrombocytes: this.state.thrombocytes,
            hematocrit: this.state.hematocrit,
            hemoglobin: this.state.hemoglobin
        }

        let results = {
            bloodAnalysis,
            gender: 0
        }

        this.props.sendResults(results);
    }

    render() {
        return (
            <div className="mx-5">
                <div className="form-group">
                    <label htmlFor="inputLeukocytes">Leukocytes:</label>
                    <input type="text" name="leukocytes" value={this.state.leukocytes} onChange={this.handleChange} className="form-control" id="inputLeukocytes"/>
                </div>
                <div className="form-group">
                    <label className="form-check-label" htmlFor="inputErythrocytes">Erythrocytes:</label>
                    <input type="text" name="erythrocytes" value={this.state.erythrocytes} onChange={this.handleChange} className="form-control" id="inputErythrocytes"/>
                </div>
                <div className="form-group">
                    <label htmlFor="inputThrombocytes">Thrombocytes:</label>
                    <input type="text" name="thrombocytes" value={this.state.thrombocytes} onChange={this.handleChange} className="form-control" id="inputThrombocytes"/>
                </div>
                <div className="form-group">
                    <label htmlFor="inputHematocrit">Hematocrit:</label>
                    <input type="text" name="hematocrit" value={this.state.hematocrit} onChange={this.handleChange} className="form-control" id="inputHematocrit"/>
                </div>
                <div className="form-group">
                    <label htmlFor="inputHemoglobin">Hemoglobin:</label>
                    <input type="text" name="hemoglobin" value={this.state.hemoglobin} onChange={this.handleChange} className="form-control" id="inputHemoglobin"/>
                </div>
                
                <button onClick={this.handleSubmit} className="btn btn-primary">Submit</button>
            </div>
        )
    }
}

const mapDispatchToProps = {
    sendResults
}

export default connect(null, mapDispatchToProps)(Homepage);