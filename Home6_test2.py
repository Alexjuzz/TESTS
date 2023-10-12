class AverageComparator:
    def __init__(self, list1, list2):
        # Конструктор класса, принимает два списка list1 и list2
        self.list1 = list1  # Инициализируем атрибут self.list1 значением list1
        self.list2 = list2  # Инициализируем атрибут self.list2 значением list2

    def calculate_average(self, input_list):
        # Метод для вычисления среднего значения списка input_list
        if not input_list:
            # Если список пустой, возвращаем 0, чтобы избежать деления на ноль
            return 0
        return sum(input_list) / len(input_list)  # Возвращаем среднее значение списка

    def compare_averages(self):
        # Метод для сравнения средних значений двух списков
        avg1 = self.calculate_average(self.list1)  # Вычисляем среднее значение первого списка
        avg2 = self.calculate_average(self.list2)  # Вычисляем среднее значение второго списка

        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"  # Возвращаем сообщение о сравнении, если avg1 больше avg2
        elif avg2 > avg1:
            return "Второй список имеет большее среднее значение"  # Возвращаем сообщение о сравнении, если avg2 больше avg1
        else:
            return "Средние значения равны"  # Возвращаем сообщение о сравнении, если средние значения равны
