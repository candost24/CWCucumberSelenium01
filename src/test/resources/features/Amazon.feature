Feature: Amazon Favori Ekleme işlemi

  Scenario Outline:
    Given :Amazon sitesi açilir.
    When Anasayfanın acildigi kontrol edilir.
    And Cerez tercihlerinden cerezleri kabul et secilir
    And  siteye login olunur
    Then Login islemi kontrol edilir
    And Arama butonu yanındaki kategoriler tabından bilgisayar secilir
    Then Bilgisayar kategorisi secildiği kontrol edilir.
    And Arama alanına "<Aranacak eleman>" yazılır ve arama yapılır.
    Then Arama yapildigi kontrol edilir
    And Arama sonuçları sayfasından 3. sayfa acılır.
    Then 3. sayfanın acıldıgı kontrol edilir.
    And  Sayfadaki 2. ürün favorilere eklenir.
    Then 2. Ürünün favorilere eklendiği kontrol edilir.
    And Hesabım > Favori Listem sayfasına gidilir.
    Then Favori Listem sayfası açıldığı kontrol edilir.
    And Eklenen ürün favorilerden silinir.
    Then Silme işleminin gerçekleştiği kontrol edilir.
    And Üye çıkış işlemi yapılır
    Then Cıkıs isleminin yepildigi kontrol edilir


    Examples:
      | Aranacak eleman |
      | HP              |
      | APPLE           |
      | ASUS            |



