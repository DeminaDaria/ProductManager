# ProductManager
В этом проекте создано 2 ветки.

В первой ветке productmanager была проделана следующая работа:

1. Разработан базовый класс Product.
1. Разработаны два унаследованных от Product класса: Book (с полями название и автор) и Smartphone (с полями название и производитель)
1. Разработан репозиторий, позволяющий сохранять Product'ы, получать все сохранённые Product'ы и удалять по id
1. Разработан менеджер, который добавляет Product'ы в репозиторий и осуществлять поиск по ним.

В ветке richmodel была проделана следующая работа:

1. За основу взят предыдущий код.
1. В классе Product реализован метод public boolean matches(String search), который определяет, подходит ли продукт поисковому запросу исходя из названия.
1. Переопределите этот метод в дочерних классах, чтобы они сначала вызывали родительский метод и только если родительский метод вернул false, тогда проводили доп.проверки (Book - по автору, Smartphone - по производителю).
1. Из менеджера удалены все instanceof и метод matches.
1.	Добавлены unit-тесты на методы умных моделей

Ко всему проекту:

* Подключен плагин Surefire так, чтобы сборка падала в случае отсутсвия тестов
* Подключен плагин JaCoCo в режиме генерации отчётов
* Написаны автотесты на методы
* Подключен CI на базе Github Actions
