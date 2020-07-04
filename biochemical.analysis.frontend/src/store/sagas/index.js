import { all, takeLatest } from 'redux-saga/effects';
import { SEND_RESULTS, HANDLE_CHANGE, SEND_SYMPTOMS } from '../actions/actionTypes';
import { resultsSend, changeHandle } from './resultsSagas';
import { symptomsSend } from './symptomsSagas';

export default function* rootSaga() {
    yield all([
        takeLatest(SEND_RESULTS, resultsSend),
        takeLatest(HANDLE_CHANGE, changeHandle),
        takeLatest(SEND_SYMPTOMS, symptomsSend)
    ])
}