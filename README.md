# TalkFlow
## Project Overview
The Chat Application project is designed to showcase the implementation of several design patterns within a functional chat system.
It supports real-time messaging, and basic message formatting, and offers features like undo/redo operations.
This document outlines the project's objectives, design patterns, and feature prioritization using the MoSCoW method.

## Design Patterns Implemented
Observer.Observer Pattern: Updates chat windows automatically when new messages are received.
Decorator Pattern: Adds features such as emojis and timestamps to messages.
Strategy Pattern: Provides various strategies for formatting messages (e.g., plain text, HTML).
Command Pattern: Manages message operations (send, edit, delete) with undo/redo capabilities.
Factory Method Pattern: Creates different types of messages (e.g., text, image).
Mediator Pattern: Manages user interactions within chat rooms.
Builder.Builder Pattern: Constructs complex message objects with attachments.

## Class Diagram
Below is the simplified class diagram for the chat application:
(Coming Soon)

## Feature Prioritization (MoSCoW)
### Must Have
Real-time Messaging
Basic UI for sending and viewing messages
Observer.Observer Pattern for chat updates
Command Pattern for send, edit, and delete operations with undo/redo
Decorator Pattern for simple message features (e.g., emojis)
Factory Method Pattern for message creation

### Should Have
Message.Message Formatting using Strategy Pattern
Mediator Pattern for managing user interactions
Enhanced UI components

### Could Have
Message.Message Builder.Builder for complex message creation
Advanced Decorators (e.g., timestamping)
Extended user management features

### Won't Have
Advanced Security Features (e.g., encryption)
Scalability for large user bases or high message volumes
Integration with external services (e.g., third-party APIs)

## Test Plan
(Coming Soon)

## Timetable
| **Date** | **Time Period** | **Activity**                       | **Details**                                            |
|----------|-----------------|------------------------------------|--------------------------------------------------------|
| **08.11** | **19:45 - 20:45** | **Planning and Design**            | Define requirements, draft class diagram, MoSCoW prioritization. |
|          | **21:00 - 23:00** | **Setup and Initial Development**  | Set up IntelliJ IDEA, implement core classes (`Observer.ChatRoom`, `User.User`, `Message.Message`). |
| **08.12** | **19:00 - 21:00** | **Implement Design Patterns**      | Implement Observer.Observer, Decorator, Command, Factory Method patterns. |
|          | **21:00 - 22:00** | **Testing and Debugging**          | Conduct functional tests, debug issues.               |
| **08.13** | **06:30 - 07:30** | **Finalization and Documentation** | Refine UI, finalize documentation, and review the test results. |

## Conclusion
(Coming Soon)

## Future Work
Future enhancements could include:
Security Features: Implementing encryption for secure messaging.
Scalability: Supporting larger numbers of users and messages.
Integration: Adding third-party service integrations and advanced UI features.



