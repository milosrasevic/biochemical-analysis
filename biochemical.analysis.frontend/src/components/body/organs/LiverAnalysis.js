import React, { Component } from 'react'
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class LiverAnalysis extends Component {
    
    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded background-white mx-1 pb-3">
                <h6 className="mt-2">Liver condition</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputALT" className="ml-4">ALT:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="ALT" value={this.props.ALT} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputALT"/>
                        </div>
                        <div className="col-2 mr-5">
                            U/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputAST" className="ml-4">AST:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="AST" value={this.props.AST} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputAST"/>
                        </div>
                        <div className="col-2 mr-5">
                            U/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputgamaGT" className="ml-4">Gama GT:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="gamaGT" value={this.props.gamaGT} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputgamaGT"/>
                        </div>
                        <div className="col-2 mr-5">
                            U/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputBilirubin" className="ml-4">Bilirubin:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="bilirubin" value={this.props.bilirubin} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputBilirubin"/>
                        </div>
                        <div className="col-2 mr-5">
                            U/L
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        ALT: state.ALT,
        AST: state.AST,
        gamaGT: state.gamaGT,
        bilirubin: state.bilirubin
    }
}

const mapDispatchToProps = {
    handleChange
}


export default connect(mapStateToProps, mapDispatchToProps)(LiverAnalysis);