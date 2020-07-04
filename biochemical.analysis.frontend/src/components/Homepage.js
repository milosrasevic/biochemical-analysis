import React, { Component } from 'react';
import BloodAnalysis from './blood/BloodAnalysis';
import BodyCondition from './body/BodyCondition';
import UrineAnalysis from './urine/UrineAnalysis';
import { sendResults } from '../store/actions/resultsActions';
import { connect } from 'react-redux';

class Homepage extends Component {

    handleSubmit = () => {
        this.props.sendResults(this.props.results);
    }

    reload = () => {
        window.location.reload(false);
    }

    render() {
        return (
            <div className="text-center mb-3">
                <div className="container mt-4 border rounded pb-2 bg-light">
                    <BloodAnalysis/>
                    <BodyCondition/>
                    <UrineAnalysis/>
                    <button onClick={this.reload} className="btn btn-outline-danger mr-3">Reset</button>
                    <button onClick={this.handleSubmit} className="btn btn-primary">Get results</button>
                </div>
                
            </div>
        )
    }
}

const mapStateToProps = state => {
    return {
        results: state.results
    }
}

const mapDispatchToProps = {
    sendResults
}

export default connect(mapStateToProps, mapDispatchToProps)(Homepage);