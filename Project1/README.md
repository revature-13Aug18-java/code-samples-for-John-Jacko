Project one was similar to project 0, only it was an Employee reinbursement system. There are
 2 types of Users: Employee and Manager. Employees can make reimbursement requests as 
 well as view their own. Managers can view/filter requests as well as Approve or reject requests.
 The technologies used were HTML, CSS, Bootstrap, JavaScript, AJAX, and Java sevlets - in
 addition to the technologies used in Project 0

There was one class for both Employee's and Manager's with a boolean attribute differentiating
 between the two. Reimbursements had a unique name (with Employee's being warned in real-time)
 whether or not their request name was already taken. Requests also had a long body, which used 
 the CLOB type in SQL.

Servlets were deployed with an abstract class being used to handle authentication that the sub-classes 
 could use to determine whether the client was logged on or not and take appropriate action accordingly.
 GET requests were used to retrieve web-pages, which read the html file and printed them to the HTTP
 Response. 

