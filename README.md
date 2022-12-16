Invoke below API
GET: http://localhost:8080/get-employee?param=2
You would get below response:
Body:
{
"id": 1,
"empName": "Test"
}
Header:
ETag: "00e037f956ced18ca98b52436225d2b8d"
Status: 200 OK

Next time if no change done in content then you will get status: 304 (Not Modified:
GET: http://localhost:8080/get-employee?param=2
Header:
If-None-Match: "00e037f956ced18ca98b52436225d2b8d"