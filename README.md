# new-mongo-cluster-replica, MongoDB 7

Preconditions:

1. OS Linux, Installed docker and docker compose, Java JDK 21, Apache Maven 3.9.5
2. Make sure in the script/init.js I am adding new mongodb user with password
3. Docker network name is clusternet
4. For setup mongocluser run ./init_mongo_cluster.sh , custom volumes are mounted: 
- ~/volumes/mongo7/primary:/data/db - ~/volumes/mongo7/secondary:/data/db
5. Next time just run ./run_mongo.sh
6. for run people microservice ./run.sh , it will build and using docker compose
7. Access http://localhost:7025/swagger-ui.html , available API for manipulatin with data
8. API http://localhost:7025/api/v2/people/generate/new/data will generate 1000 records
9. You can run benchmark with ab -n 100 -c 10  http://localhost:7025/api/v2/people/generate/new/data
10. Spring boot configured with virtual threads.
11. View ./look1 mongo1 or ./look.sh mongo2
12. ./restart people
13. Docker file tuned for high performance, I hope
14. Push it to production!
15. Send pull request for improve.