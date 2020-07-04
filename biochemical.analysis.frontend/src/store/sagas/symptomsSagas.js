import { call, put } from 'redux-saga/effects';
import { symptomsService } from '../../services/SymptomsService';
import { push, go } from 'connected-react-router';

export function* symptomsSend({ payload }) {
    try {
        const { data } = yield call(symptomsService.sendSymptoms, payload);
        localStorage.setItem("highChanceDiseases", JSON.stringify(data.highChanceDiseases));
        localStorage.setItem("possibleDiseases", JSON.stringify(data.possibleDiseases));
        localStorage.setItem("mostLikelyDisease", JSON.stringify(data.mostLikelyDisease));
        yield put(push("/diagnose"));
        yield put(go());
    } catch (error) {
        console.log(error);
    }
}