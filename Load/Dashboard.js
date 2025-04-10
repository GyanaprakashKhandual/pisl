import http from "k6/http";
import { check } from "k6";

const testType = __ENV.TEST_TYPE || "10"; 

let vus = 1;
let iterations = 1;

if (testType === "10") {
    vus = 10;
    iterations = 10;
} else if (testType === "100") {
    vus = 100;
    iterations = 100;
} else if (testType === "200") {
    vus = 200;
    iterations = 200;
} else if (testType === "300") {
    vus = 300;
    iterations = 300;
} else if (testType === "400") {
    vus = 400;
    iterations = 400;
} else if (testType === "500") {
    vus = 500;
    iterations = 500;
} else if (testType === "600") {
    vus = 600;
    iterations = 600;
} else if (testType === "700") {
    vus = 700;
    iterations = 700;
} else if (testType === "800") {
    vus = 800;
    iterations = 800;
} else if (testType = "900") {
    vus = 900;
    iterations = 900;
} else if (testType = "1000") {
    vus = 1000;
    iterations = 1000;
}
 else {
    console.error(`Invalid TEST_TYPE: ${testType}. Please use 10, 100, 200, 300, 400, 500, or 600.`);
    throw new Error("Invalid TEST_TYPE");
}

export const options = {
    vus: vus,
    iterations: iterations,
};

function dashboard() {
    const response = http.get('https://staging.pislinfra.com/#/dashboard');
    check(response, {
        'is status code 200': (r) => r.status === 200,
    });
}
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
export default function () {
    dashboard();
    RRApproval();
    RRStatus();
    CreateRR();

}
