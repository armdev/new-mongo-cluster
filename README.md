# New MongoDB Cluster Replica - MongoDB 7

## Preconditions:

1. **Operating System:** Linux
   - Ensure Docker and Docker Compose are installed.
   - Install Java JDK 21 and Apache Maven 3.9.5.

2. **Database User Setup:**
   - Configure the script/init.js file to add a new MongoDB user with a specified password.

3. **Docker Network Configuration:**
   - Set the Docker network name to `clusternet`.

4. **Cluster Initialization:**
   - Run:
     ```bash
     ./init_mongo_cluster.sh
     ```
     Custom volumes are mounted:
     - Primary Node: `~/volumes/mongo7/primary:/data/db`
     - Secondary Node: `~/volumes/mongo7/secondary:/data/db`

5. **Running the Cluster:**
   - Subsequently, run:
     ```bash
     ./run_mongo.sh
     ```

6. **Microservice Deployment:**
   - Run:
     ```bash
     ./run.sh
     ```
     This will build and deploy the People microservice using Docker Compose.

7. **API Access:**
   - Access the API documentation at [http://localhost:7025/swagger-ui.html](http://localhost:7025/swagger-ui.html) to interact with the available data manipulation APIs.

8. **Data Generation:**
   - Trigger data generation with:
     ```bash
     curl http://localhost:7025/api/v2/people/generate/new/data
     ```

9. **Benchmarking:**
   - Conduct benchmarking using Apache Benchmark:
     ```bash
     ab -n 100 -c 10 http://localhost:7025/api/v2/people/generate/new/data
     ```

10. **Concurrency Configuration:**
    - Spring Boot is configured with virtual threads for enhanced performance.

11. **Database Inspection:**
    - View the MongoDB instances using:
      ```bash
      ./look.sh mongo1
      ```
      or
      ```bash
      ./look.sh mongo2
      ```

12. **Microservice Restart:**
    - Restart the People microservice with:
      ```bash
      ./restart people
      ```

13. **Performance Tuning:**
    - The Dockerfile is tuned for high performance, aiming for optimal production deployment.

14. **Deployment:**
    - Push the code to production confidently!

15. **Collaboration:**
    - Feel free to send a pull request for improvements. Contributions are highly appreciated!
