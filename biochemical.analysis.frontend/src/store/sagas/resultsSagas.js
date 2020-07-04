import { call, put } from 'redux-saga/effects';
import { resultsService } from '../../services/ResultsService';
import { setChange } from '../actions/resultsActions';
import { push, go } from 'connected-react-router';

export function* resultsSend({ payload }) {
    try {
        const { data } = yield call(resultsService.sendResults, payload);
        localStorage.setItem("diseases", JSON.stringify(data.diseasesList));
        localStorage.setItem("symptoms", JSON.stringify(data.symptoms));
        yield put(push("/symptoms-questions"));
        yield put(go());
    } catch (error) {
        if(error.response.status === 400) {
            alert("Please fill out all of the fields correctly")
        } else {
            alert("Something went wrong")
        }
    }
}

export function* changeHandle({ payload }) {
    yield put(setChange(payload))
}
