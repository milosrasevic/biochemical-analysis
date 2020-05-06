import { call, put } from 'redux-saga/effects';
import { resultsService } from '../../services/ResultsService';

export function* resultsSend({ payload }) {
    try {
        const { data } = yield call(resultsService.sendResults, payload);
        yield put(console.log(data));
    } catch (error) {
        console.log(error);
    }
}