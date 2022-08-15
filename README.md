# Track That Track

## Inspiration
Being an avid vinyl record collector that has more that 400 records in my collection, I find myself having a hard time keeping my collection organized and remembering what records I actually have in my collection. This web application was created to solve this problem by virtually helping a user organize all the records in their collection.

## About
Track That Track is a vinyl record management system. A user may sign up. signin and create a visual representation of all the records they own. 
There is full CRUD functionality that allows user to add, update and delete a record from their collection. Data is visually displayed in alphabetical 
order by artist with an image of the album cover. User may also create a wish list of records that they are wanting to add to their collection with full Crud operations as well.

## Technologies Used
Track That Track has evolved into a full Web portal project built to demonstrate separation of concerns and a distributed system that would be found in an enterprise environment.
The following Technologies were used.
   1. Landing page and User interface was created as a Java MVC project
   2. B2B page was build as a Restful web service using Spring Boot. This demonstrates how database data can be turned into JSON data and be posted as an endpoint for a different business area to use. There is full CRUD functionalities with this service. Please see https://github.com/Bearpaw11/TrackThatTrackRest for project files. 
   3. Admin page was built using Spring Boot and is protected with Spring Security. This page allows a ADMIN full CRUD operations of all the TrackThatTrack users. Please see https://github.com/Bearpaw11/TrackThatTrackAdminSpringBoot for project files. 
   
HTML, JPA, Thymeleaf, CSS, Bootstrap and JavaScript were used to display and style page contents. 

##Challenges Faced
One of the challenges I faced was having the logged in user information stay persistent as they navigate throughout the application. I ended up using Http session to help with this. I created a DTO to model the necessary user information I needed to stay persistent and then used the addAttribute method for Http session to hold this information. Once the user logs off I use the removeAttribute method to remove user information from Http session. 

## Wireframes
### Landing Page:
![Landing](https://user-images.githubusercontent.com/54750179/184665209-eb2612e8-426d-486a-9446-ed9e57671be8.png)

### About
![About](https://user-images.githubusercontent.com/54750179/184665532-1b1e20e4-f56f-4b94-bd64-310a65f229bd.png)


### Signup
![Signup](https://user-images.githubusercontent.com/54750179/184665645-b07f42fb-023b-4660-bcbc-0f6f430fb65d.png)

### Signin
![Signin](https://user-images.githubusercontent.com/54750179/184666227-766a3a44-da7d-4c90-b35b-d83ecf7e73c3.png)

### User Homepage
![User Home](https://user-images.githubusercontent.com/54750179/184666444-1d62b436-5dc9-47c1-847d-5b3b69918b16.png)


### Add/Update Record
![Add Update](https://user-images.githubusercontent.com/54750179/184666876-8f3c69e2-44bc-48b2-a124-b51248da83db.png)

