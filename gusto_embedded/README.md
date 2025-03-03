# openapi

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/gusto/ruby-sdk). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Gusto API: Welcome to Gusto's Embedded Payroll API documentation!
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.gusto:embedded-api:0.0.5'
```

Maven:
```xml
<dependency>
    <groupId>com.gusto</groupId>
    <artifactId>embedded-api</artifactId>
    <version>0.0.5</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1TokenInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1TokenInfoResponse res = sdk.introspection().getInfo()
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                | Type | Scheme      |
| ------------------- | ---- | ----------- |
| `companyAccessAuth` | http | HTTP Bearer |

To authenticate with the API the `companyAccessAuth` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1TokenInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1TokenInfoResponse res = sdk.introspection().getInfo()
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.Company;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesRequestBody;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesResponse;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesSecurity;
import com.gusto.embedded_api.models.operations.User;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PostV1PartnerManagedCompaniesResponse res = sdk.companies().createPartnerManaged()
                .security(PostV1PartnerManagedCompaniesSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PostV1PartnerManagedCompaniesRequestBody.builder()
                    .user(User.builder()
                        .firstName("Frank")
                        .lastName("Ocean")
                        .email("frank@example.com")
                        .phone("2345558899")
                        .build())
                    .company(Company.builder()
                        .name("Frank's Ocean, LLC")
                        .tradeName("Frank’s Ocean")
                        .ein("123456789")
                        .contractorOnly(false)
                        .build())
                    .build())
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [achTransactions()](docs/sdks/achtransactions/README.md)

