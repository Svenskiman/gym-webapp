## Docker

Commands for starting and stopping the applications services.
```bash
# Build containers (first time)
docker compose up --build -d

# Stop containers
docker compose down

# Start containers 
docker compose up -d

# Check container logs and follow
docker compose logs gym-webapp -f --tail 10
```