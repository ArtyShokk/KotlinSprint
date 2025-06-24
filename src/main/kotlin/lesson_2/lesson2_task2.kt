package org.example.lesson_2

fun main() {
    val oldEmployees: Int = 50
    val newEmployees: Int = 30

    val salaryOldEmployees: Int = 30000
    val salaryNewEmployees: Int = 20000

    val expensesSalaryOldEmployees: Int = oldEmployees * salaryOldEmployees
    val totalExpensesSalaryEmployees: Int = oldEmployees * salaryOldEmployees + newEmployees * salaryNewEmployees
    val averageSalary: Int = (oldEmployees * salaryOldEmployees + newEmployees * salaryNewEmployees) / (oldEmployees + newEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesSalaryOldEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpensesSalaryEmployees")
    println("Средняя ЗП одного сотрудника после устройства стажеров $averageSalary")
}