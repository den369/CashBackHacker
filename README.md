# Отчёт о тестировании приложения CashBackHacker

## Краткое описаниe:

14.12.2022 было проведено тестирование приложения CashBackHacker с помощью библиотек JUnit4 и TestNG.

На тестирование затрачено: 0.1 часа

В результате тестирования выявлены следующие дефекты:
* https://github.com/den369/CashBackHacker/issues/4
* https://github.com/den369/CashBackHacker/issues/3

## Описание процесса тестирования

В качестве тестовых данных использовались рандомные значения по отношению к диапазону от 0 до 1000:
* тест showUnderBoundary рандомное значение внутри диапазона 700 с ожидаемым результатом 300
* тест showAboveBoundary рандомное значение за пределами диапазона (в новом диапазоне 0 - 1000) 1450 с ожидаемым результатом 550
* тест showZeroAmount граничное значение 0 с ожидаемым результатом 1000
* тест showEqualsBoundary граничное значение 1000 с ожидаемым результатом 0

Тестирование производилось в следующем окружении:
* ОС - Windows 10 20H2 x64
* Java version - 11.0.12
* JDK - IntelliJ IDEA Community Eition 2021.3
