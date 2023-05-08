# DAOFAB_Task

## Server
This server exposes API's to get parent and child data. To access API use 
* BASE_URL: https://daofabtask-production.up.railway.app/api/v1
### Endpoints
* Parent List(Sorted by id): ```/parent?page=0&limit=2``` with 2 parm **page** and **limit**.
```
page: set number of page request.
limit: set number of data in one page.
```
* Parent by Id: ```/parent/{id}``` with id.
```
id: parent id.
```

* Child List of a parent : ```child/{id}``` with parent id.
```
id: parent id.
```
