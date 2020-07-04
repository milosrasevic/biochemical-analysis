import React, { Component } from 'react'
import { handleChange } from '../../../store/actions/resultsActions';
import { connect } from 'react-redux';

class OtherParameters extends Component {
    

    handleChange = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.value
        });
    }

    handleCheck = (e) => {
        this.props.handleChange({
            name: e.target.name,
            value: e.target.checked
        });
    }

    render() {
        return (
            <div className="col border rounded mx-1 background-white">
                <h6 className="mt-2">Other parameters</h6>
                <div className="form-group my-form-group  text-left">
                    <label htmlFor="inputFibrinogen" className="mt-2 ml-4">Fibrinogen:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="fibrinogen" value={this.props.fibrinogen} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputFibrinogen"/>
                        </div>
                        <div className="col-2 mr-5">
                            mg/dL
                        </div>
                    </div>
                </div>
                <div className="form-group my-form-group mb-4">
                    <label htmlFor="inputProteins" className="mt-3">Proteins:</label>
                    <input type="checkbox" name="proteins" checked={this.props.proteins} onChange={this.handleCheck} className="form-control my-form-control" id="inputProteins"/>
                </div>
                <div className="form-group my-form-group text-left">
                    <label htmlFor="inputPT" className="mt-4 ml-4">PT:</label>
                    <div className="row">
                        <div className="col">
                            <input type="text" name="pt" value={this.props.pt} onChange={this.handleChange} className="form-control my-form-control ml-4" id="inputPT"/>
                        </div>
                        <div className="col-2 mr-5">
                            seconds
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        fibrinogen: state.results.fibrinogen,
        proteins: state.results.proteins,
        pt: state.pt
    }
}

const mapDispatchToProps = {
    handleChange
}

export default connect(mapStateToProps, mapDispatchToProps)(OtherParameters);
