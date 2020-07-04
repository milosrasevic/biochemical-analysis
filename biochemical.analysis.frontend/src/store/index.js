import { createStore, applyMiddleware } from 'redux';
import rootReducer from './reducers';
import rootSaga from './sagas';
import createSagaMiddleware from 'redux-saga';
import { routerMiddleware } from 'connected-react-router';
import { createBrowserHistory } from 'history';

const sagaMiddleware = createSagaMiddleware();
const history = createBrowserHistory();

const store = createStore(
    rootReducer(history),
    applyMiddleware(routerMiddleware(history), sagaMiddleware)
  );

sagaMiddleware.run(rootSaga);

export default store;