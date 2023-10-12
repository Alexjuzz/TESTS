import pytest
import AverageComparator

# Тесты для класса AverageComparator
def test_compare_averages():
    # Тест на равные средние значения
    # Создаем объект AverageComparator с двумя одинаковыми списками [4, 5, 6]
    avg_comp = AverageComparator.AverageComparator([4, 5, 6], [4, 5, 6])
    # Вызываем метод compare_averages() и сравниваем результат с ожидаемым результатом
    assert avg_comp.compare_averages() == "Средние значения равны"

    # Тест, где первый список имеет большее среднее значение
    # Создаем объект AverageComparator с разными списками, где первый список имеет большее среднее значение
    avg_comp = AverageComparator.AverageComparator([111, 2, 4], [3, 4, 5])
    # Вызываем метод compare_averages() и сравниваем результат с ожидаемым результатом
    assert avg_comp.compare_averages() == "Первый список имеет большее среднее значение"

    # Тест, где второй список имеет большее среднее значение
    # Создаем объект AverageComparator с разными списками, где второй список имеет большее среднее значение
    avg_comp = AverageComparator.AverageComparator([1, 2, 3], [3, 4, 5])
    # Вызываем метод compare_averages() и сравниваем результат с ожидаемым результатом
    assert avg_comp.compare_averages() == "Второй список имеет большее среднее значение"

    # Тест на пустые списки
    # Создаем объект AverageComparator с двумя пустыми списками
    avg_comp = AverageComparator.AverageComparator([], [])
    # Вызываем метод compare_averages() и сравниваем результат с ожидаемым результатом
    assert avg_comp.compare_averages() == "Средние значения равны"

    # Тест на один пустой список
    # Создаем объект AverageComparator с одним пустым списком и другим непустым
    avg_comp = AverageComparator.AverageComparator([], [1, 2, 3])
    # Вызываем метод compare_averages() и сравниваем результат с ожидаемым результатом
    assert avg_comp.compare_averages() == "Второй список имеет большее среднее значение"


if __name__ != '__main__':
    pass
else:
    pytest.main()
