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
        display: flex;
        justify-content: space-between;
        width: 100%;
      }
      .column_1,
      .column_2 {
        width: 47%;
      }
      .row {
        padding: 2px;
        display: flex;
        align-items: center;
        margin-bottom: 3px;
        background-color: #efefef;
      }
      .row label {
        flex: 1;
        margin-right: 10px;
      }
      .row input,
      .row select {
        flex: 2;
      }
      .row input[type="radio"] {
        flex: 0;
        margin-right: 5px;
      }
      .buttons {
        display: flex;
        justify-content: flex-end;
        margin-top: 20px;
      }
      .buttons button {
        margin: 0 10px;
        padding: 8px 16px;
        border: none;
        background-color: #f4f4f4;
        color: red;
        cursor: pointer;
        font-size: 14px;
      }
    </style>
  </head>
  <body>
    <div class="form-container">
      <form action="success"  method="post" onsubmit="return validateForm()">
        <div class="table">
          <div class="column_1">
            <div class="row">
              <label for="sso">SSO</label>
             <input type="text" name="sso" id="sso" value="<%= session.getAttribute("sso") %>" />
            </div>
            <div class="row">
              <label for="employeeType">Employee Type</label>
              <select name="employeeType" id="employeeType">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
            <div class="row">
              <label for="firstName">First Name</label>
              <input type="text" name="firstName" id="firstName" value="${employeeModel.getFirstName()}" />
            </div>
            <div class="row">
              <label for="middleName">Middle Name</label>
              <input type="text" name="middleName" id="middleName" value="${employeeModel.getMiddleName()}" />
            </div>
            <div class="row">
              <label for="lastName">Last Name</label>
              <input type="text" name="lastName" id="lastName" value="${employeeModel.getLastName()}" />
            </div>
            <div class="row">
              <label for="preferredName">Preferred Name</label>
              <input type="text" name="preferredName" id="preferredName" value="${employeeModel.getPreferredName()}" />
            </div>
                    <div class="row">
                        <label for="gender">Gender</label>
                        <input type="radio" name="gender" id="genderMale" value="Male" ${employeeModel.gender == 'Male' ? 'checked' : ''}/>Male
                        <input type="radio" name="gender" id="genderFemale" value="Female" ${employeeModel.gender == 'Female' ? 'checked' : ''}/>Female
                    </div>
            <div class="row">
              <label for="position">Position</label>
              <input type="text" name="position" id="position" value="${employeeModel.getPosition()}" />
            </div>
            <div class="row">
              <label for="email">Email</label>
              <input type="text" name="email" id="email" value="${employeeModel.getEmail()}" />
            </div>
            <div class="row">
              <label for="businessGroup">Business Group</label>
              <select name="businessGroup" id="businessGroup">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
            <div class="row">
              <label for="subBusinessGroup">Sub Business Group</label>
              <select name="subBusinessGroup" id="subBusinessGroup">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
          </div>
          <div class="column_2">
            <div class="row">
              <label for="hireDate">Hire Date</label>
              <input type="date" name="hireDate" id="hireDate" value="${employeeModel.getHireDate()}" />
            </div>
            <div class="row">
              <label for="classification">Classification</label>
              <select name="classification" id="classification">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
            <div class="row">
              <label for="country">Country</label>
              <select name="country" id="country">
                <option value="">Select</option>
                <option value="India" >India</option>
                <option value="USA" >USA</option>
                <option value="Canada" >Canada</option>
              </select>
            </div>
            <div class="row">
              <label for="location">Location</label>
              <select name="location" id="location">
                <option value="">Select</option>
                <option value="NCR" >NCR</option>
                <option value="Hyderabad" >Hyderabad</option>
                <option value="Faridabad" >Faridabad</option>
                <option value="Kolkata" >Kolkata</option>
                <option value="Ahmedabad" >Ahmedabad</option>
              </select>
            </div>
            <div class="row">
              <label for="organization">Organization</label>
              <select name="organization" id="organization">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
            <div class="row">
              <label for="function">Function</label>
              <input type="text" name="function" id="function" value="${employeeModel.getFunction()}" />
            </div>
            <div class="row">
              <label for="businessUnit">Business Unit</label>
              <input type="text" name="businessUnit" id="businessUnit" value="${employeeModel.getBusinessUnit()}" />
            </div>
            <div class="row">
              <label for="reportEntity">Govt. Report Entity</label>
              <select name="reportEntity" id="reportEntity">
                <option value="">Select</option>
                <option value="option_1" >Option 1</option>
                <option value="option_2" >Option 2</option>
              </select>
            </div>
            <div class="row">
              <label for="terminateDate">Terminate Date</label>
              <input type="date" name="terminateDate" id="terminateDate" value="${employeeModel.getTerminateDate()}" />
            </div>
          </div>
        </div>
        <div class="buttons">
          <button type="submit">Update</button>
          <button type="reset">Reset</button>
        </div>
      </form>
    </div>
    <script>
      function validateForm() {
        // List of fields to validate
        const fields = [
          'sso',
          'employeeType',
          'firstName',
          'lastName',
          'preferredName',
          'genderMale',
          'genderFemale',
          'position',
          'email',
          'businessGroup',
          'subBusinessGroup',
          'hireDate',
          'classification',
          'country',
          'location',
          'organization',
          'function',
          'businessUnit',
          'reportEntity',
          'terminateDate'
        ];

        for (let field of fields) {
          let element = document.getElementById(field);
          if (element && element.value.trim() === '') {
            alert('Please fill out the ' + field + ' field.');
            element.focus();
            return false;
          }
        }

        if (!document.getElementById('genderMale').checked && !document.getElementById('genderFemale').checked) {
          alert('Please select a gender.');
          return false;
        }

        return true;
      }
    </script>
  </body>
</html>
