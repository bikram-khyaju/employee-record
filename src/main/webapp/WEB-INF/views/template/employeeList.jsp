<h1>Employee List</h1>
<div class="emp">
Search <input type="text" placeholder="search by first/last name" ng-model="searchText" />
<input type="checkbox" ng-model="hideSalary" /> Hide Salary
<br />
<table  class="empList">
      <thead>
        <tr>
          <th ng-click="sortData('firstName')">
            First Name
            <div ng-class="getSortClass('firstName')"></div>
          </th>
          <th ng-click="sortData('lastName')">
            Last Name
            <div ng-class="getSortClass('lastName')"></div>
          </th>
          <th ng-click="sortData('gender')">
            Gender
            <div ng-class="getSortClass('gender')"></div>
          </th>
          <th ng-click="sortData('age')">
          	Age
          	<div ng-class="getSortClass('age')"></div>
          </th>
          <th ng-hide="hideSalary" ng-click="sortData('salary')">
            Salary
            <div ng-class="getSortClass('salary')"></div>
          </th>
          <th>
          	Action
          </th>
        </tr>
      </thead>
      <tbody>
        <tr ng-repeat="employee in employees | orderBy: sortColumn:reverseSort | filter: search">
          <td>{{employee.firstName}}</td>
          <td>{{employee.lastName}}</td>
          <td>{{employee.gender | lowercase}}</td>
          <td>{{employee.age}}</td>
          <td ng-hide="hideSalary"> {{employee.salary}}</td>
          <td>
          	<a href="#/editEmployee/{{employee.id}}" class="button" >Edit</a>
          	<button ng-click="deleteEmployee(employee.id)">Delete
          </td>
         
        </tr>
      </tbody>
    </table>
    </div>