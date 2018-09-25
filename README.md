The async endpoint will fail with a 400 - Bad Request.
```
curl -v http://localhost:8080/hello/async -u World:1234
```

... and the sync endpoint works as expected:
```
curl -v http://localhost:8080/hello/sync -u World:1234
```
