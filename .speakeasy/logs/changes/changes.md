## Java SDK Changes:
* `gustoembedded.contractorPaymentMethod.get()`:  `response.type.enum(null)` **Removed** (Breaking ⚠️)
* `gustoembedded.companyBenefits.getSupported()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Removed** (Breaking ⚠️)
* `gustoembedded.companies.listAdmins()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.[].phone` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companies.suspensions.get()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.companyAttachments.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyAttachmentCreateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `category` **Changed**
    - `name` **Changed**
    - `uploadTime` **Changed**
    - `uuid` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.peopleBatches.getV1PeopleBatchesPeopleBatchUuid()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
    - `enum(20251115)` **Removed** (Breaking ⚠️)
  * `response` **Changed**
    - `idempotencyKey` **Changed**
    - `status` **Changed**
    - `uuid` **Changed**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.peopleBatches.postV1CompaniesCompanyIdPeopleBatches()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody.batch[].compensation.effectiveDate` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion.enum(20250615)` **Added**
    - `xGustoApiVersion.enum(20251115)` **Removed** (Breaking ⚠️)
  * `response` **Changed** (Breaking ⚠️)
    - `batchAction` **Changed**
    - `idempotencyKey` **Changed**
    - `status.enum(partialSuccess)` **Added** (Breaking ⚠️)
    - `uuid` **Changed**
  * `error` **Changed** (Breaking ⚠️)
    - `errors[].errors` **Removed** (Breaking ⚠️)
    - `errors[].metadata` **Removed** (Breaking ⚠️)
    - `rawResponse` **Removed** (Breaking ⚠️)
* `gustoembedded.reimbursements.deleteV1RecurringReimbursements()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.reimbursements.putV1RecurringReimbursements()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.reimbursements.getV1RecurringReimbursements()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.reimbursements.postV1EmployeesEmployeeIdRecurringReimbursements()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.reimbursements.getV1EmployeesEmployeeIdRecurringReimbursements()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.salaryEstimates.getV1SalaryEstimatesOccupations()`: `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
* `gustoembedded.salaryEstimates.postV1SalaryEstimatesUuidAccept()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.salaryEstimates.putV1SalaryEstimatesId()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.salaryEstimates.getV1SalaryEstimatesId()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.salaryEstimates.postV1EmployeesEmployeeIdSalaryEstimates()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.wireInRequests.list()`:  `response.[].paymentType.enum(contractorPaymentGroup)` **Added** (Breaking ⚠️)
* `gustoembedded.federalTaxDetails.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `filingForm` **Changed** (Breaking ⚠️)
    - `taxPayerType` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.federalTaxDetails.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `federalTaxDetailsUpdate` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `filingForm` **Changed** (Breaking ⚠️)
    - `taxPayerType` **Changed** (Breaking ⚠️)
  * `error` **Changed**
    - `` **Added**
    - `status[409]` **Added**
* `gustoembedded.wireInRequests.submit()`:  `response.paymentType.enum(contractorPaymentGroup)` **Added** (Breaking ⚠️)
* `gustoembedded.industrySelection.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyIndustrySelectionRequiredBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.signatories.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `signatoryCreateRequest` **Added** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.wireInRequests.get()`:  `response.paymentType.enum(contractorPaymentGroup)` **Added** (Breaking ⚠️)
* `gustoembedded.signatories.invite()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `signatoryInviteRequest` **Added** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.signatories.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `signatoryUpdateRequest` **Added** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[409]` **Added**
* `gustoembedded.recoveryCases.get()`: `response.[]` **Changed** (Breaking ⚠️)
    - `latestErrorCode` **Changed** (Breaking ⚠️)
    - `originalDebitDate` **Changed** (Breaking ⚠️)
* `gustoembedded.flows.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `createFlowRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.locations.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyLocationRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.informationRequests.submit()`:  `response.requiredQuestions[].responseType.enum(radioButton)` **Added** (Breaking ⚠️)
* `gustoembedded.locations.retrieve()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.locations.update()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.locations.getMinimumWages()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.bankAccounts.get()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.bankAccounts.create()`: 
  *  `response.status[200]` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.bankAccounts.verify()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyBankAccountVerifyRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.bankAccounts.deleteV1CompaniesCompanyIdBankAccountsBankAccountId()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.informationRequests.getInformationRequests()`:  `response.[].requiredQuestions[].responseType.enum(radioButton)` **Added** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.removeEmployees()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.externalPayrolls.listTaxLiabilities()`:  `response.[]` **Changed** (Breaking ⚠️)
