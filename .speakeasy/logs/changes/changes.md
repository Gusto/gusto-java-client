## Java SDK Changes:
* `gustoembedded.employees.list()`: `response.[].jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.payrolls.cancel()`: `response.payPeriod` **Changed** (Breaking ⚠️)
    - `endDate` **Changed** (Breaking ⚠️)
    - `startDate` **Changed** (Breaking ⚠️)
* `gustoembedded.payrolls.prepare()`: `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].customWithholdings` **Added**
    - `employeeCompensations[].fixedCompensations[].breakdowns` **Added**
    - `employeeCompensations[].hourlyCompensations[].breakdowns` **Added**
    - `payPeriod.endDate` **Changed** (Breaking ⚠️)
    - `payPeriod.startDate` **Changed** (Breaking ⚠️)
    - `workweeks` **Added**
* `gustoembedded.payrolls.update()`: 
  * `request.payrollUpdate.employeeCompensations[]` **Changed**
    - `customWithholdings` **Added**
    - `fixedCompensations[].breakdowns` **Added**
    - `hourlyCompensations[].breakdowns` **Added**
  * `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].customWithholdings` **Added**
    - `employeeCompensations[].fixedCompensations[].breakdowns` **Added**
    - `employeeCompensations[].hourlyCompensations[].breakdowns` **Added**
    - `payPeriod.endDate` **Changed** (Breaking ⚠️)
    - `payPeriod.startDate` **Changed** (Breaking ⚠️)
    - `workweeks` **Added**
  *  `error.status[409]` **Added**
* `gustoembedded.payrolls.get()`: `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].customWithholdings` **Added**
    - `employeeCompensations[].fixedCompensations[].breakdowns` **Added**
    - `employeeCompensations[].hourlyCompensations[].breakdowns` **Added**
    - `employeeCompensations[].payAdjustments` **Added**
    - `payPeriod.endDate` **Changed** (Breaking ⚠️)
    - `payPeriod.startDate` **Changed** (Breaking ⚠️)
* `gustoembedded.payrolls.createOffCycle()`: `response` **Changed** (Breaking ⚠️)
    - `employeeCompensations[].customWithholdings` **Added**
    - `employeeCompensations[].fixedCompensations[].breakdowns` **Added**
    - `employeeCompensations[].hourlyCompensations[].breakdowns` **Added**
    - `payPeriod.endDate` **Changed** (Breaking ⚠️)
    - `payPeriod.startDate` **Changed** (Breaking ⚠️)
    - `workweeks` **Added**
* `gustoembedded.payrolls.list()`: `response.[].payPeriod` **Changed** (Breaking ⚠️)
    - `endDate` **Changed** (Breaking ⚠️)
    - `startDate` **Changed** (Breaking ⚠️)
