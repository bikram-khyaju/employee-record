<h1>Add Employee</h1>
{{employee.firstName}}
<form ng-submit="save()">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" ng-model="employee.firstName"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" ng-model="employee.lastName"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="radio" ng-model="employee.gender" value="Male">Male
				<input type="radio" ng-model="employee.gender" value="Female">Female
			</td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" ng-model="employee.age"></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><input type="text" ng-model="employee.salary"></td>
		</tr>
		<tr>
			<td><button type="submit">Save</button></td>
		</tr>
	</table>
</form>
<p>Emp: {{employee}}</p>


