import ApiService from './ApiService';

const ENDPOINTS = {
    SYMPTOMS: '/symptoms'
}

class SymptomsService extends ApiService {
    sendSymptoms = (symptoms) => {
        return this.apiClient.post(ENDPOINTS.SYMPTOMS, symptoms);
    }  
}

export const symptomsService = new SymptomsService();