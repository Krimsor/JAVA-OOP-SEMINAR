# JAVA-OOP-SEMINAR

# `Семинар №1 ДЗ. "Принципы ООП: Инкапсуляция, наследование, полиморфизм"`
* **`Задача № 1.`** 
Создать класс Товар, имеющий переменные имя, цена, рейтинг.

* **`Задача № 2.`** 
Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.

* **`Задача № 3.`** 
Создать класс Basket, содержащий массив купленных товаров.

* **`Задача № 4.`** 
Создать класс User, содержащий логин, пароль и объект класса Basket. 
Создать несколько объектов класса User.

* **`Задача № 5.`** 
Вывести на консоль каталог продуктов.

**Пример:** 
Все продукты магазина

* **`Задача № 6.`** 
Вывести на консоль покупки посетителей магазина. 

**Пример:**
После покупки у пользователя добавляется товар, а из магазина - удаляется

# `Семинар №2 ДЗ. "Принципы ООП Абстракция и интерфейсы. Пример проектирования"`
* **`Задача № 1.`** 
Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.

* **`Задача № 2.`** 
Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

* **`Задача № 3.`** 
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

# `Семинар №3 ДЗ. "Некоторые стандартные интерфейсы Java и примеры их использования"`

* **`Задача № 1.`** 
Доделать вариации с игрой на английском/русском языке, сигнатуры уже приведены в прикрепленном файле

* **`Задача № 2.`** 
Улучшить интерфейсную часть игры

* **`Задача № 3.`** 
Создать историю ходов и по окончании игры вывести её, в зависимости от ответа пользователя (y-вывести, n -выводить не следует)

# `Семинар №4 ДЗ. "ООП: Обобщения. ч1"`

* **`Задача № 1.`** 
Расширить класс калькулятор на умножение

* **`Задача № 2.`** 
Расширить класс калькулятор на деление

* **`Задача № 3.`** 
Расширить класс калькулятор на бинарный перевод

**Пример:**
принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать, 
что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т)

# `Семинар №5 ДЗ. "От простого к практике"`

* **`Задача № 1.`** 
Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.

* **`Задача № 2.`** 
Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher,
List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его.

* **`Задача № 3.`** 
Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса.

* **`Задача № 4.`** 
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
Формат сдачи: ссылка на гитхаб проект

# `Семинар №6 ДЗ. "ООП Дизайн и Solid"`

* **`Задача № 1.`** 
Взять реализованный код в рамках последнего семинара (5) и продемонстрировать применение принципов,
усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
рефакторим, какой принцип применяем и почему.

# `Семинар №7 ДЗ. "ООП Дизайн и Solid ч.2"`

* **`Задача № 1.`** 
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление). 
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора. 
Соблюдать принципы SOLID, паттерны проектирования. 

**Пример:**
Можно выбрать другой язык программирования, например C# или Python, 
если выбран язык, отличный от JAVA, то необходимо написать документ, каким образом можно запустить приложение 
(что необходимо установить, каким образом запускать и т.п.)