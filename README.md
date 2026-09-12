# Digital Banking API Tests — Karate + Serenity REST

![Java](https://img.shields.io/badge/Java-11+-ED8B00?logo=openjdk&logoColor=white)
![Karate](https://img.shields.io/badge/Karate-DSL-1BA1F2?logo=java&logoColor=white)
![Serenity](https://img.shields.io/badge/Serenity-BDD-blue)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apache-maven&logoColor=white)

API test automation suite for a digital banking platform built with **Karate DSL**, **Serenity REST**, and the **Screenplay Pattern**. Covers full user lifecycle: create, read, and delete operations across isolated test runners.

## Test Coverage

| Feature | Endpoint | Method | Description |
|---|---|---|---|
| `createuser.feature` | `/users` | POST | Create new user account with required fields |
| `readuser.feature` | `/users/:id` | GET | Retrieve user by ID and validate response schema |
| `readusers.feature` | `/users` | GET | List all users and validate collection response |
| `deleteuser.feature` | `/users/:id` | DELETE | Delete user by ID and confirm 204/200 response |

## Project Structure

```
src/test/java/co/com/testlulobank/
├── features/
│   ├── createuser.feature
│   ├── readuser.feature
│   ├── readusers.feature
│   └── deleteuser.feature
└── runner/
    └── [individual runners per feature]
```

## Tech Stack

| Tool | Purpose |
|---|---|
| Java 11+ | Runtime |
| Maven | Build & dependency management |
| Karate DSL | API test scenarios |
| Serenity REST | Extended reporting + REST assertions |
| Serenity BDD | HTML report generation |
| Cucumber | BDD framework |

## Getting Started

```bash
git clone https://github.com/criguex/testlulobank.git
cd testlulobank
mvn clean test
```

Each feature has its own dedicated runner class — to run a specific flow:
1. Open the project in IntelliJ IDEA or Eclipse
2. Navigate to `src/test/java/co/com/testlulobank/runner/`
3. Run the desired runner class

## License

MIT
