# **Project SUN Agent**

---

## Authors

- **FueledByBesh**
- **Nonashimi**

---

# Project Structure 

---


## Tasks todo

### Specific TODOs for Step 1 (Week 1)

| Task | Description | Status | Assigned To |
|:---|:---|:---:|:---:|
| **1. LLM Infrastructure** | **Implement Gemini API Integration** | Pending | |
| 1.1 SDK Setup | Add `google-cloud-aiplatform` dependency to `build.gradle.kts` and configure Gemini API keys in `application.yaml`. | Pending | |
| 1.2 `LLMClient` Impl | Complete `LLMClientGeminiImpl.java` to send `Session` history to Gemini and return an `LLMResponse`. | Pending | |
| **2. Core Chat Logic** | **Functional Chat Loop & Session Management** | Pending | |
| 2.1 `ChatService` | Create `ChatService.java` to coordinate `LLMClient` calls and manage message persistence logic. | Pending | |
| 2.2 Session Logic | Implement `isSummaryNeeded()` in `Session.java` based on a fixed token threshold (e.g., 4000 tokens). | Pending | |
| 2.3 `AgentController` | Implement `POST /api/v1/chat` endpoint to receive user messages and return AI responses. | Pending | |
| **3. Persistence Prep** | **GCP Service Connectivity** | Pending | |
| 3.1 Firestore Config | Setup Firebase Admin SDK and implement basic `findById` in `UserRepoFirestoreImpl.java`. | Pending | |
| 3.2 GCS Config | Configure Google Cloud Storage bucket access and implement `store()` in `FileStorageGCSImpl.java`. | Pending | |

### Detailed breakdown for the week:

*   **Days 1-2: LLM Integration.** Get the agent talking. This involves moving from the current `Optional.empty()` in `LLMClientGeminiImpl` to a real API call.
*   **Days 3-4: API & Service Layer.** Connect the REST controller to the service layer. Ensure that a user can send a string and get a string back via HTTP.
*   **Day 5: Infrastructure Skeleton.** Move the Firestore and GCS implementations from "Not Implemented" to "Connected," verifying that the application can communicate with Google Cloud services.
