# PostEmployeeYtdBenefitAmountsFromDifferentCompany


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `benefitType`                                                           | *Optional\<Long>*                                                       | :heavy_minus_sign:                                                      | The benefit type supported by Gusto.                                    |
| `taxYear`                                                               | *double*                                                                | :heavy_check_mark:                                                      | The tax year for which this amount applies.                             |
| `ytdEmployeeDeductionAmount`                                            | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The year-to-date employee deduction made outside the current company.   |
| `ytdCompanyContributionAmount`                                          | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The year-to-date company contribution made outside the current company. |