* `gustoembedded.externalPayrolls.updateTaxLiabilities()`:  `response.[]` **Changed** (Breaking ⚠️)
* `gustoembedded.paymentConfigs.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.paymentSpeed` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.paymentConfigs.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `paymentConfigsUpdateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.paymentSpeed` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.paySchedules.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `payScheduleCreateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `anchorEndOfPayPeriod` **Changed** (Breaking ⚠️)
    - `anchorPayDate` **Changed** (Breaking ⚠️)
    - `autoPayrollEnablementBlockers` **Added**
    - `autoPayroll` **Added**
    - `frequency.enum(annually)` **Added** (Breaking ⚠️)
    - `frequency.enum(quarterly)` **Added** (Breaking ⚠️)
    - `version` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.paySchedules.getAll()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.[]` **Changed** (Breaking ⚠️)
    - `anchorEndOfPayPeriod` **Changed** (Breaking ⚠️)
    - `anchorPayDate` **Changed** (Breaking ⚠️)
    - `autoPayrollEnablementBlockers` **Added**
    - `autoPayroll` **Added**
    - `version` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.paySchedules.getPreview()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `anchorEndOfPayPeriod` **Changed** (Breaking ⚠️)
    - `anchorPayDate` **Changed** (Breaking ⚠️)
    - `endDate` **Added**
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `holidays[]` **Changed** (Breaking ⚠️)
    - `payPeriods[].checkDate` **Changed** (Breaking ⚠️)
    - `payPeriods[].endDate` **Changed** (Breaking ⚠️)
    - `payPeriods[].runPayrollBy` **Changed** (Breaking ⚠️)
    - `payPeriods[].startDate` **Changed** (Breaking ⚠️)
  * `error` **Changed**
    - `status[404]` **Added**
    - `status[422]` **Added**
* `gustoembedded.paySchedules.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `anchorEndOfPayPeriod` **Changed** (Breaking ⚠️)
    - `anchorPayDate` **Changed** (Breaking ⚠️)
    - `autoPayrollEnablementBlockers` **Added**
    - `autoPayroll` **Added**
    - `version` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.paySchedules.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `payScheduleUpdateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `anchorEndOfPayPeriod` **Changed** (Breaking ⚠️)
    - `anchorPayDate` **Changed** (Breaking ⚠️)
    - `autoPayrollEnablementBlockers` **Added**
    - `autoPayroll` **Added**
    - `frequency.enum(annually)` **Added** (Breaking ⚠️)
    - `frequency.enum(quarterly)` **Added** (Breaking ⚠️)
    - `version` **Added**
  * `error` **Changed**
    - `` **Added**
    - `status[409]` **Added**
