This guide is segregated into 3 main parts. 
1. The first part of the guide talks about installing the MySQL database, MySQL WB and finally running the sql scripts required for the ecommerce project. 
2. The second part talks about running the Spring Boot E-Commerce App.
3. The third part talks about running the Angular Frontend E-Commerce App.

**Running MySQL Server:**
1. Download the source code attached to lecture 217 and extract the directory from the zip.
2. Open 01-starter-files directory. Lets run the scripts under the `01-starter-files/db-scripts` directory. To run those scripts and look at the results later, you have to install a mysql client on your machine. So, We will install MySQL Workbench.
3. Download MySQL community server and install mysql`. 
4. You can start mysql as follows: hit  `windows key + R`  
5. Once you're in `Services`, find `MySQL` and start it.
6. Now, inorder to run those starter sql scripts under `01-starter-files/db-scripts` , lets install MySQL Workbench.  
   Download MySQL Workbench and install mysql.workbench`. You should see MySQL WB on start in Windows. 
   Now, to run all the scripts, open all the SQL scripts one-by-one and run execute them by clickingon the ⚡️.


**Running the Spring Boot App:**
1. Install jdk on your machine. Open your cmd prompt, do `java --version` which should give you the java version.
2. Set JAVA_HOME in environmental variables.
3. Now, `cd` into `02-backend/spring-boot-ecommerce`. Once you're inside, please change the java version to 11 in the pom.xml. 
   This is just because we have installed java11 above. Now, run `mvnw clean install`. This might take a couple minutes.
4. Once everything goes well in step 3, to start your application run `.mvnw spring-boot:run`. This will run your backend application. Once your application is up, go hit `http://localhost:8080/api/` on your browser and you should see something as follows: (Note: Make sure your mysql server is up)
   


**Running the Angular App:**
1.  Install node on your machine install nodejs-lts` . This will install install nodejs v16 (lts).
2. Running `node -v` && `npm -v` from cmd should give you their respective version numbers.
3. Install the angular-cli globally from cmd prompt by running:  `npm install -g @angular/cli`. `ng version` should give you angular-cli version number.
4. Now, navigate to our front-end app at `03-frontend/angular-ecommerce`. Once you're inside the `angular-ecommerce` directory, run `npm install`.
5. Now, run `ng build`  (this might take a couple minutes) and then `ng serve`.
6. You should have the front-end ecommerce app up and running at `http://localhost:4200`. 
With that, you should have a fully functional E-Commerce App running on your machine.
   