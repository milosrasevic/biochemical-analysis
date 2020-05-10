import React, { Component } from 'react'
import Blood from './analysis/Blood'
import BiochemicalParameters from './analysis/BiochemicalParameters';
import Fat from './analysis/Fat';
import OtherParameters from './analysis/OtherParameters';

class BloodAnalysis extends Component {
    render() {
        return (
            <div className="row">
                <div className="container mt-4 mx-2 pb-2">
                    <h6 className="mt-2">
                        Blood analysis
                    </h6>
                    <div className="row">
                        <Blood/>
                        <BiochemicalParameters/>
                        <Fat/>
                        <OtherParameters/>
                    </div>
                </div>
            </div>
        )
    }
}

export default BloodAnalysis;