* `gustoembedded.paySchedules.getPayPeriods()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `endDate` **Changed** (Breaking ⚠️)
    - `payrollTypes` **Changed** (Breaking ⚠️)
    - `startDate` **Changed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.employees.list()`: 
  *  `response.[].jobs[].compensations[].title` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.create()`: 
  *  `requestBody.email` **Changed**
  *  `response.jobs[].compensations[].title` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.addEmployees()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.get()`: 
  *  `response.jobs[].compensations[].title` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.update()`: 
  *  `response.jobs[].compensations[].title` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.delete()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.updateOnboardingDocumentsConfig()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `employeeOnboardingDocumentsConfigRequest` **Added**
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `i9Document` **Changed** (Breaking ⚠️)
    - `uuid` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.employees.getOnboardingStatus()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.updateOnboardingStatus()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employees.getTimeOffActivities()`: `response` **Changed** (Breaking ⚠️)
    - `balanceChange` **Changed** (Breaking ⚠️)
    - `balance` **Changed** (Breaking ⚠️)
    - `effectiveTime` **Changed** (Breaking ⚠️)
    - `eventDescription` **Changed** (Breaking ⚠️)
    - `policyName` **Changed** (Breaking ⚠️)
    - `policyUuid` **Changed** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.delete()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.update()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.create()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeEmployments.rehire()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `rehireUpdateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeEmployments.getRehire()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeEmployments.deleteRehire()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `error` **Changed** (Breaking ⚠️)
    - `errors[].errors` **Removed** (Breaking ⚠️)
    - `errors[].metadata` **Removed** (Breaking ⚠️)
    - `status[422]` **Added**
* `gustoembedded.employeeEmployments.getHistory()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.get()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.create()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.retrieveHomeAddress()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.update()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.delete()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.getWorkAddresses()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.createWorkAddress()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.retrieveWorkAddress()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.updateWorkAddress()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeAddresses.deleteWorkAddress()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.holidayPayPolicies.get()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeTaxSetup.updateFederalTaxes()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody.additionalWithholding` **Changed** (Breaking ⚠️)
    - `requestBody.deductions` **Changed** (Breaking ⚠️)
    - `requestBody.dependentsAmount` **Changed** (Breaking ⚠️)
    - `requestBody.extraWithholding` **Changed** (Breaking ⚠️)
    - `requestBody.filingStatus` **Changed** (Breaking ⚠️)
    - `requestBody.otherIncome` **Changed** (Breaking ⚠️)
    - `requestBody.w4DataType` **Changed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `union(pre_2020_w4).companyId` **Added**
    - `union(pre_2020_w4).employeeId` **Added**
    - `union(rev_2020_w4).companyId` **Added**
    - `union(rev_2020_w4).employeeId` **Added**
  * `error` **Changed**
    - `` **Added**
    - `status[409]` **Added**
* `gustoembedded.employeeTaxSetup.getStateTaxes()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeTaxSetup.updateStateTaxes()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.taxRequirements.updateState()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody.requirementSets[].key` **Changed** (Breaking ⚠️)
    - `requestBody.requirementSets[].requirements[].key` **Changed** (Breaking ⚠️)
    - `requestBody.requirementSets[].requirements[].value` **Changed** (Breaking ⚠️)
    - `requestBody.requirementSets[].state` **Changed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.contractorPaymentMethod.update()`:  `response.type.enum(null)` **Removed** (Breaking ⚠️)
* `gustoembedded.employeePaymentMethod.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `requestBody.splitBy` **Changed**
    - `requestBody.splits[].splitAmount` **Changed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[409]` **Added**
