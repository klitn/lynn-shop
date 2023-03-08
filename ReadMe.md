# Lynn Shop Management System

This is a clothing store management system for Lynn Shop which allows for the management of employees, products, invoices, and revenue statistics. Lynn Shop is designed to be user-friendly and can be easily used by store managers, employees, and other personnel who need to perform various tasks related to the store management. 

## Features
The following are the features of the Lynn Shop Management System:

1. Employee Management.
2. Product Management.
3. Invoice Management.
4. Revenue Statistics.



## Demo 

### Login 
![login%202](./image/login%202.jpg)
### Home Page.
![](./image/trang%20chủ.jpg)

### Employee Management.
![](./image/qli%20nhân%20viên.jpg)

The application allows the store manager to manage employees by adding, editing, and deleting employee records. The manager can also view the employee’s details such as name, contact information, and role in the store,..

### Product Management.

![](./image/qli%20sản%20phẩm.jpg)

The application allows the store manager to manage the products by adding, aditing, and deleting product records. The manager can also view the product’s details such as name, price, and quantity.

### Invoice Management.
![](./image/quản%20lí%20hóa%20đơn.jpg)

The application allows the store manager to manage the invoices by adding, editing, and deleting invoice records. The manager can also view the invoice’s details such as customer information, invoice total and order date.

### Revenue Statistics.
![](./image/thống%20kê.jpg)

The application provides revenue statistics that allow the store manager to view the total revenue generated by the store. The manager can view the revenue statistics by day or month.

## Technology used
1. Programming language: Java.
2. Database: MySQL.
3. Framework: JavaScript.


## Structure of the application
1. Package model: Contains classes representing objects in the application such as Nhanvien, Sanpham, Hoadon,...
2. Package controller: Manage data query operations with functions such as adding, editing, deleting, searching, displaying list, revenue statistics.
3. Package view: Contains user interfaces that receive user requests, send requests to the controller to process data, return results to update the display interface.

## Description of the implementation steps:
1. Design MySQL database and create employees, products, invoice and invoice details tables.
2. Create classes Nhanvien, Sanpham, HoaDon, SanphamCT to manage information of the respective object classes.
3. Create Controller class to perform data query operations with MySQL database.
4. Design and create user interfaces, including Login, Home, QLnhanvien, QLsanpham, Capnhatdonhang, Thongke.
5. Add functions to the user interfaces as follows:
   - Login: Allows users to log into the system with an account and password.
   - QLnhanvien: Allows users to manage employee information, including adding, editing, deleting, and searching for employees.
   - QLsanpham: Allows users to manage product information, including adding, editing, deleting and searching products.
   - Capnhatdonhang: Allows users to create new invoices, modify or delete previously created invoices.
   - Thongke: Allows users to view the entire store's sales statistics and statistics by day or month.

## User manual
1. Run the application on the computer
2. At the login interface, the user enters the account and password.
3. At the Home interface, users can select the functions they want to use by clicking on the corresponding button. The application will then display an interface that implements this function.
4. At the Employee Management interface, users can use the functions of adding, editing, deleting and searching by employee code or employee name.
   - If the user wants to add a new employee to the system, they will fill in the employee's information in the corresponding boxes on the interface and click the "Add" button to complete the operation.
  - If the user wants to edit an employee on the system, the user will click on the employee he wants to edit on the board and edit the content he wants to edit, then click the "Edit" button to complete the operation.
  - If the user wants to delete an employee on the system, the user will click on the employee he wants to delete on the table and then click the "Delete" button to complete the operation.
  - If the user wants to search for an employee on the system, the user will enter the employee code or the name of the employee he wants to search and then click the "Find" button to complete the operation.
5. At the Product Management interface, users can use the functions of adding, editing, deleting and searching by product code or product name similar to the employee management function.
6. At the Invoice Management interface, users can use the functions of adding, editing and deleting invoices.
   - If the user wants to add an invoice, fill in the customer information, select the salesperson code, and the order date. Next, click on the product the customer wants to buy in the product table and enter the number of products they want to buy. Then, click on the “Add Product” button to add a product in the product detail table. In case if the user places the wrong order, the user can click in the detailed product table to delete the previously ordered product. Finally, click on the “Save Invoice” button to save the invoice in the invoice table.
  - If the user wants to invoice an invoice on the system, the user will click on the invoice he wants to delete on the invoice table and click the "Delete invoice" button to complete the operation.
7. At the revenue statistics interface, users can perform functions such as invoice statistics by day, month and year. Displays the total total sales of the store.
   - If the user wants to record the revenue, enter the date that the user wants to make statistics and then click the "Find" button to complete the operation.

## Conclusion:
- In this report, I presented a java project with functions of employee management, product management, invoice management and revenue statistics. 

- I have described the class diagram and the implementation steps. This project will help businesses manage employee information, products, invoices and revenue statistics easily and effectively.

## Video Demo

[Video Demo](https://youtu.be/2YXKEe6MATs)






