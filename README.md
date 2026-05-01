ProNearBy is a full-stack web application designed to connect users with nearby service providers such as plumbers, electricians, carpenters, and freelancers. The platform enables users to easily discover, book, and manage local services, while service providers can register, list their offerings, and manage customer requests.

This project was built independently with a strong focus on real-world backend architecture, security, and scalability, simulating a production-level application.

🎯 Problem Statement
In everyday life, finding trusted local service providers is often unorganized and inefficient. Users rely on scattered contacts or unreliable sources.
ProNearBy solves this problem by:


Providing a centralized platform for service discovery


Enabling seamless booking and management


Ensuring secure authentication and role-based access



⚙️ Tech Stack


Backend: Spring Boot


Security: Spring Security with JWT


Database: MySQL


API Architecture: RESTful APIs


Build Tool: Maven


Version Control: Git


Repository Hosting: GitHub



🏗️ System Architecture
The application follows a layered architecture to ensure maintainability and scalability:


Controller Layer – Handles HTTP requests and responses


Service Layer – Contains business logic


Repository Layer – Interacts with the database


This modular structure allows easy extension into microservices architecture in the future.

🔐 Security Implementation


JWT-based authentication for secure login sessions


Role-Based Access Control (RBAC) for:


User


Provider


Admin




Secure password handling (BCrypt recommended)


OTP-based email verification for signup



👤 Core Modules
🔹 User Module


User registration and login


OTP email verification


Search for nearby service providers


Book services


View booking history



🔹 Provider Module


Register as a service provider


Add, update, and delete services (CRUD operations)


Manage incoming bookings


Update service availability



🔹 Admin Module


Manage users and providers


Monitor system activity


Ensure platform integrity



📡 Key API Endpoints
EndpointDescription/auth/signupRegister a new user/auth/loginAuthenticate user and generate JWT/servicesManage service listings/bookingsHandle booking operations

🔥 Key Features


End-to-end full-stack development


Secure authentication using JWT


OTP-based user verification


Role-based dashboards (User / Provider / Admin)


Scalable and modular backend design


Clean code practices and REST API standards



🚧 Future Enhancements


📍 Location-based filtering using maps integration


💳 Payment gateway integration


🔔 Real-time notifications (WebSockets)


☁️ Cloud deployment (AWS / Docker)


⚖️ Load balancing and high availability



💡 Key Learnings


Building a real-world scalable backend system


Implementing secure authentication and authorization


Designing modular and maintainable architecture

<img width="1536" height="1024" alt="A1" src="https://github.com/user-attachments/assets/0775b6e5-82fe-4b9c-9849-eef7091462cf" />
<img width="1536" height="1024" alt="Landingpage" src="https://github.com/user-attachments/assets/e58c6c76-b319-4e8c-ae9d-a20c17aa2c86" />
<img width="1536" height="1024" alt="Providerdashboard" src="https://github.com/user-attachments/assets/29beb05c-36a1-407f-ac1f-715d7c847bc1" />
<img width="1536" height="1024" alt="Admindashboard" src="https://github.com/user-attachments/assets/fcee37db-a1dc-4bc9-8935-c6c643927079" />
<img width="1536" height="1024" alt="Userdashboard" src="https://github.com/user-attachments/assets/06e3f5ae-d531-486c-82f6-805b754489c3" />






Handling real-world use cases like booking systems

