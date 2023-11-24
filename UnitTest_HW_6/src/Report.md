# Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:

1. Рассчитывает среднее значение каждого списка.

2. Сравнивает эти средние значения и выводит соответствующее сообщение:
- "Первый список имеет большее среднее значение", если среднее значение первого списка больше.
- "Второй список имеет большее среднее значение", если среднее значение второго списка больше.
- "Средние значения равны", если средние значения списков равны.

# Решение:

1. [Код программы (ListsToCompare.java)](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/src/Program/ListsToCompare.java)
2. [Код тестов (ListsToCompareTest.java)](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/src/test/ListsToCompareTest.java)
3. [Скриншот проверки кода с помощью Checkstyle](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/CheckStyle.png)
   ![Скриншот проверки кода с помощью Checkstyle](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/CheckStyle.png)
4. [Скриншот отчета о покрытии тестами](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/TestCoverage.png)
   ![Скриншот отчета о покрытии тестами](https://github.com/Empinado/UnitTest_HW/blob/main/UnitTest_HW_6/TestCoverage.png)
5. Объяснение выбора сценариев для тестов:
   Выбор сценариев напрямую вытекает из функционала программы. тесты написаны для проверки основных методов и поведения.
- "testCalculateAverage": Этот тест для проверки метода, вычисляющего среднее значение в списке. на входе 5, 6, 7, ожидаемый вывод - 6.0
- "testCalculateEmptyList": Этот тест на случай, если подается пустой список. на входе пустой список, ожидаемый результат - 0.
- "testCompareFirstListBigger": Этот тест для проверки списков, когда среднее первого больше, чем второго. на входе значения такие, чтоб среднее первого было больше, ожидаемый результат "First list average is bigger than second list average".
- "testCompareSecondListBigger": Этот тест для проверки списков, когда среднее второго больше, чем первого. на входе значения такие, чтоб среднее второго было больше, ожидаемый результат "Second list average is bigger than first list average".
- "testComparingListsEqual: Этот тест для проверки списков, когда средние равны. на входе значения такие, чтоб средние были равны, ожидаемый результат "Averages are equal".