* `gustoembedded.jobsAndCompensations.createJob()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `jobsCreateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.compensations[].title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.employerSign()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `i9AuthorizationEmployerSignRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `additionalInfo` **Changed** (Breaking ⚠️)
    - `altProcedure` **Changed** (Breaking ⚠️)
    - `country` **Changed** (Breaking ⚠️)
    - `documentType` **Changed** (Breaking ⚠️)
    - `expirationDate` **Changed** (Breaking ⚠️)
    - `formUuid` **Changed** (Breaking ⚠️)
    - `hasDocumentNumber` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.createDocuments()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `i9AuthorizationDocumentsRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `status[200]` **Removed** (Breaking ⚠️)
    - `status[201]` **Added** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `jobsUpdateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.compensations[].title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.getDocuments()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.[].expirationDate` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.webhooks.createSubscription()`:  `response.subscriptionTypes[].enum(payrollSync)` **Added** (Breaking ⚠️)
* `gustoembedded.jobsAndCompensations.createCompensation()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `compensationsRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `i9AuthorizationRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `additionalInfo` **Changed** (Breaking ⚠️)
    - `altProcedure` **Changed** (Breaking ⚠️)
    - `country` **Changed** (Breaking ⚠️)
    - `documentType` **Changed** (Breaking ⚠️)
    - `expirationDate` **Changed** (Breaking ⚠️)
    - `formUuid` **Changed** (Breaking ⚠️)
    - `hasDocumentNumber` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.updateCompensation()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `compensationsUpdateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.getAuthorization()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `additionalInfo` **Changed** (Breaking ⚠️)
    - `altProcedure` **Changed** (Breaking ⚠️)
    - `country` **Changed** (Breaking ⚠️)
    - `documentType` **Changed** (Breaking ⚠️)
    - `expirationDate` **Changed** (Breaking ⚠️)
    - `formUuid` **Changed** (Breaking ⚠️)
    - `hasDocumentNumber` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.contractors.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `contractorCreateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `departmentTitle` **Added**
    - `dismissalCancellationEligible` **Added**
    - `memberPortalInvitationStatus` **Added**
    - `partnerPortalInvitationSent` **Added**
    - `paymentMethod.enum(null)` **Removed** (Breaking ⚠️)
    - `rehireCancellationEligible` **Added**
    - `upcomingEmployment` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.contractors.list()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `include` **Added**
    - `onboardedActive` **Added**
    - `onboarded` **Added**
    - `sortBy` **Changed** (Breaking ⚠️)
    - `terminatedToday` **Added**
    - `terminated` **Added**
    - `xGustoApiVersion` **Changed**
  * `response.[]` **Changed** (Breaking ⚠️)
    - `departmentTitle` **Added**
    - `dismissalCancellationEligible` **Added**
    - `memberPortalInvitationStatus` **Added**
    - `partnerPortalInvitationSent` **Added**
    - `paymentMethod.enum(null)` **Removed** (Breaking ⚠️)
    - `rehireCancellationEligible` **Added**
    - `upcomingEmployment` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.contractors.get()`: 
  * `request` **Changed**
    - `include` **Added**
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `departmentTitle` **Added**
    - `dismissalCancellationEligible` **Added**
    - `memberPortalInvitationStatus` **Added**
    - `partnerPortalInvitationSent` **Added**
    - `paymentMethod.enum(null)` **Removed** (Breaking ⚠️)
    - `rehireCancellationEligible` **Added**
    - `upcomingEmployment` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.contractors.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `contractorUpdateRequestBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `departmentTitle` **Added**
    - `dismissalCancellationEligible` **Added**
    - `memberPortalInvitationStatus` **Added**
    - `partnerPortalInvitationSent` **Added**
    - `paymentMethod.enum(null)` **Removed** (Breaking ⚠️)
    - `rehireCancellationEligible` **Added**
    - `upcomingEmployment` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.employeeBenefits.patchV1EmployeesEmployeeUuidSection603HighEarnerStatusesEffectiveYear()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.getV1EmployeesEmployeeUuidSection603HighEarnerStatusesEffectiveYear()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractors.getV1CompaniesCompanyIdContractorsPaymentDetails()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.get()`: 
  * `response` **Changed** (Breaking ⚠️)
    - `creditBlockers[]` **Changed** (Breaking ⚠️)
    - `submissionBlockers[]` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.postV1EmployeesEmployeeUuidSection603HighEarnerStatuses()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.getV1EmployeesEmployeeUuidSection603HighEarnerStatuses()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.webhooks.listSubscriptions()`:  `response.[].subscriptionTypes[].enum(payrollSync)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.updateSubscription()`:  `response.subscriptionTypes[].enum(payrollSync)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.getSubscription()`:  `response.subscriptionTypes[].enum(payrollSync)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.verify()`:  `response.subscriptionTypes[].enum(payrollSync)` **Added** (Breaking ⚠️)
