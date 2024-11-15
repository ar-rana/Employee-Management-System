<%@page language="java" %>
<html>
  <head>
    <style>
      .form-container {
        width: 75%;
        border: 1px solid black;
        padding: 10px;
        margin: 0 auto;
      }
      .table {
        width: 100%;
        border-collapse: collapse;
      }
      .table th,
      .table td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
      }
      .row label {
        margin-right: 10px;
      }
    </style>
  </head>
  <body>
    <div class="form-container">
    	<h3>SS0: <%= session.getAttribute("sso") %></h3>
      <form>
        <table class="table">
          <tr>
            <th>SSO</th>
            <th>${employeeModel.getSso()}</th>
          </tr>
          <tr>
            <th>Employee Type</th>
            <th>${employeeModel.getEmployeeType()}</th>
          </tr>
          <tr>
            <th>First Name</th>
            <th>${employeeModel.getFirstName()}</th>
          </tr>
          <tr>
            <th>Middle Name</th>
            <th>${employeeModel.getMiddleName()}</th>
          </tr>
          <tr>
            <th>Last Name</th>
            <th>${employeeModel.getLastName()}</th>
          </tr>
          <tr>
            <th>Preferred Name</th>
            <th>${employeeModel.getPreferredName()}</th>
          </tr>
          <tr>
            <th>Gender</th>
            <th>${employeeModel.getGender()}</th>
          </tr>
          <tr>
            <th>Position</th>
            <th>${employeeModel.getPosition()}</th>
          </tr>
          <tr>
            <th>Email</th>
            <th>${employeeModel.getEmail()}</th>
          </tr>
          <tr>
            <th>Business Group</th>
            <th>${employeeModel.getBusinessGroup()}</th>
          </tr>
          <tr>
            <th>Sub Business Group</th>
            <th>${employeeModel.getSubBusinessGroup()}</th>
          </tr>
          <tr>
            <th>Hire Date</th>
            <th>${employeeModel.getHireDate()}</th>
          </tr>
          <tr>
            <th>Classification</th>
            <th>${employeeModel.getClassification()}</th>
          </tr>
          <tr>
            <th>Country</th>
            <th>${employeeModel.getCountry()}</th>
          </tr>
          <tr>
            <th>Location</th>
            <th>${employeeModel.getLocation()}</th>
          </tr>
          <tr>
            <th>Organization</th>
            <th>${employeeModel.getOrganization()}</th>
          </tr>
          <tr>
            <th>Function</th>
            <th>${employeeModel.getFunction()}</th>
          </tr>
          <tr>
            <th>Business Unit</th>
            <th>${employeeModel.getBusinessUnit()}</th>
          </tr>
          <tr>
            <th>Govt. Report Entity</th>
            <th>${employeeModel.getReportEntity()}</th>
          </tr>
          <tr>
            <th>Terminate Date</th>
            <th>${employeeModel.getTerminateDate()}</th>
          </tr>
        </table>
      </form>
    </div>
  </body>
</html>
