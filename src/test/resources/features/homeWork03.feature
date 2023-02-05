Feature:Tc05 dinamik urller

  Scenario Outline: Dinamik Urller
    Given clinician "<url>" sayfasina gider
    Then kullanici 12 sn bekler
    And sayfa basliginin "<kelime>"icerdigini test eder
    And sayfayi kapatir

    Examples:
      | url      | kelime   |
      | google   | Google   |
      | amazon   | Amazon   |
      | trendyol | Trendyol |












