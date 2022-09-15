# **Коллекции HashSet и HashMap.**

Перед Вами программа с помощью которой можно определить, какая буква встречается чаще всего и какая реже всего в тексте, заданном в текстовом поле ```TEXT```.
Определить, является ли символ буквой, можно с помощью встроенного статического метода Character.isLetter.
В ```Map<Character, Integer> charQuantity``` хранится каждый символ и то количество, сколько раз он встречается.
Для каждого символа проходит проверка, есть ли он в ```charQuantity``` или нет. Может быть два случая:
1. Символа нет в ```charQuantity```. Значит, мы встретили его в первый раз и вставляем в ```charQuantity``` пару, где ключ это наш символ, а значение это 1 (так как встретили его первый раз).
2. Символ есть в ```charQuantity```. Значит он нам уже встречался. Вынимаем текущее значение для ключа (нашего символа), увеличиваем это число на 1 и вставляем обратно.

Всё что нам останется - пройтись по ```charQuantity``` и найти максимум и минимум.