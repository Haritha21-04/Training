import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import TeamList from './components/TeamList';
import TeamDetailsWithState from './components/TeamDetailsWithState';
import VenueList from './components/VenueList';
import TeamDetailsWithUseState from './components/TeamDetailsWithUseState';
import App from './App';
import reportWebVitals from './reportWebVitals';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <TeamList/>
    <VenueList/>
    <TeamDetailsWithState/>
    <TeamDetailsWithUseState/>
    <App />
  </React.StrictMode>
);

reportWebVitals();
