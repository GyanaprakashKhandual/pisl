import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {
  vus: 50, // Virtual users
  duration: '30s', // Duration of the test
  thresholds: {
    http_req_duration: ['p(95)<500'], // 95% of requests must complete below 500ms
    http_req_failed: ['rate<0.01'],   // Errors must be less than 1%
  },
};

const users = [
  { email: 'avidusinteractive@gmail.com', password: 'avidus@001' },
   { email: 'user2@example.com', password: 'pass2' },
   { email: 'user3@example.com', password: 'pass3' },
];

export default function () {
  const user = users[Math.floor(Math.random() * users.length)]; // Random user
  const url = 'https://stagingpr.avidusinteractive.com/api/web/users/login';

  const payload = JSON.stringify({
    email: user.email,
    password: user.password,
  });

  const headers = {
    'Content-Type': 'application/json',
    'Origin': 'https://staging.pislinfra.com',
  };

  const res = http.post(url, payload, { headers });

  check(res, {
    'status is 200': (r) => r.status === 200,
    'response time < 500ms': (r) => r.timings.duration < 500,
  });

  sleep(Math.random() * 2); // Random wait between 0 - 2 seconds (realistic)
}
