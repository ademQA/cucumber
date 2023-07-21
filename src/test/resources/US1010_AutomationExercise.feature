Feature: AE Product VerifY
  ​
  Scenario: US_001 Ae Product Verify
    Given kullanici "automationUrl" anasayfaya gider
    Then Anasayfaya ulastigini dogrular
    Then Product Sayfasina gider
    Then Tum urunlerin goruntulendigini dogrular
    Then Arama kismina Premium Polo T-shirt yazip search butonuna tiklar
    Then Urun ayrintisini goruntuler
    Then Urun adini dogrular
    And  sayfayi kapatir