* [getAll](docs/sdks/achtransactions/README.md#getall) - Get all ACH transactions for a company

### [bankAccounts()](docs/sdks/bankaccounts/README.md)

* [create](docs/sdks/bankaccounts/README.md#create) - Create a company bank account
* [get](docs/sdks/bankaccounts/README.md#get) - Get all company bank accounts
* [verify](docs/sdks/bankaccounts/README.md#verify) - Verify a company bank account
* [createFromPlaidToken](docs/sdks/bankaccounts/README.md#createfromplaidtoken) - Create a bank account from a plaid processor token

### [companies()](docs/sdks/companies/README.md)

* [createPartnerManaged](docs/sdks/companies/README.md#createpartnermanaged) - Create a partner managed company
* [get](docs/sdks/companies/README.md#get) - Get a company
* [update](docs/sdks/companies/README.md#update) - Update a company
* [migrate](docs/sdks/companies/README.md#migrate) - Migrate company to embedded payroll
* [acceptTermsOfService](docs/sdks/companies/README.md#accepttermsofservice) - Accept terms of service for a company user
* [retrieveTermsOfService](docs/sdks/companies/README.md#retrievetermsofservice) - Retrieve terms of service status for a company user
* [createAdmin](docs/sdks/companies/README.md#createadmin) - Create an admin for the company
* [listAdmins](docs/sdks/companies/README.md#listadmins) - Get all the admins at a company
* [getOnboardingStatus](docs/sdks/companies/README.md#getonboardingstatus) - Get the company's onboarding status
* [finishOnboarding](docs/sdks/companies/README.md#finishonboarding) - Finish company onboarding
* [getCustomFields](docs/sdks/companies/README.md#getcustomfields) - Get the custom fields of a company

### [companyAttachment()](docs/sdks/companyattachment/README.md)

* [getDownloadUrl](docs/sdks/companyattachment/README.md#getdownloadurl) - Get a temporary url to download the Company Attachment file

### [companyAttachments()](docs/sdks/companyattachments/README.md)

* [getDetails](docs/sdks/companyattachments/README.md#getdetails) - Get Company Attachment Details
* [getList](docs/sdks/companyattachments/README.md#getlist) - Get List of Company Attachments
* [create](docs/sdks/companyattachments/README.md#create) - Create Company Attachment and Upload File

### [companyBenefits()](docs/sdks/companybenefits/README.md)

* [create](docs/sdks/companybenefits/README.md#create) - Create a company benefit
* [list](docs/sdks/companybenefits/README.md#list) - Get benefits for a company
* [get](docs/sdks/companybenefits/README.md#get) - Get a company benefit
* [update](docs/sdks/companybenefits/README.md#update) - Update a company benefit
* [delete](docs/sdks/companybenefits/README.md#delete) - Delete a company benefit
* [getAll](docs/sdks/companybenefits/README.md#getall) - Get all benefits supported by Gusto
* [getSupported](docs/sdks/companybenefits/README.md#getsupported) - Get a supported benefit by ID
* [getSummary](docs/sdks/companybenefits/README.md#getsummary) - Get company benefit summary by company benefit id.
* [getEmployeeBenefits](docs/sdks/companybenefits/README.md#getemployeebenefits) - Get all employee benefits for a company benefit
* [updateEmployeeBenefits](docs/sdks/companybenefits/README.md#updateemployeebenefits) - Bulk update employee benefits for a company benefit
* [getRequirements](docs/sdks/companybenefits/README.md#getrequirements) - Get benefit fields requirements by ID

### [companyForms()](docs/sdks/companyforms/README.md)

* [getAll](docs/sdks/companyforms/README.md#getall) - Get all company forms
* [get](docs/sdks/companyforms/README.md#get) - Get a company form
* [getPdf](docs/sdks/companyforms/README.md#getpdf) - Get a company form pdf
* [sign](docs/sdks/companyforms/README.md#sign) - Sign a company form

### [contractorDocuments()](docs/sdks/contractordocuments/README.md)

* [getAll](docs/sdks/contractordocuments/README.md#getall) - Get all contractor documents
* [get](docs/sdks/contractordocuments/README.md#get) - Get a contractor document
* [getPdf](docs/sdks/contractordocuments/README.md#getpdf) - Get the contractor document pdf
* [sign](docs/sdks/contractordocuments/README.md#sign) - Sign a contractor document

### [contractorForms()](docs/sdks/contractorforms/README.md)

* [list](docs/sdks/contractorforms/README.md#list) - Get all contractor forms
* [get](docs/sdks/contractorforms/README.md#get) - Get a contractor form
* [getPdf](docs/sdks/contractorforms/README.md#getpdf) - Get the contractor form pdf
* [generate1099](docs/sdks/contractorforms/README.md#generate1099) - Generate a 1099 form [DEMO]

### [contractorPaymentGroups()](docs/sdks/contractorpaymentgroups/README.md)

* [create](docs/sdks/contractorpaymentgroups/README.md#create) - Create a contractor payment group
* [getList](docs/sdks/contractorpaymentgroups/README.md#getlist) - Get contractor payment groups for a company
* [preview](docs/sdks/contractorpaymentgroups/README.md#preview) - Preview a contractor payment group
* [get](docs/sdks/contractorpaymentgroups/README.md#get) - Fetch a contractor payment group
* [delete](docs/sdks/contractorpaymentgroups/README.md#delete) - Cancel a contractor payment group
* [fund](docs/sdks/contractorpaymentgroups/README.md#fund) - Fund a contractor payment group [DEMO]

### [contractorPaymentMethod()](docs/sdks/contractorpaymentmethod/README.md)

* [getBankAccounts](docs/sdks/contractorpaymentmethod/README.md#getbankaccounts) - Get all contractor bank accounts
* [get](docs/sdks/contractorpaymentmethod/README.md#get) - Get a contractor's payment method
* [update](docs/sdks/contractorpaymentmethod/README.md#update) - Update a contractor's payment method

### [contractorPaymentMethods()](docs/sdks/contractorpaymentmethods/README.md)

* [createBankAccount](docs/sdks/contractorpaymentmethods/README.md#createbankaccount) - Create a contractor bank account

### [contractorPayments()](docs/sdks/contractorpayments/README.md)

* [getReceipt](docs/sdks/contractorpayments/README.md#getreceipt) - Get a single contractor payment receipt
* [fund](docs/sdks/contractorpayments/README.md#fund) - Fund a contractor payment [DEMO]
* [create](docs/sdks/contractorpayments/README.md#create) - Create a contractor payment
* [list](docs/sdks/contractorpayments/README.md#list) - Get contractor payments for a company
* [get](docs/sdks/contractorpayments/README.md#get) - Get a single contractor payment
* [delete](docs/sdks/contractorpayments/README.md#delete) - Cancel a contractor payment
* [preview](docs/sdks/contractorpayments/README.md#preview) - Preview contractor payment debit date

### [contractors()](docs/sdks/contractors/README.md)

* [create](docs/sdks/contractors/README.md#create) - Create a contractor
* [list](docs/sdks/contractors/README.md#list) - Get contractors of a company
* [get](docs/sdks/contractors/README.md#get) - Get a contractor
* [update](docs/sdks/contractors/README.md#update) - Update a contractor
* [delete](docs/sdks/contractors/README.md#delete) - Delete a contractor
* [getOnboardingStatus](docs/sdks/contractors/README.md#getonboardingstatus) - Get the contractor's onboarding status
* [updateOnboardingStatus](docs/sdks/contractors/README.md#updateonboardingstatus) - Change the contractor's onboarding status
* [getAddress](docs/sdks/contractors/README.md#getaddress) - Get a contractor address
* [updateAddress](docs/sdks/contractors/README.md#updateaddress) - Update a contractor's address

### [departments()](docs/sdks/departments/README.md)

* [create](docs/sdks/departments/README.md#create) - Create a department
* [getAll](docs/sdks/departments/README.md#getall) - Get all departments of a company
* [get](docs/sdks/departments/README.md#get) - Get a department
* [update](docs/sdks/departments/README.md#update) - Update a department
* [delete](docs/sdks/departments/README.md#delete) - Delete a department
* [addPeople](docs/sdks/departments/README.md#addpeople) - Add people to a department
* [removePeople](docs/sdks/departments/README.md#removepeople) - Remove people from a department

### [earningTypes()](docs/sdks/earningtypes/README.md)

* [create](docs/sdks/earningtypes/README.md#create) - Create a custom earning type
* [list](docs/sdks/earningtypes/README.md#list) - Get all earning types for a company
* [update](docs/sdks/earningtypes/README.md#update) - Update an earning type
* [delete](docs/sdks/earningtypes/README.md#delete) - Deactivate an earning type

### [employeeAddresses()](docs/sdks/employeeaddresses/README.md)

* [get](docs/sdks/employeeaddresses/README.md#get) - Get an employee's home addresses
* [create](docs/sdks/employeeaddresses/README.md#create) - Create an employee's home address
* [retrieveHomeAddress](docs/sdks/employeeaddresses/README.md#retrievehomeaddress) - Get an employee's home address
* [update](docs/sdks/employeeaddresses/README.md#update) - Update an employee's home address
* [delete](docs/sdks/employeeaddresses/README.md#delete) - Delete an employee's home address
* [getWorkAddresses](docs/sdks/employeeaddresses/README.md#getworkaddresses) - Get an employee's work addresses
* [createWorkAddress](docs/sdks/employeeaddresses/README.md#createworkaddress) - Create an employee work address
* [retrieveWorkAddress](docs/sdks/employeeaddresses/README.md#retrieveworkaddress) - Get an employee work address
* [updateWorkAddress](docs/sdks/employeeaddresses/README.md#updateworkaddress) - Update an employee work address
* [deleteWorkAddress](docs/sdks/employeeaddresses/README.md#deleteworkaddress) - Delete an employee's work address

### [employeeBenefits()](docs/sdks/employeebenefits/README.md)

* [create](docs/sdks/employeebenefits/README.md#create) - Create an employee benefit
* [get](docs/sdks/employeebenefits/README.md#get) - Get all benefits for an employee
* [retrieve](docs/sdks/employeebenefits/README.md#retrieve) - Get an employee benefit
* [update](docs/sdks/employeebenefits/README.md#update) - Update an employee benefit
* [delete](docs/sdks/employeebenefits/README.md#delete) - Delete an employee benefit
* [getYtdBenefitAmountsFromDifferentCompany](docs/sdks/employeebenefits/README.md#getytdbenefitamountsfromdifferentcompany) - Get year-to-date benefit amounts from a different company
* [createYtdBenefitAmountsFromDifferentCompany](docs/sdks/employeebenefits/README.md#createytdbenefitamountsfromdifferentcompany) - Create year-to-date benefit amounts from a different company

### [employeeEmployments()](docs/sdks/employeeemployments/README.md)

* [createTermination](docs/sdks/employeeemployments/README.md#createtermination) - Create an employee termination
* [getTerminations](docs/sdks/employeeemployments/README.md#getterminations) - Get terminations for an employee
* [deleteTermination](docs/sdks/employeeemployments/README.md#deletetermination) - Delete an employee termination
* [updateTermination](docs/sdks/employeeemployments/README.md#updatetermination) - Update an employee termination
* [createRehire](docs/sdks/employeeemployments/README.md#createrehire) - Create an employee rehire
* [rehire](docs/sdks/employeeemployments/README.md#rehire) - Update an employee rehire
* [getRehire](docs/sdks/employeeemployments/README.md#getrehire) - Get an employee rehire
* [deleteRehire](docs/sdks/employeeemployments/README.md#deleterehire) - Delete an employee rehire
* [getHistory](docs/sdks/employeeemployments/README.md#gethistory) - Get employment history for an employee

### [employeeForms()](docs/sdks/employeeforms/README.md)

* [generateW2](docs/sdks/employeeforms/README.md#generatew2) - Generate a W2 form [DEMO]
* [list](docs/sdks/employeeforms/README.md#list) - Get all employee forms
* [get](docs/sdks/employeeforms/README.md#get) - Get an employee form
* [getPdf](docs/sdks/employeeforms/README.md#getpdf) - Get the employee form pdf
* [sign](docs/sdks/employeeforms/README.md#sign) - Sign an employee form

### [employeePaymentMethod()](docs/sdks/employeepaymentmethod/README.md)

* [create](docs/sdks/employeepaymentmethod/README.md#create) - Create an employee bank account
* [deleteBankAccount](docs/sdks/employeepaymentmethod/README.md#deletebankaccount) - Delete an employee bank account
* [updateBankAccount](docs/sdks/employeepaymentmethod/README.md#updatebankaccount) - Update an employee bank account
* [get](docs/sdks/employeepaymentmethod/README.md#get) - Get an employee's payment method
* [update](docs/sdks/employeepaymentmethod/README.md#update) - Update an employee's payment method

### [employeePaymentMethods()](docs/sdks/employeepaymentmethods/README.md)

* [getBankAccounts](docs/sdks/employeepaymentmethods/README.md#getbankaccounts) - Get all employee bank accounts

### [employees()](docs/sdks/employees/README.md)

* [create](docs/sdks/employees/README.md#create) - Create an employee
* [list](docs/sdks/employees/README.md#list) - Get employees of a company
* [createHistorical](docs/sdks/employees/README.md#createhistorical) - Create a historical employee
* [get](docs/sdks/employees/README.md#get) - Get an employee
* [update](docs/sdks/employees/README.md#update) - Update an employee
* [delete](docs/sdks/employees/README.md#delete) - Delete an onboarding employee
* [getCustomFields](docs/sdks/employees/README.md#getcustomfields) - Get an employee's custom fields
* [updateOnboardingDocumentsConfig](docs/sdks/employees/README.md#updateonboardingdocumentsconfig) - Update an employee's onboarding documents config
* [getOnboardingStatus](docs/sdks/employees/README.md#getonboardingstatus) - Get the employee's onboarding status
* [updateOnboardingStatus](docs/sdks/employees/README.md#updateonboardingstatus) - Update the employee's onboarding status
* [getTimeOffActivities](docs/sdks/employees/README.md#gettimeoffactivities) - Get employee time off activities

### [employeeTaxSetup()](docs/sdks/employeetaxsetup/README.md)

* [getFederalTaxes](docs/sdks/employeetaxsetup/README.md#getfederaltaxes) - Get an employee's federal taxes
* [updateFederalTaxes](docs/sdks/employeetaxsetup/README.md#updatefederaltaxes) - Update an employee's federal taxes
* [getStateTaxes](docs/sdks/employeetaxsetup/README.md#getstatetaxes) - Get an employee's state taxes
* [updateStateTaxes](docs/sdks/employeetaxsetup/README.md#updatestatetaxes) - Update an employee's state taxes

### [events()](docs/sdks/events/README.md)

* [get](docs/sdks/events/README.md#get) - Get all events

### [externalPayrolls()](docs/sdks/externalpayrolls/README.md)

* [create](docs/sdks/externalpayrolls/README.md#create) - Create a new external payroll for a company
* [get](docs/sdks/externalpayrolls/README.md#get) - Get external payrolls for a company
* [retrieve](docs/sdks/externalpayrolls/README.md#retrieve) - Get an external payroll
* [delete](docs/sdks/externalpayrolls/README.md#delete) - Delete an external payroll
* [update](docs/sdks/externalpayrolls/README.md#update) - Update an external payroll
* [calculateTaxes](docs/sdks/externalpayrolls/README.md#calculatetaxes) - Get tax suggestions for an external payroll
* [listTaxLiabilities](docs/sdks/externalpayrolls/README.md#listtaxliabilities) - Get tax liabilities
* [updateTaxLiabilities](docs/sdks/externalpayrolls/README.md#updatetaxliabilities) - Update tax liabilities
* [finalizeTaxLiabilities](docs/sdks/externalpayrolls/README.md#finalizetaxliabilities) - Finalize tax liabilities options and convert into processed payrolls

### [federalTaxDetails()](docs/sdks/federaltaxdetails/README.md)

* [get](docs/sdks/federaltaxdetails/README.md#get) - Get Federal Tax Details
* [update](docs/sdks/federaltaxdetails/README.md#update) - Update Federal Tax Details

### [flows()](docs/sdks/flows/README.md)

* [create](docs/sdks/flows/README.md#create) - Create a flow

### [garnishments()](docs/sdks/garnishments/README.md)

* [create](docs/sdks/garnishments/README.md#create) - Create a garnishment
* [list](docs/sdks/garnishments/README.md#list) - Get garnishments for an employee
* [get](docs/sdks/garnishments/README.md#get) - Get a garnishment
* [update](docs/sdks/garnishments/README.md#update) - Update a garnishment
* [getChildSupportData](docs/sdks/garnishments/README.md#getchildsupportdata) - Get child support garnishment data

### [generatedDocuments()](docs/sdks/generateddocuments/README.md)

* [get](docs/sdks/generateddocuments/README.md#get) - Get a generated document


### [historicalEmployees()](docs/sdks/historicalemployees/README.md)

* [update](docs/sdks/historicalemployees/README.md#update) - Update a historical employee

### [holidayPayPolicies()](docs/sdks/holidaypaypolicies/README.md)

* [get](docs/sdks/holidaypaypolicies/README.md#get) - Get a company's holiday pay policy
* [create](docs/sdks/holidaypaypolicies/README.md#create) - Create a holiday pay policy for a company
* [update](docs/sdks/holidaypaypolicies/README.md#update) - Update a company's holiday pay policy
* [delete](docs/sdks/holidaypaypolicies/README.md#delete) - Delete a company's holiday pay policy
* [addEmployees](docs/sdks/holidaypaypolicies/README.md#addemployees) - Add employees to a company's holiday pay policy
* [removeEmployees](docs/sdks/holidaypaypolicies/README.md#removeemployees) - Remove employees from a company's holiday pay policy
* [previewPaidHolidays](docs/sdks/holidaypaypolicies/README.md#previewpaidholidays) - Preview a company's paid holidays

### [i9Verification()](docs/sdks/i9verification/README.md)

* [getAuthorization](docs/sdks/i9verification/README.md#getauthorization) - Get an employee's I-9 authorization
* [update](docs/sdks/i9verification/README.md#update) - Create or update an employee's I-9 authorization
* [getDocumentOptions](docs/sdks/i9verification/README.md#getdocumentoptions) - Get an employee's I-9 verification document options
* [getDocuments](docs/sdks/i9verification/README.md#getdocuments) - Get an employee's I-9 verification documents
* [createDocuments](docs/sdks/i9verification/README.md#createdocuments) - Create an employee's I-9 authorization verification documents
* [deleteDocument](docs/sdks/i9verification/README.md#deletedocument) - Delete an employee's I-9 verification document
* [employerSign](docs/sdks/i9verification/README.md#employersign) - Employer sign an employee's Form I-9

### [industrySelection()](docs/sdks/industryselection/README.md)

* [get](docs/sdks/industryselection/README.md#get) - Get a company industry selection
* [update](docs/sdks/industryselection/README.md#update) - Update a company industry selection

### [introspection()](docs/sdks/introspection/README.md)

* [getInfo](docs/sdks/introspection/README.md#getinfo) - Get info about the current access token
* [refreshToken](docs/sdks/introspection/README.md#refreshtoken) - Refresh access token

### [invoices()](docs/sdks/invoices/README.md)

* [get](docs/sdks/invoices/README.md#get) - Retrieve invoicing data for companies

### [jobsAndCompensations()](docs/sdks/jobsandcompensations/README.md)

* [createJob](docs/sdks/jobsandcompensations/README.md#createjob) - Create a job
* [getJobs](docs/sdks/jobsandcompensations/README.md#getjobs) - Get jobs for an employee
* [getJob](docs/sdks/jobsandcompensations/README.md#getjob) - Get a job
* [update](docs/sdks/jobsandcompensations/README.md#update) - Update a job
* [delete](docs/sdks/jobsandcompensations/README.md#delete) - Delete an individual job
* [getCompensations](docs/sdks/jobsandcompensations/README.md#getcompensations) - Get compensations for a job
* [createCompensation](docs/sdks/jobsandcompensations/README.md#createcompensation) - Create a compensation
* [getCompensation](docs/sdks/jobsandcompensations/README.md#getcompensation) - Get a compensation
* [updateCompensation](docs/sdks/jobsandcompensations/README.md#updatecompensation) - Update a compensation
* [deleteCompensation](docs/sdks/jobsandcompensations/README.md#deletecompensation) - Delete a compensation

### [locations()](docs/sdks/locations/README.md)

* [create](docs/sdks/locations/README.md#create) - Create a company location
* [get](docs/sdks/locations/README.md#get) - Get company locations
* [retrieve](docs/sdks/locations/README.md#retrieve) - Get a location
* [update](docs/sdks/locations/README.md#update) - Update a location
* [getMinimumWages](docs/sdks/locations/README.md#getminimumwages) - Get minimum wages for a location

### [notifications()](docs/sdks/notifications/README.md)

* [getDetails](docs/sdks/notifications/README.md#getdetails) - Get a notification's details

### [paymentConfigs()](docs/sdks/paymentconfigs/README.md)

* [get](docs/sdks/paymentconfigs/README.md#get) - Get a company's payment configs
* [update](docs/sdks/paymentconfigs/README.md#update) - Update a company's payment configs

### [payrolls()](docs/sdks/payrolls/README.md)

* [createOffCycle](docs/sdks/payrolls/README.md#createoffcycle) - Create an off-cycle payroll
* [list](docs/sdks/payrolls/README.md#list) - Get all payrolls for a company
* [getApprovedReversals](docs/sdks/payrolls/README.md#getapprovedreversals) - Get approved payroll reversals
* [get](docs/sdks/payrolls/README.md#get) - Get a single payroll
* [update](docs/sdks/payrolls/README.md#update) - Update a payroll by ID
* [delete](docs/sdks/payrolls/README.md#delete) - Delete a payroll
* [prepare](docs/sdks/payrolls/README.md#prepare) - Prepare a payroll for update
* [getReceipt](docs/sdks/payrolls/README.md#getreceipt) - Get a single payroll receipt
* [getBlockers](docs/sdks/payrolls/README.md#getblockers) - Get all payroll blockers for a company
* [cancel](docs/sdks/payrolls/README.md#cancel) - Cancel a payroll
* [getPayStub](docs/sdks/payrolls/README.md#getpaystub) - Get an employee pay stub (pdf)
* [getPayStubs](docs/sdks/payrolls/README.md#getpaystubs) - Get an employee's pay stubs
* [generatePrintableChecks](docs/sdks/payrolls/README.md#generateprintablechecks) - Generate printable payroll checks (pdf)

### [paySchedules()](docs/sdks/payschedules/README.md)

* [create](docs/sdks/payschedules/README.md#create) - Create a new pay schedule
* [getAll](docs/sdks/payschedules/README.md#getall) - Get the pay schedules for a company
* [getPreview](docs/sdks/payschedules/README.md#getpreview) - Preview pay schedule dates
* [get](docs/sdks/payschedules/README.md#get) - Get a pay schedule
* [update](docs/sdks/payschedules/README.md#update) - Update a pay schedule
* [getPayPeriods](docs/sdks/payschedules/README.md#getpayperiods) - Get pay periods for a company
* [getUnprocessedTerminationPeriods](docs/sdks/payschedules/README.md#getunprocessedterminationperiods) - Get termination pay periods for a company
* [getAssignments](docs/sdks/payschedules/README.md#getassignments) - Get pay schedule assignments for a company
* [previewAssignment](docs/sdks/payschedules/README.md#previewassignment) - Preview pay schedule assignments for a company
* [assign](docs/sdks/payschedules/README.md#assign) - Assign pay schedules for a company

### [recoveryCases()](docs/sdks/recoverycases/README.md)

* [get](docs/sdks/recoverycases/README.md#get) - Get all recovery cases for a company
* [redebit](docs/sdks/recoverycases/README.md#redebit) - Initiate a redebit for a recovery case

### [reports()](docs/sdks/reports/README.md)

* [createCustom](docs/sdks/reports/README.md#createcustom) - Create a custom report
* [get](docs/sdks/reports/README.md#get) - Get a report
* [getTemplate](docs/sdks/reports/README.md#gettemplate) - Get a report template

### [signatories()](docs/sdks/signatories/README.md)

* [create](docs/sdks/signatories/README.md#create) - Create a signatory
* [list](docs/sdks/signatories/README.md#list) - Get all company signatories
* [invite](docs/sdks/signatories/README.md#invite) - Invite a signatory
* [update](docs/sdks/signatories/README.md#update) - Update a signatory
* [delete](docs/sdks/signatories/README.md#delete) - Delete a signatory

### [taxRequirements()](docs/sdks/taxrequirements/README.md)

* [get](docs/sdks/taxrequirements/README.md#get) - Get State Tax Requirements
* [updateState](docs/sdks/taxrequirements/README.md#updatestate) - Update State Tax Requirements
* [getAll](docs/sdks/taxrequirements/README.md#getall) - Get All Tax Requirement States

### [timeOffPolicies()](docs/sdks/timeoffpolicies/README.md)

* [calculateAccruingTimeOffHours](docs/sdks/timeoffpolicies/README.md#calculateaccruingtimeoffhours) - Calculate accruing time off hours
* [get](docs/sdks/timeoffpolicies/README.md#get) - Get a time off policy
* [update](docs/sdks/timeoffpolicies/README.md#update) - Update a time off policy
* [getAll](docs/sdks/timeoffpolicies/README.md#getall) - Get all time off policies
* [create](docs/sdks/timeoffpolicies/README.md#create) - Create a time off policy
* [addEmployees](docs/sdks/timeoffpolicies/README.md#addemployees) - Add employees to a time off policy
* [removeEmployees](docs/sdks/timeoffpolicies/README.md#removeemployees) - Remove employees from a time off policy
* [updateBalance](docs/sdks/timeoffpolicies/README.md#updatebalance) - Update employee time off hour balances
* [deactivate](docs/sdks/timeoffpolicies/README.md#deactivate) - Deactivate a time off policy

### [webhooks()](docs/sdks/webhooks/README.md)

* [createSubscription](docs/sdks/webhooks/README.md#createsubscription) - Create a webhook subscription
* [listSubscriptions](docs/sdks/webhooks/README.md#listsubscriptions) - List webhook subscriptions
* [updateSubscription](docs/sdks/webhooks/README.md#updatesubscription) - Update a webhook subscription
* [getSubscription](docs/sdks/webhooks/README.md#getsubscription) - Get a webhook subscription
* [deleteSubscription](docs/sdks/webhooks/README.md#deletesubscription) - Delete a webhook subscription
* [verify](docs/sdks/webhooks/README.md#verify) - Verify the webhook subscription
* [requestVerificationToken](docs/sdks/webhooks/README.md#requestverificationtoken) - Request the webhook subscription verification_token

### [wireInRequests()](docs/sdks/wireinrequests/README.md)

* [get](docs/sdks/wireinrequests/README.md#get) - Get a single Wire In Request
* [submit](docs/sdks/wireinrequests/README.md#submit) - Submit a wire in request
* [list](docs/sdks/wireinrequests/README.md#list) - Get all Wire In Requests for a company

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `createPartnerManaged` method throws the following exceptions:

| Error Type                                   | Status Code | Content Type     |
| -------------------------------------------- | ----------- | ---------------- |
| models/errors/UnprocessableEntityErrorObject | 422         | application/json |
| models/errors/APIException                   | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.Company;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesRequestBody;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesResponse;
import com.gusto.embedded_api.models.operations.PostV1PartnerManagedCompaniesSecurity;
import com.gusto.embedded_api.models.operations.User;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PostV1PartnerManagedCompaniesResponse res = sdk.companies().createPartnerManaged()
                .security(PostV1PartnerManagedCompaniesSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PostV1PartnerManagedCompaniesRequestBody.builder()
                    .user(User.builder()
                        .firstName("Frank")
                        .lastName("Ocean")
                        .email("frank@example.com")
                        .phone("2345558899")
                        .build())
                    .company(Company.builder()
                        .name("Frank's Ocean, LLC")
                        .tradeName("Frank’s Ocean")
                        .ein("123456789")
                        .contractorOnly(false)
                        .build())
                    .build())
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name   | Server                       | Description |
| ------ | ---------------------------- | ----------- |
| `demo` | `https://api.gusto-demo.com` | Demo        |
| `prod` | `https://api.gusto.com`      | Prod        |

#### Example

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1TokenInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .server(GustoEmbedded.AvailableServers.PROD)
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1TokenInfoResponse res = sdk.introspection().getInfo()
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1TokenInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .serverURL("https://api.gusto-demo.com")
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1TokenInfoResponse res = sdk.introspection().getInfo()
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
