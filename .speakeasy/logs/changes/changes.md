## Java SDK Changes:
* `gustoembedded.webhooks.listSubscriptions()`:  `response.[].subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.createSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.getSubscription()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.updateSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.verify()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.locations.retrieve()`:  `response.warnings` **Added**
* `gustoembedded.employees.list()`:  `response.[].jobs[].location.warnings` **Added**
* `gustoembedded.reports.getV1BulkReportsRequestUuid()`: **Added**
* `gustoembedded.contractorPayments.getV1ContractorsContractorUuidPayments()`: **Added**
* `gustoembedded.contractorPayments.getV1ContractorPaymentsContractorPaymentIdPdf()`: **Added**
* `gustoembedded.contractorPayments.list()`: **Added**
* `gustoembedded.contractorPayments.create()`: **Added**
* `gustoembedded.contractorPayments.get()`: **Added**
* `gustoembedded.contractorPayments.delete()`: **Added**
* `gustoembedded.contractorPayments.preview()`: **Added**
* `gustoembedded.contractorPayments.getReceipt()`: **Added**
* `gustoembedded.contractorPayments.fund()`: **Added**
* `gustoembedded.memberPortalInvitations.postV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.getV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.deleteV1EmployeesEmployeeIdMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.postV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.getV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.memberPortalInvitations.deleteV1ContractorsContractorUuidMemberPortalInvitations()`: **Added**
* `gustoembedded.payrollCancellations.postV1PayrollBatches()`: **Added**
* `gustoembedded.payrollCancellations.getV1PayrollBatchesPayrollBatchUuid()`: **Added**
* `gustoembedded.reverseWireTransactions.getReverseWireTransactions()`: **Added**
* `gustoembedded.taxPayments.getTaxPayments()`: **Added**
* `gustoembedded.taxPayments.getTaxPayment()`: **Added**
* `gustoembedded.contractorPayments.getReceipt()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.fund()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.list()`: **Removed** (Breaking ⚠️)
* `gustoembedded.contractorPayments.create()`: **Removed** (Breaking ⚠️)
* `gustoembedded.paySchedules.getPreview()`: 
  *  `request.payScheduleUuid` **Added**
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
* `gustoembedded.companies.putV1PartnerManagedCompaniesCompanyUuidDisassociate()`: **Added**
* `gustoembedded.reports.postV1BulkReports()`: **Added**
* `gustoembedded.locations.update()`:  `response.warnings` **Added**
* `gustoembedded.contractorPayments.get()`: **Removed** (Breaking ⚠️)
* `gustoembedded.employees.create()`:  `response.jobs[].location.warnings` **Added**
* `gustoembedded.employees.createHistorical()`:  `response.jobs[].location.warnings` **Added**
* `gustoembedded.employees.get()`:  `response.jobs[].location.warnings` **Added**
* `gustoembedded.employees.update()`:  `response.jobs[].location.warnings` **Added**
* `gustoembedded.employees.getOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.employees.updateOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.historicalEmployees.update()`:  `response.jobs[].location.warnings` **Added**
* `gustoembedded.employeeAddresses.get()`:  `response.[].warnings` **Added**
* `gustoembedded.employeeAddresses.create()`:  `response.warnings` **Added**
* `gustoembedded.employeeAddresses.retrieveHomeAddress()`:  `response.warnings` **Added**
* `gustoembedded.employeeAddresses.update()`:  `response.warnings` **Added**
* `gustoembedded.jobsAndCompensations.getJobs()`:  `response.[].location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.createJob()`:  `response.location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.getJob()`:  `response.location.warnings` **Added**
* `gustoembedded.jobsAndCompensations.update()`:  `response.location.warnings` **Added**
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
* `gustoembedded.payrolls.createOffCycle()`:  `response.employeeCompensations[].customWithholdings` **Added**
* `gustoembedded.payrolls.getApprovedReversals()`:  `request.xGustoApiVersion` **Changed**
* `gustoembedded.payrolls.get()`:  `response.employeeCompensations[].customWithholdings` **Added**
* `gustoembedded.payrolls.update()`: 
  *  `request.payrollUpdate.employeeCompensations[].customWithholdings` **Added**
  *  `response.employeeCompensations[].customWithholdings` **Added**
* `gustoembedded.payrolls.prepare()`:  `response.employeeCompensations[].customWithholdings` **Added**
* `gustoembedded.payrolls.getReceipt()`: `request` **Changed**
    - `page` **Added**
    - `per` **Added**
* `gustoembedded.payrolls.skip()`:  `error.status[409]` **Added**
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
