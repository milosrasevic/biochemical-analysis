import { call, put } from 'redux-saga/effects';
import { resultsService } from '../../services/ResultsService';
import { setChange } from '../actions/resultsActions';

export function* resultsSend({ payload }) {
    try {
        // const { data } = yield call(resultsService.sendResults, payload);
        yield call(resultsService.sendResults, payload);
        // yield put(console.log(data));
    } catch (error) {
        console.log(error);
    }
}

export function* changeHandle({ payload }) {
    // console.log(payload.name, payload.value);
    yield put(setChange(payload))
}
