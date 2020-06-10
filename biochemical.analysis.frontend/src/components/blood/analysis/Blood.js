import React, { Component } from 'react';
import { handleChange, handleSubmit, sendResults } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class Blood extends Component {

    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    handleSubmit = () => {
        // let bloodAnalysis = {
        //     leukocytes: this.state.leukocytes,
        //     erythrocytes: this.state.erythrocytes,
        //     thrombocytes: this.state.thrombocytes,
        //     hematocrit: this.state.hematocrit,
        //     hemoglobin: this.state.hemoglobin
        // }

        // let results = {
        //     bloodAnalysis,
        //     gender: 0
        // }
        this.props.sendResults(this.props.store);
    }

    render() {
        return (
            <div className="col-3 pb-3 border rounded ml-1 background-white">
                <h6 className="mt-2">Blood</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputLeukocytes" className="ml-4">Leukocytes:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="leukocytes" value={this.props.leukocytes  || ''} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputLeukocytes"/>
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
                
                {/* <button onClick={this.handleSubmit} className="btn btn-primary">Submit</button> */}
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        leukocytes: state.leukocytes,
        erythrocytes: state.erythrocytes,
        thrombocytes: state.thrombocytes,
        hemoglobin: state.hemoglobin,
        hematocrit: state.hematocrit,
        store: state
    }
}

const mapDispatchToProps = {
    handleChange,
    handleSubmit,
    sendResults
}

export default connect(mapStateToProps, mapDispatchToProps)(Blood);