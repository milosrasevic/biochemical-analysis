import React, { Component } from 'react';
import { handleChange, sendResults } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class Blood extends Component {

    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    
    render() {
        return (
            <div className="col-3 pb-3 border rounded ml-1 background-white">
                <h6 className="mt-2">Blood</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputLeukocytes" className="ml-4">Leukocytes:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="leukocytes" value={this.props.leukocytes} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputLeukocytes"/>
                        </div>
                        <div className="col-2 mr-5">
                            *109/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputErythrocytes" className="ml-4">Erythrocytes:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="erythrocytes" value={this.props.erythrocytes} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputErythrocytes"/>
                        </div>
                        <div className="col-2 mr-5">
                            *1012/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputThrombocytes" className="ml-4">Thrombocytes:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="thrombocytes" value={this.props.thrombocytes} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputThrombocytes"/>
                        </div>
                        <div className="col-2 mr-5">
                            *109/L
                        </div>
                    </div>                    
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputHematocrit" className="ml-4">Hematocrit:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="hematocrit" value={this.props.hematocrit} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputHematocrit"/>
                        </div>
                        <div className="col-2 mr-5">
                            1/L
                        </div>
                    </div>             
                    
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputHemoglobin" className="ml-4">Hemoglobin:</label>
                    <div className="row">
                        <div className="col">
                        <input type="text" name="hemoglobin" value={this.props.hemoglobin} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputHemoglobin"/>
                        </div>
                        <div className="col-2 mr-5">
                            g/L
                        </div>
                    </div>                                 
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        leukocytes: state.results.leukocytes,
        erythrocytes: state.results.erythrocytes,
        thrombocytes: state.results.thrombocytes,
        hemoglobin: state.results.hemoglobin,
        hematocrit: state.results.hematocrit
    }
}

const mapDispatchToProps = {
    handleChange,
    sendResults
}

export default connect(mapStateToProps, mapDispatchToProps)(Blood);