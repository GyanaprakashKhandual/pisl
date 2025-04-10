import http from "k6/http";
import { check } from "k6";

const testType = __ENV.TEST_TYPE || "10";

const validTestTypes = [10, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000];

if (!validTestTypes.includes(Number(testType))) {
    console.error(`Invalid TEST_TYPE: ${testType}. Please use one of ${validTestTypes.join(", ")}.`);
    throw new Error("Invalid TEST_TYPE");
}

const vus = Number(testType);
const iterations = Number(testType);

export const options = {
    vus,
    iterations,
};


function RRApproval() {
    const response = http.get('https://staging.pislinfra.com/#/procurement/prlist');
    check(response, {
        'is status code 200': (r) => r.status === 200,
    });
}
function RRList() {
    const response = http.get('https://staging.pislinfra.com/#/procurement/view-RR-list');
    check(response, {
        'is status code 200': (r) => r.status === 200,
    });
}
function CreateRR() {
    const response = http.get('https://staging.pislinfra.com/#/procurement');
    check(response, {
        'is status code 200': (r) => r.status === 200,
    });
}
function RateComparative() {
    const response = http.get('https://staging.pislinfra.com/#/rate-comparative');
    check(response, {
        'is status code 200': (r) => r.status === 200,
    });
}

export default function () {
    // RRApproval();
    // RRStatus();
    // CreateRR();
    RateComparative();
}
