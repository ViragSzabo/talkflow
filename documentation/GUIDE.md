# Talkflow Guide
## 1. Introduction
TalkFlow is a chat application designed to demonstrate 
various design patterns and features including real-time messaging, 
message formatting, undo/redo operations, and more. 
This guide provides instructions for both developers and general users 
to effectively utilize and contribute to the project.

## 2. Developer Guide
### 2.1. Project Setup
1. Clone the Repository
   git clone https://github.com/your-repo/talkflow.git
   cd talkflow
2. Set Up Development Environment
   IDE: IntelliJ IDEA or any preferred Java IDE.
   JDK: Ensure JDK 11 or higher is installed.
   Build Tool: Use Maven or Gradle (refer to pom.xml or build.gradle).
3. Build the Project
4. Run the Application
5. Run Tests

## 2.2. Project Structure
src/main/java: Contains the source code for the application.
Builder: Contains the Attachment and MessageBuilder classes.
Decorator: Contains the EmojiDecorator and TimestampDecorator classes.
Message: Contains the Message class.
Mediator: Contains the ChatMediator class.
User: Contains the User class.
Utils: Contains utility classes like EncryptionUtil.
src/test/java: Contains unit tests for the application.

## 2.3. Design Patterns Implemented
Observer Pattern: Used for updating chat windows automatically.
Decorator Pattern: Adds features like emojis and timestamps to messages.
Strategy Pattern: Formats messages in different styles.
Command Pattern: Manages message operations with undo/redo capabilities.
Factory Method Pattern: Creates various types of messages.
Mediator Pattern: Manages user interactions within chat rooms.
Builder Pattern: Constructs complex message objects.

## 3. General User Guide
### 3.1. Using the Application
For starting the TalkFlow Application, run the 'Main' class.
- Users are automatically created when they send their first message.
- With Attachment: Use the sendMessage method to send messages with files.
  Without Attachment: Simply create a Message object and send it.
- Messages are automatically displayed in the chat window when received.
- Plain Text: Basic formatting.
  HTML: Enhanced formatting with HTML.
- Messages can be decorated with emojis and timestamps.

### 3.2. User Interface
Chat Window: Where messages are displayed and received.
Message Input: Where users type and send their messages.
Attachments: Optionally include files with your messages.

### 3.3. Handling Errors
Invalid Input: Ensure message content and attachments are correctly formatted.
Connection Issues: Verify network settings if real-time messaging does not work.

### 3.4. Features Not Yet Implemented
Advanced Security: Future enhancements will include encryption improvements.
Scalability: Plans to handle larger user bases and high message volumes.
Multi-language Support: Future updates will include localization features.

## 4. Future Work and Contributions
TalkFlow aims to evolve with enhanced security, scalability, 
and additional features. Contributions are welcome:
Submit Issues: Report bugs or request features via GitHub issues.
Submit Pull Requests: Contribute code improvements or new features.
Provide Feedback: Share your experiences and suggestions for improvement.

## 5. Documentation and Help
[Project Repository:](https://github.com/ViragSzabo/talkflow/tree/main) 
Access the source code, issue tracker, and contribution guidelines.
User Guides: Detailed instructions and FAQs are available in the repository’s docs folder.
Support: Contact support via [outlook](mailto:virag.szabo@student.nhlstenden.com)
for assistance.