* `gustoembedded.payrolls.list()`: 
  * `response.[]` **Changed** (Breaking ⚠️)
    - `creditBlockers[].unblockOptions[].union(submit_bank_screenshot).metadata.bankAccountLastFourDigits` **Added**
    - `creditBlockers[].unblockOptions[].union(wait_for_reverse_wire).metadata.bankAccountLastFourDigits` **Added**
    - `withholdingPayPeriod` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.createOffCycle()`: 
  *  `requestBody.employeeUuids` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].deductions` **Removed** (Breaking ⚠️)
    - `employeeCompensations[].paidTimeOff[].finalPayoutUnusedHoursInput` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].version` **Changed** (Breaking ⚠️)
    - `withholdingPayPeriod` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.get()`: 
  * `response` **Changed** (Breaking ⚠️)
    - `creditBlockers[].unblockOptions[].union(submit_bank_screenshot).metadata.bankAccountLastFourDigits` **Added**
    - `creditBlockers[].unblockOptions[].union(wait_for_reverse_wire).metadata.bankAccountLastFourDigits` **Added**
    - `employeeCompensations[].additionalProperties` **Added**
    - `employeeCompensations[].paidTimeOff[].finalPayoutUnusedHoursInput` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].version` **Changed** (Breaking ⚠️)
    - `withholdingPayPeriod` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.update()`: 
  *  `request.payrollUpdate.employeeCompensations[].paidTimeOff[].finalPayoutUnusedHoursInput` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].paidTimeOff[].finalPayoutUnusedHoursInput` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].version` **Changed** (Breaking ⚠️)
    - `withholdingPayPeriod` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.delete()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.prepare()`: 
  * `request` **Changed**
    - `requestBody.employeeUuids` **Changed**
    - `sortBy` **Changed**
    - `xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].paidTimeOff[].finalPayoutUnusedHoursInput` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].version` **Changed** (Breaking ⚠️)
    - `withholdingPayPeriod` **Changed** (Breaking ⚠️)
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.payrolls.getReceipt()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.getBlockers()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.[]` **Changed** (Breaking ⚠️)
    - `key` **Changed** (Breaking ⚠️)
    - `message` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.payrolls.cancel()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `companyTaxes` **Removed** (Breaking ⚠️)
    - `creditBlockers` **Removed** (Breaking ⚠️)
    - `finalTerminationPayroll` **Removed** (Breaking ⚠️)
    - `fixedWithholdingRate` **Removed** (Breaking ⚠️)
    - `paymentSpeedChanged` **Removed** (Breaking ⚠️)
    - `payrollStatusMeta` **Removed** (Breaking ⚠️)
    - `payrollTaxes` **Removed** (Breaking ⚠️)
    - `processingRequest` **Removed** (Breaking ⚠️)
    - `skipRegularDeductions` **Removed** (Breaking ⚠️)
    - `submissionBlockers` **Removed** (Breaking ⚠️)
    - `totals` **Removed** (Breaking ⚠️)
    - `withholdingPayPeriod` **Removed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.payrolls.getPayStub()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.getPayStubs()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.generatePrintableChecks()`:  `response.startingCheckNumber` **Changed** (Breaking ⚠️)
* `gustoembedded.payrolls.getV1CompaniesCompanyIdPayrollsIdPartnerDisbursements()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.patchV1CompaniesCompanyIdPayrollsIdPartnerDisbursements()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.calculateAccruingTimeOffHours()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `payrollCalculateAccruingTimeOffHoursRequest` **Added**
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.timeOffPolicies.get()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.update()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.getAll()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.[].policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.create()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.addEmployees()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.removeEmployees()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.updateBalance()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.timeOffPolicies.deactivate()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `response.policyType` **Changed** (Breaking ⚠️)
    - `enum(bereavement)` **Added** (Breaking ⚠️)
    - `enum(custom)` **Added** (Breaking ⚠️)
    - `enum(floatingHoliday)` **Added** (Breaking ⚠️)
    - `enum(juryDuty)` **Added** (Breaking ⚠️)
    - `enum(learningAndDevelopment)` **Added** (Breaking ⚠️)
    - `enum(parentalLeave)` **Added** (Breaking ⚠️)
    - `enum(personalDay)` **Added** (Breaking ⚠️)
    - `enum(volunteer)` **Added** (Breaking ⚠️)
    - `enum(weather)` **Added** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `contractorPaymentBody` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.employeeBenefits.update()`: `response` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.retrieve()`: `response` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.get()`: `response.[]` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.getList()`: 
  * `response.[]` **Changed** (Breaking ⚠️)
    - `creditBlockers[]` **Changed** (Breaking ⚠️)
    - `submissionBlockers[]` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.create()`: 
  * `requestBody` **Changed** (Breaking ⚠️)
    - `contractorPayments[].bonus` **Changed** (Breaking ⚠️)
    - `contractorPayments[].hours` **Changed** (Breaking ⚠️)
    - `contractorPayments[].reimbursement` **Changed** (Breaking ⚠️)
    - `contractorPayments[].wage` **Changed** (Breaking ⚠️)
    - `submissionBlockers` **Added**
  * `response` **Changed** (Breaking ⚠️)
    - `creditBlockers[]` **Changed** (Breaking ⚠️)
    - `submissionBlockers[]` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.preview()`: 
  * `requestBody.contractorPayments[]` **Changed** (Breaking ⚠️)
    - `bonus` **Changed** (Breaking ⚠️)
    - `hours` **Changed** (Breaking ⚠️)
    - `reimbursement` **Changed** (Breaking ⚠️)
    - `wage` **Changed** (Breaking ⚠️)
  * `response` **Changed** (Breaking ⚠️)
    - `creditBlockers[]` **Changed** (Breaking ⚠️)
    - `submissionBlockers[]` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.introspection.oauthAccessToken()`: `request` **Changed** (Breaking ⚠️)
    - `requestBody.union(1)` **Removed** (Breaking ⚠️)
    - `requestBody.union(2)` **Removed** (Breaking ⚠️)
    - `requestBody.union(Refresh Token Request)` **Added**
    - `requestBody.union(System Access Token Request)` **Added**
    - `xGustoApiVersion.enum(20240401)` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion.enum(20250615)` **Added**
* `gustoembedded.contractorPaymentGroups.delete()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.fund()`: 
  * `response` **Changed** (Breaking ⚠️)
    - `creditBlockers[]` **Changed** (Breaking ⚠️)
    - `submissionBlockers[]` **Changed** (Breaking ⚠️)
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.getV1ContractorPaymentGroupsIdPartnerDisbursements()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPaymentGroups.patchV1ContractorPaymentGroupsIdPartnerDisbursements()`: `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.companyForms.getAll()`:  `request.sortBy` **Changed** (Breaking ⚠️)
* `gustoembedded.employeeBenefits.create()`: `response` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
* `gustoembedded.reports.postV1CompaniesCompanyIdReportsEmployeesAnnualFicaWage()`: 
  * `request.xGustoApiVersion` **Changed** (Breaking ⚠️)
    - `enum(20240401)` **Removed** (Breaking ⚠️)
    - `enum(20250615)` **Added**
  * `errors[]` **Changed** (Breaking ⚠️)
    - `errors` **Removed** (Breaking ⚠️)
    - `metadata` **Removed** (Breaking ⚠️)
