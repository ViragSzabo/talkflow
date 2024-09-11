# TalkFlow Chat Application
TalkFlow is a simple, extendable, and pattern-rich chat application designed to demonstrate the use of multiple design patterns in a real-world scenario.
Built in Java using IntelliJ IDEA, this project emphasizes flexibility, scalability, and ease of understanding through design patterns such as Observer, Mediator, Decorator, Command, and Builder.

## Features
**Real-time message updates:** ChatRooms notify all connected ChatWindows (Observer pattern).
**Centralized communication:** Users communicate through a central ChatMediator, which handles routing (Mediator pattern).
**Flexible message creation:** Messages are built with attachments and can be extended with decorators like timestamps and emojis (Builder and Decorator patterns).
**Undo/Redo functionality:** Commands such as sending messages can be undone and redone (Command pattern).
**Extendable:** Designed for future improvements, additional features, and more learning opportunities.

## Design Patterns Used
### 1. Observer Pattern
**Used for:** Notifying ChatWindow observers when a new message is sent to a ChatRoom.
**Class Involvement:** ChatRoom, ChatWindow
### 2. Mediator Pattern
**Used for:** Managing communication between different users and routing messages through the ChatMediator.
**Class Involvement:** ChatMediator, User, ChatRoom
### 3. Decorator Pattern
**Used for:** Enhancing messages with additional features like timestamps and emojis.
**Class Involvement:** Message, TextMessage, EmojiDecorator, TimestampDecorator
### 4. Command Pattern
**Used for:** Implementing undo/redo functionality when sending or removing messages.
**Class Involvement:** Command, SendCommand, UndoManager
### 5. Builder Pattern
**Used for:** Constructing complex messages with optional attachments.
**Class Involvement:** MessageBuilder, Attachment, Message

## Setup Instructions
### Requirements
Java 11+
IntelliJ IDEA
Git (optional)

### Steps to Run the Project
**Clone this repository:** git clone https://github.com/your-username/talkflow.git
Open the project in IntelliJ IDEA.
Build and run the project using the Run button in IntelliJ IDEA.
Enjoy testing the chat application.

## Testing
Testing is done through a series of automated tests in the Testing and Debugging phase. Here's a basic test plan:
**Message Flow Test:** Ensure that messages sent by users are routed properly via the ChatMediator to the ChatRoom.
**Observer Test:** Verify that ChatWindow instances are updated when the ChatRoom receives a new message.
**Command Test:** Test the undo/redo functionality of message sending using the SendCommand and UndoManager.
**Builder Test:** Ensure that the MessageBuilder can correctly build messages with or without attachments.
**Decorator Test:** Validate the correct application of emoji and timestamp decorators on messages.

## Timetable
| **Task**                       | **Date/Time**                  | **Duration** |
|---------------------------------|--------------------------------|--------------|
| Planning and Design             | 08.11. 19:45 - 20:45           | 1 hour       |
| Setup and Initial Development   | 08.11. 21:00 - 23:00           | 2 hours      |
| Implement Design Patterns       | 08.12. 19:00 - 21:00           | 2 hours      |
| Testing and Debugging           | 08.12. 21:00 - 22:00           | 1 hour       |
| Finalization and Documentation  | 08.13. 06:30 - 07:30           | 1 hour       |
**Total Estimated Time:** 7 hours

## Future Enhancements
Add real-time web sockets for real-world chat functionality.
Extend the Decorator pattern to support multimedia content (images, videos).
Introduce a persistence layer using a database to store chat logs.
Implement user authentication and private messaging between users.

## Developer
Student: Virag Szabo
Number: 4727444
