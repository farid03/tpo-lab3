# Тестирование ПО. Лабораторная работа 3

- Курбанов Фарид
- Глинских Роман

## Use-case диаграмма

![image](https://user-images.githubusercontent.com/68964770/232411277-17767413-c97c-44e8-90ba-8f256ad5024e.png)

## Прецеденты использования

| Прецедент 1             | Просмотр погоды через основную страницу       |
| -------------           |:-------------:|
| ID                      | WV1             |
| Краткое описание        | Пользователь выбирает конкретный город и смотрит погоду       |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт      |
| Основной поток          | 1. Пользователь выбирает город <br />2. Пользователь выбирает день <br />3. Пользователь смотрит погоду  |
| Постусловия             | Погода корректно отобразилась       |
| Альтернативные потоки   | -      |

| Прецедент 2             | Просмотр погоды через карту            |
| -------------           |:-------------:|
| ID                      | WV2            |
| Краткое описание        | Пользователь просматривает текущую погоду через карты        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт      |
| Основной поток          | 1. Пользователь переходит в раздел "Карты" <br />2. Пользователь выбирает тип карты <br />(Осадки, температура, ветер, облачность, аллергия) <br />3. Пользователь смотрит карту <br />4. Пользователь меняет время  |
| Постусловия             | Карта корректно отобразилась, при смене времени карта корректно изменилась        |
| Альтернативные потоки   | WV3      |



| Прецедент 3             | Просмотр погоды через карту            |
| -------------           |:-------------:|
| ID                      | WV3            |
| Краткое описание        | Пользователь просматривает текущую погоду через карты        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт      |
| Основной поток          | 1. Пользователь переходит в раздел "Карты" <br />2. Пользователь выбирает тип карты <br />(Осадки, температура, ветер, облачность, аллергия) <br />3. Пользователь смотрит карту <br />4. Пользователь запускает внимацию изменения погоды  |
| Постусловия             | Карта корректно отобразилась, при нажатии на кнопку анимация корректно заработала         |
| Альтернативные потоки   | WV2      |


| Прецедент 3             | Просмотр погоды через карту            |
| -------------           |:-------------:|
| ID                      | WV3            |
| Краткое описание        | Пользователь просматривает текущую погоду через карты        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт      |
| Основной поток          | 1. Пользователь переходит в раздел "Карты" <br />2. Пользователь выбирает тип карты <br />(Осадки, температура, ветер, облачность, аллергия) <br />3. Пользователь смотрит карту <br />4. Пользователь запускает внимацию изменения погоды  |
| Постусловия             | Карта корректно отобразилась, при нажатии на кнопку анимация корректно заработала         |
| Альтернативные потоки   | WV2      |


| Прецедент 4             | Создание инфомера            |
| -------------           |:-------------:|
| ID                      | INF1            |
| Краткое описание        | Пользователь создает собственный инфомер        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит в раздел "Инфомеры" <br />2. Пользователь прокрутил список и выбрал подходящий инфомер <br />3. Польнзователь перешел на старницу создания конкретного инфомера <br />4. Пользователь заполняет форму создания инфомера |
| Постусловия             | Форма создания инфомера корректно загрузилась и отработала, инфомер загрузился пользователю на страницу         |
| Альтернативные потоки   | INF2, INF3      |



| Прецедент 5             | Создание инфомера            |
| -------------           |:-------------:|
| ID                      | INF2            |
| Краткое описание        | Пользователь создает собственный инфомер        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит в раздел "Инфомеры" <br />2. Пользователь перешел на страницу "выбрать один из стандартных" <br />3. Пользователь выбрал подходящий инфомер <br />4. Польнзователь перешел на старницу создания конкретного инфомера <br />5. Пользователь заполняет форму создания инфомера |
| Постусловия             | Форма создания инфомера корректно загрузилась и отработала, инфомер загрузился пользователю на страницу         |
| Альтернативные потоки   | INF1, INF3      |


| Прецедент 6             | Создание инфомера            |
| -------------           |:-------------:|
| ID                      | INF3            |
| Краткое описание        | Пользователь создает собственный инфомер        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит в раздел "Инфомеры" <br />2. Пользователь перешел на страницу "создать свой инфомер" <br />3. Пользователь перешел на старницу создания инфомера <br />4. Пользователь заполняет форму создания инфомераа |
| Постусловия             | Форма создания инфомера корректно загрузилась и отработала, инфомер загрузился пользователю на страницу         |
| Альтернативные потоки   | INF1, INF2     |



| Прецедент 7             | Просмотр новостей            |
| -------------           |:-------------:|
| ID                      | N1            |
| Краткое описание        | Пользователь просматривает новости на главной странице        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь находит новость <br />2. Пользователь кликнул по новости, перешел на страницу новостного портала  |
| Постусловия             | Пользователь попал на страницу выбранной новости на новостном портале         |
| Альтернативные потоки   | N2, N3     |



| Прецедент 8             | Просмотр новостей            |
| -------------           |:-------------:|
| ID                      | N2            |
| Краткое описание        | Пользователь просматривает новости на главной странице        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит на страницу "новости" <br />2. Пользователь находит новость <br />3. Пользователь кликнул по новости, перешел на страницу новостного портала  |
| Постусловия             | Пользователь попал на страницу выбранной новости на новостном портале         |
| Альтернативные потоки   | N1, N3     |



| Прецедент 9             | Просмотр новостей            |
| -------------           |:-------------:|
| ID                      | N3            |
| Краткое описание        | Пользователь просматривает новости на главной странице        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит на страницу "новости" <br />2 Пользователь переходит в конкретную категорию новостей <br />3. Пользователь находит новость <br />4. Пользователь кликнул по новости, перешел на страницу новостного портала  |
| Постусловия             | Пользователь попал на страницу выбранной новости на новостном портале         |
| Альтернативные потоки   | N1, N2     |



| Прецедент 10             | Просмотр страницы приложений            |
| -------------           |:-------------:|
| ID                      | APP1            |
| Краткое описание        | Пользователь просматривает доступные приложения        |
| Главные акторы:         | Пользователь      |
| Второстепенные акторы:  | -      |
| Предусловия             | Пользователь зашел на сайт     |
| Основной поток          | 1. Пользователь переходит на страницу "приложения" <br />2 Пользователь переходит во вкладку "Для компьютеров" <br />3. Пользователь переходит на страницу "Дополнения для браузеров" <br />4. Пользователь переходит к установке  |
| Постусловия             | Пользователь попал на страницу установки расширения браузера         |
| Альтернативные потоки   | -    |


## CheckList тестового покрытия

- [ ] Возможность поменять город
- [ ] Возможность поменят дату
- [ ] Возможность открыть карту погоды
- [ ] Изменение карты погоды в зависимости от выбранного типа
- [ ] Возможность изменить дату в картах
- [ ] Возможность запустить анимацию на карте
- [ ] В разделе "Новости" можно переходить по категориям
- [ ] Нажатие на носоть перенаправляет на сайт новости на портале 
- [ ] Возможнсть выбрать инфомер из списка готовых
- [ ] Возможность создать собственный инфомер
- [ ] При заполнении формы создания инфомера появляется возможнсть разместить его на пользовательском сайте 

## Тестовые сценарии

| №             | Начальное состояние          | Ввод          | Действие          | Вывод          | Конечное состояние          |
| ------------- |:-------------:|:------------:|:-------------:|:-------------:|:-------------:|
| 1            | Загруженная основная страница          | Пользователь выбирает город |  Загрузка погоды для текущего дня   | Страница погоды   | Загруженная страница погоды   |
| 2            | Загруженная страница погоды          | Пользователь выбирает дату |  Загрузка погоды для выбранного дня   | Страница погоды   | Загруженная страница погоды   |


| №             | Начальное состояние          | Ввод          | Действие          | Вывод          | Конечное состояние          |
| ------------- |:-------------:|:------------:|:-------------:|:-------------:|:-------------:|
| 1            | Загруженная основная страница          | Пользователь переходит в раздел "Карты" |  Загрузка страницы карт   | Страница с главной картой   | Загруженная страница с главной картой   |
| 2            | Загруженная страница с главной картой         | Пользователь выбирает тип карты |  Загрузка карты данного типа   | Страница карты   | Загруженная страница карты   |
| 3            | Загруженная страница с главной картой         | Пользователь запускает анимацию |  Запуск анимации с изменением времени и ситуации на карте  | Изменяющаяся страница карты   | Загруженная страница карты   |


| №             | Начальное состояние          | Ввод          | Действие          | Вывод          | Конечное состояние          |
| ------------- |:-------------:|:------------:|:-------------:|:-------------:|:-------------:|
| 1            | Загруженная основная страница | Пользователь переходит в раздел "Инфомеры" |  Загрузка страницы инфомеров   | Страница с описанием инфомеров   | Загруженная страница с описанием инфомеров   |
| 2            | Загруженная страница с описанием инфомеров          | Пользователь выбирает "выбрать один из стандартных" |  Загрузка списка готовых инфомеров   | Страница выбора инфомера   | Загруженная страница выбора инфомеров   |
| 3            | Загруженная страница выбора инфомеров | Пользователь выбирает инфомер |  Загрузка формы размещения инфомера на сайте  | Страница с формой звгрузка инфомера | Загруженная страница с формой загрузки инфомера   |
| 4            | Загруженная страница с формой загрузки инфомера | Пользователь заполняет и отправляет форму |  Размещение инфомера на предложенном сайте  | ГЛавная страница сайта |  Готов |



| №             | Начальное состояние          | Ввод          | Действие          | Вывод          | Конечное состояние          |
| ------------- |:-------------:|:------------:|:-------------:|:-------------:|:-------------:|
| 1            | Загруженная основная страница | Пользователь переходит в раздел "Новости" |  Загрузка страницы новостей   | Страница новостей   | Загруженная страница новостей   |
| 2            | Загруженная страница новостей | Пользователь выбирает категорию "Коронавирус" |  Загрузка списка новостей по теме "Коронавирус" | Страница новостей по теме "Коронавирус"   | Загруженная страница с новостями по теме "Коронавирус"   |
| 3            | Загруженная страница с новостями по теме "Коронавирус" | Пользователь выбирает новость |  Перенаправление на сайт новсти  | Страница носоти на новостном портале | Готов   |





