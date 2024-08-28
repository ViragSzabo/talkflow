# TalkFlow
## Project Overview
The Chat Application project demonstrates
the use of various design patterns within a functional chat system.
It features real-time messaging, message formatting,
and undo/redo capabilities.
This document outlines the project's objectives,
design patterns, feature prioritization, and other relevant details.

## Design Patterns Implemented
Observer Pattern: Updates chat windows automatically when new messages are received.
Decorator Pattern: Adds features like emojis and timestamps to messages.
Strategy Pattern: Provides various message formatting strategies (e.g., plain text, HTML).
Command Pattern: Manages message operations (send, edit, delete) with undo/redo capabilities.
Factory Method Pattern: Creates different types of messages (e.g., text, image).
Mediator Pattern: Manages user interactions within chat rooms.
Builder Pattern: Constructs complex message objects with attachments.

## Class Diagram
(Coming Soon)

## Feature Prioritization (MoSCoW)
### Must Have
Real-time Messaging
Basic UI for sending and viewing messages
Observer Pattern for chat updates
Command Pattern for message operations with undo/redo
Decorator Pattern for simple message features (e.g., emojis)
Factory Method Pattern for message creation

### Should Have
Message Formatting using Strategy Pattern
Mediator Pattern for managing user interactions
Enhanced UI components

### Could Have
Message Builder for complex message creation
Advanced Decorators (e.g., timestamping)
Extended user management features

### Won't Have
Advanced Security Features (e.g., encryption)
Scalability for large user bases or high message volumes
Integration with external services (e.g., third-party APIs)

## Test Plan
The test plan outlines the strategy for validating the functionality 
and performance of the TalkFlow Chat Application. 
The testing process will ensure that all features work as intended 
and meet the project's requirements.

### Objectives
Verify that the core functionalities of the chat application work correctly.
Ensure that design patterns are implemented effectively and do not introduce bugs.
Validate that the application meets user requirements and handles edge cases.

### Test Strategies
#### Unit Testing
Test individual components in isolation to ensure they function correctly.
#### Integration Testing
Test interactions between components to ensure they work together as expected.
#### System Testing
Test the complete application to ensure it meets the specified requirements.
#### User Acceptance Testing (UAT)
Validate that the application meets user needs and expectations.

### Test Environment
Tools: JUnit 5 for unit and integration testing.
Environment: Local development environment with Java 17 or later.

## Timetable
| **Date** | **Time Period** | **Activity**                       | **Details**                                            |
|----------|-----------------|------------------------------------|--------------------------------------------------------|
| **08.11** | **19:45 - 20:45** | **Planning and Design**            | Define requirements, draft class diagram, MoSCoW prioritization. |
|          | **21:00 - 23:00** | **Setup and Initial Development**  | Set up IntelliJ IDEA, implement core classes (`Observer.ChatRoom`, `User.User`, `Message.Message`). |
| **08.12** | **19:00 - 21:00** | **Implement Design Patterns**      | Implement Observer.Observer, Decorator, Command, Factory Method patterns. |
|          | **21:00 - 22:00** | **Testing and Debugging**          | Conduct functional tests, debug issues.               |
| **08.13** | **06:30 - 07:30** | **Finalization and Documentation** | Refine UI, finalize documentation, and review the test results. |

## Conclusion
The TalkFlow Chat Application project has successfully implemented 
several design patterns to create a robust and flexible messaging system.
Throughout the development process, the project demonstrated effective
use of the Observer, Decorator, Strategy, Command, Factory Method, 
Mediator, and Builder patterns. These patterns facilitated 
the creation of a modular and maintainable chat application, 
with features such as real-time messaging, message formatting, 
and undo/redo functionality.

### Achievements
#### Real-Time Messaging
The application supports real-time communication 
between users, ensuring that messages are instantly delivered and received.
#### Design Patterns Integration
The project effectively integrated 
multiple design patterns, enhancing the application's architecture 
and making it adaptable to future changes.
#### User Interface: 
A basic yet functional user interface was developed, 
allowing users to send and receive messages easily.
#### Feature Implementation
Core features such as message formatting, 
emoji and timestamp decorators, and command operations (send, edit, delete) 
were implemented successfully.

### Challenges
#### Pattern Implementation
Implementing and integrating multiple design patterns required 
careful planning and consideration to avoid conflicts and ensure cohesion.
#### Testing Debugging
Ensuring that all features worked as intended 
and were free of bugs involved extensive testing 
and debugging. Some challenges were encountered 
in maintaining the integrity of the chat mediator 
and ensuring accurate message formatting.

### Final Thoughts
The TalkFlow Chat Application serves as a comprehensive example of 
how various design patterns can be applied to solve common software 
development problems. The project not only meets the initial objectives 
but also sets a solid foundation for future enhancements. 
As the application evolves, additional features such as
advanced security measures, scalability improvements, 
and third-party integrations could be considered to further enhance 
its capabilities.

Overall, the project highlights the importance of using design patterns 
to create a well-structured and maintainable application. 
It demonstrates how a thoughtfully designed architecture can lead to 
a more flexible and robust software solution.

## Future Work
Security Features: Implement encryption for secure messaging.
Scalability: Enhance support for larger numbers of users and messages.
Integration: Add third-party service integrations and advanced UI features.



