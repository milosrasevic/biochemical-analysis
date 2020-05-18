import React, { Component } from 'react'
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class BonesAnalysis extends Component {

    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white pb-2">
                <h6 className="mt-2">Bones analysis</h6>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputIron" className="ml-4">Iron:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="iron" value={this.props.iron} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputIron"/>
                        </div>
                        <div className="col-2 mr-5">
                            mcg/dL
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputAlkalinePhosphatase" className="ml-4">Alkaline phospatase:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="alkalinePhospatase" value={this.props.alkalinePhospatase} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputAlkalinePhosphatase"/>
                        </div>
                        <div className="col-2 mr-5">
                            U/L
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputUricAcid" className="ml-4">Uric acid:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="uricAcid" value={this.props.uricAcid} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputUricAcid"/>
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

const mapStateToProps = state => {
    return {
        iron: state.iron,
        alkalinePhospatase: state.alkalinePhospatase,
        uricAcid: state.uricAcid
    }
}

const mapDispatchToProps = {
    handleChange
}


export default connect(mapStateToProps, mapDispatchToProps)(BonesAnalysis);