* `gustoembedded.companyBenefits.create()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyBenefitCreateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.putV1CompanyBenefitsCompanyBenefitIdContributionExclusions()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `contributionExclusionUpdateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.employeeBenefits[]` **Changed** (Breaking ⚠️)
    - `action` **Removed** (Breaking ⚠️)
    - `uuid` **Removed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.update()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `companyBenefitUpdateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.delete()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[422]` **Removed** (Breaking ⚠️)
* `gustoembedded.companyBenefits.getAll()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Removed** (Breaking ⚠️)
* `gustoembedded.companies.createAdmin()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `adminCreateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  *  `response.phone` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.getSummary()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.employees` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.getEmployeeBenefits()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.[]` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.updateEmployeeBenefits()`: 
  * `request` **Changed** (Breaking ⚠️)
    - `employeeBenefitBulkUpdateRequest` **Added** (Breaking ⚠️)
    - `requestBody` **Removed** (Breaking ⚠️)
    - `xGustoApiVersion` **Changed**
  * `response.[]` **Changed** (Breaking ⚠️)
    - `additionalProperties` **Added**
    - `retirementLoanIdentifier` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.getRequirements()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed** (Breaking ⚠️)
    - `catchUp.choices` **Changed** (Breaking ⚠️)
    - `catchUp.defaultValue` **Changed** (Breaking ⚠️)
    - `companyContributionAnnualMaximum.choices` **Changed** (Breaking ⚠️)
    - `companyContributionAnnualMaximum.defaultValue` **Changed** (Breaking ⚠️)
    - `contribution.choices` **Changed** (Breaking ⚠️)
    - `contribution.defaultValue` **Changed** (Breaking ⚠️)
    - `coverageAmount.choices` **Changed** (Breaking ⚠️)
    - `coverageAmount.defaultValue` **Changed** (Breaking ⚠️)
    - `coverageSalaryMultiplier.choices` **Changed** (Breaking ⚠️)
    - `coverageSalaryMultiplier.defaultValue` **Changed** (Breaking ⚠️)
    - `deductAsPercentage.choices` **Changed** (Breaking ⚠️)
    - `deductAsPercentage.defaultValue` **Changed** (Breaking ⚠️)
    - `employeeDeduction.choices` **Changed** (Breaking ⚠️)
    - `employeeDeduction.defaultValue` **Changed** (Breaking ⚠️)
    - `limitOption.choices` **Changed** (Breaking ⚠️)
    - `limitOption.defaultValue` **Changed** (Breaking ⚠️)
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.deleteCompensation()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.jobsAndCompensations.getJob()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.compensations[].title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.reports.createCustom()`: 
  *  `requestBody.employeeUuids` **Changed**
