# Java-Projects
Email generator

This class creates an email account for a new employee, using their first name, last name and department code. It generates a unique email address and a random password. It also provides methods to change the password, set mailbox capacity, and set an alternate email address.
Usage

Create an object of the Email class by passing in the first name and last name of the new employee:
Email newEmployee = new Email("John", "Doe");
This will create a new email account for John Doe and display the user information.

To change the password of the email account:
newEmployee.set_password();

This will prompt the user to enter their current password and then the new password.

To set the mailbox capacity
newEmployee.set_mail();

This will prompt the user to enter the new mailbox capacity.

To set an alternate email address:
newEmployee.alternative_email();

This will prompt the user to enter the new alternate email address.

To display the user information:
newEmployee.getInfo();

This will display the user's name, department, email address, password, mailbox capacity, and alternate email address.
