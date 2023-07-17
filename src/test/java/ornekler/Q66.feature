Scenario Outline
Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit ekleyin
When kullanici https://editor.datatables.net/ adresine gider Then new butonuna basar
And tum bilgileri girer
And Create tusuna basar
When kullanici ilk isim ile arama yapar
Then isim bolumunde isminin oldugunu dogrular