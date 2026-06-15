## Java SDK Changes:
* `gustoembedded.payrolls.get()`: `response.employeeCompensations[]` **Changed** (Breaking ⚠️)
    - `benefits[].companyContribution` **Changed** (Breaking ⚠️)
    - `benefits[].employeeDeduction` **Changed** (Breaking ⚠️)
    - `deductions[].amount` **Changed** (Breaking ⚠️)
    - `taxes[].amount` **Changed** (Breaking ⚠️)
* `gustoembedded.webhooks.verify()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.updateSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.getSubscription()`:  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.createSubscription()`: 
  *  `requestBody.subscriptionTypes[].enum(timeOffRequest)` **Added**
  *  `response.subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.webhooks.listSubscriptions()`:  `response.[].subscriptionTypes[].enum(timeOffRequest)` **Added** (Breaking ⚠️)
* `gustoembedded.payrolls.createOffCycle()`: 
  *  `requestBody.employeeUuids` **Changed** (Breaking ⚠️)
* `gustoembedded.contractors.deleteV1ContractorsContractorUuidTermination()`:  `error.status[422]` **Added**
* `gustoembedded.payrolls.getApprovedReversals()`:  `request.xGustoApiVersion` **Changed**
* `gustoembedded.payrolls.update()`: 
  *  `request.payrollUpdate.employeeCompensations[].customWithholdings` **Added**
* `gustoembedded.employees.updateOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.payrolls.getReceipt()`: `request` **Changed**
    - `page` **Added**
    - `per` **Added**
* `gustoembedded.generatedDocuments.get()`:  `request.xGustoApiVersion` **Changed**
* `gustoembedded.paySchedules.getPreview()`: 
  *  `request.payScheduleUuid` **Added**
* `gustoembedded.employees.getOnboardingStatus()`:  `response.blockers` **Added**
* `gustoembedded.contractorPayments.getV1ContractorsContractorUuidPayments()`: **Added**
* `gustoembedded.contractors.postV1ContractorsContractorUuidTermination()`:  `error.status[422]` **Added**
* `gustoembedded.contractors.deleteV1ContractorsContractorUuidRehire()`:  `error.status[422]` **Added**
* `gustoembedded.contractors.postV1ContractorsContractorUuidRehire()`:  `error.status[422]` **Added**
