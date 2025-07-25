# 🧠 ДЗ 4 — Наследование и полиморфизм

## 📌 Техническое задание

**Задача:**  
Реализовать иерархию классов, описывающих членов своей семьи. Основной класс — `Parent`. От него должны наследоваться дочерние классы, например, `Arsen`, `Sister`, `Brother` и т.д.

Каждый дочерний класс должен иметь **свой отличительный метод или поле**, которого нет в базовом классе `Parent`.

## 🔧 Требования:

1. Базовый класс `Parent`: поля `name`, `age`, конструктор, геттеры.
2. Наследники: хотя бы один с уникальным полем/методом.
3. Массив `Parent[]` со всеми членами семьи.
4. В цикле:
    - вывести имя и возраст,
    - с помощью `instanceof` определить класс,
    - вызвать уникальный метод/поле.

