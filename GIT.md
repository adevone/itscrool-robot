# Конспект по Git
## Инициализация репозитория
`git init`
## Управление удаленными репозиториями
(*удаленный репозиторий - это репозиторий, который находится на другом компьтере*)  
`git remote add origin git@github.com:adevone/itscrool-robot.git` - добавление удаленного репозитория origin, находящегося по указанной ссылке.  
`git remote remove origin` - удаление удаленного репозитория.
## Управление ветками
`git branch feature/galina_homework1` - создание ветки feature/galina_homework1  
`git checkout feature/galina_homework1` - переключение на ветку feature/galina_homework1  
`git branch -d feature/galina_homework1` - удаление ветки feature/galina_homework1  
`git branch -i` - получение списка существующих веток и информации о том, какая из них текущая ветка.
## Фиксация изменений
`git add .` - добавить в репозиторий все файлы из текущей папки. При изменении файлов они удаляются из репозитория.  
`git commit -m "выполнено задание1"` - зафиксировать внесенные изменения с сообщением о выполнении задания 1.  
`git reset --soft HEAD~1` - отменить последнюю фиксацию изменений.  
`git reset --hard` - вернуться к последнему зафиксированному состоянию (или удалить все незафиксированные изменения).
## Синхронизация с удаленным репозиторием
`git push origin feature/galina_homework1` - отправить зафиксированные в ветке feature/galina_homework1 изменения в удаленный репозиторий origin.  
`git pull origin feature/galina_homework1` - влить изменения из ветки feature/galina_homework1 удаленного репозитория origin в текущую ветку.

