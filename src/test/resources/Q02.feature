Feature: US01 demoguru testi

  Scenario: TC01 Kullanici demogur sayfasinda gerekli islemleri yapabilmeli

    Given Kullanici "demoguruUrl" sayfasina gider
    And Sayfanın title’ında Telecom yazdığını dogrular
    And Add Costumer sayfasına gitmek icin linki tiklar
    And Formu doldurup müşteri ekler
    And Kaydın başarıyla yapıldığı dogrular
    And Kullanıcının costumer id’sini yazdırır
    And sayfayi kapatir



#1- https://demo.guru99.com/telecom/index.html adresine gidin
#2- Sayfanın title’ında Telecom yazdığını doğrulayın
#3- Add Costumer sayfasına gidin
#4- Formu doldurup müşteri ekleyin
#5- Kaydın başarıyla yapıldığı doğrulayın
#6- Kullanıcının costumer id’sini yazdırın
#7- Pencereyi kapatın

