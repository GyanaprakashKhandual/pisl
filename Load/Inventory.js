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

function rrStatus() {
    const response = http.get('https://staging.pislinfra.com/#/inventory');
    check(response, {
        'is status code: 200': (r) => r.status === 200
    });
}
export default function () {
    rrStatus()
}
