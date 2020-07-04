import React from 'react';
// import Homepage from './components/Homepage';
import Homepage from './components/Homepage';
import { Provider } from 'react-redux';
import store from './store';
import { ConnectedRouter } from 'connected-react-router';
import { Route } from 'react-router-dom';
import SymptomsQuestions from './components/symptoms/SymptomsQuestions';
import {createBrowserHistory as createHistory} from 'history';
import Navbar from './components/Navbar';
import Diagnose from './components/Diagnose';

const history = createHistory();

function App() {
  return (
    <Provider store={store}>
      <Navbar/>
      <ConnectedRouter history={history}>
          <Route exact path="/" component={Homepage} />
          <Route path="/symptoms-questions" component={SymptomsQuestions} />
          <Route path="/diagnose" component={Diagnose} />
      </ConnectedRouter>
    </Provider>
  );
}

export default App;
