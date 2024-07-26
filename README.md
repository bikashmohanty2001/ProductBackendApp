
# Product Application CRUD opretion with RESTFul Service

The "Product" application project is a Java-based Spring Boot application with RESTful service functionality. It has been developed to perform CRUD operations on products, including adding, updating, viewing, and deleting products. Additionally, it provides reference implementations to connect with various databases such as H2, MySQL, Postgres-SQL, and SQL.”

## Tech Stack

**Java:** 17

**Spring Boot:** 3.3.2

**Spring Data Jpa**

**MySQL Workbench**


## Features/API Reference



| Features | APIs     | 
| :-------- | :------- | 
| `Add_Product` | `http://localhost:8080/product/add` |
| `Fetch_Product` | `http://localhost:8080/product/fetch_all` |
| `Product_By_Id` | `http://localhost:8080/product/fetch/{id}` |
| `Update_By_Id` | `http://localhost:8080/product/update/{id}` |
| `Delete_By_Id` | `http://localhost:8080/product/delete/{id}` |




## Database Setup



```bash
#Database Config:mysql
spring.datasource.url=jdbc:mysql://localhost:3306/fullstackcrudapi
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password

#hibernet config
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create the above appropriate database in your local system.
## Build and Run The Application

**Using Command Prompt:**

- Go to project root dirictory path and copy it:
```bash
https://github.com/bikashmohanty2001/ProductBackendApp.git
```
- Open command prompt in your system with appropriate location clone the code using this command:

```bash
git clone https://github.com/bikashmohanty2001/ProductBackendApp.git
```
- execute the command "mvn clean install" to clean and build the project in project dirictory


## Using IDE (IntelliJ/STS/Eclipse)

- Import the download project in appropriat IDE.
- Run the maven update 
- Go to the main java file AppLuncher and run the application


## Test API

**Using "POSTMAN":**
| Features | APIs     | 
| :-------- | :------- | 
| `Add_Product` | `http://localhost:8080/product/add` |
| `All_Product` | `http://localhost:8080/product/fetch_all` |
| `Product_By_Id` | `http://localhost:8080/product/fetch/{id}` |
| `Update_By_Id` | `http://localhost:8080/product/update/{id}` |
| `Delete_By_Id` | `http://localhost:8080/product/delete/{id}` |
- Bind the API path in the Url section. 
- Attach appropiat request header or request param.
- Click on send button to get the response


    
