const staff = [
    {
        name: "Joe",
        income: 5000,
        months: 10,
    },

    {
        name: "John",
        income: 7500,
        months: 12,
    },
]

function yearlyIncome(person) {
    return  person.income * person.months;
}

console.log(yearlyIncome(staff[0]));