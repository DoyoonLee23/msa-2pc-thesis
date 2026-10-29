import http from 'k6/http';
import { check } from 'k6';

export const options = {
  stages: [
    { duration: '10s', target: 10000 }, 
    { duration: '20s', target: 10000 }, 
  ],
};

export default function () {
  const url = 'http://localhost:8080/api/reservations';
  const res = http.post(url);
  
  check(res, { 'status is 200': (r) => r.status === 200 });     
}
