Event-Driven Customer Support System – Documentation
Project Overview
The Event-Driven Customer Support System is designed to manage customer support tickets, facilitate communication between customers and support agents, and generate reports and notifications for better ticket management. The system is multi-tenant, meaning it supports multiple organizations, where each organization has its own set of customers, support agents, and tickets. The system uses REST APIs to interact with the frontend (or other services) and handle backend operations.

Use Case
Problem Statement:
Organizations that provide customer support services often face difficulties in efficiently managing support tickets, ensuring timely responses, and maintaining customer satisfaction. These organizations need a structured, automated, and scalable system to manage customer queries, track ticket statuses, and monitor the performance of support agents.

Solution:
The Event-Driven Customer Support System allows customers to create support tickets for their issues, which are then assigned to support agents for resolution. Notifications are sent to both customers and agents upon ticket updates, and reports are generated to track performance metrics like response time and customer satisfaction. The system ensures that each organization’s data is kept separate, enabling effective multi-tenant support.

Key Features:
Multi-Tenant Support: Each organization has its own isolated environment, identified by a unique orgId (4-5 digit identifier).
Ticket Management: Customers can submit support tickets with details like subject, description, priority, and category.
Agent Assignment: Support agents are assigned tickets based on availability and expertise.
Status Updates: The ticket status can be updated as "Open", "In Progress", "Resolved", or "Closed", keeping customers informed about the ticket's progress.
Notifications: Both customers and support agents receive notifications about ticket updates.
Reporting: Reports can be generated to track key support metrics (e.g., number of tickets resolved, average response time).
