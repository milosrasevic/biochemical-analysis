import { all, takeLatest } from 'redux-saga/effects';
import { SEND_RESULTS } from '../actions/actionTypes';
import { resultsSend } from './resultsSagas';

export default function* rootSaga() {
    yield all([
        takeLatest(SEND_RESULTS, resultsSend)
    ])
}