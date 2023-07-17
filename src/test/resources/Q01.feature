Feature: QUS1001 Editor datatable testi, kullanici data ekleyebilmeli
# Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
# DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit ekleyin

  Scenario Outline: US1007_kullanici_data_ekleyebilmeli

    Given kullanici "dataTablesUrl" adresine gider
    Then new butonuna basar
    And "<Ad>","<soyad>","<pozisyon>","<ofis>","<tel>","<tarih>","<maas>" bilgilerini girer
    And Create tusuna basar
    When kullanici "<Ad>" ile arama yapar
    Then isim bolumunde "<Ad>" isminin oldugunu dogrular
    And sayfayi kapatir

    Examples:
      |Ad|soyad|pozisyon|ofis|tel|tarih|maas|
      |Adem|Tekinel|QA  |Gebze|1234|2023-02-01|50000|
      |Banu|Yurdakul|Qa |Ankara|2345|2023-01-01|50000|