* `gustoembedded.webhooks.verify()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.updateSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.getSubscription()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.createSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.listSubscriptions()`:  `response.[].subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.jobsAndCompensations.update()`: `response` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.getJob()`: `response` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.createJob()`: `response` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.getJobs()`: `response.[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.historicalEmployees.update()`: `response.jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.employees.update()`: `response.jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.employees.get()`: `response.jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.employees.createHistorical()`: `response.jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.employees.create()`: `response.jobs[]` **Changed** (Breaking ⚠️)
    - `currentCompensationUuid` **Changed** (Breaking ⚠️)
    - `location.warnings` **Added**
* `gustoembedded.taxPayments.getTaxPayment()`: **Added**
* `gustoembedded.memberPortalInvitations.postV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.contractorPayments.getReceipt()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.fund()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.list()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.create()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.get()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.delete()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.preview()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.getV1ContractorPaymentsContractorPaymentIdPdf()`: **Removed** (Breaking ⚠️)
* `gustoembedded.companies.suspensions.suspend()`: 
  * `requestBody.leavingFor` **Changed**
    - `enum(otherPeo)` **Added**
    - `enum(toast)` **Added**
* `gustoembedded.federalTaxDetails.update()`:  `error.status[403]` **Added**
* `gustoembedded.locations.get()`:  `response.[].warnings` **Added**
* `gustoembedded.locations.create()`:  `response.warnings` **Added**
* `gustoembedded.locations.retrieve()`:  `response.warnings` **Added**
* `gustoembedded.locations.update()`:  `response.warnings` **Added**
* `gustoembedded.paySchedules.getAll()`:  `response.[].workweekStartDay` **Added**
* `gustoembedded.paySchedules.create()`: 
  *  `request.payScheduleCreateRequest.workweekStartDay` **Added**
  *  `response.workweekStartDay` **Added**
* `gustoembedded.paySchedules.getPreview()`: 
  *  `request.payScheduleUuid` **Added**
* `gustoembedded.paySchedules.get()`:  `response.workweekStartDay` **Added**
* `gustoembedded.paySchedules.update()`: 
  *  `request.payScheduleUpdateRequest.workweekStartDay` **Added**
  *  `response.workweekStartDay` **Added**
* `gustoembedded.taxPayments.getTaxPayments()`: **Added**
* `gustoembedded.reverseWireTransactions.getReverseWireTransactions()`: **Added**
* `gustoembedded.payrollCancellations.getV1PayrollBatchesPayrollBatchUuid()`: **Added**
* `gustoembedded.payrollCancellations.postV1PayrollBatches()`: **Added**
* `gustoembedded.memberPortalInvitations.deleteV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.employees.getOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.employees.updateOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.memberPortalInvitations.getV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.employeeAddresses.get()`:  `response.[].warnings` **Added**
* `gustoembedded.employeeAddresses.create()`:  `response.warnings` **Added**
* `gustoembedded.employeeAddresses.retrieveHomeAddress()`:  `response.warnings` **Added**
* `gustoembedded.employeeAddresses.update()`:  `response.warnings` **Added**
* `gustoembedded.companies.putV1PartnerManagedCompaniesCompanyUuidDisassociate()`: **Added**
* `gustoembedded.memberPortalInvitations.deleteV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.getV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.postV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.earningTypes.list()`: `response.default[]` **Changed**
    - `category` **Added**
    - `includedInOvertimePay` **Added**
* `gustoembedded.earningTypes.create()`: 
  * `requestBody` **Changed**
    - `category` **Added**
    - `includedInOvertimePay` **Added**
  * `response` **Changed**
    - `category` **Added**
    - `includedInOvertimePay` **Added**
* `gustoembedded.earningTypes.update()`: 
  * `requestBody` **Changed**
    - `category` **Added**
    - `includedInOvertimePay` **Added**
  * `response` **Changed**
    - `category` **Added**
    - `includedInOvertimePay` **Added**
* `gustoembedded.contractors.list()`:  `response.[].workEmail` **Added**
* `gustoembedded.contractors.create()`: 
  *  `request.contractorCreateRequestBody.workEmail` **Added**
  *  `response.workEmail` **Added**
* `gustoembedded.contractors.get()`:  `response.workEmail` **Added**
* `gustoembedded.contractors.update()`: 
  *  `request.contractorUpdateRequestBody.workEmail` **Added**
  *  `response.workEmail` **Added**
* `gustoembedded.contractors.getAddress()`:  `response.warnings` **Added**
* `gustoembedded.contractors.updateAddress()`:  `response.warnings` **Added**
* `gustoembedded.contractors.postV1ContractorsContractorUuidRehire()`:  `error.status[422]` **Added**
* `gustoembedded.contractors.deleteV1ContractorsContractorUuidRehire()`:  `error.status[422]` **Added**
* `gustoembedded.contractors.postV1ContractorsContractorUuidTermination()`:  `error.status[422]` **Added**
* `gustoembedded.contractors.deleteV1ContractorsContractorUuidTermination()`:  `error.status[422]` **Added**
* `gustoembedded.contractorPayments.fund()`: **Added**
* `gustoembedded.contractorPayments.getReceipt()`: **Added**
* `gustoembedded.contractorPayments.preview()`: **Added**
* `gustoembedded.contractorPayments.delete()`: **Added**
* `gustoembedded.contractorPayments.get()`: **Added**
* `gustoembedded.contractorPayments.create()`: **Added**
* `gustoembedded.contractorPayments.list()`: **Added**
* `gustoembedded.payrolls.getApprovedReversals()`:  `request.xGustoApiVersion` **Changed**
* `gustoembedded.contractorPayments.getV1ContractorPaymentsContractorPaymentIdPdf()`: **Added**
* `gustoembedded.contractorPayments.getV1ContractorsContractorUuidPayments()`: **Added**
* `gustoembedded.reports.getV1BulkReportsRequestUuid()`: **Added**
* `gustoembedded.payrolls.getReceipt()`: `request` **Changed**
    - `page` **Added**
    - `per` **Added**
* `gustoembedded.payrolls.skip()`:  `error.status[409]` **Added**
* `gustoembedded.reports.postV1BulkReports()`: **Added**
* `gustoembedded.contractorPaymentGroups.patchV1ContractorPaymentGroupsIdPartnerDisbursements()`: 
  * `requestBody.disbursements[].paymentMethod` **Changed**
    - `enum(correctionPayment)` **Added**
    - `enum(historicalPayment)` **Added**
* `gustoembedded.generatedDocuments.get()`:  `request.xGustoApiVersion` **Changed**
* `gustoembedded.reports.createCustom()`: `request.createReportBody` **Changed**
    - `columns[].enum(additionalEarnings)` **Added**
    - `columns[].enum(employeeStateIncomeTax)` **Added**
    - `dateFilterType` **Added**
    - `groupings` **Changed**
* `gustoembedded.taxRequirements.get()`: `response.requirementSets[].requirements[]` **Changed**
    - `defaultValueApplied` **Added**
    - `payrollBlocking` **Added**