* `gustoembedded.contractorPayments.delete()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.contractorPayments.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.contractorPayments.list()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.employeeBenefits.delete()`:  `error.status[422]` **Added**
* `gustoembedded.i9Verification.getDocumentOptions()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.taxRequirements.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.requirementSets[].requirements[].editable` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.contractors.updateOnboardingStatus()`: 
  * `requestBody.onboardingStatus` **Changed**
    - `enum(adminOnboardingIncomplete)` **Added**
    - `enum(adminOnboardingReview)` **Added**
    - `enum(selfOnboardingInvited)` **Added**
    - `enum(selfOnboardingNotInvited)` **Added**
    - `enum(selfOnboardingReview)` **Added**
    - `enum(selfOnboardingStarted)` **Added**
* `gustoembedded.contractors.delete()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.employeeEmployments.createRehire()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.getCompensation()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.getCompensations()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.[].title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.jobsAndCompensations.delete()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.signatories.delete()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.i9Verification.deleteDocument()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `error` **Changed**
    - `` **Added**
    - `status[422]` **Added**
* `gustoembedded.jobsAndCompensations.getJobs()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `response.[].compensations[].title` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.employeePaymentMethod.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.employeePaymentMethod.deleteBankAccount()`:  `error.status[422]` **Added**
* `gustoembedded.taxRequirements.getAll()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.[]` **Changed**
    - `defaultRatesApplied` **Added**
    - `readyToRunPayroll` **Added**
    - `setupComplete` **Changed**
    - `setupStatus` **Added**
    - `state` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.getV1CompanyBenefitsCompanyBenefitIdContributionExclusions()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyBenefits.list()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.employeeTaxSetup.getFederalTaxes()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `union(pre_2020_w4).companyId` **Added**
    - `union(pre_2020_w4).employeeId` **Added**
    - `union(rev_2020_w4).companyId` **Added**
    - `union(rev_2020_w4).employeeId` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.companies.update()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `compensations.fixed[].uuid` **Added**
    - `compensations.hourly[].uuid` **Added**
    - `compensations.paidTimeOff[].uuid` **Added**
    - `locations[].active` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.employees.createHistorical()`:  `response.jobs[].compensations[].title` **Added**
* `gustoembedded.externalPayrolls.calculateTaxes()`:  `error.status[422]` **Added**
* `gustoembedded.events.get()`: 
  * `request` **Changed**
    - `sortOrder` **Changed**
    - `xGustoApiVersion` **Changed**
  *  `error.status[422]` **Added**
* `gustoembedded.externalPayrolls.delete()`:  `error.status[422]` **Added**
* `gustoembedded.locations.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.employeeEmployments.deleteTermination()`:  `error.status[422]` **Added**
* `gustoembedded.signatories.list()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.industrySelection.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyAttachment.getDownloadUrl()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyAttachments.getList()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response.[]` **Changed**
    - `category` **Changed**
    - `name` **Changed**
    - `uploadTime` **Changed**
    - `uuid` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companyAttachments.getDetails()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `category` **Changed**
    - `name` **Changed**
    - `uploadTime` **Changed**
    - `uuid` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companies.finishOnboarding()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.companies.getOnboardingStatus()`: 
  *  `request.xGustoApiVersion` **Changed**
  *  `error.status[404]` **Added**
* `gustoembedded.historicalEmployees.update()`:  `response.jobs[].compensations[].title` **Added**
* `gustoembedded.companies.get()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `compensations.fixed[].uuid` **Added**
    - `compensations.hourly[].uuid` **Added**
    - `compensations.paidTimeOff[].uuid` **Added**
    - `locations[].active` **Added**
  *  `error.status[404]` **Added**
* `gustoembedded.introspection.getInfo()`: 
  *  `request.xGustoApiVersion` **Changed**
  * `response` **Changed**
    - `resource.type` **Changed**
    - `resource.uuid` **Changed**
    - `resourceOwner.type` **Changed**
    - `resourceOwner.uuid` **Changed**
    - `scope` **Changed**
* `gustoembedded.companies.migrate()`: **Removed** (Breaking ⚠️)
* `gustoembedded.payrolls.submit()`: **Added**
* `gustoembedded.payrolls.calculate()`: **Added**
* `gustoembedded.payrolls.calculateGrossUp()`: **Added**
* `gustoembedded.companies.getV1PartnerManagedCompaniesCompanyUuidMigrationReadiness()`: **Added**
