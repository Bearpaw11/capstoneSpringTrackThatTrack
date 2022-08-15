# TrackThatTrack

## Inspiration
Being an avid vinyl record collector that has more that 400 records in my collection, I find myself having a hard time keeping my collection organized and remembering what records I actually have in my collection. This web application was created to solve this problem by virtually helping a user organize all the records in their collection.

## About
Track That Track is a vinyl Record management system. A user may sign up. signin and create a visual representation of all the records they own. 
There is full CRUD functionality that allows user to add, update and delete a record from their collection. Data is visually displayed in alphabetical 
order by artist with an image of the album cover. User may also create a wish list of records that they are wanting to add to their collection with full Crud operations as well.

## Technologies Used
Track That Track has evolved into a full Web portal project built to demonstrate separation of concerns and a distributed system that would be found in an enterprise environment.
The following Technologies were used.
   1. Landing page and User interface was created a Java MVC project
   2. B2B page was build as a Restful web service using Spring Boot. This demonstrates how database data cant be turned into JSON data and be posted as an endpoint for a different business area to use. There is full CRUD functionalities with this service. Please see https://github.com/Bearpaw11/TrackThatTrackRest for project files. 
   3. Admin page was built using Spring Boot and is protected with Spring Security. This page allows a ADMIN full CRUD operations of all the TrackThatTrack users. Please see https://github.com/Bearpaw11/TrackThatTrackAdminSpringBoot for project files. 
   
HTML, JPA, Thymeleaf, CSS, Bootstrap and Javascript were used to display and style page contents. 

## Visuals
### Signup page:
![signup](https://user-images.githubusercontent.com/54750179/184559756-96a3a60d-5615-473d-b6ac-02cd01c09c5c.png)

### User Home Page:
![Screen Shot 2022-08-14 at 5 09 13 PM](https://user-images.githubusercontent.com/54750179/184560026-d1c9e379-d66a-46e8-9803-07d1f2b4f188.png)


### Adding a record to a user's collection:
![addToCollection](https://user-images.githubusercontent.com/54750179/184559728-4ae3641d-50df-4761-8486-2308ade00db2.png)
