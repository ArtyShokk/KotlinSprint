package org.example.lesson_2

fun main() {
    // количество сотрудников
    val oldEmployees: Int = 50
    val newEmployees: Int = 30

    // зарплаты сотрудников
    val salaryOldEmployees: Int = 30000
    val salaryNewEmployees: Int = 20000

    // расходы на выплату зарплаты постоянных сотрудников
    val expensesSalaryOldEmployees: Int = oldEmployees * salaryOldEmployees
    // общие расходы по ЗП после прихода стажеров
    val totalExpensesSalaryEmployees: Int = oldEmployees * salaryOldEmployees + newEmployees * salaryNewEmployees
    // средняя ЗП одного сотрудника после устройства стажеров
    val averageSalary: Int = (oldEmployees * salaryOldEmployees + newEmployees * salaryNewEmployees) / (oldEmployees + newEmployees)

}