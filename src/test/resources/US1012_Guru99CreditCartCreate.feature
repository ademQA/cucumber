Feature: Guru99 PaymentPage
  Scenario: Guru99 PaymentPage CreditCard Creator
    Given kullanici "guru99Url1" payment adresine gider
    Then  kullanici sayfanin basliginin Payment icerdigini dogrular
    Then  kullanici kredi karti uretme sayfasina gider
    Then  Uretilen kartin bilgilerini yazdirir
    And   sayfayi kapatir