import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent extends BaseCtl {
 
  errorMessageName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.EMPLOYEE, locator, route);
  }

   onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.name);
    flag = flag && validator.isNotNullObject(form.salary);
    flag = flag && validator.isNotNullObject(form.post);
    flag = flag && validator.isNotNullObject(form.address);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.name = data.name;
    form.salary = data.salary;
    form.post = data.post;
    form.address = data.address;
  }

  validateName(event: KeyboardEvent): void {
    const inputValue = (event.target as HTMLInputElement).value;
    const inputChar = event.key;
    const alphabetPattern = /^[a-zA-Z]*$/;  // Pattern to match only alphabetic characters

    if (!alphabetPattern.test(inputChar) && !['Backspace', 'Delete', 'Tab'].includes(inputChar)) {
      event.preventDefault();
      this.errorMessageName = 'Only alphabets are allowed.';
      return;
    }

    if (inputValue.length < 3) {
      this.errorMessageName = 'fullName must be at least 3 characters long.';
    } else if (inputValue.length > 15) {
      this.errorMessageName= 'fullName must not exceed 15 characters.';
    } else {
      this.errorMessageName= '';  // Clear error message if valid
    }
  }

  validateAlphabetInput(event) {
    const charCode = event.which || event.keyCode;
    const charStr = String.fromCharCode(charCode);

    // Regular expression to test if the character is a letter
    if (!/^[a-zA-Z]+$/.test(charStr)) {
      event.preventDefault();
    }
  }

}