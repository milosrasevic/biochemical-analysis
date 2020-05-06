import ApiService from './ApiService';

const ENDPOINTS = {
    RESULTS: '/results'
}

class ResultsService extends ApiService {
    sendResults = (results) => {
        return this.apiClient.post(ENDPOINTS.RESULTS, results);
    }
}

export const resultsService = new ResultsService();