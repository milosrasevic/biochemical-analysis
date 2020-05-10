import React, { Component } from 'react'
import BonesAnalysis from './bones/BonesAnalysis';
import ElectrolytesAnalysis from './minerals/ElectrolytesAnalysis';
import KidneysAnalysis from './organs/KidneysAnalysis';
import LiverAnalysis from './organs/LiverAnalysis';

class BodyCondition extends Component {
    render() {
        return (
            <div className="row  mt-3">
                <div className="container mx-2 pb-2">
                    <h6>Body condition</h6>
                    <div className="row">
                        <BonesAnalysis/>
                        <ElectrolytesAnalysis/>
                        <KidneysAnalysis/>
                        <LiverAnalysis/>
                    </div>
                </div>
            </div>
        )
    }
}

export default BodyCondition;