import React, { Component } from 'react';
import BloodAnalysis from './blood/BloodAnalysis';
import BodyCondition from './body/BodyCondition';
import UrineAnalysis from './urine/UrineAnalysis';

class Homepage extends Component {
    render() {
        return (
            <div className="text-center mb-3">
                <div className="bg-info py-3">
                    <h2 className="text-light text-left ml-4">Biochemical analysis interpretation</h2>
                </div>
                <div className="container mt-4 border rounded pb-2 bg-light">
                    <BloodAnalysis/>
                    <BodyCondition/>
                    <UrineAnalysis/>
                </div>
                
            </div>
        )
    }
}

export default Homepage;